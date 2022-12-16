package altf4.banco.jFrames;

import altf4.banco.sql.Connections;
import altf4.banco.UserInfo;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class jFrameTransferencia extends javax.swing.JFrame {
    Connections dao = new Connections();
    
    public jFrameTransferencia() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/altf4/banco/icons/Logo.png"));
        this.setIconImage(ic.getImage());
        lblSaldo.setText("SALDO: R$"+dao.getSaldo());
        txtGetID.setText("Meu ID: "+UserInfo.getUserID());
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
        txtID = new javax.swing.JFormattedTextField();
        txtValor = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        lblSaldo = new javax.swing.JLabel();
        txtGetID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alt+F4 BANK - (TRANSFERENCIA)");
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

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 38)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("TRANSFERÊNCIA");
        panelBackLogo.add(jLabel8);
        jLabel8.setBounds(140, 50, 310, 48);

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
        jLabel5.setText("INSIRA O ID DA CONTA DO RECEBEDOR");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 10, 270, 30);

        panelBackFuncoes.add(jPanel1);
        jPanel1.setBounds(40, 260, 380, 50);

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "ID", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 8), new java.awt.Color(0, 0, 0))); // NOI18N
        txtID.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelBackFuncoes.add(txtID);
        txtID.setBounds(140, 350, 180, 30);

        txtValor.setBackground(new java.awt.Color(255, 255, 255));
        txtValor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "R$", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 8), new java.awt.Color(0, 0, 0))); // NOI18N
        txtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelBackFuncoes.add(txtValor);
        txtValor.setBounds(140, 190, 180, 30);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SELECIONE O VALOR A SER ENVIADO");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(70, 10, 240, 30);

        panelBackFuncoes.add(jPanel2);
        jPanel2.setBounds(40, 100, 380, 50);

        btnEnviar.setBackground(new java.awt.Color(0, 51, 255));
        btnEnviar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/update.png"))); // NOI18N
        btnEnviar.setText("CONFIRMAR");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        panelBackFuncoes.add(btnEnviar);
        btnEnviar.setBounds(170, 420, 120, 23);

        lblSaldo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSaldo.setForeground(new java.awt.Color(0, 0, 0));
        lblSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaldo.setText("SALDO:");
        panelBackFuncoes.add(lblSaldo);
        lblSaldo.setBounds(30, 20, 400, 32);

        txtGetID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtGetID.setForeground(new java.awt.Color(0, 0, 0));
        txtGetID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtGetID.setText("ID");
        panelBackFuncoes.add(txtGetID);
        txtGetID.setBounds(10, 50, 440, 16);

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

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        
        if(!txtID.getText().equals("") && !txtValor.getText().equals("")){
            double valor = Double.parseDouble(txtValor.getText().replaceAll(",", "."));
            String destino = txtID.getText();
        
            if(destino.equals(UserInfo.getUserID())){
                JOptionPane.showMessageDialog(null, "Erro na transferência!\nO destino não pode ser você.", "ERRO", JOptionPane.ERROR_MESSAGE, null);
                txtID.setText(null);
            }else if(dao.getSaldo() < valor){
                JOptionPane.showMessageDialog(null, "Erro na transferência!\nSaldo Insuficiente.", "ERRO", JOptionPane.ERROR_MESSAGE, null);
                txtValor.setText(null);
            }else{
                dao.transferencia(UserInfo.getUserID(), destino, valor);
                txtID.setText("");
                txtValor.setText("");
                lblSaldo.setText("SALDO: R$"+dao.getSaldo());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Erro na transferência!\nPreencha os campos corretamente!", "ERRO", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLogo;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel gotoMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JPanel panelBackFuncoes;
    private javax.swing.JPanel panelBackLogo;
    private javax.swing.JPanel panelBlackBorder;
    private javax.swing.JLabel txtGetID;
    private javax.swing.JFormattedTextField txtID;
    private javax.swing.JFormattedTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
