package org.example;

import javax.annotation.processing.Filer;
import java.io.*;

public class LeerArchivo {
    public static void main(String[] args) {
        String ruta = "dator.txt";
        try {
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
            {
            }catch(FileNotFoundException fnfe){

                System.out.println("El archivo no existe");
                System.out.println(fnfe.getMessage());
            }
        }
    }

    }

