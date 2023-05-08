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
public class Vendedores {

    int id;
    String nombres;
    int cc;
    ListaDoble ListadeVendedores;

    public Vendedores(int id, String nombres, int cc, ListaDoble ListadeVendedores) {
        this.id = id;
        this.nombres = nombres;
        this.cc = cc;
        this.ListadeVendedores = ListadeVendedores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public ListaDoble getListadeVendedores() {
        return ListadeVendedores;
    }

    public void setListadeVendedores(ListaDoble ListadeVendedores) {
        this.ListadeVendedores = ListadeVendedores;
    }

    @Override
    public String toString() {
        return "Vendedores{" + "id=" + id + ", nombres=" + nombres + ", cc=" + cc + ", ListadeVendedores=" + ListadeVendedores.MostrarDeInicioAFinal() + '}';
    }



}
