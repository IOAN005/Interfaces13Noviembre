package com.corenetworks.presentacion;

import com.corenetworks.modelo.*;

public class ProbarCliente {
    public static void main(String[] args) {
        Cliente c1=new Cliente("JUan","c2223334m");
        IDAO cProduction=new AccesoProduction();
        IDAO cDesarollo=new AccesoDesarollo();
        ClienteDao cl1=new ClienteDao();
        cl1.setConecxion(cDesarollo);
        System.out.println(cl1.insertar(c1));
        cl1.setConecxion(cProduction);
        System.out.println(cl1.insertar(c1));





    }
}
