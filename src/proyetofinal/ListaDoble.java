/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyetofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeison
 */
public class ListaDoble {

    NodoLista inicio;
    NodoLista fin;

    public ListaDoble() {
        inicio = null;
        fin = null;
    }

    public boolean Vacia() {
        return inicio == null;
    }

    public void InsertarAlUltimo(Celular d) {
        if (!Vacia()) {
            fin = new NodoLista(d, null, fin);
            fin.anterior.siguiente = fin;
        } else {
            inicio = fin = new NodoLista(d);
        }
    }

    public void InsertarAlInicio(Celular d) {
        if (!Vacia()) {
            inicio = new NodoLista(d, inicio, null);
            inicio.siguiente.anterior = inicio;
        } else {
            inicio = fin = new NodoLista(d);
        }
    }

    public String MostrarDeInicioAFinal() {
        String ListaDoble = "";
        NodoLista aux = inicio;
        while (aux != null) {
            System.out.println(aux.dato);
            ListaDoble += "{" + aux.dato + "}--";
            aux = aux.siguiente;
        }
        return ListaDoble;
    }
    
   public String MostrarDeInicioAFinalArboles() {
        String ListaDoble = "";
        NodoLista aux = inicio;
        while (aux != null) {
            System.out.println(aux.dato);
            ListaDoble += "{" + aux.dato + "}--";
            aux = aux.siguiente;
        }
        return ListaDoble;
    }

    public String MostrarDeFinalAInicio() {
        String lista = "";
        NodoLista aux = fin;
        while (aux != null) {
            
            lista += "{" + aux.dato + "}--";
            aux = aux.anterior;
        }
        return lista;
    }

    public Celular EliminarInicio() {
        Celular eliminado = inicio.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
        return eliminado;
    }

    public Celular EliminarFinal() {
        Celular eliminado = fin.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            fin = fin.anterior;
            fin.siguiente = null;
        }
        return eliminado;
    }

    void compradetelefonos(ListaDoble listaenventa, int id, int cantidad, ListaDoble ListadeVendedores) {

        NodoLista aux = listaenventa.inicio;
        int identificacion=0;
        String nombre=null;
        String marca=null;
        int memoriainterna=0;
        int memoriaram=0;
        int mpx=0;
        int precio=0;
        while (aux != null) {
            if (aux.dato.id == id) {
            if (aux.dato.cantidad>0|| aux.dato.cantidad<0){ 
                    if (cantidad > aux.dato.cantidad) {
                        JOptionPane.showMessageDialog(null, " CANTIDAD INSUFICIENTE \n     SOLO HAY : " + aux.dato.cantidad);
                    } else {

                        aux.dato.cantidad = aux.dato.cantidad - cantidad;
                        identificacion = aux.dato.id;
                        nombre = aux.dato.nombre;
                        marca = aux.dato.marca;
                        memoriainterna = aux.dato.memoriainterna;
                        memoriaram = aux.dato.memoriaram;
                        mpx = aux.dato.mpx;
                        precio = aux.dato.precio;
                    
                    }
                } else {
                    JOptionPane.showMessageDialog(null, " NO HAY DISPOSITIVOS DISPONIBLES");
                }  
            }
            aux = aux.siguiente;
        }
        ListadeVendedores.InsertarAlInicio(new Celular(identificacion, nombre, marca, memoriainterna, memoriaram, mpx, precio, cantidad));

    }
    

}
