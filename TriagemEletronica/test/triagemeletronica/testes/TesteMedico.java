package triagemeletronica.testes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import triagemeletronica.interfaces.administrador.Tela_Administrador_Adicionar_Medico;
import triagemeletronica.modelos.Medico;

/**
 *
 * @author lenovo user
 */
public class TesteMedico {
    
    public TesteMedico() {
        Tela_Administrador_Adicionar_Medico tela = new Tela_Administrador_Adicionar_Medico();
        tela.setVisible(true);
    }
           
    @Test
    public void testeNomeValido() {
        
        Tela_Administrador_Adicionar_Medico adicionar = new Tela_Administrador_Adicionar_Medico();
        
        Medico medico = new Medico();
        
        medico.setNome("Marcio Sousa");
        medico.setCrm("0321");
        medico.setSenha("abcd");
        medico.setPerfil("Medico");
        
        try {
            adicionar.adicionar_usuario(medico);
        } catch (Exception ex) {
            Logger.getLogger(TesteMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Test(expected = Exception.class)
    public void testeNomeInvalido() throws Exception{
        
        Tela_Administrador_Adicionar_Medico adicionar = new Tela_Administrador_Adicionar_Medico();
        
        Medico medico = new Medico();
        
        medico.setNome("123");
        medico.setCrm("0321");
        medico.setSenha("abcd");
        medico.setPerfil("Medico");
        
        adicionar.adicionar_usuario(medico);
        
    }
}
