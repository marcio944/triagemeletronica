/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triagemeletronica.modelos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import triagemeletronica.modelos.Medico;
import triagemeletronica.modelos.Medico;
import triagemeletronica.modelos.Medico;

/**
 *
 * @author Márcio
 */
public class Validar {
    
    String nome;
    String crm;
    String coren;
    String senha;
    String perfilMed;
    String perfilEnf;
    String fone_fixo;
	
	public boolean checkName(String nome){
		
		this.nome = nome;
		
		Pattern p = Pattern.compile("[0-9!@#$%&*]");
		Matcher m = p.matcher(nome);
		
		if(m.find()){
			return true;
		}else{
			return false;
		}
		
	}
        
        public boolean camposNulosMed(Medico medico) {
		
		if(!medico.getNome().equals("") && !medico.getCrm().equals("") && !medico.getSenha().equals("") && !medico.getPerfil().equals("")) {
			return true;
		}else {
			return false;
		}
		
	}
        
        public boolean camposNulosMedEnd(Medico medico) {
		
		if(!medico.getFone_fixo().equals("") && !medico.getFone_celular().equals("") && !medico.getEndereco().equals("")) {
			return true;
		}else {
			return false;
		}
		
	}
        
        public boolean camposNulosEnf(Enfermeiro enfermeiro) {
		
		if(!enfermeiro.getNome().equals("") &&
                        !enfermeiro.getCoren().equals("") &&
                        !enfermeiro.getSenha().equals("") &&
                        !enfermeiro.getPerfil().equals("")) {
			return true;
		}else {
			return false;
		}
		
	}
        
        public boolean camposNulosEnfEnd(Enfermeiro enfermeiro) {
		
		if(!enfermeiro.getFone_fixo().equals("") &&
                        !enfermeiro.getFone_celular().equals("") &&
                        !enfermeiro.getEndereco().equals("")) {
			return true;
		}else {
			return false;
		}
		
	}
        
        public boolean checkCRM(String crm){
		
		this.crm = crm;
		
		Pattern p = Pattern.compile("[a-zA-Z!@#$%&*]");
		Matcher m = p.matcher(crm);
		
		if(m.find()){
			return true;
		}else{
			return false;
		}
		
	}
        
        public boolean checkCoren(String coren){
		
		this.coren = coren;
		
		Pattern p = Pattern.compile("[a-zA-Z!@#$%&*]");
		Matcher m = p.matcher(coren);
		
		if(m.find()){
			return true;
		}else{
			return false;
		}
		
	}
        
        public boolean checkPerfilMed(String perfilMed){
		
		this.perfilMed = perfilMed;
		
		if(perfilMed.equals("Medico")){
			return true;
		}else{
			return false;
		}
		
	}
        
        public boolean checkPerfilEnf(String perfilEnf){
		
		this.perfilEnf = perfilEnf;
		
		if(perfilEnf.equals("Enfermeiro")){
			return true;
		}else{
			return false;
		}
		
	}
        
        public boolean checkFone_Fixo(String fone_fixo){
		
		this.fone_fixo = fone_fixo;
		
		Pattern p = Pattern.compile("[A-Za-z!@#$%¨&*;.,]");
		Matcher m = p.matcher(fone_fixo);
		
		if(m.find()){
			return true;
		}else{
			return false;
		}
		
	}
        
        public boolean checkSenha(String senha){
		
		this.senha = senha;
		
		Pattern p = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z#!@$%¨&*?+=.,:;\\d]{8,}$");
		Matcher m = p.matcher(senha);
                
                if(m.find()){
                    return true;
                }else{
                    return false;
                }
        }
}
/**
 *
 * @author lenovo user
 */