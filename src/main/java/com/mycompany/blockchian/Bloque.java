
package com.mycompany.blockchian;

import java.util.LinkedList;

public class Bloque {

    private LinkedList<Transaccion> transacciones;
    private String hastAnterior;
    private String hashSiguiente;
    private Bloque blSiguiente; //es como una lista

    public Bloque(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
        blSiguiente = null;
    }

    @Override
    public String toString() {
        //vamos a agregar el valor de este hash del bloque seguido del hash de cada transaccion
        StringBuilder s = new StringBuilder();
        
        //agregamos el HashCode de nuestro bloque
        s.append(this.hashCode()).append("_");
        
        //luego agregamos el hashCode de la transaccion _ hashCode de la siguiente transaccion... y asi
        //tendremos un identificador unico por las transacciones
        for (int i = 0; i < this.transacciones.size(); i++) {
            s.append(transacciones.get(i).hashCode()).append("_");
        }
        
        return s.toString(); //To change body of generated methods, choose Tools | Templates.
    }


    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public String getHastAnterior() {
        return hastAnterior;
    }

    public void setHastAnterior(String hastAnterior) {
        this.hastAnterior = hastAnterior;
    }

    public String getHashSiguiente() {
        return hashSiguiente;
    }

    public void setHashSiguiente(String hashSiguiente) {
        this.hashSiguiente = hashSiguiente;
    }

    public Bloque getBlSiguiente() {
        return blSiguiente;
    }

    public void setBlSiguiente(Bloque blSiguiente) {
        this.blSiguiente = blSiguiente;
    }

    
}
