package com.corenetworks.modelo;

public class AccesoProduction implements IDAO{
    @Override
    public String insertar(Cliente c1) {
        return "El clinte esta en la base Production " + c1.getNombre();
    }
}
