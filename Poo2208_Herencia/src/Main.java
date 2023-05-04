public class Main {
    public static void main(String[] args) {
        Animal ani = new Animal("oviparo", "grande","Carne");
        ani.correr();
        ani.dormir();
        System.out.println(ani);

        Perro perro = new Perro("Canino","mediano","carnivoro","Akita","si");
        System.out.println(perro);
        perro.dormir();
        perro.correr();
        perro.ladrar();
        perro.aullar();

        //Polimorfismo es la capacidad que tienen los metodos de responer de dierente forma a la llamada al mismo metodo con la misma cantidad de argumentos.El polimorfismo permite que el comportamineto de los obetos sea flexible.

        System.out.println("----Polimorfismo------");
        Animal elAnimal = new Perro();
        elAnimal.correr();
        
    }
}