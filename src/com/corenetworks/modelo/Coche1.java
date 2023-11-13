package com.corenetworks.modelo;

public class Coche1 implements IVehiculo{
    private int deposito;

    @Override
    public String moverse() {
        if (deposito > 0) {
            return "el coche se puede mover ";
        } else {
            return "sin gasolina";

        }

    }

    @Override
    public String toString() {
        return "Coche1{" +
                "deposito=" + deposito +
                '}';
    }

    public Coche1() {
    }

    public Coche1(int deposito) {
        this.deposito = deposito;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }
}
