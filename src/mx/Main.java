package mx;

import mx.arquitectura.facade.IPaqueteria;
import mx.arquitectura.facade.Paqueteria;

import java.io.*;

public class Main {

    public static void main(String[] args) {


            IPaqueteria pa = new Paqueteria();
            pa.calcular();


    }
}

