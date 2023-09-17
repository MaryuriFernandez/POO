package animals;

public class Bird extends Animal{

    String species;

    public Bird(String species, String name, String age, String typeOfFeeding) {
        super(name, age, typeOfFeeding);
        this.species = species;
    }
    
    @Override
    public void animalSound() {
        System.out.println("piiooo!!");
    }
    
}
