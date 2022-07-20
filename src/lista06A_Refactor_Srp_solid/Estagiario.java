package lista06A_Refactor_Srp_solid;

import java.util.HashSet;
import java.util.Set;

public class Estagiario implements Reembolso{

    private String nomeEstagiario;
    private double valorBolsa;


    public Estagiario(String nomeEstagiario, double valorBolsa) {
        this.nomeEstagiario = nomeEstagiario;
        this.valorBolsa = valorBolsa;
    }

    @Override
    public void calcularReembolso() {
        System.out.println("O Valor de R$ (....), referente a (....), foi Reembolsado com Sucesso!");
    }


    public String getNomeEstagiario() {
        return nomeEstagiario;
    }

    public void setNomeEstagiario(String nomeEstagiario) {
        this.nomeEstagiario = nomeEstagiario;
    }


    public double getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }
}
