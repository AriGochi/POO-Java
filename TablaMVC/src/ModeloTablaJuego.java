import javax.swing.table.TableModel;
import java.util.ArrayList;

public class ModeloTablaJuego implements TableModel {
    ArrayList <Videojuego> datos;


}
public void agregarJuego(Videojuego juego) {
    this.datos.add(juego);
}
}
