/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author guilh
 */
public class Paciente {
    
    private String nome, cpf, sexo, senha, dataNasc;
    private boolean comorbidade;

    public Paciente(String nome, String cpf, String sexo, String dataNasc, String senha, boolean comorbidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.sexo = sexo;
        this.dataNasc = dataNasc;
        this.comorbidade = comorbidade;
    }

    public Paciente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }   
    
    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc){
        this.dataNasc = dataNasc;
    }         
    
    public String getAno(){
        char[] horario = dataNasc.toCharArray();
        String data = "";
        for(int i = 0; i <= 3; i++){
            data = data + horario[i];
        }
        return data;
    }
    
    public String getMes(){
        char[] horario = dataNasc.toCharArray();
        String data = "";
        for(int i = 5; i <= 6; i++){
            data = data + horario[i];
        }
        return data;
    }
    
    public String getDia(){
        char[] horario = dataNasc.toCharArray();
        String data = "";
        for(int i = 8; i <= 9; i++){
            data = data + horario[i];
        }
        return data;
    }

    public boolean isComorbidade() {
        return comorbidade;
    }

    public void setComorbidade(boolean comorbidade) {
        this.comorbidade = comorbidade;
    }
    
}
