package org.example.classes.org.example;

public class Tarifario {
    private double valorHora;
    private double valorDiaria;
    private double valorMes;
    private double valorSemana;

public Tarifario(double valorHora, double valorDiaria, double valorMes, double valorSemana){
    this.valorHora = valorHora;
    this.valorDiaria = valorDiaria;
    this.valorSemana = valorSemana;
    this.valorMes = valorMes;
}

public double calcularValor(int totalHoras){
    double total = 0;

    int meses = totalHoras / (24 * 30);

    totalHoras %= (24*30);
    int semanas = totalHoras / (24 * 7);
    totalHoras %= (24 * 7);

    int dias = totalHoras / 24;
    totalHoras %= 24;

    int horas = totalHoras;


    total += meses * valorMes;
    total += semanas * valorSemana;
    total += dias * valorDiaria;
    total += horas * valorHora;

    return total;
}


    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public double getValorSemana() {
        return valorSemana;
    }

    public void setValorSemana(double valorSemana) {
        this.valorSemana = valorSemana;
    }

    public double getValorMes() {
        return valorMes;
    }

    public void setValorMes(double valorMes) {
        this.valorMes = valorMes;
    }
}

