package org.example;

import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    public void leer(String ruta) throws IOException{

            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            String line = "";
            while ((line = reader.readLine()) != null){
                System.out.println("Info: " + line);
            }



    }
    public void MetosoUn(String ruta) throws IOException{
    this.MetodoDos(ruta);
    }
    public void MetodoDos(String ruta) throws IOException{
        this.leer(ruta);

    }
}
