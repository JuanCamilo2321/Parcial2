package org.example;

import java.util.Date;

public class Reserva {
    private int id;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private Date fechaInicio;
    private Date fechaFin;
    private double costoTotal;

    public Reserva(int id, Vehiculo vehiculo, Cliente cliente, Date fechaInicio, Date fechaFin) {
        this.id = id;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoTotal = calcularCostoTotal();
    }

    public int getId() {
        return id;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    private double calcularCostoTotal() {
        // Cálculo del costo total basado en varios factores (por ejemplo, tipo de vehículo, duración de la reserva, etc.)
        // ...
        return costoTotal;
    }
}
