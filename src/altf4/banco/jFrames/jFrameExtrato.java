package altf4.banco.jFrames;

import altf4.banco.sql.Connections;
import altf4.banco.Transferencias;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class jFrameExtrato extends javax.swing.JFrame {

    Connections dao = new Connections();
    
    public jFrameExtrato() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/altf4/banco/icons/Logo.png"));
        this.setIconImage(ic.getImage());
        readTransfers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblExtrato = new javax.swing.JLabel();
        backLogo = new javax.swing.JLabel();
        panelBlackBorder2 = new javax.swing.JPanel();
        panelBackFuncoes = new javax.swing.JPanel();
        gotoCadastrar = new javax.swing.JLabel();
        scrollRecebidas = new javax.swing.JScrollPane();
        tableRecebidas = new javax.swing.JTable();
        scrollEnviadas = new javax.swing.JScrollPane();
        tableEnviadas = new javax.swing.JTable();
        lblRecebidas = new javax.swing.JLabel();
        lblEnviadas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alt+F4 BANK - (EXTRATO)");
        setMinimumSize(new java.awt.Dimension(695, 685));
        setResizable(false);
        setSize(new java.awt.Dimension(695, 685));
        getContentPane().setLayout(null);

        panelBackLogo.setBackground(new java.awt.Color(204, 153, 0));
        panelBackLogo.setLayout(null);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/Logo.png"))); // NOI18N
        panelBackLogo.add(lblLogo);
        lblLogo.setBounds(10, 10, 120, 120);

        lblExtrato.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblExtrato.setForeground(new java.awt.Color(0, 0, 0));
        lblExtrato.setText("EXTRATO BANCARIO");
        panelBackLogo.add(lblExtrato);
        lblExtrato.setBounds(160, 30, 490, 64);

        backLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/back.jpg"))); // NOI18N
        panelBackLogo.add(backLogo);
        backLogo.setBounds(0, 0, 680, 140);

        getContentPane().add(panelBackLogo);
        panelBackLogo.setBounds(0, 0, 680, 140);

        panelBlackBorder2.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(panelBlackBorder2);
        panelBlackBorder2.setBounds(0, 140, 680, 10);

        panelBackFuncoes.setBackground(new java.awt.Color(255, 204, 0));
        panelBackFuncoes.setLayout(null);

        gotoCadastrar.setForeground(new java.awt.Color(153, 153, 153));
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
        gotoCadastrar.setBounds(300, 460, 90, 16);

        tableRecebidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TRANSAÇÃO(ID)", "RECEBEDOR(ID)", "RECEBEDOR(NOME)", "VALOR", "DATA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableRecebidas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableRecebidas.getTableHeader().setResizingAllowed(false);
        tableRecebidas.getTableHeader().setReorderingAllowed(false);
        scrollRecebidas.setViewportView(tableRecebidas);

        panelBackFuncoes.add(scrollRecebidas);
        scrollRecebidas.setBounds(10, 60, 660, 160);

        tableEnviadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TRANSAÇÃO(ID)", "REMETENTE(ID)", "REMETENTE(NOME)", "VALOR", "DATA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableEnviadas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableEnviadas.getTableHeader().setResizingAllowed(false);
        tableEnviadas.getTableHeader().setReorderingAllowed(false);
        scrollEnviadas.setViewportView(tableEnviadas);

        panelBackFuncoes.add(scrollEnviadas);
        scrollEnviadas.setBounds(10, 280, 660, 160);

        lblRecebidas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblRecebidas.setForeground(new java.awt.Color(0, 0, 0));
        lblRecebidas.setText("RECEBIDAS");
        panelBackFuncoes.add(lblRecebidas);
        lblRecebidas.setBounds(280, 240, 130, 32);

        lblEnviadas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblEnviadas.setForeground(new java.awt.Color(0, 0, 0));
        lblEnviadas.setText("ENVIADAS");
        panelBackFuncoes.add(lblEnviadas);
        lblEnviadas.setBounds(280, 20, 130, 32);

        getContentPane().add(panelBackFuncoes);
        panelBackFuncoes.setBounds(0, 150, 680, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gotoCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoCadastrarMouseEntered
        gotoCadastrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        gotoCadastrar.setForeground(Color.BLUE);
    }//GEN-LAST:event_gotoCadastrarMouseEntered

    private void readTransfers(){
        
        DefaultTableModel models = (DefaultTableModel) tableRecebidas.getModel();
        DefaultTableModel modelr = (DefaultTableModel) tableEnviadas.getModel();
        
        for(Transferencias t: dao.getSendTransfers()){
            
            models.addRow(new Object[]{
                String.valueOf(t.getID()),
                String.valueOf(t.getDestino()),
                String.valueOf(t.getRecebedor()),
                String.valueOf("R$ "+t.getValor()),
                String.valueOf(t.getData())
            });
        }
        for(Transferencias t: dao.getRecivedTransfers()){
            
            modelr.addRow(new Object[]{
                String.valueOf(t.getID()),
                String.valueOf(t.getDestino()),
                String.valueOf(t.getRecebedor()),
                String.valueOf("R$ "+t.getValor()),
                String.valueOf(t.getData())
            });
        }
        tableRecebidas.setModel(models);
        tableEnviadas.setModel(modelr);
    }
    
    private void gotoCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoCadastrarMouseExited
        gotoCadastrar.setForeground(Color.GRAY);
    }//GEN-LAST:event_gotoCadastrarMouseExited

    private void gotoCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoCadastrarMouseClicked
        dispose();
        new jFrameMenu().setVisible(true);
    }//GEN-LAST:event_gotoCadastrarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLogo;
    private javax.swing.JLabel gotoCadastrar;
    private javax.swing.JLabel lblEnviadas;
    private javax.swing.JLabel lblExtrato;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblRecebidas;
    private javax.swing.JPanel panelBackFuncoes;
    private javax.swing.JPanel panelBackLogo;
    private javax.swing.JPanel panelBlackBorder2;
    private javax.swing.JScrollPane scrollEnviadas;
    private javax.swing.JScrollPane scrollRecebidas;
    private javax.swing.JTable tableEnviadas;
    private javax.swing.JTable tableRecebidas;
    // End of variables declaration//GEN-END:variables
}
