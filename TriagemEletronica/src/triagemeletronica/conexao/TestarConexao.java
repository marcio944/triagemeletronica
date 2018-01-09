/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triagemeletronica.conexao;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static triagemeletronica.interfaces.administrador.Tela_Administrador_Adicionar_Medico.txtPerfilMed;

/**
 *
 * @author Esdras Fragoso
 */
public class TestarConexao {
    public static void main(String[] args) {
        // TODO code application logic here
      Connection conexao = null;
    PreparedStatement pst = null;
    PreparedStatement pst2 = null;
    PreparedStatement pst3 = null;
    ResultSet rs = null;
        
      
        conexao = Conexao.getConnection();  
    String sql = "insert into usuarios(nome,login,senha,perfil) values (?,?,?,?)";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, "Carlos");
            pst.setString(2, "João");
            pst.setString(3, "1234");
            pst.setString(4, "121");

            
                int add = pst.executeUpdate();
            

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
