package com.empresa;

public class Aluno extends Pessoa implements Entravel {
    @Override
    public void entrou() {
        System.out.println("Aluno entrou");
        GerenciarEntrada.lista.add(this);
    }

    @Override
    public void saiu() {
        System.out.println("Aluno saiu");
        GerenciarEntrada.lista.remove(this);

    }
}
