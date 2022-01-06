/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


/**
 *
 * @author guilh
 */
public class Exame {
    
    private String nome, observacao;
    private int codExame;
    private boolean valido, validado;
    private String diaExame;
    private EResultado resultado;
    private Coleta coleta;
    private Teste teste;

    public Exame(String nome, String observacao, int codExame, boolean valido, boolean validado, String diaExame, EResultado resultado, Coleta coleta, Teste teste) {
        this.nome = nome;
        this.observacao = observacao;
        this.codExame = codExame;
        this.valido = valido;
        this.validado = validado;
        this.diaExame = diaExame;
        this.resultado = resultado;
        this.coleta = coleta;
        this.teste = teste;
    }

    public Exame() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodExame() {
        return codExame;
    }

    public void setCodExame(int codExame) {
        this.codExame = codExame;
    }

    public String getDiaExame() {
        return diaExame;
    }

    public void setDiaExame(String diaExame) {
        this.diaExame = diaExame;
    }
    
    public String getAno(){
        char[] horario = diaExame.toCharArray();
        String data = "";
        for(int i = 0; i <= 3; i++){
            data = data + horario[i];
        }
        return data;
    }
    
    public String getMes(){
        char[] horario = diaExame.toCharArray();
        String data = "";
        for(int i = 5; i <= 6; i++){
            data = data + horario[i];
        }
        return data;
    }
    
    public String getDia(){
        char[] horario = diaExame.toCharArray();
        String data = "";
        for(int i = 8; i <= 9; i++){
            data = data + horario[i];
        }
        return data;
    }

    public Teste getTeste() {
        return teste;
    }

    public void setTeste(Teste teste) {
        this.teste = teste;
    }    

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }   
        
    public EResultado getResultado() {
        return resultado;
    }

    public void setResultado(EResultado resultado) {
        this.resultado = resultado;
    }

    public boolean isValido() {
        return valido;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }

    public boolean isValidado() {
        return validado;
    }

    public void setValidado(boolean validado) {
        this.validado = validado;
    }

    public Coleta getColeta() {
        return coleta;
    }

    public void setColeta(Coleta coleta) {
        this.coleta = coleta;
    }        
}
