/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import triagemeletronica.interfaces.administrador.Tela_Administrador_Alterar_Enfermeiro;
import triagemeletronica.interfaces.administrador.Tela_Administrador_Alterar_Medico;
import triagemeletronica.modelos.Enfermeiro;
import triagemeletronica.modelos.Medico;

/**
 *
 * @author marcio
 */
public class TesteAlterar {
    
    public TesteAlterar() {
    }
    
     @Test
    public void testeAlterarFone_Fixo_e_Celular_Valido() throws Exception {
        //teste de medico e enfermeiro validos (10 digitos fixo,11 digitos  celular)
        Tela_Administrador_Alterar_Medico alterar = new Tela_Administrador_Alterar_Medico();
        Tela_Administrador_Alterar_Enfermeiro alterarEnf = new Tela_Administrador_Alterar_Enfermeiro();
        
        Medico medico = new Medico();
        Enfermeiro enfermeiro = new Enfermeiro();
        
        medico.setId(4);
        medico.setFone_fixo("8934223544");
        medico.setFone_celular("89999841001");
        medico.setEndereco("Bairro Junco");
        
        enfermeiro.setId(5);
        enfermeiro.setFone_fixo("8934228900");
        enfermeiro.setFone_celular("89999426321");
        enfermeiro.setEndereco("Centro");
        
        alterar.alterar_endereco(medico);
        alterarEnf.alterar_endereco(enfermeiro);
        
        String fone_fixo_Med = "8934223544";
        String fone_fixo_Enf = "8934228900";
        String fone_celu_Med = "89999841001";
        String fone_celu_Enf = "89999426321";
                
        String fone_fixo_Medico = alterar.buscaEndMedico(medico).getFone_fixo();
        String fone_fixo_Enfermeiro = alterarEnf.buscaEndEnfermeiro(enfermeiro).getFone_fixo();
        String fone_celu_Medico = alterar.buscaEndMedico(medico).getFone_celular();
        String fone_celu_Enfermeiro = alterarEnf.buscaEndEnfermeiro(enfermeiro).getFone_celular();
        
        assertEquals(fone_fixo_Medico, fone_fixo_Med);
        assertEquals(fone_fixo_Enfermeiro, fone_fixo_Enf);
        assertEquals(fone_celu_Medico, fone_celu_Med);
        assertEquals(fone_celu_Enfermeiro, fone_celu_Enf);
        
    }
    
    @Test(expected = Exception.class)
    public void testeAlterarFone_Fixo_e_Celular_Invalido_1valoracima() throws Exception{
             //teste de medico e enfermeiro Invalidos (11 digitos fixo,12 digitos celular)estes testes de valores invalidos sao de limite para os dois
        Tela_Administrador_Alterar_Medico alterar = new Tela_Administrador_Alterar_Medico();
        Tela_Administrador_Alterar_Enfermeiro alterarEnf = new Tela_Administrador_Alterar_Enfermeiro();
        
        Medico medico = new Medico();
        Enfermeiro enfermeiro = new Enfermeiro();
        
        medico.setId(4);
        medico.setFone_fixo("34228078156");
        medico.setFone_celular("899994668481");
        medico.setEndereco("Paraibinha");
        
        enfermeiro.setId(5);
        enfermeiro.setFone_fixo("89342287801");
        enfermeiro.setFone_celular("899995665451");
        enfermeiro.setEndereco("Cohab");
        
        alterar.alterar_endereco(medico);
        alterarEnf.alterar_endereco(enfermeiro);
        
    }
    
    @Test(expected = Exception.class)
    public void testeAlterarFone_Fixo_e_Celular_Invalido_1valorabaixo() throws Exception{
             //teste de medico e enfermeiro Invalidos (9 digitos fixo,10 digitos celular)estes testes de valores invalidos sao de limite para os dois
        Tela_Administrador_Alterar_Medico alterar = new Tela_Administrador_Alterar_Medico();
        Tela_Administrador_Alterar_Enfermeiro alterarEnf = new Tela_Administrador_Alterar_Enfermeiro();
        
        Medico medico = new Medico();
        Enfermeiro enfermeiro = new Enfermeiro();
        
        medico.setId(4);
        medico.setFone_fixo("893422243");
        medico.setFone_celular("8999999942");
        medico.setEndereco("Mesquita");
        
        enfermeiro.setId(5);
        enfermeiro.setFone_fixo("893422156");
        enfermeiro.setFone_celular("8993214994");
        enfermeiro.setEndereco("Olavo Quadros");
        
        alterar.alterar_endereco(medico);
        alterarEnf.alterar_endereco(enfermeiro);
        
    }
    
    @Test(expected = Exception.class)
    public void testeAlterarCelular_Nulo() throws Exception{
       //teste de medico e enfermeiro Invalidos (9 digitos fixo,10 digitos celular)estes testes de valores invalidos sao de limite para os dois
        Tela_Administrador_Alterar_Medico alterar = new Tela_Administrador_Alterar_Medico();
        Tela_Administrador_Alterar_Enfermeiro alterarEnf = new Tela_Administrador_Alterar_Enfermeiro();
        
        Medico medico = new Medico();
        Enfermeiro enfermeiro = new Enfermeiro();
        
        medico.setId(8);
        medico.setFone_fixo("8934222433");
        medico.setFone_celular("");
        medico.setEndereco("Mesquita");
        
        enfermeiro.setId(9);
        enfermeiro.setFone_fixo("34222433");
        enfermeiro.setFone_celular("");
        enfermeiro.setEndereco("Olavo Quadros");
        
        alterar.alterar_endereco(medico);
        alterarEnf.alterar_endereco(enfermeiro);
        
    }
    
    @Test(expected = Exception.class)
    public void testeEndereco_Nulo() throws Exception{
        
        Tela_Administrador_Alterar_Medico alterar = new Tela_Administrador_Alterar_Medico();
        Tela_Administrador_Alterar_Enfermeiro alterarEnf = new Tela_Administrador_Alterar_Enfermeiro();
        
        Medico medico = new Medico();
        Enfermeiro enfermeiro = new Enfermeiro();
        
        medico.setId(8);
        medico.setFone_fixo("8934222433");
        medico.setFone_celular("89999841001");
        medico.setEndereco("");
        
        enfermeiro.setId(9);
        enfermeiro.setFone_fixo("34222433");
        enfermeiro.setFone_celular("89999841001");
        enfermeiro.setEndereco("");
        
        alterar.alterar_endereco(medico);
        alterarEnf.alterar_endereco(enfermeiro);
        
    }
    
}
