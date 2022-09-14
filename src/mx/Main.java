package mx;

import mx.arquitectura.facade.IPaqueteria;
import mx.arquitectura.facade.Paqueteria;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        // Ejemplo comando
        // calcular --servicio=express --paqueteria=sobre --distancia=1

            IPaqueteria pa = new Paqueteria();
            pa.calcular();


    }
}

