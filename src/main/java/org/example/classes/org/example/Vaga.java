package org.example.classes.org.example;

public class Vaga {
    private int numero;
    private boolean ocupada;
    private Veiculo veiculoEstacionando;

    public Vaga(int numeros){
        this.numero = numero;
        this.ocupada = false;
        this.veiculoEstacionando = null;
    }

    public void estacionar(Veiculo Carro){
        if(!ocupada){
            this.veiculoEstacionando = Carro;
            this.ocupada = true;
            this.veiculoEstacionando = null;

        }
    }


}
