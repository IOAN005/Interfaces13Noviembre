package com.corenetworks.modelo;

public class Conductor  {
    private IVehiculo vehiculo;



    public String conducir(){
        return vehiculo.moverse();
    }





    public Conductor() {
    }

    public Conductor(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public IVehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
