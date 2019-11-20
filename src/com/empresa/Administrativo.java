package com.empresa;

public class Administrativo extends Funcionario implements Entravel {

    @Override
    public void entrou() {
        System.out.println("Admin entrou");
        GerenciarEntrada.lista.add(this);
    }

    @Override
    public void saiu() {
        System.out.println("Admin saiu");
        GerenciarEntrada.lista.remove(this);

    }
}
