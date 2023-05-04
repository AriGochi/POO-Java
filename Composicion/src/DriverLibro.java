public class DriverLibro {
    public static void main(String[] args) {
        Libro book1 = new Libro("El perfume",
                               350.4,
                               "La historia de un asesino",
                                new Autor("Patrik suskin","ps",
                                          new Pais("Francia", "Europa","fr","Paris")),
                                             new Editorial("Planeta","av 1 #300,",
                                                     new Pais("Mexico","America","mx","CdMx"))
        );
        System.out.println(book1);
        // Libro2
        String sinop ="La historia de un asesino";
        Autor aut = new Autor("Patrik Suskind","ps",new Pais());
        Editorial edit = new Editorial("Planeta","av 1 #300", new Pais());

        Libro book2 = new Libro("El perfume",350.4, sinop, aut, edit);
        System.out.println(book2);
        book2.setPrecio(199.9);
        System.out.println(book2);
        book2.getAutor().setNombre("Anonimo");
        System.out.println(book2);
        book2.getEditorial().setDireccion("av Universidad");
        System.out.println(book2);
        book2.getEditorial().getPais().setCorto("fr");
        System.out.println(book2);
        book2.getAutor().setNacionalidad(new Pais("España","Europa","es","Madrid"));
        System.out.println(book2);
    }
}
