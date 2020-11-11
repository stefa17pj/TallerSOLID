/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

/**
 *
 * @author Pedro Mendoza
 */
public class Helado extends Postre {

    public Helado(String sabor, double precioParcial) {
        super(sabor, precioParcial);
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal;
        precioFinal = (precioParcial + (precioParcial * 0.12)) + (aderezos.size() * 0.50);
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Helado{" + super.toString();
    }

    @Override
    public String showPrecioFinal() {
        return "Precio Final: $ " + calcularPrecioFinal();
    }
    
}
