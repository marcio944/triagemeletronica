/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triagemeletronica.modelos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author lenovo user
 */
public class Validar {
    
    String nome;
	
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
    
}
