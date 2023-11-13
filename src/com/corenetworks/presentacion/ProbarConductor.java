package com.corenetworks.presentacion;

import com.corenetworks.modelo.Coche1;
import com.corenetworks.modelo.Conductor;

public class ProbarConductor {
    public static void main(String[] args) {


        Coche1 c2 = new Coche1(-1);
        Conductor c3=new Conductor(c2);
        System.out.println(c3.conducir());

    }

    }



