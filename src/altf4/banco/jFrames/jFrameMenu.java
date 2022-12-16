package altf4.banco.jFrames;

import altf4.banco.sql.Connections;
import altf4.banco.Transferencias;
import altf4.banco.UserInfo;
import altf4.banco.sql.DAO;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class jFrameMenu extends javax.swing.JFrame {

    Connections con = new Connections();
    DAO dao = new DAO();
    
    public jFrameMenu() {
        
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/altf4/banco/icons/Logo.png"));
        this.setIconImage(ic.getImage());
        labelSaldoResult.setText(String.valueOf("R$ "+con.getSaldo()));
        labelRetiradaResult.setText(String.valueOf("R$ "+con.getLiberado()));
        labelNomeResult.setText(dao.getNome());
        contaId.setText(UserInfo.getUserID());
        setLastTransfer();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelAccount = new javax.swing.JPanel();
        labelConta = new javax.swing.JLabel();
        contaId = new javax.swing.JLabel();
        labelBackAccount = new javax.swing.JLabel();
        panelNomeSaldo = new javax.swing.JPanel();
        labelSaldoResult = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelSaldo = new javax.swing.JLabel();
        labelNomeResult = new javax.swing.JLabel();
        labelRetiradaResult = new javax.swing.JLabel();
        labelretirada = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        labelBackInfos = new javax.swing.JLabel();
        panelLastTransfer = new javax.swing.JPanel();
        labelLastTransfer = new javax.swing.JLabel();
        panelLTValue = new javax.swing.JPanel();
        labelLTValor = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        panelBackReciver = new javax.swing.JPanel();
        labelLTvalor = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        labelBackLS = new javax.swing.JLabel();
        labelExit = new javax.swing.JLabel();
        labelChangePass = new javax.swing.JLabel();
        labelAcess = new javax.swing.JLabel();
        labelBackground = new javax.swing.JLabel();
        panelBlackBorder = new javax.swing.JPanel();
        panelBackLogo = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        backLogo = new javax.swing.JLabel();
        panelBackFuncoes = new javax.swing.JPanel();
        btnTransfer = new javax.swing.JButton();
        btnSaque = new javax.swing.JButton();
        btnExtrato = new javax.swing.JButton();
        btnDeposito = new javax.swing.JButton();
        panelBlackBorder2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alt+F4 BANK - (MENU)");
        setMinimumSize(new java.awt.Dimension(1065, 685));
        setResizable(false);
        setSize(new java.awt.Dimension(1065, 685));
        getContentPane().setLayout(null);

        panelPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        panelPrincipal.setLayout(null);

        panelAccount.setBackground(new java.awt.Color(102, 102, 102));
        panelAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelAccount.setLayout(null);

        labelConta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelConta.setForeground(new java.awt.Color(0, 0, 0));
        labelConta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelConta.setText("Conta (ID)");
        panelAccount.add(labelConta);
        labelConta.setBounds(0, 0, 90, 14);

        contaId.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        contaId.setForeground(new java.awt.Color(0, 0, 0));
        contaId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contaId.setText("ID");
        panelAccount.add(contaId);
        contaId.setBounds(20, 10, 50, 16);

        labelBackAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/panelMenuBackground.jpg"))); // NOI18N
        panelAccount.add(labelBackAccount);
        labelBackAccount.setBounds(0, 0, 90, 30);

        panelPrincipal.add(panelAccount);
        panelAccount.setBounds(20, 20, 90, 30);

        panelNomeSaldo.setBackground(new java.awt.Color(102, 102, 102));
        panelNomeSaldo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelNomeSaldo.setLayout(null);

        labelSaldoResult.setFont(new java.awt.Font("Calibri Light", 2, 24)); // NOI18N
        labelSaldoResult.setForeground(new java.awt.Color(0, 0, 0));
        labelSaldoResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSaldoResult.setText("0");
        panelNomeSaldo.add(labelSaldoResult);
        labelSaldoResult.setBounds(10, 160, 570, 30);

        labelNome.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        labelNome.setForeground(new java.awt.Color(0, 0, 0));
        labelNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNome.setText("NOME:");
        labelNome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelNomeSaldo.add(labelNome);
        labelNome.setBounds(10, 20, 570, 31);

        labelSaldo.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        labelSaldo.setForeground(new java.awt.Color(0, 0, 0));
        labelSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSaldo.setText("SALDO:");
        labelSaldo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelNomeSaldo.add(labelSaldo);
        labelSaldo.setBounds(10, 120, 570, 31);

        labelNomeResult.setFont(new java.awt.Font("Calibri Light", 2, 24)); // NOI18N
        labelNomeResult.setForeground(new java.awt.Color(0, 0, 0));
        labelNomeResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNomeResult.setText("nome");
        panelNomeSaldo.add(labelNomeResult);
        labelNomeResult.setBounds(10, 60, 570, 30);

        labelRetiradaResult.setFont(new java.awt.Font("Calibri Light", 2, 24)); // NOI18N
        labelRetiradaResult.setForeground(new java.awt.Color(0, 0, 0));
        labelRetiradaResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRetiradaResult.setText("0");
        panelNomeSaldo.add(labelRetiradaResult);
        labelRetiradaResult.setBounds(10, 260, 570, 30);

        labelretirada.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        labelretirada.setForeground(new java.awt.Color(0, 0, 0));
        labelretirada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelretirada.setText("SAQUE DISPONÍVEL:");
        labelretirada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelNomeSaldo.add(labelretirada);
        labelretirada.setBounds(10, 220, 570, 31);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        panelNomeSaldo.add(jSeparator1);
        jSeparator1.setBounds(0, 203, 590, 3);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        panelNomeSaldo.add(jSeparator2);
        jSeparator2.setBounds(0, 100, 590, 3);

        labelBackInfos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/panelMenuBackground.jpg"))); // NOI18N
        panelNomeSaldo.add(labelBackInfos);
        labelBackInfos.setBounds(0, 0, 590, 300);

        panelPrincipal.add(panelNomeSaldo);
        panelNomeSaldo.setBounds(60, 70, 590, 300);

        panelLastTransfer.setBackground(new java.awt.Color(102, 102, 102));
        panelLastTransfer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelLastTransfer.setLayout(null);

        labelLastTransfer.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        labelLastTransfer.setForeground(new java.awt.Color(0, 0, 0));
        labelLastTransfer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLastTransfer.setText("ÚLTIMO ENVIO:");
        panelLastTransfer.add(labelLastTransfer);
        labelLastTransfer.setBounds(10, 10, 570, 31);

        panelLTValue.setBackground(new java.awt.Color(239, 239, 239));
        panelLTValue.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelLTValue.setLayout(null);

        labelLTValor.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        labelLTValor.setForeground(new java.awt.Color(0, 0, 0));
        labelLTValor.setText("Valor:");
        panelLTValue.add(labelLTValor);
        labelLTValor.setBounds(0, 0, 40, 20);

        lblValor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblValor.setForeground(new java.awt.Color(0, 0, 0));
        lblValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValor.setText("R$0.00");
        panelLTValue.add(lblValor);
        lblValor.setBounds(10, 20, 360, 25);

        panelLastTransfer.add(panelLTValue);
        panelLTValue.setBounds(110, 50, 380, 50);

        panelBackReciver.setBackground(new java.awt.Color(239, 239, 239));
        panelBackReciver.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelBackReciver.setLayout(null);

        labelLTvalor.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        labelLTvalor.setForeground(new java.awt.Color(0, 0, 0));
        labelLTvalor.setText("Recebedor:");
        panelBackReciver.add(labelLTvalor);
        labelLTvalor.setBounds(0, 0, 70, 20);

        lblID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblID.setForeground(new java.awt.Color(0, 0, 0));
        lblID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblID.setText("NENHUM ENVIO");
        panelBackReciver.add(lblID);
        lblID.setBounds(10, 20, 360, 25);

        panelLastTransfer.add(panelBackReciver);
        panelBackReciver.setBounds(110, 120, 380, 50);

        labelBackLS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/panelMenuBackground.jpg"))); // NOI18N
        panelLastTransfer.add(labelBackLS);
        labelBackLS.setBounds(0, 0, 590, 200);

        panelPrincipal.add(panelLastTransfer);
        panelLastTransfer.setBounds(60, 400, 590, 200);

        labelExit.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelExit.setForeground(new java.awt.Color(153, 153, 153));
        labelExit.setText("Sair da Conta");
        labelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExitMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelExitMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelExitMouseEntered(evt);
            }
        });
        panelPrincipal.add(labelExit);
        labelExit.setBounds(590, 620, 100, 22);

        labelChangePass.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelChangePass.setForeground(new java.awt.Color(153, 153, 153));
        labelChangePass.setText("Trocar Senha");
        labelChangePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelChangePassMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelChangePassMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelChangePassMouseEntered(evt);
            }
        });
        panelPrincipal.add(labelChangePass);
        labelChangePass.setBounds(30, 620, 93, 22);

        labelAcess.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelAcess.setForeground(new java.awt.Color(153, 153, 153));
        labelAcess.setText("Acessos");
        labelAcess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAcessMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAcessMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAcessMouseEntered(evt);
            }
        });
        panelPrincipal.add(labelAcess);
        labelAcess.setBounds(340, 620, 60, 22);

        labelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/menuBackground.jpg"))); // NOI18N
        panelPrincipal.add(labelBackground);
        labelBackground.setBounds(0, 0, 720, 660);

        getContentPane().add(panelPrincipal);
        panelPrincipal.setBounds(350, 0, 720, 660);

        panelBlackBorder.setBackground(new java.awt.Color(0, 0, 0));
        panelBlackBorder.setLayout(null);
        getContentPane().add(panelBlackBorder);
        panelBlackBorder.setBounds(340, 0, 10, 660);

        panelBackLogo.setBackground(new java.awt.Color(204, 153, 0));
        panelBackLogo.setLayout(null);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/Logo.png"))); // NOI18N
        panelBackLogo.add(Logo);
        Logo.setBounds(100, 10, 120, 120);

        backLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/back.jpg"))); // NOI18N
        panelBackLogo.add(backLogo);
        backLogo.setBounds(0, 0, 340, 140);

        getContentPane().add(panelBackLogo);
        panelBackLogo.setBounds(0, 0, 340, 140);

        panelBackFuncoes.setBackground(new java.awt.Color(255, 204, 0));
        panelBackFuncoes.setLayout(null);

        btnTransfer.setBackground(new java.awt.Color(0, 51, 255));
        btnTransfer.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnTransfer.setForeground(new java.awt.Color(255, 255, 255));
        btnTransfer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/tranfer.png"))); // NOI18N
        btnTransfer.setText("TRANSFERÊNCIA");
        btnTransfer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransfer.setFocusPainted(false);
        btnTransfer.setMaximumSize(new java.awt.Dimension(95, 35));
        btnTransfer.setMinimumSize(new java.awt.Dimension(95, 35));
        btnTransfer.setPreferredSize(new java.awt.Dimension(95, 35));
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });
        panelBackFuncoes.add(btnTransfer);
        btnTransfer.setBounds(20, 280, 300, 50);

        btnSaque.setBackground(new java.awt.Color(0, 51, 255));
        btnSaque.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnSaque.setForeground(new java.awt.Color(255, 255, 255));
        btnSaque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/saque.png"))); // NOI18N
        btnSaque.setText("SAQUE PROGRAMADO");
        btnSaque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaque.setFocusPainted(false);
        btnSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaqueActionPerformed(evt);
            }
        });
        panelBackFuncoes.add(btnSaque);
        btnSaque.setBounds(20, 40, 300, 50);

        btnExtrato.setBackground(new java.awt.Color(0, 51, 255));
        btnExtrato.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnExtrato.setForeground(new java.awt.Color(255, 255, 255));
        btnExtrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/list.png"))); // NOI18N
        btnExtrato.setText("EXTRATO");
        btnExtrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExtrato.setFocusPainted(false);
        btnExtrato.setMaximumSize(new java.awt.Dimension(95, 35));
        btnExtrato.setMinimumSize(new java.awt.Dimension(95, 35));
        btnExtrato.setPreferredSize(new java.awt.Dimension(95, 35));
        btnExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtratoActionPerformed(evt);
            }
        });
        panelBackFuncoes.add(btnExtrato);
        btnExtrato.setBounds(20, 390, 300, 50);

        btnDeposito.setBackground(new java.awt.Color(0, 51, 255));
        btnDeposito.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnDeposito.setForeground(new java.awt.Color(255, 255, 255));
        btnDeposito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/deposito.png"))); // NOI18N
        btnDeposito.setText("DEPÓSITO RÁPIDO");
        btnDeposito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeposito.setFocusPainted(false);
        btnDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositoActionPerformed(evt);
            }
        });
        panelBackFuncoes.add(btnDeposito);
        btnDeposito.setBounds(20, 160, 300, 50);

        getContentPane().add(panelBackFuncoes);
        panelBackFuncoes.setBounds(0, 150, 340, 510);

        panelBlackBorder2.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(panelBlackBorder2);
        panelBlackBorder2.setBounds(0, 140, 340, 10);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaqueActionPerformed
        dispose();
        new jFrameSaque().setVisible(true);
    }//GEN-LAST:event_btnSaqueActionPerformed

    private void setLastTransfer(){
        
        for(Transferencias t:con.getLastSendTransfer()){
            
            lblID.setText(t.getLastNome());
            lblValor.setText(String.valueOf("R$ "+t.getLastValue()));
        }
    }
    
    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
        dispose();
        new jFrameTransferencia().setVisible(true);
    }//GEN-LAST:event_btnTransferActionPerformed

    private void labelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseEntered
        labelExit.setForeground(Color.BLUE);
        labelExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_labelExitMouseEntered

    private void labelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseExited
        labelExit.setForeground(Color.GRAY);
        labelExit.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_labelExitMouseExited

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        JOptionPane.showMessageDialog(null, "Você saiu da conta, realize o login novamente!", "Você Saiu!", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/altf4/banco/icons/Logo.png")));
        dispose();
        new jFrameLogin().setVisible(true);
        UserInfo.leftAccount();
    }//GEN-LAST:event_labelExitMouseClicked

    private void btnExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtratoActionPerformed
        dispose();
        new jFrameExtrato().setVisible(true);
    }//GEN-LAST:event_btnExtratoActionPerformed

    private void btnDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoActionPerformed
        dispose();
        new jFrameDeposito().setVisible(true);
    }//GEN-LAST:event_btnDepositoActionPerformed

    private void labelChangePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelChangePassMouseClicked
        dispose();
        new jFrameChangePass().setVisible(true);
    }//GEN-LAST:event_labelChangePassMouseClicked

    private void labelChangePassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelChangePassMouseExited
        labelChangePass.setForeground(Color.GRAY);
        labelChangePass.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_labelChangePassMouseExited

    private void labelChangePassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelChangePassMouseEntered
        labelChangePass.setForeground(Color.BLUE);
        labelChangePass.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_labelChangePassMouseEntered

    private void labelAcessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAcessMouseClicked
        dispose();
        new jFrameAcesso().setVisible(true);
    }//GEN-LAST:event_labelAcessMouseClicked

    private void labelAcessMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAcessMouseExited
        labelAcess.setForeground(Color.GRAY);
        labelAcess.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_labelAcessMouseExited

    private void labelAcessMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAcessMouseEntered
        labelAcess.setForeground(Color.BLUE);
        labelAcess.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_labelAcessMouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel backLogo;
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnExtrato;
    private javax.swing.JButton btnSaque;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JLabel contaId;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelAcess;
    private javax.swing.JLabel labelBackAccount;
    private javax.swing.JLabel labelBackInfos;
    private javax.swing.JLabel labelBackLS;
    private javax.swing.JLabel labelBackground;
    private javax.swing.JLabel labelChangePass;
    private javax.swing.JLabel labelConta;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelLTValor;
    private javax.swing.JLabel labelLTvalor;
    private javax.swing.JLabel labelLastTransfer;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNomeResult;
    private javax.swing.JLabel labelRetiradaResult;
    private javax.swing.JLabel labelSaldo;
    private javax.swing.JLabel labelSaldoResult;
    private javax.swing.JLabel labelretirada;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel panelAccount;
    private javax.swing.JPanel panelBackFuncoes;
    private javax.swing.JPanel panelBackLogo;
    private javax.swing.JPanel panelBackReciver;
    private javax.swing.JPanel panelBlackBorder;
    private javax.swing.JPanel panelBlackBorder2;
    private javax.swing.JPanel panelLTValue;
    private javax.swing.JPanel panelLastTransfer;
    private javax.swing.JPanel panelNomeSaldo;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
