package modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Computadora {
    private String marca;
    private String modelo;
    private Double frecuenciaProcesador;
    private String URLFoto;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, Double frecuenciaProcesador, String URLFoto) {
        this.marca = marca;
        this.modelo = modelo;
        this.frecuenciaProcesador = frecuenciaProcesador;
        this.URLFoto = URLFoto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getFrecuenciaProcesador() {
        return frecuenciaProcesador;
    }

    public void setFrecuenciaProcesador(Double frecuenciaProcesador) {
        this.frecuenciaProcesador = frecuenciaProcesador;
    }

    public String getURLFoto() {
        return URLFoto;
    }

    public void setURLFoto(String URLFoto) {
        this.URLFoto = URLFoto;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", frecuenciaProcesador=" + frecuenciaProcesador +
                ", URLFoto='" + URLFoto + '\'' +
                '}';
    }
    public ImageIcon createIcon(){
        ImageIcon resultado = null;
        try{
            URL urlImagen = new URL(this.URLFoto);
            resultado = new ImageIcon(urlImagen);

        }catch (MalformedURLException mue){
            System.out.println(mue.toString());
        }
        return resultado;
    }
}
