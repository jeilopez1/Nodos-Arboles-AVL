/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyetofinal;

import java.util.Scanner;

/**
 *
 * @author Jeison
 */
public class ProyetoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ListaDoble EnVenta=new ListaDoble();
        
        Celular J7Prime=new Celular(1,"J7 Prime", "SAMSUNG", 16, 3, 13, 1500000,150);
        Celular P10Lite=new Celular(2,"P10Lite", "HUAWEI", 32, 3, 13, 750000,20);
        Celular Y5II=new Celular(3,"Y5 II", "HUAWEI", 16, 1, 8, 250000,15);
        Celular I8P=new Celular(4,"IPHONE 8", "IPHONE", 32, 3, 13, 2500000,5);
        Celular J5=new Celular(5,"J5 Prime", "Samsung", 8, 2, 10, 500000,50);
        Celular S8=new Celular(6,"GALAXY S8", "Samsung", 64, 4, 20, 2500000,10);
        Celular L830=new Celular(7,"LUMIA 830", "NOKIA", 16, 2, 10, 1000000,3);
        Celular L930XL=new Celular(8,"LUMIA 930", "MICROSOFT", 63, 4, 13, 1500000,4);
        
        EnVenta.InsertarAlInicio(J7Prime);
        EnVenta.InsertarAlInicio(P10Lite);
        EnVenta.InsertarAlInicio(Y5II);
        EnVenta.InsertarAlInicio(I8P);
        EnVenta.InsertarAlInicio(J5);
        EnVenta.InsertarAlInicio(S8);
        EnVenta.InsertarAlInicio(J7Prime);
        EnVenta.InsertarAlInicio(L830);
        EnVenta.InsertarAlInicio(L930XL);
        System.out.println("===========================");
         ListaDoble ListadeVendedores1=new ListaDoble();
         
         ListaDoble ListadeVendedores3=new ListaDoble();
         ListaDoble ListadeVendedores2=new ListaDoble();
         ListaDoble ListadeVendidos=new ListaDoble();
         
         
         
         ListadeVendedores1.compradetelefonos(EnVenta, 2, 12, ListadeVendedores1);
                 
        Arbol ArbolDeVendedores=new Arbol();
        ArbolDeVendedores.Insertar(new Vendedores(5, "Jeison", 1110571142, ListadeVendedores1));
       ArbolDeVendedores.Insertar(new Vendedores(4, "Diego", 1001001001, ListadeVendedores2));
        ArbolDeVendedores.Insertar(new Vendedores(6, "JuanCarlos", 10010010, ListadeVendedores3));
        
//       ArbolDeVendedores.InOrden(ArbolDeVendedores.raiz);
       
//        
//       System.out.println("=============EN ORDEN=============");
//       ArbolDeVendedores.InOrden(ArbolDeVendedores.raiz);
//       ArbolDeVendedores.BuscarNodo(10);
       
        System.out.println("==============nueva operacion==============");
       ArbolDeVendedores.Vender(5, 3,ListadeVendidos);
       ListadeVendidos.MostrarDeInicioAFinal();
       
       
    }
    
}
