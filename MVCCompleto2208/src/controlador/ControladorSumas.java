package controlador;

import modelo.Calculadora;
import vista.VentanaSumas;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorSumas implements MouseListener {

   private VentanaSumas view;
   private Calculadora calculadoraModel;


    public ControladorSumas(VentanaSumas view) {
        this.view = view;
        this.view.getBtnBoton().addMouseListener(this);
        this.view.getLblresultado().addMouseListener(this);
        calculadoraModel = new Calculadora();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
     String texto1 = this.view.getTxtOperando1().getText();


        if (e.getSource() == this.view.getBtnBoton()){
            System.out.println("Clic en boton :)");
            try {
                double op1 = Double.parseDouble(texto1);
                double op2 = Double.parseDouble(this.view.getGetTxtOperando2().getText());
                calculadoraModel.setOperando1(op1);
                calculadoraModel.setOperando2(op2);
                String resultado = "" + calculadoraModel.sumar();
                this.view.getLblresultado().setText(resultado);
            }catch (NumberFormatException nfe){
                calculadoraModel.setOperando1(0.0);
                calculadoraModel.setOperando2(0.0);
                JOptionPane.showMessageDialog(view, "Datos incorrectos");
            }
        }
        if (e.getSource() == this.view.getLblresultado()){
            System.out.println("Clic en la etiqueta resultado :)");
        }


    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
