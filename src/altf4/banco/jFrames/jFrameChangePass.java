package altf4.banco.jFrames;

import altf4.banco.UserInfo;
import altf4.banco.sql.DAO;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class jFrameChangePass extends javax.swing.JFrame {

    DAO dao = new DAO();
    
    public jFrameChangePass() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/altf4/banco/icons/Logo.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblChangePass = new javax.swing.JLabel();
        backLogo = new javax.swing.JLabel();
        panelBackFuncoes = new javax.swing.JPanel();
        txtSenha = new javax.swing.JPasswordField();
        btnCadastro = new javax.swing.JButton();
        lblNewPass2 = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblNewPass = new javax.swing.JLabel();
        gotoLogin = new javax.swing.JLabel();
        txtNSenha = new javax.swing.JPasswordField();
        txtNSenha2 = new javax.swing.JPasswordField();
        jSeparator = new javax.swing.JSeparator();
        panelBlackBorder = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alt+F4 BANK - (ALTERAR SENHA)");
        setMinimumSize(new java.awt.Dimension(465, 685));
        setResizable(false);
        setSize(new java.awt.Dimension(465, 685));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBackLogo.setBackground(new java.awt.Color(204, 153, 0));
        panelBackLogo.setLayout(null);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/Logo.png"))); // NOI18N
        panelBackLogo.add(lblLogo);
        lblLogo.setBounds(30, 10, 120, 120);

        lblChangePass.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblChangePass.setForeground(new java.awt.Color(0, 0, 0));
        lblChangePass.setText("TROCAR SENHA");
        panelBackLogo.add(lblChangePass);
        lblChangePass.setBounds(170, 50, 280, 48);

        backLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/back.jpg"))); // NOI18N
        panelBackLogo.add(backLogo);
        backLogo.setBounds(0, 0, 460, 140);

        getContentPane().add(panelBackLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 140));

        panelBackFuncoes.setBackground(new java.awt.Color(255, 204, 0));
        panelBackFuncoes.setLayout(null);
        panelBackFuncoes.add(txtSenha);
        txtSenha.setBounds(140, 70, 190, 30);

        btnCadastro.setBackground(new java.awt.Color(0, 51, 255));
        btnCadastro.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/write.png"))); // NOI18N
        btnCadastro.setText("ALTERAR SENHA");
        btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastro.setFocusPainted(false);
        btnCadastro.setMaximumSize(new java.awt.Dimension(95, 35));
        btnCadastro.setMinimumSize(new java.awt.Dimension(95, 35));
        btnCadastro.setPreferredSize(new java.awt.Dimension(95, 35));
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        panelBackFuncoes.add(btnCadastro);
        btnCadastro.setBounds(80, 380, 300, 50);

        lblNewPass2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNewPass2.setForeground(new java.awt.Color(0, 0, 0));
        lblNewPass2.setText("NOVA SENHA");
        panelBackFuncoes.add(lblNewPass2);
        lblNewPass2.setBounds(170, 270, 120, 25);

        lblPass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPass.setForeground(new java.awt.Color(0, 0, 0));
        lblPass.setText("SENHA ATUAL");
        panelBackFuncoes.add(lblPass);
        lblPass.setBounds(170, 40, 130, 25);

        lblNewPass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNewPass.setForeground(new java.awt.Color(0, 0, 0));
        lblNewPass.setText("NOVA SENHA");
        panelBackFuncoes.add(lblNewPass);
        lblNewPass.setBounds(170, 170, 120, 25);

        gotoLogin.setForeground(new java.awt.Color(153, 153, 153));
        gotoLogin.setText("Voltar ao Menu");
        gotoLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoLoginMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gotoLoginMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gotoLoginMouseEntered(evt);
            }
        });
        panelBackFuncoes.add(gotoLogin);
        gotoLogin.setBounds(190, 460, 90, 16);
        panelBackFuncoes.add(txtNSenha);
        txtNSenha.setBounds(140, 200, 190, 30);
        panelBackFuncoes.add(txtNSenha2);
        txtNSenha2.setBounds(140, 300, 190, 30);

        jSeparator.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator.setEnabled(false);
        jSeparator.setOpaque(true);
        jSeparator.setPreferredSize(new java.awt.Dimension(0, 1));
        panelBackFuncoes.add(jSeparator);
        jSeparator.setBounds(20, 140, 420, 1);

        getContentPane().add(panelBackFuncoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 460, 500));

        panelBlackBorder.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(panelBlackBorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 460, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gotoLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoLoginMouseClicked
        dispose();
        new jFrameMenu().setVisible(true);
    }//GEN-LAST:event_gotoLoginMouseClicked
    
    public String getPass(){
        
        return UserInfo.cryptoPass(String.valueOf(txtSenha.getPassword()));
    }
    
    public String getNewPass(int field){
        
        switch(field){
            case 1:
                return UserInfo.cryptoPass(String.valueOf(txtNSenha.getPassword()));
            case 2:
                return UserInfo.cryptoPass(String.valueOf(txtNSenha2.getPassword()));
            default:
                return UserInfo.cryptoPass(String.valueOf(txtNSenha.getPassword()));
        }
    }
    
    private void gotoLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoLoginMouseEntered
        
        gotoLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        gotoLogin.setForeground(Color.BLUE);
    }//GEN-LAST:event_gotoLoginMouseEntered

    private void gotoLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoLoginMouseExited
        gotoLogin.setForeground(Color.GRAY);
    }//GEN-LAST:event_gotoLoginMouseExited

    private void resetarCampos() {                                      
        txtSenha.setText("");
        txtNSenha.setText("");
        txtNSenha2.setText("");
    }      
    
    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed

        if(!getPass().equals("")&& !getNewPass(1).equals("") && !getNewPass(2).equals("") 
                && getNewPass(1).equals(getNewPass(2)) && !getPass().equals(getNewPass(1))
                && getNewPass(1).length() <= 20 && getPass().length() <= 20){
            if(dao.getSenha().equals(getPass())){
                dao.setSenha(UserInfo.uncryptoPass(getNewPass(1)));
                dispose();
                new jFrameLogin().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "As senhas não batem.", "ERRO", JOptionPane.ERROR_MESSAGE, null);
                resetarCampos();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente.", "ERRO", JOptionPane.ERROR_MESSAGE, null);
            resetarCampos();
        }
    }//GEN-LAST:event_btnCadastroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLogo;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JLabel gotoLogin;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JLabel lblChangePass;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNewPass;
    private javax.swing.JLabel lblNewPass2;
    private javax.swing.JLabel lblPass;
    private javax.swing.JPanel panelBackFuncoes;
    private javax.swing.JPanel panelBackLogo;
    private javax.swing.JPanel panelBlackBorder;
    private javax.swing.JPasswordField txtNSenha;
    private javax.swing.JPasswordField txtNSenha2;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
