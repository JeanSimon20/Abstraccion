package Ejemplo;

public class Principal {
    public static void main(String[] args) {
        Planta p = new Planta();
        AnimalCarnivoro animalC = new AnimalCarnivoro();
        AnimalHervivoro animalH = new AnimalHervivoro();
        
        p.alimentarse();
        animalC.alimentarse();
        animalH.alimentarse();
    }
}
