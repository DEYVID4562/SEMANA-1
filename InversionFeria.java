package com.empresa;

public class InversionFeria {
    private double montoTotal;

    public InversionFeria(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public double calcularAlquiler() {
        return montoTotal * 0.23;
    }

    public double calcularPublicidad() {
        return montoTotal * 0.07;
    }

    public double calcularTransporte() {
        return montoTotal * 0.26;
    }

    public double calcularServiciosFeriales() {
        return montoTotal * 0.12;
    }

    public double calcularDecoracion() {
        return montoTotal * 0.21;
    }

    public double calcularGastosVarios() {
        return montoTotal * 0.11;
    }

    public void mostrarResumen() {
        System.out.println("Monto total de inversión: " + montoTotal);
        System.out.println("Alquiler de espacio: " + calcularAlquiler());
        System.out.println("Publicidad: " + calcularPublicidad());
        System.out.println("Transporte: " + calcularTransporte());
        System.out.println("Servicios feriales: " + calcularServiciosFeriales());
        System.out.println("Decoración: " + calcularDecoracion());
        System.out.println("Gastos varios: " + calcularGastosVarios());
    }
}
