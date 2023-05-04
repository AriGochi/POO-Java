package polimorfismo;

public class DriverMascota {
    public static void main(String[] args) {
        MascotaCanina mascota = new MascotaCanina();
        mascota.setNombre("Fido");
        mascota.setCollar();
        mascota.setRaza();
        mascota.setAlimentofavorito();
        mascota.setJuguete();
        System.out.println(mascota);
        mascota.jugar();

          }
}



