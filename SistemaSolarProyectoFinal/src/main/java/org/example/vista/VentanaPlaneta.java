package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class VentanaPlaneta extends JFrame {
    private JLabel lblId;
    private JLabel lblubiSistemaSolar;
    private JLabel lblnumDePlanetas;
    private JLabel lblplanetaMasGrande;
    private JLabel lblplanetaCercanoSol;
    private JLabel lblimagenUrl;
    private JLabel lblImagen;
    private JTextField txtId;
    private JTextField txtubiSistemaSolar;
    private JTextField txtnumDePlanetas;
    private JTextField txtplanetaMasGrande;
    private JTextField txtplanetaCercanoSol;
    private JTextField txtimagenUrl;
    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnDelete;
    private GridLayout layout;
    private JTable tabla;
    private JScrollPane scroll;
    private JPanel panel1; //Formulario para capturar
    private JPanel panel2; //Tabla
    private JPanel panel3;
    private JPanel panel4;

    public VentanaPlaneta(String title) throws HeadlessException {
        super(title);
        this.setSize(1000,1000);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(128, 242, 252));
        lblId = new JLabel("ID");
        lblubiSistemaSolar = new JLabel("Ubicacion del sistema solar");
        lblnumDePlanetas= new JLabel("Numero de planetas con los que cuenta");
        lblplanetaMasGrande = new JLabel("Planeta mas grande");
        lblplanetaCercanoSol= new JLabel("Planeta mas cercano");
        lblimagenUrl = new JLabel("Imagen en Url");
        txtId = new JTextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);
        txtubiSistemaSolar = new JTextField(15);
        txtnumDePlanetas = new JTextField(15);
        txtplanetaMasGrande = new JTextField(20);
        txtplanetaCercanoSol = new JTextField(20);
        txtimagenUrl = new JTextField(30);
        btnAgregar = new JButton("Agregar");
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblubiSistemaSolar);
        panel1.add(txtubiSistemaSolar);
        panel1.add(lblnumDePlanetas);
        panel1.add(txtnumDePlanetas);
        panel1.add(lblplanetaMasGrande);
        panel1.add(txtplanetaMasGrande);
        panel1.add(lblplanetaCercanoSol);
        panel1.add(txtplanetaCercanoSol);
        panel1.add(lblimagenUrl);
        panel1.add(txtimagenUrl);
        panel1.add(btnAgregar);


        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(217, 199, 253));
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        tabla = new JTable();
        scroll = new JScrollPane(tabla);
        panel2.add(scroll);


        //panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(193, 157, 255));
        lblImagen = new JLabel("....");

        this.panel3.add(lblImagen);

        //panel4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(128, 242, 252));




        this.getContentPane().add(panel1, 0);
        this.getContentPane().add(panel2, 1);
        this.getContentPane().add(panel3, 2);
        this.getContentPane().add(panel4, 3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblubiSistemaSolar() {
        return lblubiSistemaSolar;
    }

    public void setLblubiSistemaSolar(JLabel lblubiSistemaSolar) {
        this.lblubiSistemaSolar = lblubiSistemaSolar;
    }

    public JLabel getLblnumDePlanetas() {
        return lblnumDePlanetas;
    }

    public void setLblnumDePlanetas(JLabel lblnumDePlanetas) {
        this.lblnumDePlanetas = lblnumDePlanetas;
    }

    public JLabel getLblplanetaMasGrande() {
        return lblplanetaMasGrande;
    }

    public void setLblplanetaMasGrande(JLabel lblplanetaMasGrande) {
        this.lblplanetaMasGrande = lblplanetaMasGrande;
    }

    public JLabel getLblplanetaCercanoSol() {
        return lblplanetaCercanoSol;
    }

    public void setLblplanetaCercanoSol(JLabel lblplanetaCercanoSol) {
        this.lblplanetaCercanoSol = lblplanetaCercanoSol;
    }

    public JLabel getLblimagenUrl() {
        return lblimagenUrl;
    }

    public void setLblimagenUrl(JLabel lblimagenUrl) {
        this.lblimagenUrl = lblimagenUrl;
    }

    public JLabel getLblImagen() {
        return lblImagen;
    }

    public void setLblImagen(JLabel lblImagen) {
        this.lblImagen = lblImagen;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtubiSistemaSolar() {
        return txtubiSistemaSolar;
    }

    public void setTxtubiSistemaSolar(JTextField txtubiSistemaSolar) {
        this.txtubiSistemaSolar = txtubiSistemaSolar;
    }

    public JTextField getTxtnumDePlanetas() {
        return txtnumDePlanetas;
    }

    public void setTxtnumDePlanetas(JTextField txtnumDePlanetas) {
        this.txtnumDePlanetas = txtnumDePlanetas;
    }

    public JTextField getTxtplanetaMasGrande() {
        return txtplanetaMasGrande;
    }

    public void setTxtplanetaMasGrande(JTextField txtplanetaMasGrande) {
        this.txtplanetaMasGrande = txtplanetaMasGrande;
    }

    public JTextField getTxtplanetaCercanoSol() {
        return txtplanetaCercanoSol;
    }

    public void setTxtplanetaCercanoSol(JTextField txtplanetaCercanoSol) {
        this.txtplanetaCercanoSol = txtplanetaCercanoSol;
    }

    public JTextField getTxtimagenUrl() {
        return txtimagenUrl;
    }

    public void setTxtimagenUrl(JTextField txtimagenUrl) {
        this.txtimagenUrl = txtimagenUrl;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(JButton btnDelete) {
        this.btnDelete = btnDelete;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }
    public void limpiar(){
        txtubiSistemaSolar.setText("");
        txtnumDePlanetas.setText("");
        txtplanetaMasGrande.setText("");
        txtplanetaCercanoSol.setText("");
        txtimagenUrl.setText("");
    }
}


