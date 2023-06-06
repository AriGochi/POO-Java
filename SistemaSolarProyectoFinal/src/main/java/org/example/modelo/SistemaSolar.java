package org.example.modelo;

public class SistemaSolar {
    private int ID;
    private String ubiSistemaSolar;
    private int numDePlanetas;
    private String planetaMasGrande;
    private String planetaCercanoSol;
    private String imagenUrl;

    public SistemaSolar() {
    }

    public SistemaSolar(int ID, String ubiSistemaSolar, int numDePlanetas, String planetaMasGrande, String planetaCercanoSol, String imagenUrl) {
        this.ID = ID;
        this.ubiSistemaSolar = ubiSistemaSolar;
        this.numDePlanetas = numDePlanetas;
        this.planetaMasGrande = planetaMasGrande;
        this.planetaCercanoSol = planetaCercanoSol;
        this.imagenUrl = imagenUrl;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUbiSistemaSolar() {
        return ubiSistemaSolar;
    }

    public void setUbiSistemaSolar(String ubiSistemaSolar) {
        this.ubiSistemaSolar = ubiSistemaSolar;
    }

    public int getNumDePlanetas() {
        return numDePlanetas;
    }

    public void setNumDePlanetas(int numDePlanetas) {
        this.numDePlanetas = numDePlanetas;
    }

    public String getPlanetaMasGrande() {
        return planetaMasGrande;
    }

    public void setPlanetaMasGrande(String planetaMasGrande) {
        this.planetaMasGrande = planetaMasGrande;
    }

    public String getPlanetaCercanoSol() {
        return planetaCercanoSol;
    }

    public void setPlanetaCercanoSol(String planetaCercanoSol) {
        this.planetaCercanoSol = planetaCercanoSol;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    @Override
    public String toString() {
        return "SistemaSolar{" +
                "ID=" + ID +
                ", ubiSistemaSolar='" + ubiSistemaSolar + '\'' +
                ", numDePlanetas=" + numDePlanetas +
                ", planetaMasGrande='" + planetaMasGrande + '\'' +
                ", planetaCercanoSol='" + planetaCercanoSol + '\'' +
                ", imagenUrl='" + imagenUrl + '\'' +
                '}';
    }
}
