package com.corenetworks.modelo;

public class TallerMecanico implements ITaller {
    @Override
    public String reparar(Coche c) {
        return "El coche se esta reparando "+ c.getMatricula()+"modelo"+c.getModelo()+ "\n ya ha salido de la reparacion";
    }
}
