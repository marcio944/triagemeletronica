/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triagem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.jdesktop.beansbinding.BindingGroup;
import triagemeletronica.conexao.Conexao;

/**
 *
 * @author JOICE FRAGOSO
 */
public class Triagem  extends JFrame{
    public javax.swing.JTextField Sistole;
    public javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField diastola;

    
    private javax.swing.JToggleButton jBVerificar;
    private javax.swing.JButton jButtonTriagem;
    private javax.swing.JCheckBox jCheckBoxAlergia;
    private javax.swing.JCheckBox jCheckBoxDores;
    private javax.swing.JComboBox<String> jComboBoxBairro;
    private javax.swing.JComboBox<String> jComboBoxCidade;
    private javax.swing.JComboBox<String> jComboBoxCor;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxMotivoDaVienda;
    private javax.swing.JComboBox<String> jComboBoxProcedencia;
    private javax.swing.JComboBox<String> jComboBoxRegiao;
    private javax.swing.JComboBox<String> jComboBoxRua;
    private javax.swing.JComboBox<String> jComboBoxZona;
    private javax.swing.JLabel jLBairro;
    private javax.swing.JLabel jLCEP;
    private javax.swing.JLabel jLCartaoSUS;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLEndereco;
    private javax.swing.JLabel jLQual;
    private javax.swing.JLabel jLRG;
    private javax.swing.JLabel jLZona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFBairro;
    private javax.swing.JTextField jTFCEP;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFQual;
    private javax.swing.JTextField jTFRG;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldProcedencia;
    private javax.swing.JTextField jTextFieldRua;
    private javax.swing.JTextField jTextFieldTemperatura;
    private javax.swing.JTextField jTextNumeroCartaoSUS;
    private javax.swing.JTextPane jTextPaneMotivoDaVinda;
    private javax.swing.JLabel jlEstado;

    


public Triagem() {
    
        Connection conexao = Conexao.getConnection();
        BindingGroup bindingGroup = new org.jdesktop.beansbinding.BindingGroup();
       
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLCartaoSUS = new javax.swing.JLabel();
        jTextNumeroCartaoSUS = new javax.swing.JTextField();
        jBVerificar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLEndereco = new javax.swing.JLabel();
        jLBairro = new javax.swing.JLabel();
        jTFBairro = new javax.swing.JTextField();
        jLCEP = new javax.swing.JLabel();
        jTFCEP = new javax.swing.JTextField();
        jlEstado = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jLCidade = new javax.swing.JLabel();
        jComboBoxCidade = new javax.swing.JComboBox<>();
        jLRG = new javax.swing.JLabel();
        jTFRG = new javax.swing.JTextField();
        jLZona = new javax.swing.JLabel();
        jComboBoxZona = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jCheckBoxAlergia = new javax.swing.JCheckBox();
        jLQual = new javax.swing.JLabel();
        jTFQual = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldProcedencia = new javax.swing.JTextField();
        jComboBoxProcedencia = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxMotivoDaVienda = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldTemperatura = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCheckBoxDores = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Sistole = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        diastola = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneMotivoDaVinda = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxCor = new javax.swing.JComboBox<>();
        jButtonTriagem = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxRegiao = new javax.swing.JComboBox<>();
        jComboBoxBairro = new javax.swing.JComboBox<>();
        jComboBoxRua = new javax.swing.JComboBox<>();
        jTextFieldRua = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLCartaoSUS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLCartaoSUS.setText("Informe o numero do cartão do SUS:");

        jBVerificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBVerificar.setText("Verificar");

        
        
         jBVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                        
        String sql = "SELECT * FROM `paciente` WHERE cartao_sus='"+jTextNumeroCartaoSUS.getText()+"'";
        System.err.println(jTextNumeroCartaoSUS.getText());
        try {
             Conexao c = new Conexao();
       Connection con = c.getConnection();
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery(sql);
            String sus = jTextNumeroCartaoSUS.getText(); 
           
            if(rs.next()!=false){
       
                
                
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nome:");

        jLEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLEndereco.setText("Rua:");

        jLBairro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLBairro.setText("Bairro");

       

        jLCEP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLCEP.setText("CEP:");

        jlEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlEstado.setText("Estado");

       
        jLCidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLCidade.setText("Cidade");


        jLRG.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLRG.setText("RG");

      
        jLZona.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLZona.setText("Zona:");

        jComboBoxZona.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "URBANA", "RURAL" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("O paciente tem diabetes:");

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton1.setText("SIM");

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton2.setText("NÂO");
        

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("O paciente possui alergias ?");

        jCheckBoxAlergia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxAlergia.setText("SIM");

        jLQual.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLQual.setText("Qual:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Procedencia:");

        jTextFieldProcedencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jComboBoxProcedencia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxProcedencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Motivo da Vinda:");

        jComboBoxMotivoDaVienda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxMotivoDaVienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Temperatura:");

       
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Paciente esta com fortes dores?");

        jCheckBoxDores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBoxDores.setText("SIM");
        

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Resultado do teste de clicemia:");

       

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Resultado da pressão sístole:");

        

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Resultado da pressão diastóla:");

        jScrollPane1.setViewportView(jTextPaneMotivoDaVinda);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Selecione a cor:");

        jComboBoxCor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vermelho", "Laranja", "Amarelo", "Verde", "Azual" }));

        jButtonTriagem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonTriagem.setText("Realizar Triagem");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Região:");

        jComboBoxRegiao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxRegiao.setModel(new javax.swing.DefaultComboBoxModel<>(Regiao()));

        jComboBoxBairro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxBairro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));

        jComboBoxRua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxRua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Nº:");
           
        jTFNome.setText(rs.getString("nome"));
        jTFCEP.setText(rs.getString("cep"));
        jTFRG.setText(rs.getString("rg"));
        jTextFieldNumero.setText(rs.getString("numero"));
        
          
        jComboBoxEstado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        
       
        
        
            stmt.close();
            rs.close();
            
            }      
        
        } catch (SQLException ex) {
            Logger.getLogger(triagemeletronica.paciente.Triagem.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        
            }
        });
        
         jComboBoxEstado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String noem = (String) jComboBoxEstado.getSelectedItem(); 
                 Conexao c = new Conexao();
       Connection con = c.getConnection();
            String sql = "SELECT Uf FROM `estado` WHERE Nome='"+noem+"';"; 
            PreparedStatement stmt;
                try {
                    stmt = con.prepareStatement(sql);
               
            ResultSet rs = stmt.executeQuery(sql);
            String sus = jTextNumeroCartaoSUS.getText(); 
           
            if(rs.next()!=false){
                            
                
        jComboBoxCidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxCidade.setModel(new javax.swing.DefaultComboBoxModel<>(Cidade((String)rs.getString("Uf"))));
            }
            
            
             } catch (SQLException ex) {
                    Logger.getLogger(Triagem.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
         jComboBoxRegiao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String noem = (String) jComboBoxRegiao.getSelectedItem(); 
                 Conexao c = new Conexao();
       Connection con = c.getConnection();
            String sql = "SELECT id FROM `regiao` WHERE Nome='"+noem+"';"; 
            PreparedStatement stmt;
                try {
                    stmt = con.prepareStatement(sql);
               
            ResultSet rs = stmt.executeQuery(sql);
            String sus = jTextNumeroCartaoSUS.getText(); 
           
            if(rs.next()!=false){
                            
                
        jComboBoxEstado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(Estado((String)rs.getString("Id"))));
            }
            
            
             } catch (SQLException ex) {
                    Logger.getLogger(Triagem.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
         
         
        jComboBoxCidade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String noem = (String) jComboBoxCidade.getSelectedItem(); 
                 Conexao c = new Conexao();
       Connection con = c.getConnection();
            String sql = "SELECT Id FROM `municipio` WHERE Nome='"+noem+"'; "; 
            PreparedStatement stmt;
                try {
                    stmt = con.prepareStatement(sql);
               
            ResultSet rs = stmt.executeQuery(sql);
            
           
            if(rs.next()!=false){
                            
                System.err.println(rs.getString("Id"));    
        jComboBoxRua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxRua.setModel(new javax.swing.DefaultComboBoxModel<>(Rua((String)rs.getString("Id"))));
            }
            
            
             } catch (SQLException ex) {
                    Logger.getLogger(Triagem.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
          
         
         
         
         
         
          
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBoxDores))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxCor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Sistole, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(diastola, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(jButtonTriagem)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLBairro)
                                    .addComponent(jLRG))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(236, 236, 236)
                                        .addComponent(jLZona)
                                        .addGap(10, 10, 10)
                                        .addComponent(jComboBoxZona, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jComboBoxBairro, 0, 232, Short.MAX_VALUE)
                                            .addComponent(jTFRG))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNumero))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFNome)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 57, Short.MAX_VALUE)
                                        .addComponent(jLCartaoSUS)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextNumeroCartaoSUS, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBoxRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlEstado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLCidade)
                                    .addComponent(jLEndereco))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBoxRua, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldRua)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxMotivoDaVienda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBoxAlergia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLQual))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldProcedencia)
                                    .addComponent(jTFQual)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4)))
                        .addGap(14, 14, 14)
                        .addComponent(jBVerificar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCartaoSUS, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jTextNumeroCartaoSUS, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBVerificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBoxRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEstado)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCidade)
                    .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCEP)
                    .addComponent(jTFCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLEndereco)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBairro)
                    .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRG)
                    .addComponent(jTFRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLZona)
                    .addComponent(jComboBoxZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel8)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCheckBoxAlergia)
                    .addComponent(jLQual)
                    .addComponent(jTFQual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxMotivoDaVienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jCheckBoxDores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Sistole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(diastola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBoxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTriagem))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );



         pack();
        setVisible(true);
        this.setResizable(false);
    }// </editor-fold>      



 public static String [] Regiao() throws SQLException{
       String sql = "SELECT Nome FROM `regiao`";
       Conexao c = new Conexao();
       Connection con = c.getConnection();
       PreparedStatement stmt = con.prepareStatement(sql); 
       ResultSet rs = stmt.executeQuery(sql);
       String[] r = new  String[5]; 
      // rs.last();
      // int totalOfRecords = rs.getRow();
      // rs.beforeFirst();
      // System.err.println(totalOfRecords);
      
      int i =0;
       while (rs.next()) {            
                r[i] = rs.getString("Nome");
                i++;

        }
        
        return r; 
    }

