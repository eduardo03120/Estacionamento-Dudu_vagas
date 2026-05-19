package org.example.classes.org.example;

public class Vaga {

    private int numero;
    private boolean ocupada;
    private Veiculo carro;

    public Vaga(int numero) {
        this.numero = numero;
        this.ocupada = false;
        this.carro = null;
    }

    public void ocupar(Veiculo carro) {
        this.carro = carro;
        this.ocupada = true;
    }

    public void liberar() {
        this.carro = null;
        this.ocupada = false;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public int getNumero() {
        return numero;
    }

    public Veiculo getCarro() {
        return carro;
    }
}
