import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class VentanaCombo  extends JFrame {
    private JPanel panel1;
    private JPanel panel2;

    private GridLayout layout;
    private JLabel lbNombre;
    private JTextField txtNombre;
    private JButton btAgregar;
    private JComboBox <String> combo;
    private ModeloComboNombre modelo;
    private ArrayList<String> inicial;


    public VentanaCombo(String title) throws HeadlessException {
        super(title);
        inicial = new ArrayList<>();
        this.setSize(300,600);

        layout = new GridLayout(2, 1);
        this.getContentPane().setLayout(layout);
        panel1 = new JPanel();
        panel1.setBackground(new Color(123, 235, 255));
        lbNombre = new JLabel("Introduce tu nombre");
        panel1.add(lbNombre);
        txtNombre = new JTextField(20);
        panel1.add(txtNombre);
        btAgregar = new JButton("Add");
        panel1.add(btAgregar);

        btAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("evento clic");
                modelo.agregarNombre(txtNombre.getText());
                combo.setModel(modelo);
                //forzar a repintar la vista
                txtNombre.setText(" ");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Entró al botón");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Saliendo");
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("dragging...");
            }
        });
        this.getContentPane().add(panel1);


        panel2 = new JPanel();
        panel2.setBackground(new Color(220, 160, 255));
       //String[] nombres = {"Jose", "Diego", "Ari", "Kane"};

        inicial.add("Ari");
        inicial.add("Juan");
        inicial.add("Kane");
        modelo = new ModeloComboNombre(inicial);
        combo = new JComboBox<>(modelo);

        panel2.add(combo);
        this.getContentPane().add(panel2);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
