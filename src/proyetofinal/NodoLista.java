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
    public class NodoLista {
    Celular dato;
    NodoLista siguiente;
    NodoLista anterior;
    //Constructor para cuando no hay nodos
    
    public NodoLista(Celular d){
    
    this.anterior=null;
    this.siguiente=null;
    this.dato=d;
    
    
    }
    //Constructor para cuando ya hay datos
    public NodoLista(Celular d, NodoLista s, NodoLista a){
    dato=d;
    siguiente=s;
    anterior=a;
    }

    @Override
    public String toString() {
        return "NodoLista{" + "dato=" + dato + ", siguiente=" + siguiente + ", anterior=" + anterior + '}';
    }

    public Celular getDato() {
        return dato;
    }

    public void setDato(Celular dato) {
        this.dato = dato;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }

    public NodoLista getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoLista anterior) {
        this.anterior = anterior;
    }
}
