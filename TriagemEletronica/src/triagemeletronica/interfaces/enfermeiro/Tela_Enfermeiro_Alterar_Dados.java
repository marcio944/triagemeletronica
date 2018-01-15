/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triagemeletronica.interfaces.enfermeiro;

import triagemeletronica.conexao.Conexao;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import triagemeletronica.modelos.Enfermeiro;
import triagemeletronica.modelos.Validar;

/**
 *
 * @author Fabricio Sousa
 */
public class Tela_Enfermeiro_Alterar_Dados extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    PreparedStatement pst2 = null;
    ResultSet rs = null;
    Enfermeiro enfermeiro = new Enfermeiro();

    /**
     * Creates new form Tela_Agenda_Adicionar
     */
    public Tela_Enfermeiro_Alterar_Dados() {
        initComponents();
        conexao = Conexao.getConnection();
    }
        
        public void alterar_dados_Enfermeiro(Enfermeiro enfermeiro) throws Exception{
       
        String sql2 = "update Usuarios set nome=?,login=?,senha=? where id=?";
      
         int confirma = JOptionPane.showConfirmDialog(null, "Tem Certeza que deseja Alterar os Dados do Usuario ", "Atenção", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {
            
            Validar validar = new Validar();
            boolean nomeValido = validar.checkName(enfermeiro.getNome());
            boolean senhaValida = validar.checkSenha(enfermeiro.getSenha());
            boolean nulos = validar.camposNulosAlterarEnf(enfermeiro);
        
            try {
            
                pst2 = conexao.prepareStatement(sql2);
                pst2.setString(1, enfermeiro.getNome());
                pst2.setString(2, enfermeiro.getCoren());
                pst2.setString(3, enfermeiro.getSenha()); 
                pst2.setInt(4, enfermeiro.getId());
            
                if(nulos == true && nomeValido == false && senhaValida == true){
                    pst2.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Dados do enfermeiro alterados com sucesso!"); 
            
                }else{
                    throw new Exception("Erro ao alterar dados do enfermeiro!");
                }
            
            
            
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex);
                throw ex;
            }
        }
            /*try {
                        
            pst2 = conexao.prepareStatement(sql2);
            pst2.setString(1, txtNomeEnf.getText());
            pst2.setString(2, txtLoginEnf.getText());
            pst2.setString(3, txtSenhaEnf.getText());
            pst2.setString(4, Tela_Do_Enfermeiro.txtNumID.getText());
       
              if (txtNomeEnf.getText().isEmpty() || txtLoginEnf.getText().isEmpty() || txtSenhaEnf.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Preencha todos os Campos Obrigatorios");

            }else{
               int add2 = pst2.executeUpdate();

                if (add2 > 0) {
                    JOptionPane.showMessageDialog(null, "Alterado Com Sucesso");
                    
                    txtNomeEnf.setText(null);
                    txtLoginEnf.setText(null);
                    txtSenhaEnf.setText(null);
                }
             }

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }*/
    }
        
    public Enfermeiro buscaEnfermeiro(Enfermeiro enfermeiro){
         String sql = "select * from Usuarios where login = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, enfermeiro.getCoren());
            rs = pst.executeQuery();
            if(rs.next()){
                enfermeiro.setNome(rs.getString("Nome"));
                enfermeiro.setCoren(rs.getString("login"));
                enfermeiro.setSenha(rs.getString("senha"));
                enfermeiro.setPerfil(rs.getString("perfil"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados!"+ex);
        }
         
         return enfermeiro;
     }    

    private void pesquisar() {

        String sql = "select  * from Usuarios where login =? And Id=?";

        try {

            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtBuscarEnf.getText());
            pst.setString(2, Tela_Do_Enfermeiro.txtNumID.getText());
            rs = pst.executeQuery();
            
            if (rs.next()){     
                txtNomeEnf.setText(rs.getString(2));
                txtLoginEnf.setText(rs.getString(3));
                txtSenhaEnf.setText(rs.getString(4));
 
            }
//            tblContatos.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        txtBuscarEnf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNomeEnf = new javax.swing.JTextField();
        txtLoginEnf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSenhaEnf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Opções do Enfermeiro");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Digite o Coren: ");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triagemeletronica/icones/deletar.png"))); // NOI18N
        jButton2.setToolTipText("Cancelar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("*Nome: ");

        txtNomeEnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeEnfActionPerformed(evt);
            }
        });

        txtLoginEnf.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("*Senha: ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("*Login");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triagemeletronica/icones/alterar.png"))); // NOI18N
        jButton1.setToolTipText("Alterar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel8.setText("* Campos Obrigatórios");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triagemeletronica/icones/pesquisar 2.0.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(585, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(179, 179, 179))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeEnf, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBuscarEnf, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLoginEnf, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSenhaEnf, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)))
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscarEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLoginEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSenhaEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2});

        setBounds(0, 0, 840, 740);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtNomeEnf.setText(null);
        txtLoginEnf.setText(null);
        txtSenhaEnf.setText(null);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNomeEnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeEnfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeEnfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        enfermeiro.setId(Integer.parseInt(Tela_Do_Enfermeiro.txtNumID.getText()));
        enfermeiro.setNome(txtNomeEnf.getText());
        enfermeiro.setCoren(txtLoginEnf.getText());
        enfermeiro.setSenha(txtSenhaEnf.getText());
        try {
            alterar_dados_Enfermeiro(enfermeiro);
        } catch (Exception ex) {
            Logger.getLogger(Tela_Enfermeiro_Alterar_Dados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            pesquisar();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtBuscarEnf;
    private javax.swing.JTextField txtLoginEnf;
    private javax.swing.JTextField txtNomeEnf;
    private javax.swing.JTextField txtSenhaEnf;
    // End of variables declaration//GEN-END:variables

    private void adicionando() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
