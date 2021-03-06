/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Postre {

    protected String sabor;
    protected ArrayList<Aderezo> aderezos;
    protected double precioParcial;

    public Postre(String sabor, double precioParcial) {
        aderezos = new ArrayList<>();
        this.sabor = sabor;
        this.precioParcial = precioParcial;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPrecioParcial() {
        return precioParcial;
    }

    public void setPrecioParcial(double precioParcial) {
        this.precioParcial = precioParcial;
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    public void setAderezos(ArrayList<Aderezo> aderezos) {
        this.aderezos = aderezos;
    }
    
    @Override
    public String toString() {
        return "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
    
    public void anadirAderezo(Aderezo aderezo){
        this.getAderezos().add(aderezo);
    }
    
    public void quitarAderezo(Aderezo aderezo){
        this.getAderezos().remove(aderezo);
    }

}
