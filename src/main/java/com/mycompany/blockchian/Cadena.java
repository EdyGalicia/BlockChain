/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.blockchian;

/**
 *
 * @author edysu
 */
public class Cadena {
    Bloque inicial;
    
    public Cadena(){
        inicial = null;
    }
    
    public void insertar(Bloque nuevo){
        if (this.inicial == null) {
            this.inicial = nuevo;
        }else{
            Bloque actual = this.inicial;
            while (actual.getBlSiguiente() != null) {
                if (!actual.getHashSiguiente().equals(actual.getBlSiguiente().toString()) || //comparo el hashSiguiente del actual con el hash del Siguiente
                    !actual.getBlSiguiente().getHastAnterior().equals(actual.toString())) { // con el siguiente
                    System.out.println("Tenemos que arreglar la cadena");
                    return;
                }else{
                    //si los hash son iguales, avanzo
                    actual = actual.getBlSiguiente();
                }
            }
            //
            actual.setBlSiguiente(nuevo);
            actual.setHashSiguiente(nuevo.toString());
            nuevo.setHastAnterior(actual.toString());
        }
    }
}
