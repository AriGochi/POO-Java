package vista;

import javax.swing.*;
import java.awt.*;

public class VentanaSumas extends JFrame {
    private JTextField txtOperando1;
    private JLabel lblSignoMas;
    private JTextField getTxtOperando2;
    private JButton btnBoton;
    private  JLabel lblresultado;

    public VentanaSumas(String title) throws HeadlessException {
        super(title);
        this.setSize(450, 200);
        this.setLayout(new FlowLayout());
        txtOperando1 = new JTextField(5);
        lblSignoMas = new JLabel("+");
        getTxtOperando2 = new JTextField(5);
        btnBoton = new JButton("Suma");
        lblresultado = new JLabel("= 0");
        this.getContentPane().add(txtOperando1);
        this.getContentPane().add(lblSignoMas);
        this.getContentPane().add(getTxtOperando2);
        this.getContentPane().add(btnBoton);
        this.getContentPane().add(lblresultado);



        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JTextField getTxtOperando1() {
        return txtOperando1;
    }

    public void setTxtOperando1(JTextField txtOperando1) {
        this.txtOperando1 = txtOperando1;
    }

    public JLabel getLblSignoMas() {
        return lblSignoMas;
    }

    public void setLblSignoMas(JLabel lblSignoMas) {
        this.lblSignoMas = lblSignoMas;
    }

    public JTextField getGetTxtOperando2() {
        return getTxtOperando2;
    }

    public void setGetTxtOperando2(JTextField getTxtOperando2) {
        this.getTxtOperando2 = getTxtOperando2;
    }

    public JButton getBtnBoton() {
        return btnBoton;
    }

    public void setBtnBoton(JButton btnBoton) {
        this.btnBoton = btnBoton;
    }

    public JLabel getLblresultado() {
        return lblresultado;
    }

    public void setLblresultado(JLabel lblresultado) {
        this.lblresultado = lblresultado;
    }
}
