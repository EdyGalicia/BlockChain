/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.blockchian;

import java.util.LinkedList;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Transaccion a = new Transaccion("Marvin", 0, "Yaiza");
        Transaccion b = new Transaccion("Marvin25", 0, "Yaiza");
        Transaccion c = new Transaccion("Marvin35", 0, "Yaiza");
        Transaccion d = new Transaccion("Marvin75", 0, "Yaiza");
        Transaccion e = new Transaccion("Marvin454", 0, "Yaiza");
        Transaccion f = new Transaccion("Marv", 0, "11Yaiza");
        
        LinkedList<Transaccion> la = new LinkedList<>();
        LinkedList<Transaccion> lb = new LinkedList<>();
        LinkedList<Transaccion> lc = new LinkedList<>();
        
        la.add(a);
        la.add(b);
        lb.add(c);
        lc.add(e);
        lc.add(f);
        lc.add(d);
        
        Bloque ba = new Bloque(la);
        Bloque bb = new Bloque(lb);
        Bloque bc = new Bloque(lc);
        
        Cadena cad = new Cadena();
        
        cad.insertar(ba);
        cad.insertar(bb);
        cad.insertar(bc);
        
        //provocando error
        cad.inicial.getBlSiguiente().getTransacciones().get(0).setDestino("HOLA");
        cad.insertar(ba);
    }
    
}
