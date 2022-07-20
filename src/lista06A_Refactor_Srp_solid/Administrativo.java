package lista06A_Refactor_Srp_solid;

import java.util.HashSet;
import java.util.Set;

public class Administrativo extends Funcionario implements Reembolso{

    String funcaoAdm, senioridade;

    Set<Administrativo> listaAdministrativos = new HashSet<>();

    public Administrativo(String nome, String cpf, String rg, String orgaoLotacao, double salario, String funcaoAdm, String senioridade) {
        super(nome, cpf, rg, orgaoLotacao, salario);
        this.funcaoAdm = funcaoAdm;
        this.senioridade = senioridade;
    }


    @Override
    void aumentarSalario() {
        double salarioAdm = getSalario() + (getSalario() * 0.10);
        setSalario(salarioAdm);

    }

    @Override
    public void calcularReembolso() {
        System.out.println("O Valor de R$ (....), referente a (....), foi Reembolsado com Sucesso!");

    }

    public String getFuncaoAdm() {
        return funcaoAdm;
    }

    public void setFuncaoAdm(String funcaoAdm) {
        this.funcaoAdm = funcaoAdm;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }


}
