package Servidor;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Patrick
 */
public class Medico_Cadastrar extends javax.swing.JFrame {

    int aux;
    String Id;

    public Medico_Cadastrar(int x, String[] obj) {
        aux = x;

        initComponents();
        if (aux == 2) {
            Id = obj[0];
            Preencher(obj);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        NomeCadastroMedico = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CRMCadastroMedico = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        EspCadastroMedico = new javax.swing.JTextField();
        ButaoCadastrarUsuario = new javax.swing.JButton();
        CPFCadastroMedico = new javax.swing.JTextField();
        ButaoCancelarCadastroUsuario = new javax.swing.JButton();
        DescCadastroMedico = new javax.swing.JTextField();
        ValorCadastroMedico = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Médico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jLabel1.setText("CPF:");

        jLabel6.setText("Valor:");

        jLabel2.setText("Nome: ");

        CRMCadastroMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRMCadastroMedicoActionPerformed(evt);
            }
        });

        jLabel4.setText("CRM:");

        jLabel7.setText("Descrição:");

        jLabel5.setText("Especialidade:");

        ButaoCadastrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/success.png"))); // NOI18N
        ButaoCadastrarUsuario.setText("Cadastrar");
        ButaoCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButaoCadastrarUsuarioActionPerformed(evt);
            }
        });

        ButaoCancelarCadastroUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/error.png"))); // NOI18N
        ButaoCancelarCadastroUsuario.setText("Cancelar");
        ButaoCancelarCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButaoCancelarCadastroUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ButaoCadastrarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                        .addComponent(ButaoCancelarCadastroUsuario))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CPFCadastroMedico)
                            .addComponent(NomeCadastroMedico)
                            .addComponent(CRMCadastroMedico)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ValorCadastroMedico))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DescCadastroMedico))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EspCadastroMedico)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPFCadastroMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NomeCadastroMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CRMCadastroMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(EspCadastroMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(DescCadastroMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ValorCadastroMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButaoCadastrarUsuario)
                    .addComponent(ButaoCancelarCadastroUsuario))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(153, 236, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jLabel9.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CRMCadastroMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRMCadastroMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CRMCadastroMedicoActionPerformed

    private void ButaoCancelarCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButaoCancelarCadastroUsuarioActionPerformed
        dispose();
        if (aux == 1 || aux == 2) {
            new Medico_Gerenciar().setVisible(true);
        }
    }//GEN-LAST:event_ButaoCancelarCadastroUsuarioActionPerformed

    private void ButaoCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButaoCadastrarUsuarioActionPerformed
        if (aux == 2) {
            Alterar();
            new Medico_Gerenciar().preencherTabela();
        } else {
            Cadastrar();
            if (aux == 1) {
                new Medico_Gerenciar().preencherTabela();
            }
        }
        dispose();
    }//GEN-LAST:event_ButaoCadastrarUsuarioActionPerformed

    private void Cadastrar() {
        String[] coluna = {CPFCadastroMedico.getText(), NomeCadastroMedico.getText(), CRMCadastroMedico.getText(), EspCadastroMedico.getText(), DescCadastroMedico.getText(), ValorCadastroMedico.getText()};

        bd.connection();

        String sql = "insert into medico (CPF, Nome, CRM, Especializacao, Descricao, Valor) values (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stm = bd.con.prepareStatement(sql);

            stm.setString(1, coluna[0]);
            stm.setString(2, coluna[1]);
            stm.setString(3, coluna[2]);
            stm.setString(4, coluna[3]);
            stm.setString(5, coluna[4]);
            stm.setString(6, coluna[5]);
            stm.execute();
            stm.close();

            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!!");
            ex.printStackTrace();
        }
    }

    public void Alterar() {
        String[] coluna = {CPFCadastroMedico.getText(), NomeCadastroMedico.getText(), CRMCadastroMedico.getText(), EspCadastroMedico.getText(), DescCadastroMedico.getText(), ValorCadastroMedico.getText()};

        bd.connection();

        String update = "UPDATE medico SET CPF = ?, Nome = ?, CRM = ?, Especializacao = ?, Descricao = ?, Valor = ? WHERE Id = ?";

        try {
            PreparedStatement stm = bd.con.prepareStatement(update);

            stm.setString(1, coluna[0]);
            stm.setString(2, coluna[1]);
            stm.setString(3, coluna[2]);
            stm.setString(4, coluna[3]);
            stm.setString(5, coluna[4]);
            stm.setString(6, coluna[5]);
            stm.setInt(7, Integer.parseInt(Id));
            stm.execute();
            stm.close();

            JOptionPane.showMessageDialog(null, "Alterado com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!!");
            ex.printStackTrace();
        }
    }

    public void Preencher(String[] obj) {
        ButaoCadastrarUsuario.setText("Alterar");
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alterar Médico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N
        CPFCadastroMedico.setText(obj[1]);
        NomeCadastroMedico.setText(obj[2]);
        CRMCadastroMedico.setText(obj[3]);
        EspCadastroMedico.setText(obj[4]);
        DescCadastroMedico.setText(obj[5]);
        ValorCadastroMedico.setText(obj[6]);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Medico_Cadastrar(0, null).setVisible(true);
        });
    }

    ConectaBanco bd = new ConectaBanco();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButaoCadastrarUsuario;
    private javax.swing.JButton ButaoCancelarCadastroUsuario;
    private javax.swing.JTextField CPFCadastroMedico;
    private javax.swing.JTextField CRMCadastroMedico;
    private javax.swing.JTextField DescCadastroMedico;
    private javax.swing.JTextField EspCadastroMedico;
    private javax.swing.JTextField NomeCadastroMedico;
    private javax.swing.JTextField ValorCadastroMedico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
