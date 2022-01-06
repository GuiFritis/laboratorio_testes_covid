/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author guilh
 */
public class Recoleta extends Coleta{
    
    private EMotivo motivo;
    private Coleta coletaPai;
    private boolean primeira;

    public Recoleta(Coleta coletaPai, EMotivo motivo, boolean primeira, int codColeta, String profissional, String cidade, 
            String tipoMaterial, Paciente paciente, String horarioColeta, 
            EFormaColeta formaColeta, boolean sucesso, String observacao) {
        super(codColeta, profissional, cidade, tipoMaterial, paciente, horarioColeta, formaColeta,sucesso, observacao);
        this.motivo = motivo;
        this.coletaPai = coletaPai;
        this.primeira = primeira;
    }

    public Recoleta(){
    }

    public EMotivo getMotivo() {
        return motivo;
    }

    public void setMotivo(EMotivo motivo) {
        this.motivo = motivo;
    }

    public Coleta getColetaPai() {
        return coletaPai;
    }

    public void setColetaPai(Coleta coletaPai) {
        this.coletaPai = coletaPai;
    }

    public boolean isPrimeira() {
        return primeira;
    }

    public void setPrimeira(boolean primeira) {
        this.primeira = primeira;
    }    
                      
}
