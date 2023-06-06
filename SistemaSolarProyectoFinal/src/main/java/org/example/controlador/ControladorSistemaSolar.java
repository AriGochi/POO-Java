package org.example.controlador;

import org.example.modelo.ModeloTabla;
import org.example.modelo.SistemaSolar;
import org.example.vista.VentanaPlaneta;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorSistemaSolar extends MouseAdapter {

    private VentanaPlaneta view;
    private ModeloTabla modelo;

    public ControladorSistemaSolar(VentanaPlaneta view) {
        this.view = view;
        modelo = new ModeloTabla();
        this.view.getTabla().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);


    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.view.getBtnCargar()){

            modelo.cargarDatos();
            this.view.getTabla().setModel(modelo);
            this.view.getTabla().updateUI();

        }
        if (e.getSource() == this.view.getBtnAgregar()){
            SistemaSolar sistemaSolar = new SistemaSolar();
            sistemaSolar.setID(0);
            sistemaSolar.setUbiSistemaSolar(this.view.getTxtubiSistemaSolar().getText());
            sistemaSolar.setNumDePlanetas(Integer.parseInt(this.view.getTxtnumDePlanetas().getText()));
            sistemaSolar.setPlanetaMasGrande(this.view.getTxtplanetaMasGrande().getText());
            sistemaSolar.setPlanetaCercanoSol(this.view.getTxtplanetaCercanoSol().getText());
            sistemaSolar.setImagenUrl(this.view.getTxtimagenUrl().getText());
            if (modelo.agregarInfo(sistemaSolar)){
                JOptionPane.showMessageDialog(view, "Se agregó correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.view.getTabla().updateUI();
            }else {
                JOptionPane.showMessageDialog(view, "No se pudo agregar a la base de datos. Por favor revisa tu conexion", "Error al Insertar", JOptionPane.ERROR_MESSAGE);
            }
            this.view.limpiar();
        }
    }
}
