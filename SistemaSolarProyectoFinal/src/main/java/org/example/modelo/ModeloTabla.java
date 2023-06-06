package org.example.modelo;

import org.example.persistencia.PlanetaDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTabla implements TableModel {

    public static final int COLUMNS = 6;
    private ArrayList<SistemaSolar> datos;
    private PlanetaDAO pdao;

    public ModeloTabla() {
        pdao = new PlanetaDAO();
        datos = new ArrayList<>();
    }

    public ModeloTabla(ArrayList<SistemaSolar> datos) {
        this.datos = datos;
        pdao = new PlanetaDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public String getColumnName(int rowIndex) {
        switch (rowIndex){
            case 0:
                return "id";
            case 1:
                return "Ubicacion";
            case 2:
                return "Num. de planetas";
            case 3:
                return "Planeta mas grande";
            case 4:
                return "Planeta mas cercano al sol";
            case 5:
                return "Imagen en URL";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int rowIndex) {
        switch (rowIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return Integer.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        SistemaSolar tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getID();
            case 1:
                return tmp.getUbiSistemaSolar();
            case 2:
                return tmp.getNumDePlanetas();
            case 3:
                return tmp.getPlanetaMasGrande();
            case 4:
                return tmp.getPlanetaCercanoSol();
            case 5:
                return tmp.getImagenUrl();
        }
        return null;
    }

    @Override
    public void setValueAt(Object o, int rowIndex, int colIndex) {
        switch (colIndex){
            case 0:
                //datos.get(rowIndex).setId(0;
                break;
            case 1:
                datos.get(rowIndex).setUbiSistemaSolar((String) o);
                break;
            case 2:
                datos.get(rowIndex).setNumDePlanetas((int)o);
                break;
            case 3:
                datos.get(rowIndex).setPlanetaMasGrande((String) o);
                break;
            case 4:
                datos.get(rowIndex).setPlanetaCercanoSol((String) o);
                break;
            case 5:
                datos.get(rowIndex).setImagenUrl((String) o);
                break;
            default:
                System.out.println("No se modifica nada");
        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void cargarDatos(){
        try {
            ArrayList<SistemaSolar> tirar = pdao.obtenerTodo();
            System.out.println(tirar);
            datos = pdao.obtenerTodo();
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }

    }
    public boolean agregarInfo(SistemaSolar sistemaSolar){
      boolean resultado = false;
      try {
          if( pdao.insentar(sistemaSolar)){
              datos.add(sistemaSolar);
              resultado = true;

          }else{
              resultado = false;
          }
      }catch (SQLException sqle){
          System.out.println(sqle.getMessage());
      }
        return resultado;
    }
}
