package com.corenetworks.modelo;

public class TallerPintura implements ITaller {
    @Override
    public String reparar(Coche c) {
        return "El coche se esta pìntando"+c.getMatricula()+"modelo"+c.getModelo()+"\n ya ha salido de la pintura";
    }
}
