package altf4.banco.jFrames;

import altf4.banco.Acessos;
import altf4.banco.sql.DAO;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class jFrameAcesso extends javax.swing.JFrame {

    DAO dao = new DAO();
    
    public jFrameAcesso() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/altf4/banco/icons/Logo.png"));
        this.setIconImage(ic.getImage());
        readTransfers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackFuncoes = new javax.swing.JPanel();
        gotoCadastrar = new javax.swing.JLabel();
        scrollAcessos = new javax.swing.JScrollPane();
        tableAcessos = new javax.swing.JTable();
        lblAcessos = new javax.swing.JLabel();
        btnChangePass = new javax.swing.JButton();
        panelBlackBorder = new javax.swing.JPanel();
        panelBackLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblAcesso = new javax.swing.JLabel();
        backLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alt+F4 BANK - (ACESSOS)");
        setMinimumSize(new java.awt.Dimension(695, 685));
        setResizable(false);
        setSize(new java.awt.Dimension(695, 685));
        getContentPane().setLayout(null);

        panelBackFuncoes.setBackground(new java.awt.Color(255, 204, 0));
        panelBackFuncoes.setLayout(null);

        gotoCadastrar.setForeground(new java.awt.Color(153, 153, 153));
        gotoCadastrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gotoCadastrar.setText("Voltar ao Menu");
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
        gotoCadastrar.setBounds(270, 450, 130, 16);

        tableAcessos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DATA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAcessos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableAcessos.getTableHeader().setResizingAllowed(false);
        tableAcessos.getTableHeader().setReorderingAllowed(false);
        scrollAcessos.setViewportView(tableAcessos);

        panelBackFuncoes.add(scrollAcessos);
        scrollAcessos.setBounds(10, 60, 660, 320);

        lblAcessos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAcessos.setForeground(new java.awt.Color(0, 0, 0));
        lblAcessos.setText("ACESSOS");
        panelBackFuncoes.add(lblAcessos);
        lblAcessos.setBounds(290, 20, 110, 32);

        btnChangePass.setBackground(new java.awt.Color(0, 51, 255));
        btnChangePass.setForeground(new java.awt.Color(255, 255, 255));
        btnChangePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/write.png"))); // NOI18N
        btnChangePass.setText("Trocar Senha");
        btnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePassActionPerformed(evt);
            }
        });
        panelBackFuncoes.add(btnChangePass);
        btnChangePass.setBounds(270, 410, 130, 23);

        getContentPane().add(panelBackFuncoes);
        panelBackFuncoes.setBounds(0, 150, 680, 500);

        panelBlackBorder.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(panelBlackBorder);
        panelBlackBorder.setBounds(0, 140, 680, 10);

        panelBackLogo.setBackground(new java.awt.Color(204, 153, 0));
        panelBackLogo.setLayout(null);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/Logo.png"))); // NOI18N
        panelBackLogo.add(lblLogo);
        lblLogo.setBounds(10, 10, 120, 120);

        lblAcesso.setFont(new java.awt.Font("Segoe UI", 1, 52)); // NOI18N
        lblAcesso.setForeground(new java.awt.Color(0, 0, 0));
        lblAcesso.setText("ACESSOS À CONTA");
        panelBackLogo.add(lblAcesso);
        lblAcesso.setBounds(160, 30, 490, 71);

        backLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/back.jpg"))); // NOI18N
        panelBackLogo.add(backLogo);
        backLogo.setBounds(0, 0, 680, 140);

        getContentPane().add(panelBackLogo);
        panelBackLogo.setBounds(0, 0, 680, 140);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gotoCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoCadastrarMouseEntered
        gotoCadastrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        gotoCadastrar.setForeground(Color.BLUE);
    }//GEN-LAST:event_gotoCadastrarMouseEntered

    private void readTransfers(){
        
        DefaultTableModel models = (DefaultTableModel) tableAcessos.getModel();
        
        for(Acessos a: dao.getAcessos()){
            
            models.addRow(new Object[]{
                String.valueOf(a.getID()),
                String.valueOf(a.getData()),
            });
        tableAcessos.setModel(models);
        }
    }
    
    private void gotoCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoCadastrarMouseExited
        gotoCadastrar.setForeground(Color.GRAY);
    }//GEN-LAST:event_gotoCadastrarMouseExited

    private void gotoCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoCadastrarMouseClicked
        dispose();
        new jFrameMenu().setVisible(true);
    }//GEN-LAST:event_gotoCadastrarMouseClicked

    private void btnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePassActionPerformed
        dispose();
        new jFrameChangePass().setVisible(true);
    }//GEN-LAST:event_btnChangePassActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLogo;
    private javax.swing.JButton btnChangePass;
    private javax.swing.JLabel gotoCadastrar;
    private javax.swing.JLabel lblAcesso;
    private javax.swing.JLabel lblAcessos;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel panelBackFuncoes;
    private javax.swing.JPanel panelBackLogo;
    private javax.swing.JPanel panelBlackBorder;
    private javax.swing.JScrollPane scrollAcessos;
    private javax.swing.JTable tableAcessos;
    // End of variables declaration//GEN-END:variables
}
