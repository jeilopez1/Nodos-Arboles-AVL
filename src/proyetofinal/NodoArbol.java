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
public class NodoArbol {
    Vendedores dato;
    NodoArbol izq, der;
    
    public NodoArbol(Vendedores d){
        dato=d;
        izq=der=null;
    }

    @Override
    public String toString() {
        return "NodoArbol{" + "dato=" + dato + ", izq=" + izq + ", der=" + der + '}';
    }
    
    

}
