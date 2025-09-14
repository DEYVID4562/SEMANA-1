package com.tienda;

public class CamisaVenta {
    private double precioUnitario;
    private int cantidad;

    public CamisaVenta(double precioUnitario, int cantidad) {
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public double calcularImporteCompra() {
        return precioUnitario * cantidad;
    }

    public double calcularPrimerDescuento() {
        return calcularImporteCompra() * 0.07;
    }

    public double calcularSegundoDescuento() {
        double restante = calcularImporteCompra() - calcularPrimerDescuento();
        return restante * 0.07;
    }

    public double calcularDescuentoTotal() {
        return calcularPrimerDescuento() + calcularSegundoDescuento();
    }

    public double calcularImporteFinal() {
        return calcularImporteCompra() - calcularDescuentoTotal();
    }

    public void mostrarResumen() {
        System.out.println("Importe de compra: " + calcularImporteCompra());
        System.out.println("Primer descuento: " + calcularPrimerDescuento());
        System.out.println("Segundo descuento: " + calcularSegundoDescuento());
        System.out.println("Descuento total: " + calcularDescuentoTotal());
        System.out.println("Importe final a pagar: " + calcularImporteFinal());
    }
}
