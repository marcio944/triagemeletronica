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
import triagemeletronica.interfaces.administrador.Tela_Administrador_Adicionar_Medico;
import static triagemeletronica.interfaces.administrador.Tela_Administrador_Adicionar_Medico.txtPerfilMed;

/**
 *
 * @author Esdras Fragoso
 */
public class TestarConexao {
    public static void main(String[] args) {
        // TODO code application logic here
        Tela_Administrador_Adicionar_Medico m = new Tela_Administrador_Adicionar_Medico();
        m.adicionar_usuario(); 
    }
}
