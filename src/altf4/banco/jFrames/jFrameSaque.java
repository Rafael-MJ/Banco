package altf4.banco.jFrames;

import altf4.banco.sql.Connections;
import altf4.banco.UserInfo;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class jFrameSaque extends javax.swing.JFrame {

    Connections dao = new Connections();
    
    public jFrameSaque() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/altf4/banco/icons/Logo.png"));
        this.setIconImage(ic.getImage());
        lblSaldo.setText("SALDO: R$"+dao.getSaldo());
        lblLiberado.setText("VALOR LIBERADO: R$"+dao.getLiberado());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBlackBorder = new javax.swing.JPanel();
        panelBackLogo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        backLogo = new javax.swing.JLabel();
        panelBackFuncoes = new javax.swing.JPanel();
        gotoMenu = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtRetornar = new javax.swing.JFormattedTextField();
        txtSacar = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnRetornar = new javax.swing.JButton();
        btnSacar = new javax.swing.JButton();
        lblSaldo = new javax.swing.JLabel();
        lblLiberado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alt+F4 BANK - (SAQUE)");
        setMinimumSize(new java.awt.Dimension(465, 685));
        setResizable(false);
        setSize(new java.awt.Dimension(465, 685));
        getContentPane().setLayout(null);

        panelBlackBorder.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(panelBlackBorder);
        panelBlackBorder.setBounds(0, 140, 460, 10);

        panelBackLogo.setBackground(new java.awt.Color(204, 153, 0));
        panelBackLogo.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/Logo.png"))); // NOI18N
        panelBackLogo.add(jLabel1);
        jLabel1.setBounds(10, 10, 120, 120);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("SAQUE");
        panelBackLogo.add(jLabel8);
        jLabel8.setBounds(180, 30, 220, 81);

        backLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/back.jpg"))); // NOI18N
        panelBackLogo.add(backLogo);
        backLogo.setBounds(0, 0, 460, 140);

        getContentPane().add(panelBackLogo);
        panelBackLogo.setBounds(0, 0, 460, 140);

        panelBackFuncoes.setBackground(new java.awt.Color(255, 204, 0));
        panelBackFuncoes.setLayout(null);

        gotoMenu.setForeground(new java.awt.Color(153, 153, 153));
        gotoMenu.setText("Voltar ao Menu");
        gotoMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoMenuMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gotoMenuMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gotoMenuMouseEntered(evt);
            }
        });
        panelBackFuncoes.add(gotoMenu);
        gotoMenu.setBounds(190, 460, 90, 16);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DEFINA O VALOR QUE DEVE RETORNAR AO SALDO");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 10, 360, 30);

        panelBackFuncoes.add(jPanel1);
        jPanel1.setBounds(40, 290, 380, 50);

        txtRetornar.setBackground(new java.awt.Color(255, 255, 255));
        txtRetornar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "R$", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 8), new java.awt.Color(0, 0, 0))); // NOI18N
        txtRetornar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtRetornar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelBackFuncoes.add(txtRetornar);
        txtRetornar.setBounds(140, 360, 180, 30);

        txtSacar.setBackground(new java.awt.Color(255, 255, 255));
        txtSacar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "R$", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 8), new java.awt.Color(0, 0, 0))); // NOI18N
        txtSacar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtSacar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelBackFuncoes.add(txtSacar);
        txtSacar.setBounds(140, 160, 180, 30);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SELECIONE O VALOR A SER LIBERADO PARA RETIRADA");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 10, 360, 30);

        panelBackFuncoes.add(jPanel2);
        jPanel2.setBounds(40, 90, 380, 50);

        btnRetornar.setBackground(new java.awt.Color(0, 51, 255));
        btnRetornar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRetornar.setForeground(new java.awt.Color(255, 255, 255));
        btnRetornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/cashback.png"))); // NOI18N
        btnRetornar.setText("RETORNAR");
        btnRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarActionPerformed(evt);
            }
        });
        panelBackFuncoes.add(btnRetornar);
        btnRetornar.setBounds(170, 410, 120, 23);

        btnSacar.setBackground(new java.awt.Color(0, 51, 255));
        btnSacar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSacar.setForeground(new java.awt.Color(255, 255, 255));
        btnSacar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/update.png"))); // NOI18N
        btnSacar.setText("LIBERAR");
        btnSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarActionPerformed(evt);
            }
        });
        panelBackFuncoes.add(btnSacar);
        btnSacar.setBounds(170, 210, 120, 23);

        lblSaldo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSaldo.setForeground(new java.awt.Color(0, 0, 0));
        lblSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaldo.setText("SALDO:");
        panelBackFuncoes.add(lblSaldo);
        lblSaldo.setBounds(30, 20, 400, 25);

        lblLiberado.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblLiberado.setForeground(new java.awt.Color(0, 0, 0));
        lblLiberado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLiberado.setText("VALOR LIBERADO:");
        panelBackFuncoes.add(lblLiberado);
        lblLiberado.setBounds(50, 40, 360, 30);

        getContentPane().add(panelBackFuncoes);
        panelBackFuncoes.setBounds(0, 150, 460, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gotoMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoMenuMouseEntered
        gotoMenu.setCursor(new Cursor(Cursor.HAND_CURSOR));
        gotoMenu.setForeground(Color.BLUE);
    }//GEN-LAST:event_gotoMenuMouseEntered

    private void gotoMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoMenuMouseExited
        gotoMenu.setForeground(Color.GRAY);
    }//GEN-LAST:event_gotoMenuMouseExited

    private void gotoMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoMenuMouseClicked
        dispose();
        new jFrameMenu().setVisible(true);
    }//GEN-LAST:event_gotoMenuMouseClicked

    private void btnSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarActionPerformed
        if(!txtSacar.getText().equals("")){
            double valor = Double.parseDouble(txtSacar.getText().replaceAll(",", "."));
            if(dao.getSaldo() < valor){
                JOptionPane.showMessageDialog(null, "Erro no saque, valor inválido!", "ERRO", JOptionPane.ERROR_MESSAGE, null);
                txtSacar.setText(null);
            }else{
                dao.sacar(UserInfo.getUserID(), valor);
                txtSacar.setText("");
                txtRetornar.setText("");
                lblSaldo.setText("SALDO: R$"+dao.getSaldo());
                lblLiberado.setText("VALOR LIBERADO: R$ "+dao.getLiberado());
            }
        }
    }//GEN-LAST:event_btnSacarActionPerformed

    private void btnRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarActionPerformed
        if(!txtRetornar.getText().equals("")){
            double valor = Double.parseDouble(txtRetornar.getText().replaceAll(",", "."));
            if(dao.getLiberado()< valor || txtRetornar.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Erro no retorno, valor inválido!", "ERRO", JOptionPane.ERROR_MESSAGE, null);
                txtRetornar.setText(null);
            }else{
                dao.retirar(UserInfo.getUserID(), valor);
                txtSacar.setText("");
                txtRetornar.setText("");
                lblSaldo.setText("SALDO: R$"+dao.getSaldo());
                lblLiberado.setText("VALOR LIBERADO: R$ "+dao.getLiberado());
            }
        }
    }//GEN-LAST:event_btnRetornarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLogo;
    private javax.swing.JButton btnRetornar;
    private javax.swing.JButton btnSacar;
    private javax.swing.JLabel gotoMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblLiberado;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JPanel panelBackFuncoes;
    private javax.swing.JPanel panelBackLogo;
    private javax.swing.JPanel panelBlackBorder;
    private javax.swing.JFormattedTextField txtRetornar;
    private javax.swing.JFormattedTextField txtSacar;
    // End of variables declaration//GEN-END:variables
}
