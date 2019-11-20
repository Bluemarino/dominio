package com.empresa;

public class Docente extends Funcionario implements Entravel {

    @Override
    public void entrou() {
        System.out.println("Docente entrou");
        GerenciarEntrada.lista.add(this);
    }

    @Override
    public void saiu() {
        System.out.println("Docente saiu");
        GerenciarEntrada.lista.remove(this);

    }
}
