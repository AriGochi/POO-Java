package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{
    private JButton btnMensaje;
    private JButton btnEntrada;
    private  JButton btnOption;
    private JLabel lblResultado;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(400,200);

        btnMensaje = new JButton("Mensaje");
        btnEntrada = new JButton("Entrada");
        btnOption = new JButton("Opcion");
        lblResultado = new JLabel("Resultado");

        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(btnMensaje);
        this.getContentPane().add(btnEntrada);
        this.getContentPane().add(btnOption);
        this.getContentPane().add(lblResultado);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JButton getBtnMensaje() {
        return btnMensaje;
    }

    public void setBtnMensaje(JButton btnMensaje) {
        this.btnMensaje = btnMensaje;
    }

    public JButton getBtnEntrada() {
        return btnEntrada;
    }

    public void setBtnEntrada(JButton btnEntrada) {
        this.btnEntrada = btnEntrada;
    }

    public JButton getBtnOption() {
        return btnOption;
    }

    public void setBtnOption(JButton btnOption) {
        this.btnOption = btnOption;
    }

    public JLabel getLblResultado() {
        return lblResultado;
    }

    public void setLblResultado(JLabel lblResultado) {
        this.lblResultado = lblResultado;
    }
}
