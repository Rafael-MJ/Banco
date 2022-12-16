package altf4.banco.jFrames;

import altf4.banco.sql.DAO;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class jFrameLogin extends javax.swing.JFrame {

    DAO dao = new DAO();
    
    public jFrameLogin() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/altf4/banco/icons/Logo.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBlackBorder = new javax.swing.JPanel();
        panelBackLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        backLogo = new javax.swing.JLabel();
        panelBackFuncoes = new javax.swing.JPanel();
        txtSenha = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblPass = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblHaveAcc = new javax.swing.JLabel();
        gotoCadastrar = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alt+F4 BANK - (LOGIN)");
        setMinimumSize(new java.awt.Dimension(465, 685));
        setResizable(false);
        setSize(new java.awt.Dimension(465, 685));
        getContentPane().setLayout(null);

        panelBlackBorder.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(panelBlackBorder);
        panelBlackBorder.setBounds(0, 220, 460, 10);

        panelBackLogo.setBackground(new java.awt.Color(204, 153, 0));
        panelBackLogo.setLayout(null);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/Logo.png"))); // NOI18N
        panelBackLogo.add(lblLogo);
        lblLogo.setBounds(170, 10, 120, 120);

        lblLogin.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(0, 0, 0));
        lblLogin.setText("LOGIN");
        panelBackLogo.add(lblLogin);
        lblLogin.setBounds(140, 130, 200, 81);

        backLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/back.jpg"))); // NOI18N
        panelBackLogo.add(backLogo);
        backLogo.setBounds(0, 0, 460, 220);

        getContentPane().add(panelBackLogo);
        panelBackLogo.setBounds(0, 0, 460, 220);

        panelBackFuncoes.setBackground(new java.awt.Color(255, 204, 0));
        panelBackFuncoes.setLayout(null);
        panelBackFuncoes.add(txtSenha);
        txtSenha.setBounds(140, 190, 190, 30);

        btnLogin.setBackground(new java.awt.Color(0, 51, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/enter.png"))); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setFocusPainted(false);
        btnLogin.setMaximumSize(new java.awt.Dimension(95, 35));
        btnLogin.setMinimumSize(new java.awt.Dimension(95, 35));
        btnLogin.setPreferredSize(new java.awt.Dimension(95, 35));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        panelBackFuncoes.add(btnLogin);
        btnLogin.setBounds(80, 280, 300, 50);

        lblPass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPass.setForeground(new java.awt.Color(0, 0, 0));
        lblPass.setText("SENHA");
        panelBackFuncoes.add(lblPass);
        lblPass.setBounds(200, 160, 70, 25);

        lblUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(0, 0, 0));
        lblUser.setText("USUÁRIO");
        panelBackFuncoes.add(lblUser);
        lblUser.setBounds(190, 60, 90, 25);

        lblHaveAcc.setForeground(new java.awt.Color(0, 0, 0));
        lblHaveAcc.setText("Não possui conta?");
        panelBackFuncoes.add(lblHaveAcc);
        lblHaveAcc.setBounds(180, 350, 110, 16);

        gotoCadastrar.setForeground(new java.awt.Color(153, 153, 153));
        gotoCadastrar.setText("Cadastre-se");
        gotoCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoCadastrarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gotoCadastrarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gotoCadastrarMouseEntered(evt);
            }
        });
        panelBackFuncoes.add(gotoCadastrar);
        gotoCadastrar.setBounds(200, 370, 70, 16);
        panelBackFuncoes.add(txtLogin);
        txtLogin.setBounds(140, 90, 190, 30);

        getContentPane().add(panelBackFuncoes);
        panelBackFuncoes.setBounds(0, 230, 460, 420);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gotoCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoCadastrarMouseClicked
        dispose();
        new jFrameCadastro().setVisible(true);
    }//GEN-LAST:event_gotoCadastrarMouseClicked

    private void gotoCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoCadastrarMouseEntered
        gotoCadastrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        gotoCadastrar.setForeground(Color.BLUE);
    }//GEN-LAST:event_gotoCadastrarMouseEntered

    private void gotoCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoCadastrarMouseExited
        gotoCadastrar.setForeground(Color.GRAY);
    }//GEN-LAST:event_gotoCadastrarMouseExited

    private void resetarCampos(){
        txtLogin.setText(null);
        txtSenha.setText(null);
    }
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if(txtSenha.getPassword().length <= 20 && txtLogin.getText().length() <= 15){
            if(dao.login(txtLogin.getText(), String.valueOf(txtSenha.getPassword()))){
                dispose();
                new jFrameMenu().setVisible(true);
            }else{
                resetarCampos();
            }
        }else{
            resetarCampos();
            JOptionPane.showMessageDialog(null, "Login ou Senha Inválido(s)!", "ERRO", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new jFrameLogin().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLogo;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel gotoCadastrar;
    private javax.swing.JLabel lblHaveAcc;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel panelBackFuncoes;
    private javax.swing.JPanel panelBackLogo;
    private javax.swing.JPanel panelBlackBorder;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
