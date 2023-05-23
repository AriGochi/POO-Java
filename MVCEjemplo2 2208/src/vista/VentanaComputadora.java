package vista;

import javax.swing.*;
import java.awt.*;

public class VentanaComputadora extends JFrame {
    private JLabel lblMarca;
    private JLabel lblModelo;
    private JLabel lblFrecuencia;
    private JLabel lblUrlFoto;
    private JLabel lblImagenCompu;
    private TextField txtMarca;
    private TextField txtModelo;
    private TextField txtFrecuencia;
    private TextField txtUrlFoto;
    private JButton BtnAgregar;
    private GridLayout layout;
    private JTable TblComputadora;
    private JScrollPane scrTabla;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;


    public VentanaComputadora(String title) throws HeadlessException {
        super(title);
        this.setSize(800,800);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(202, 238, 159));
        this.getContentPane().add(panel1,0);
        lblMarca = new JLabel("Marca");
        lblModelo = new JLabel("Modelo");
        lblFrecuencia = new JLabel("Frecuencia");
        lblUrlFoto = new JLabel("URL Foto");
        txtMarca = new TextField(10);
        txtModelo = new TextField(10);
        txtFrecuencia = new TextField(5);
        txtUrlFoto = new TextField(30);
        panel1.add(lblMarca);
        panel1.add(txtMarca);
        panel1.add(lblModelo);
        panel1.add(txtModelo);
        panel1.add(lblFrecuencia);
        panel1.add(txtFrecuencia);
        panel1.add(lblUrlFoto);
        panel1.add(txtUrlFoto);
        BtnAgregar = new JButton("Agregar");
        panel1.add(BtnAgregar);

        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(197, 106, 106));
        this.getContentPane().add(panel2,1);
        TblComputadora = new JTable();
        scrTabla = new JScrollPane(TblComputadora);
        panel2.add(scrTabla);


        //panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(40, 197, 197));
        this.getContentPane().add(panel3,2);
        lblImagenCompu = new JLabel("......");
        this.panel3.add(lblImagenCompu);


        //panel4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(75, 182, 63));
        this.getContentPane().add(panel4,3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);


    }
}
