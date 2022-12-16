package altf4.banco.sql;

import altf4.banco.Transferencias;
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

public class Connections {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public void transferencia(String getSID, String getDID, double valor){
        
        con = ConnectionFactory.getDb();
        ps = null;
        rs = null;
        String destino = null;
        
        try {
            
            ps = con.prepareStatement("select id from user where id = "+getDID+";");
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                destino = rs.getString("id");
            }
            
            if(destino != null){
                ps = con.prepareStatement("call Transferencia(?,?,?);");

                ps.setString(1, getSID);
                ps.setString(2, getDID);
                ps.setDouble(3, valor);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Transferência realizada!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/altf4/banco/icons/Logo.png")));
            }else{
                JOptionPane.showMessageDialog(null, "Erro na transerência, destino inválido.", "ERRO", JOptionPane.ERROR_MESSAGE, null);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na transerência: " + ex, "ERRO", JOptionPane.ERROR_MESSAGE, null);
        } finally {
            
            ConnectionFactory.closeConnection(con, ps);
        }
    }
        
    public void sacar(String getSID, double valor){
        
        con = ConnectionFactory.getDb();
        ps = null;
        
        try {
            ps = con.prepareStatement("call Saque(?,?);");
            ps.setString(1, getSID);
            ps.setDouble(2, valor);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saque programado!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/altf4/banco/icons/Logo.png")));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no saque: " + ex, "ERRO", JOptionPane.ERROR_MESSAGE, null);
        } finally {
            ConnectionFactory.closeConnection(con, ps);
        }
    }
    
    public void depositar(String getSID, double valor){
        
        con = ConnectionFactory.getDb();
        ps = null;
        
        try {
            ps = con.prepareStatement("call Deposito(?,?);");
            ps.setString(1, getSID);
            ps.setDouble(2, valor);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deposito rápido realizado!\nVocê transferiu R$ " + valor + " de seu outro banco.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/altf4/banco/icons/Logo.png")));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no deposito: " + ex, "ERRO", JOptionPane.ERROR_MESSAGE, null);
        } finally {
            ConnectionFactory.closeConnection(con, ps);
        }
    }
    
    public void retirar(String getSID, double valor){
        
        con = ConnectionFactory.getDb();
        ps = null;
        
        try {
            ps = con.prepareStatement("call Retirada(?,?);");
            
            ps.setString(1, getSID);
            ps.setDouble(2, valor);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saque cancelado, valor retornou ao saldo!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/altf4/banco/icons/Logo.png")));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no saque: " + ex, "ERRO", JOptionPane.ERROR_MESSAGE, null);
        } finally {
            ConnectionFactory.closeConnection(con, ps);
        }
    }
    
    public double getSaldo(){
        
        double saldo = 0;
        con = ConnectionFactory.getDb();
        ps = null;
        rs = null;
        
        try {
            ps = con.prepareStatement("SELECT saldo FROM user WHERE id = " + UserInfo.getUserID());
            rs = ps.executeQuery();
            
            while(rs.next()){
                saldo = rs.getDouble("saldo");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connections.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, ps, rs);
    }
        return saldo;
    }
    
    public ArrayList<Transferencias> getSendTransfers(){
        
        con = ConnectionFactory.getDb();
        
        ps = null;
        rs = null;
        ArrayList<Transferencias> t = new ArrayList<>();
        double valor;
        int destino, id;
        String data, recebedor;
        
        try {
            ps = con.prepareStatement("select movimentacao.valor,movimentacao.destino_id,movimentacao.id,movimentacao.data,user.nome,user.sobrenome "
                    + "from user join movimentacao on user.id = movimentacao.destino_id where movimentacao.envio_id = "+UserInfo.getUserID()+";");
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                Transferencias tr = new Transferencias();
                valor = rs.getDouble("movimentacao.valor");
                destino = rs.getInt("movimentacao.destino_id");
                id = rs.getInt("movimentacao.id");
                data = rs.getString("movimentacao.data");
                recebedor = rs.getString("user.nome");
                recebedor += " ";
                recebedor += rs.getString("user.sobrenome");
            
                tr.setTransfers(valor, destino, id, data, recebedor);
                t.add(tr);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connections.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, ps, rs);
    }
        return t;
    }
    
    public ArrayList<Transferencias> getLastSendTransfer(){
        
        con = ConnectionFactory.getDb();
        ps = null;
        rs = null;
        ArrayList<Transferencias> t = new ArrayList<>();
        Transferencias tr = new Transferencias();
        double valor;
        String recebedor;
        
        try {
            ps = con.prepareStatement("select movimentacao.valor,user.nome,user.sobrenome from user "
                    + "join movimentacao on user.id = movimentacao.destino_id where movimentacao.envio_id = "+UserInfo.getUserID()+";");
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                valor = rs.getDouble("movimentacao.valor");
                recebedor = rs.getString("user.nome");
                recebedor += " ";
                recebedor += rs.getString("user.sobrenome");
            
                tr.setLastTransfer(valor, recebedor);
                t.add(tr);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connections.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        
            ConnectionFactory.closeConnection(con, ps, rs);
    }
        return t;
    }
    
    public ArrayList<Transferencias> getRecivedTransfers(){
        
        con = ConnectionFactory.getDb();
        ps = null;
        rs = null;
        ArrayList<Transferencias> t = new ArrayList<>();
        double valor;
        int destino, id;
        String data, recebedor;
        
        try {
            ps = con.prepareStatement("select movimentacao.valor,movimentacao.envio_id,movimentacao.id,movimentacao.data,user.nome,user.sobrenome "
                    + "from user join movimentacao on user.id = movimentacao.envio_id where movimentacao.destino_id = "+UserInfo.getUserID()+";");
            rs = ps.executeQuery();
            
            while(rs.next()){
                Transferencias tr = new Transferencias();
                valor = rs.getDouble("movimentacao.valor");
                destino = rs.getInt("movimentacao.envio_id");
                id = rs.getInt("movimentacao.id");
                data = rs.getString("movimentacao.data");
                recebedor = rs.getString("user.nome");
                recebedor += " ";
                recebedor += rs.getString("user.sobrenome");
            
                tr.setTransfers(valor, destino, id, data, recebedor);
                t.add(tr);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connections.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        
            ConnectionFactory.closeConnection(con, ps, rs);
    }
        return t;
    }
    
    public double getLiberado(){
        
        double saldo = 0;
        con = ConnectionFactory.getDb();
        ps = null;
        rs = null;
        
        try {
            ps = con.prepareStatement("SELECT retirada FROM user WHERE id = " + UserInfo.getUserID());
            rs = ps.executeQuery();
            
            while(rs.next()){
                saldo = rs.getDouble("retirada");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connections.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, ps, rs);
    }
        return saldo;
    }
}