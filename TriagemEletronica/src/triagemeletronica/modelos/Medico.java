/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triagemeletronica.modelos;

/**
 *
 * @author marcio
 */
public class Medico {
    
    private int id;
    private String nome;
    private String crm;
    private String senha;
    private String endereco;
    private String fone_fixo;
    private String fone_celular;
    private String perfil;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the crm
     */
    public String getCrm() {
        return crm;
    }

    /**
     * @param crm the crm to set
     */
    public void setCrm(String crm) {
        this.crm = crm;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the fone_fixo
     */
    public String getFone_fixo() {
        return fone_fixo;
    }

    /**
     * @param fone_fixo the fone_fixo to set
     */
    public void setFone_fixo(String fone_fixo) {
        this.fone_fixo = fone_fixo;
    }

    /**
     * @return the fone_celular
     */
    public String getFone_celular() {
        return fone_celular;
    }

    /**
     * @param fone_celular the fone_celular to set
     */
    public void setFone_celular(String fone_celular) {
        this.fone_celular = fone_celular;
    }

    /**
     * @return the perfil
     */
    public String getPerfil() {
        return perfil;
    }

    /**
     * @param perfil the perfil to set
     */
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    
    
}
