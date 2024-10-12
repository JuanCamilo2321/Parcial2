package org.example;

public class Vehiculo {
    private final int año;
    private int id;
    private String marca;
    private String modelo;
    private int getAño;
    private String tipo;
    private double costoDiario;
    private boolean disponible;

    public Vehiculo(int id, String marca, String modelo, int año, String tipo, double costoDiario) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.año= año;
        this.tipo = tipo;
        this.costoDiario = costoDiario;
        this.disponible = true;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return año;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCostoDiario() {
        return costoDiario;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
