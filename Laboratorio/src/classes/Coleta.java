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
public class Coleta {
    
    private int codColeta;
    private String profissional, cidade, tipoMaterial, observacao;
    private Paciente paciente;
    private String horarioColeta;
    private EFormaColeta formaColeta;
    private boolean sucesso;

    public Coleta(int codColeta, String profissional, String cidade, String tipoMaterial, 
                Paciente paciente, String horarioColeta, EFormaColeta formaColeta, 
                boolean sucesso, String observacao) {
        this.codColeta = codColeta;
        this.profissional = profissional;
        this.cidade = cidade;
        this.tipoMaterial = tipoMaterial;
        this.paciente = paciente;
        this.horarioColeta = horarioColeta;
        this.formaColeta = formaColeta;
        this.sucesso = sucesso;
        this.observacao = observacao;
    }

    public Coleta() {
    }

    public int getCodColeta() {
        return codColeta;
    }

    public void setCodColeta(int codColeta) {
        this.codColeta = codColeta;
    }

    public String getProfissional() {
        return profissional;
    }

    public void setProfissional(String profissional) {
        this.profissional = profissional;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }    
    
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getHorarioColeta() {
        return horarioColeta;
    }
    
    public void setHorarioColeta(String dataNasc){
        this.horarioColeta = dataNasc;
    }
    
    public String getHora(){
        char[] horario = horarioColeta.toCharArray();
        String hora = "";
        for(int i = 11; i < 12; i++){
            hora = hora + horario[i];
        }
        return hora;
    }
    
    public String getMinuto(){
        char[] horario = horarioColeta.toCharArray();
        String hora = "";
        for(int i = 14; i < 15; i++){
            hora = hora + horario[i];
        }
        return hora;
    }
    
    public String getAno(){
        char[] horario = horarioColeta.toCharArray();
        String data = "";
        for(int i = 0; i <= 3; i++){
            data = data + horario[i];
        }
        return data;
    }
    
    public String getMes(){
        char[] horario = horarioColeta.toCharArray();
        String data = "";
        for(int i = 5; i <= 6; i++){
            data = data + horario[i];
        }
        return data;
    }
    
    public String getDia(){
        char[] horario = horarioColeta.toCharArray();
        String data = "";
        for(int i = 8; i <= 9; i++){
            data = data + horario[i];
        }
        return data;
    }

    public boolean isSucesso() {
        return sucesso;
    }

    public void setSucesso(boolean sucesso) {
        this.sucesso = sucesso;
    }

    public EFormaColeta getFormaColeta() {
        return formaColeta;
    }

    public void setFormaColeta(EFormaColeta formaColeta) {
        this.formaColeta = formaColeta;
    }
    
    
    
}
