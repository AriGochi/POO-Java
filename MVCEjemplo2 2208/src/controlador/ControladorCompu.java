package controlador;

import modelo.Computadora;
import modelo.ModeloTablaCompu;
import vista.VentanaComputadora;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorCompu extends MouseAdapter {
   private VentanaComputadora view;
   private ModeloTablaCompu modelo;

    public ControladorCompu(VentanaComputadora view) {
        this.view = view;
        view.getBtnAgregar().addMouseListener(this);
        view.getTblComputadora().addMouseListener(this);
        modelo = new ModeloTablaCompu();
        view.getTblComputadora().setModel(modelo);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == view.getBtnAgregar()){
            System.out.println("Se dioclic en el boton");
            Computadora temp = new Computadora();
            temp.setMarca(view.getlblModelo().getText());
            temp.setModelo(view.getTxtModelo().getText());
            temp.setFrecuenciaProcesador(Double.parseDouble(view.gettxtFrecuencia().getText()));
            temp.setURLFoto(view.getTxtUrlFoto().getText());


            modelo.agregarComputadora(temp);
            view.getTblComputadora().updateUI();
        }
        if (e.getSource() == view.getTblComputadora()){
            System.out.println("Clic sobre la tabla ");
            int rowindex = view.gettblCoputadora.getSelectedRow();
            Computadora temp =modelo.obtenerComputadora(rowindex);
            view.getImagenCompu().setIcon(temp.createIcon());
            view.getLblImagenCompu.setIcon(temp.createIcon());
        }
    }
}
