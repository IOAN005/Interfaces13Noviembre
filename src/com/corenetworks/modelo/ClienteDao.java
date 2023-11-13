package com.corenetworks.modelo;

public class ClienteDao {
    private IDAO conecxion;
    public String insertar(Cliente c1) {
       return conecxion.insertar(c1);
    }

    @Override
    public String toString() {
        return "ClienteDao{" +
                "conecxion=" + conecxion +
                '}';
    }

    public ClienteDao() {
    }

    public ClienteDao(IDAO conecxion) {
        this.conecxion = conecxion;
    }

    public IDAO getConecxion() {
        return conecxion;
    }

    public void setConecxion(IDAO conecxion) {
        this.conecxion = conecxion;
    }
}
