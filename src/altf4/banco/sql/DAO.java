package altf4.banco.sql;

import altf4.banco.Acessos;
import altf4.banco.UserInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean cadastro(String getName, String getSobrenome, String getCPF, String getNasc, String getRG, String getLogin, String getSenha){
        
        con = ConnectionFactory.getDb();
        ps = null;
        rs = null;
        String vercpf, verrg, veruser, passCrypto;
        boolean sucess = true;
        
        passCrypto = UserInfo.cryptoPass(getSenha);
        
        try {
            ps = con.prepareStatement("call Cadastro(?,?,?,?,?,?,?);");
            
            ps.setString(1, getName);
            ps.setString(2, getSobrenome);
            ps.setDouble(3, Double.parseDouble(getCPF));
            ps.setString(4, getNasc);
            ps.setDouble(5, Double.parseDouble(getRG));
            ps.setString(6, getLogin);
            ps.setString(7, passCrypto);
            
            rs = ps.executeQuery("SELECT cpf,rg,username FROM user");
            
            while(rs.next()){
                
                vercpf = rs.getString("cpf");
                verrg = rs.getString("rg");
                veruser = rs.getString("username");
                
                if(vercpf.equals(getCPF)||verrg.equals(getRG)||veruser.equals(getLogin)){

                    JOptionPane.showMessageDialog(null, "Erro no cadastro, usuário já existente.\nRealize o login!", "ERRO", JOptionPane.ERROR_MESSAGE, null);
                    sucess = false;
                    break;
                }
            }
            if(sucess == true){
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cadastro realizado! Realize o Login.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/altf4/banco/icons/Logo.png")));
            } 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no cadastro: " + ex, "ERRO", JOptionPane.ERROR_MESSAGE, null);
        } finally {
            
            ConnectionFactory.closeConnection(con, ps, rs);
        }
        return sucess;
    }
    
    public void setSenha(String senha){
        
        con = ConnectionFactory.getDb();
        ps = null;
        String passCrypto;
        
        try {
            ps = con.prepareStatement("UPDATE login join user on login.username=user.username SET login.senha = ? WHERE user.id = "+UserInfo.getUserID()+";");
            
            passCrypto = UserInfo.cryptoPass(senha);
            
            ps.setString(1, passCrypto);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Senha alterada! Realize o login novamente.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/altf4/banco/icons/Logo.png")));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração: " + ex, "ERRO", JOptionPane.ERROR_MESSAGE, null);
        } finally {
            ConnectionFactory.closeConnection(con, ps);
        }
    }
    
    public boolean login(String login, String pass){
        
       con = ConnectionFactory.getDb();
       ps = null;
       rs = null;
       String nome, senha, passUncrypto, passCrypto;
       int id;
       boolean passed = false;
       
        try {
            passCrypto = UserInfo.cryptoPass(pass);
            ps = con.prepareStatement("call Login('" + login +"', '"+ passCrypto +"');");
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                id = rs.getInt("user.id");
                nome = rs.getString("user.username");
                senha = rs.getString("login.senha");
                
                passUncrypto = UserInfo.uncryptoPass(senha);
                
                if(login.equals(nome) && pass.equals(passUncrypto)){
                    passed = true;
                    UserInfo.setUserID(String.valueOf(id));

                }else{
                    passed = false;
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: " + ex, "ERRO", JOptionPane.ERROR_MESSAGE, null);
        }finally{
            ConnectionFactory.closeConnection(con, ps, rs);
        }
        if(passed == false){
            
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorreto(s): ", "ERRO", JOptionPane.ERROR_MESSAGE, null);
        }else{
            JOptionPane.showMessageDialog(null, "Login realizado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/altf4/banco/icons/Logo.png")));
        }
        return passed;
    }
    
    public String getSenha(){
        
        String senha = "";
        con = ConnectionFactory.getDb();
        ps = null;
        rs = null;
        
        try {
            ps = con.prepareStatement("SELECT login.senha FROM login join user on login.username = user.username WHERE user.id = " + UserInfo.getUserID());
            rs = ps.executeQuery();
            
            while(rs.next()){
                senha = rs.getString("senha");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, ps, rs);
    }
        return senha;
    }
    
    public ArrayList<Acessos> getAcessos(){
        
        con = ConnectionFactory.getDb();
        
        ps = null;
        rs = null;
        ArrayList<Acessos> a = new ArrayList<>();
        int id;
        String data;
        
        try {
            ps = con.prepareStatement("select acesso.id,acesso.data from acesso join user "
                    + "on user.username = acesso.username where user.id = "+UserInfo.getUserID()+";");
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                Acessos ac = new Acessos();
                id = rs.getInt("acesso.id");
                data = rs.getString("acesso.data");
            
                ac.setAcess(id, data);
                a.add(ac);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, ps, rs);
    }
        return a;
    }
    
    public String getNome(){
        
        String nome = "";
        con = ConnectionFactory.getDb();
        ps = null;
        rs = null;
        
        try {
            ps = con.prepareStatement("SELECT nome, sobrenome FROM user WHERE id = " + UserInfo.getUserID());
            rs = ps.executeQuery();
            
            while(rs.next()){
                nome = rs.getString("nome");
                nome += (" ");
                nome += rs.getString("sobrenome");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        
            ConnectionFactory.closeConnection(con, ps, rs);
    }
        return nome;
    }
}