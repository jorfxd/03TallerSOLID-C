/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diseñodesoftware;

import java.util.List;

/**
 *
 * @author jorge
 */
public class Compra {

    private MetodoPago metodo;
    private List articulos;

    public Compra(MetodoPago metodo) {
        // Inicializaciones
    }
    public void realizarPago(double monto) {
        metodo.realizarCobro(monto);
    }

    public void agregarArticulo(Articulo articulo) {
        // Agregar un artículo a la compra
    }

    public void removerArticulo(Articulo articulo) {
        // Remover un artículo de la compra
    }
}

