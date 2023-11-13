package com.corenetworks.modelo;

public class AccesoDesarollo implements IDAO{
    @Override
    public String insertar(Cliente c1) {
        return "el cliente esta en  la base Desarollo"+ c1.getNombre();
    }
}
