package com.empresa;

public class Main {

    public static void main(String[] args) {

        Veiculo v1 = new Veiculo();
        Aluno a1 = new Aluno();
        Docente d1 = new Docente();
        Administrativo ad1 = new Administrativo();

        v1.entrou();
        a1.entrou();
        d1.entrou();

        System.out.println("Tem " + GerenciarEntrada.lista.size() + " pessoas dentro da instituição");

    }
}
