package org.example;

import java.util.ArrayList;
import java.util.List;

public class Administrador {
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private List<Vehiculo> vehiculos;

    public Administrador(int id, String nombre, String apellido, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.vehiculos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void addVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }
}
