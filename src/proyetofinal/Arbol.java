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
public class Arbol {
    NodoArbol raiz;
    ListaDoble  lc ; 

    public Arbol() {
        lc = new ListaDoble(); 
        raiz = null;
    }

    public void Insertar(Vendedores d) {
        NodoArbol nuevo = new NodoArbol(d);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            NodoArbol auxiliar = raiz;
            NodoArbol padre;
            while (true) {
                padre = auxiliar;
                if (d.id < auxiliar.dato.id) {
                    auxiliar = auxiliar.izq;
                    if (auxiliar == null) {
                        padre.izq = nuevo;
                        return;
                    }
                } else {
                    auxiliar = auxiliar.der;
                    if (auxiliar == null) {
                        padre.der = nuevo;
                        return;
                    }
                }
            }
        }

    }

    public boolean Vacio() {
        return raiz == null;
    }
    
    public void PreOrden(NodoArbol r) {
        if (r != null) {
            System.out.println(r.dato);
            PreOrden(r.izq);
            PreOrden(r.der);
        }
    }

    public void InOrden(NodoArbol r) {
        if (r != null) {
            InOrden(r.izq);
            System.out.println(r.dato);
            InOrden(r.der);
        }
    }

    public void PostOrden(NodoArbol r) {
        if (r != null) {
            PostOrden(r.izq);
            PostOrden(r.der);
            System.out.println(r.dato);
        }
    }

    public NodoArbol BuscarNodo(int d) {
        NodoArbol aux = raiz;
        while (aux.dato.id != d) {
            if (d < aux.dato.id) {
                aux = aux.izq;
            } else {
                aux = aux.der;
            }
            if (aux == null) {
                return null;
            }
        }
        System.out.println(aux.dato);
        return aux;
    }

    public boolean Eliminar(int d) {
        NodoArbol auxiliar = raiz;
        NodoArbol padre = raiz;
        boolean hijoizq = true;
        while (auxiliar.dato.id != d) {
            padre = auxiliar;
            if (d < auxiliar.dato.id) {
                hijoizq = true;
                auxiliar = auxiliar.izq;
            } else {
                hijoizq = false;
                auxiliar = auxiliar.der;
            }
            if (auxiliar == null) {
                return false;
            }
        }
        if (auxiliar.izq == null && auxiliar.der == null) {
            if (auxiliar == raiz) {
                raiz = null;
            } else if (hijoizq) {
                padre.izq = null;
            } else {
                padre.der = null;
            }
        } else if (auxiliar.der == null) {
            if (auxiliar == raiz) {
                raiz = auxiliar.izq;
            } else if (hijoizq) {
                padre.izq = auxiliar.izq;
            } else {
                padre.der = auxiliar.izq;
            }
        } else if (auxiliar.izq == null) {
            if (auxiliar == raiz) {
                raiz = auxiliar.der;
            } else if (hijoizq) {
                padre.izq = auxiliar.der;
            } else {
                padre.der = auxiliar.der;
            }
        } else {
            NodoArbol reemplazo = ObtenerReemplazo(auxiliar);
            if (auxiliar == raiz) {
                raiz = reemplazo;
            } else if (hijoizq) {
                padre.izq = reemplazo;
            } else {
                padre.der = reemplazo;
            }
            reemplazo.izq = auxiliar.izq;
        }
        return true;
    }

    public NodoArbol ObtenerReemplazo(NodoArbol nodoreemplazo) {
        NodoArbol reemplazarpadre = nodoreemplazo;
        NodoArbol reemplazo = nodoreemplazo;
        NodoArbol auxiliar = nodoreemplazo.der;
        while (auxiliar != null) {
            reemplazarpadre = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.izq;
        }
        if (reemplazo != nodoreemplazo.der) {
            reemplazarpadre.izq = reemplazo.der;
            reemplazo.der = nodoreemplazo.der;
        }
        System.out.println("El Nodo Reemplazo es:" + reemplazo);
        return reemplazo;
    }

    public NodoArbol Raiz() {
        return raiz;
    }
    public NodoArbol Vender(int id,int vendidos,ListaDoble ListaVendidos) {
                
        NodoArbol aux = raiz;
        while (aux.dato.id != id) {
            if (id < aux.dato.id) {
                aux = aux.izq;
            } else {
                aux = aux.der;
            }
            if (aux == null) {
                return null;
            }
        }
        
        
        int identificacion=aux.dato.ListadeVendedores.inicio.dato.id;
        String nombre=aux.dato.ListadeVendedores.inicio.dato.nombre;
        String marca=aux.dato.ListadeVendedores.inicio.dato.marca;
        int memoriainterna=aux.dato.ListadeVendedores.inicio.dato.memoriainterna;
        int memoriaram=aux.dato.ListadeVendedores.inicio.dato.memoriaram;
        int mpx=aux.dato.ListadeVendedores.inicio.dato.mpx;
        int precio=aux.dato.ListadeVendedores.inicio.dato.precio*vendidos;
        aux.dato.ListadeVendedores.inicio.dato.cantidad = aux.dato.ListadeVendedores.inicio.dato.cantidad - vendidos;
         ListaVendidos.InsertarAlInicio(new Celular(identificacion, nombre, marca, memoriainterna, memoriaram, mpx, precio, vendidos));

        return aux;
    }
    
}

    

