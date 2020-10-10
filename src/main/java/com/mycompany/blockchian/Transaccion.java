package com.mycompany.blockchian;


public class Transaccion {
    private String nombre;
    private int monto;
    private String destino;
    
    
    public Transaccion(String nombre, int monto, String destino) {
        this.nombre = nombre;
        this.monto = monto;
        this.destino = destino;
    }

    //Nos devolvera el hash de la transaccion
    @Override
    public int hashCode() {
        int a =25;
        a = a*25+monto;
        a = a*26+nombre.hashCode();
        a = a *26+destino.hashCode();
        
        return a;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
}