public static String [] Cidade(String uf) throws SQLException{
    String sql = "SELECT Nome FROM `municipio` WHERE Uf='"+uf+"'; ";
    Conexao c = new Conexao();
       Connection con = c.getConnection();
       PreparedStatement stmt = con.prepareStatement(sql); 
       ResultSet rs = stmt.executeQuery(sql);
       
       rs.last();
       int totalOfRecords = rs.getRow();
       rs.beforeFirst();
       System.err.println(totalOfRecords);
      String[] r = new  String[totalOfRecords]; 
      int i =0;
       while (rs.next()) {            
                r[i] = rs.getString("Nome");
                i++;

        }
        
        return r; 
    
}




public static String [] Rua(String id) throws SQLException{
       String sql = "SELECT Nome FROM `rua` WHERE municipio_Id='"+id+"';";
       Conexao c = new Conexao();
       Connection con = c.getConnection();
       PreparedStatement stmt = con.prepareStatement(sql); 
       ResultSet rs = stmt.executeQuery(sql);
        
       rs.last();
       int totalOfRecords = rs.getRow();
       rs.beforeFirst();
       System.err.println(totalOfRecords+1);
      String[] r = new  String[totalOfRecords+1];
      int i =1;
      r[0] = "Selecione a rua!";
       while (rs.next()) {            
                r[i] = rs.getString("Nome");
                i++;

        }
        
        return r; 
    }




public static String [] Estado(String id) throws SQLException{
       String sql = "SELECT Nome FROM `estado` WHERE Regiao='"+id+"';";
       Conexao c = new Conexao();
       Connection con = c.getConnection();
       PreparedStatement stmt = con.prepareStatement(sql); 
       ResultSet rs = stmt.executeQuery(sql);
        
       rs.last();
       int totalOfRecords = rs.getRow();
       rs.beforeFirst();
       System.err.println(totalOfRecords);
      String[] r = new  String[totalOfRecords];
      int i =0;
       while (rs.next()) {            
                r[i] = rs.getString("Nome");
                i++;

        }
        
        return r; 
    }
    
 public static void main(String[] args) throws Exception {    
   new Triagem();

 }    



}

    



