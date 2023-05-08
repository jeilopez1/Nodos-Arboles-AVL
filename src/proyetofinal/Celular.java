/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyetofinal;

/**
 *
 * @author Jeison
 */
public class Celular {
   int id;
    String nombre;
    String marca;
    int memoriainterna;
    int memoriaram;
    int mpx;
    int precio;
    int cantidad;

    public Celular(int id,String nombre, String marca, int memoriainterna, int memoriaram, int mpx, int precio,int cantidad) {
       this.id=id;
        this.nombre = nombre;
        this.marca = marca;
        this.memoriainterna = memoriainterna;
        this.memoriaram = memoriaram;
        this.mpx = mpx;
        this.precio = precio;
        this.cantidad=cantidad;
    }

    @Override
    public String toString() {
        return "Celular{" + "nombre=" + nombre + ", marca=" + marca + ", memoriainterna=" + memoriainterna + ", memoriaram=" + memoriaram + ", mpx=" + mpx + ", precio=" + precio + ", cantidad="+ cantidad+'}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMemoriainterna() {
        return memoriainterna;
    }

    public void setMemoriainterna(int memoriainterna) {
        this.memoriainterna = memoriainterna;
    }

    public int getMemoriaram() {
        return memoriaram;
    }

    public void setMemoriaram(int memoriaram) {
        this.memoriaram = memoriaram;
    }

    public int getMpx() {
        return mpx;
    }

    public void setMpx(int mpx) {
        this.mpx = mpx;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
