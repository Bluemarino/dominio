package com.empresa;

public class Veiculo implements Entravel {
    private String placa;
    private String marca;
    private String cor;

    @Override
    public void entrou() {
        System.out.println("Veiculo entrou");
        GerenciarEntrada.lista.add(this);
    }

    @Override
    public void saiu() {
        System.out.println("Veiculo saiu");
        GerenciarEntrada.lista.remove(this);

    }
}
