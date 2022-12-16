package altf4.banco.jFrames;

import altf4.banco.sql.DAO;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class jFrameCadastro extends javax.swing.JFrame {

    DAO dao = new DAO();
    
    public jFrameCadastro() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/altf4/banco/icons/Logo.png"));
        this.setIconImage(ic.getImage());
        useNumCPF.setVisible(false);
        useNumRG.setVisible(false);
        useNumNome.setVisible(false);
        useNumSobrenome.setVisible(false);
        useNumLogin.setVisible(false);
        useNumPass.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblCadastro = new javax.swing.JLabel();
        backLogo = new javax.swing.JLabel();
        panelBackFuncoes = new javax.swing.JPanel();
        txtSenha = new javax.swing.JPasswordField();
        btnCadastro = new javax.swing.JButton();
        lblPass = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblSobrenome = new javax.swing.JLabel();
        lblRG = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblNasc = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        gotoLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        txtRG = new javax.swing.JFormattedTextField();
        nascYear = new javax.swing.JSpinner();
        nascDay = new javax.swing.JSpinner();
        nascMonth = new javax.swing.JSpinner();
        useNumCPF = new javax.swing.JPanel();
        FI2 = new javax.swing.JLabel();
        useNumNome = new javax.swing.JPanel();
        FI = new javax.swing.JLabel();
        useNumSobrenome = new javax.swing.JPanel();
        FI1 = new javax.swing.JLabel();
        useNumRG = new javax.swing.JPanel();
        FI3 = new javax.swing.JLabel();
        useNumPass = new javax.swing.JPanel();
        FI5 = new javax.swing.JLabel();
        useNumLogin = new javax.swing.JPanel();
        FI4 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        panelBlackBorder = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alt+F4 BANK - (CADASTRO)");
        setMinimumSize(new java.awt.Dimension(465, 685));
        setResizable(false);
        setSize(new java.awt.Dimension(465, 685));
        getContentPane().setLayout(null);

        panelBackLogo.setBackground(new java.awt.Color(204, 153, 0));
        panelBackLogo.setLayout(null);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/Logo.png"))); // NOI18N
        panelBackLogo.add(lblLogo);
        lblLogo.setBounds(30, 10, 120, 120);

        lblCadastro.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblCadastro.setText("CADASTRO");
        panelBackLogo.add(lblCadastro);
        lblCadastro.setBounds(170, 40, 260, 64);

        backLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/back.jpg"))); // NOI18N
        panelBackLogo.add(backLogo);
        backLogo.setBounds(0, 0, 460, 140);

        getContentPane().add(panelBackLogo);
        panelBackLogo.setBounds(0, 0, 460, 140);

        panelBackFuncoes.setBackground(new java.awt.Color(255, 204, 0));
        panelBackFuncoes.setLayout(null);

        txtSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)), "Caracteres(20)", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 10), new java.awt.Color(102, 102, 102))); // NOI18N
        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaFocusLost(evt);
            }
        });
        panelBackFuncoes.add(txtSenha);
        txtSenha.setBounds(140, 340, 190, 40);

        btnCadastro.setBackground(new java.awt.Color(0, 51, 255));
        btnCadastro.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altf4/banco/icons/new.png"))); // NOI18N
        btnCadastro.setText("CADASTRAR");
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
        btnCadastro.setBounds(80, 400, 300, 50);

        lblPass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPass.setForeground(new java.awt.Color(0, 0, 0));
        lblPass.setText("SENHA");
        panelBackFuncoes.add(lblPass);
        lblPass.setBounds(70, 350, 70, 25);

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 0, 0));
        lblName.setText("NOME");
        panelBackFuncoes.add(lblName);
        lblName.setBounds(80, 20, 60, 25);

        lblSobrenome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSobrenome.setForeground(new java.awt.Color(0, 0, 0));
        lblSobrenome.setText("SOBRENOME");
        panelBackFuncoes.add(lblSobrenome);
        lblSobrenome.setBounds(20, 80, 120, 25);

        lblRG.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblRG.setForeground(new java.awt.Color(0, 0, 0));
        lblRG.setText("RG");
        panelBackFuncoes.add(lblRG);
        lblRG.setBounds(110, 140, 30, 25);

        lblCPF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(0, 0, 0));
        lblCPF.setText("CPF");
        panelBackFuncoes.add(lblCPF);
        lblCPF.setBounds(100, 200, 40, 25);

        lblNasc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNasc.setForeground(new java.awt.Color(0, 0, 0));
        lblNasc.setText("NASCIMENTO");
        panelBackFuncoes.add(lblNasc);
        lblNasc.setBounds(10, 250, 120, 25);

        lblLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(0, 0, 0));
        lblLogin.setText("LOGIN");
        panelBackFuncoes.add(lblLogin);
        lblLogin.setBounds(70, 290, 60, 25);

        gotoLogin.setForeground(new java.awt.Color(153, 153, 153));
        gotoLogin.setText("Voltar ao Login");
        gotoLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gotoLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gotoLoginMouseExited(evt);
            }
        });
        panelBackFuncoes.add(gotoLogin);
        gotoLogin.setBounds(190, 460, 90, 16);

        txtLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)), "Caracteres(15)", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 10), new java.awt.Color(102, 102, 102))); // NOI18N
        txtLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLoginFocusLost(evt);
            }
        });
        panelBackFuncoes.add(txtLogin);
        txtLogin.setBounds(140, 280, 190, 40);

        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)), "Caracteres(20)", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 10), new java.awt.Color(102, 102, 102))); // NOI18N
        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });
        panelBackFuncoes.add(txtNome);
        txtNome.setBounds(140, 10, 190, 40);

        txtSobrenome.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)), "Caracteres(40)", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 10), new java.awt.Color(102, 102, 102))); // NOI18N
        txtSobrenome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSobrenomeFocusLost(evt);
            }
        });
        panelBackFuncoes.add(txtSobrenome);
        txtSobrenome.setBounds(140, 70, 190, 40);

        txtRG.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)), "Formato(9): XXXXXXXXX", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 10), new java.awt.Color(102, 102, 102))); // NOI18N
        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRGFocusLost(evt);
            }
        });
        txtRG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRGMouseClicked(evt);
            }
        });
        panelBackFuncoes.add(txtRG);
        txtRG.setBounds(140, 130, 190, 40);

        nascYear.setModel(new javax.swing.SpinnerListModel(new String[] {"1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022"}));
        panelBackFuncoes.add(nascYear);
        nascYear.setBounds(260, 250, 70, 22);

        nascDay.setModel(new javax.swing.SpinnerNumberModel(1, null, 31, 1));
        panelBackFuncoes.add(nascDay);
        nascDay.setBounds(140, 250, 50, 22);

        nascMonth.setModel(new javax.swing.SpinnerNumberModel(1, null, 12, 1));
        panelBackFuncoes.add(nascMonth);
        nascMonth.setBounds(200, 250, 50, 22);

        useNumCPF.setBackground(new java.awt.Color(255, 0, 0));
        useNumCPF.setLayout(null);

        FI2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        FI2.setForeground(new java.awt.Color(255, 255, 255));
        FI2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FI2.setText("Formatação Inválida");
        useNumCPF.add(FI2);
        FI2.setBounds(0, 0, 190, 10);

        panelBackFuncoes.add(useNumCPF);
        useNumCPF.setBounds(140, 230, 190, 10);

        useNumNome.setBackground(new java.awt.Color(255, 0, 0));
        useNumNome.setLayout(null);

        FI.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        FI.setForeground(new java.awt.Color(255, 255, 255));
        FI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FI.setText("Formatação Inválida");
        useNumNome.add(FI);
        FI.setBounds(0, 0, 190, 10);

        panelBackFuncoes.add(useNumNome);
        useNumNome.setBounds(140, 50, 190, 10);

        useNumSobrenome.setBackground(new java.awt.Color(255, 0, 0));
        useNumSobrenome.setLayout(null);

        FI1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        FI1.setForeground(new java.awt.Color(255, 255, 255));
        FI1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FI1.setText("Formatação Inválida");
        useNumSobrenome.add(FI1);
        FI1.setBounds(0, 0, 190, 10);

        panelBackFuncoes.add(useNumSobrenome);
        useNumSobrenome.setBounds(140, 110, 190, 10);

        useNumRG.setBackground(new java.awt.Color(255, 0, 0));
        useNumRG.setLayout(null);

        FI3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        FI3.setForeground(new java.awt.Color(255, 255, 255));
        FI3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FI3.setText("Formatação Inválida");
        useNumRG.add(FI3);
        FI3.setBounds(0, 0, 190, 10);

        panelBackFuncoes.add(useNumRG);
        useNumRG.setBounds(140, 170, 190, 10);

        useNumPass.setBackground(new java.awt.Color(255, 0, 0));
        useNumPass.setLayout(null);

        FI5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        FI5.setForeground(new java.awt.Color(255, 255, 255));
        FI5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FI5.setText("Formatação Inválida");
        useNumPass.add(FI5);
        FI5.setBounds(0, 0, 190, 10);

        panelBackFuncoes.add(useNumPass);
        useNumPass.setBounds(140, 380, 190, 10);

        useNumLogin.setBackground(new java.awt.Color(255, 0, 0));
        useNumLogin.setLayout(null);

        FI4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        FI4.setForeground(new java.awt.Color(255, 255, 255));
        FI4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FI4.setText("Formatação Inválida");
        useNumLogin.add(FI4);
        FI4.setBounds(0, 0, 190, 10);

        panelBackFuncoes.add(useNumLogin);
        useNumLogin.setBounds(140, 320, 190, 10);

        txtCPF.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)), "Formato(11): XXXXXXXXXXX", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 10), new java.awt.Color(102, 102, 102))); // NOI18N
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCPFFocusLost(evt);
            }
        });
        txtCPF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCPFMouseClicked(evt);
            }
        });
        panelBackFuncoes.add(txtCPF);
        txtCPF.setBounds(140, 190, 190, 40);

        getContentPane().add(panelBackFuncoes);
        panelBackFuncoes.setBounds(0, 150, 460, 500);

        panelBlackBorder.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(panelBlackBorder);
        panelBlackBorder.setBounds(0, 140, 460, 10);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gotoLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoLoginMouseClicked
        dispose();
        new jFrameLogin().setVisible(true);
    }//GEN-LAST:event_gotoLoginMouseClicked

    public String getNome(){
        
        return txtNome.getText();
    }
    
    public String getSobrenome(){
        
        return txtSobrenome.getText();
    }
    
    public String getCPF(){
        
        return txtCPF.getText();
    }
    
    public String getRG(){
        
        return txtRG.getText();
    }
    
    public String getNasc(){
        
        String result = String.valueOf(nascYear.getValue() 
                + "-" + nascMonth.getValue() 
                + "-" + nascDay.getValue());
        
        return result;
    }
    
    public String getLogin(){
        
        return txtLogin.getText();
    }
    
    public String getSenha(){
        
        return String.valueOf(txtSenha.getPassword());
    }
    
    private void gotoLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoLoginMouseEntered
        
        gotoLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        gotoLogin.setForeground(Color.BLUE);
    }//GEN-LAST:event_gotoLoginMouseEntered

    private void gotoLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoLoginMouseExited
        gotoLogin.setForeground(Color.GRAY);
    }//GEN-LAST:event_gotoLoginMouseExited

    private void resetarCampos() {                                      
        
        txtRG.setText("");
        txtLogin.setText("");
        txtNome.setText("");
        txtCPF.setText("");
        txtSenha.setText("");
        txtSobrenome.setText("");
        nascDay.setValue(1);
        nascMonth.setValue(1);
        nascYear.setValue("1925");
    }      
    
    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed

        if(!getCPF().equals("           ")&&!getRG().equals("         ")&&!getRG().equals("")
                &&!getCPF().equals("")&&!getNome().equals("")&&!getLogin().equals("")
                &&!getSenha().equals("")&&!getSobrenome().equals("")){
        
            if(dao.cadastro(getNome(), getSobrenome(), getCPF(), getNasc(), getRG(), getLogin(), getSenha())){
                dispose();
                new jFrameLogin().setVisible(true);
            }else{
                resetarCampos();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente.", "ERRO", JOptionPane.WARNING_MESSAGE, null);
            resetarCampos();
        }
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void txtRGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRGFocusLost
        if(getRG().contains(" ") && getRG() != null){
            useNumRG.setVisible(true);
        }else{
            useNumRG.setVisible(false);
        }
    }//GEN-LAST:event_txtRGFocusLost

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        if(getNome().length() > 20 && getNome() != null){
            useNumNome.setVisible(true);
            txtNome.setText(null);
        }else{
            useNumNome.setVisible(false);
        }
    }//GEN-LAST:event_txtNomeFocusLost

    private void txtSobrenomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSobrenomeFocusLost
        if(getSobrenome().length() > 40 && getSobrenome() != null){
            useNumSobrenome.setVisible(true);
            txtSobrenome.setText(null);
        }else{
            useNumSobrenome.setVisible(false);
        }
    }//GEN-LAST:event_txtSobrenomeFocusLost

    private void txtLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoginFocusLost
        if(getLogin().contains(" ") || getLogin().length() > 15 && getLogin() != null){
            useNumLogin.setVisible(true);
            txtLogin.setText(null);
        }else{
            useNumLogin.setVisible(false);
        }
    }//GEN-LAST:event_txtLoginFocusLost

    private void txtSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusLost
        if(getSenha().contains(" ") || getSenha().length() > 20 && getSenha() != null){
            useNumPass.setVisible(true);
            txtSenha.setText(null);
        }else{
            useNumPass.setVisible(false);
        }
    }//GEN-LAST:event_txtSenhaFocusLost

    private void txtCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPFFocusLost
        if(getCPF().contains(" ") && getCPF() != null){
            useNumCPF.setVisible(true);
        }else{
            useNumCPF.setVisible(false);
        }
    }//GEN-LAST:event_txtCPFFocusLost

    private void txtCPFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCPFMouseClicked
        txtCPF.setText(null);
    }//GEN-LAST:event_txtCPFMouseClicked

    private void txtRGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRGMouseClicked
        txtRG.setText(null);
    }//GEN-LAST:event_txtRGMouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FI;
    private javax.swing.JLabel FI1;
    private javax.swing.JLabel FI2;
    private javax.swing.JLabel FI3;
    private javax.swing.JLabel FI4;
    private javax.swing.JLabel FI5;
    private javax.swing.JLabel backLogo;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JLabel gotoLogin;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNasc;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblSobrenome;
    private javax.swing.JSpinner nascDay;
    private javax.swing.JSpinner nascMonth;
    private javax.swing.JSpinner nascYear;
    private javax.swing.JPanel panelBackFuncoes;
    private javax.swing.JPanel panelBackLogo;
    private javax.swing.JPanel panelBlackBorder;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtSobrenome;
    private javax.swing.JPanel useNumCPF;
    private javax.swing.JPanel useNumLogin;
    private javax.swing.JPanel useNumNome;
    private javax.swing.JPanel useNumPass;
    private javax.swing.JPanel useNumRG;
    private javax.swing.JPanel useNumSobrenome;
    // End of variables declaration//GEN-END:variables
}
