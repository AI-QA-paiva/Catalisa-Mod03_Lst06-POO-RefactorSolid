package lista06A_Refactor_Srp_solid;

import java.util.Scanner;

public class MainTeste {

    public static void main(String[] args) {

        Scanner criandoObjetos = new Scanner(System.in);

        Professor professor1 = new Professor("Felipe Silveira","12345","54321","Biologia",3000,"Mestre","Patologia");
        System.out.println();
        System.out.println("Lista Professor");
        System.out.println();
        System.out.println("Os dados cadastrados são: ");
        System.out.println("Nome: "+professor1.getNome());
        System.out.println("Número CPF: "+professor1.getCpf());
        System.out.println("Número RG: "+professor1.getRg());
        System.out.println("Salário: R$ "+professor1.getSalario());
        System.out.println("Formação Acadêmica: "+professor1.getNivelGraduacao());
        System.out.println("Setor de Lotação: "+professor1.getOrgaoLotacao());
        System.out.println("Disciplina ministrada: "+professor1.getDisciplinaEnsina());
        System.out.println();
        professor1.calcularReembolso();

        Professor professor2 = new Professor("Pedro Paiva","3412345","5454321","Matematica",3500,"Mestre","Geometria");
        System.out.println();
        System.out.println("Os dados cadastrados são: ");
        System.out.println("Nome: "+professor2.getNome());
        System.out.println("Número CPF: "+professor2.getCpf());
        System.out.println("Número RG: "+professor2.getRg());
        System.out.println("Salário: R$ "+professor2.getSalario());
        System.out.println("Formação Acadêmica: "+professor2.getNivelGraduacao());
        System.out.println("Setor de Lotação: "+professor2.getOrgaoLotacao());
        System.out.println("Disciplina ministrada: "+professor2.getDisciplinaEnsina());
        System.out.println();
        professor2.calcularReembolso();

        Coordenador coordenador1 = new Coordenador("Carlos","9876","6789","Departamento de Matematica",4500,2);
        System.out.println();
        System.out.println("Lista Coordenador");
        System.out.println();
        System.out.println("Os dados cadastrados são: ");
        System.out.println("Nome: "+coordenador1.getNome());
        System.out.println("Número CPF: "+coordenador1.getCpf());
        System.out.println("Número RG: "+coordenador1.getRg());
        System.out.println("Setor de Lotação: "+coordenador1.getOrgaoLotacao());
        System.out.println("Salário: R$ "+coordenador1.getSalario());
        System.out.println("Número de Professores supervisionados: "+coordenador1.getQuantidadeProfessores());
        System.out.println();
        coordenador1.calcularReembolso();

        Coordenador coordenador2 = new Coordenador("João Gilberto","239876","236789","Departamento de Biologia",4500,3);
        System.out.println();
        System.out.println("Os dados cadastrados são: ");
        System.out.println("Nome: "+coordenador2.getNome());
        System.out.println("Número CPF: "+coordenador2.getCpf());
        System.out.println("Número RG: "+coordenador2.getRg());
        System.out.println("Setor de Lotação: "+coordenador2.getOrgaoLotacao());
        System.out.println("Salário: R$ "+coordenador2.getSalario());
        System.out.println("Número de Professores supervisionados: "+coordenador2.getQuantidadeProfessores());
        System.out.println();
        coordenador2.calcularReembolso();

        Administrativo administrativo1 = new Administrativo("Fabio Melo","43534","345445","Dpto Biologia",2500,"Atendente","Junior");
        System.out.println();
        System.out.println("Lista Administrativos");
        System.out.println();
        System.out.println("Os dados cadastrados são: ");
        System.out.println("Nome: "+administrativo1.getNome());
        System.out.println("Número CPF: "+administrativo1.getCpf());
        System.out.println("Número RG: "+administrativo1.getRg());
        System.out.println("Setor de Lotação: "+administrativo1.getOrgaoLotacao());
        System.out.println("Salário: "+administrativo1.getSalario());
        System.out.println("Função: "+administrativo1.getFuncaoAdm()+" / Senioridade função: "+administrativo1.getSenioridade());
        System.out.println();
        administrativo1.calcularReembolso();

        Administrativo administrativo2 = new Administrativo("Renata Liskov","1243534","24345445","Dpto Matematica",3500,"Atendente","Senior");
        System.out.println();
        System.out.println("Os dados cadastrados são: ");
        System.out.println("Nome: "+administrativo2.getNome());
        System.out.println("Número CPF: "+administrativo2.getCpf());
        System.out.println("Número RG: "+administrativo2.getRg());
        System.out.println("Setor de Lotação: "+administrativo2.getOrgaoLotacao());
        System.out.println("Salário: "+administrativo2.getSalario());
        System.out.println("Função: "+administrativo2.getFuncaoAdm()+" / Senioridade função: "+administrativo1.getSenioridade());
        System.out.println();
        administrativo2.calcularReembolso();




        Estagiario estagiario1 = new Estagiario("Amanda Matias",600);
        System.out.println();
        System.out.println("Lista Estagiários");
        System.out.println();
        System.out.println("Estagiario 1: "+estagiario1.getNomeEstagiario());
        System.out.println("Valor da Bolsa Estágio é de; R$ "+estagiario1.getValorBolsa());
        System.out.println();
        estagiario1.calcularReembolso();

        Estagiario estagiario2 = new Estagiario("Julio Verner",600);
        System.out.println();
        System.out.println("Estagiario 2: "+estagiario2.getNomeEstagiario());
        System.out.println("Valor da Bolsa Estágio é de; R$ "+estagiario2.getValorBolsa());
        System.out.println();
        estagiario2.calcularReembolso();


    }
}
