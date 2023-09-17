package animals;

public class Dog extends Animal{

    String breed;

    public Dog(String breed, String name, String age, String typeOfFeeding) {
        super(name, age, typeOfFeeding);
        this.breed = breed;
    }
    
    @Override
    public void animalSound() {
        System.out.println("Guauuuu!!");
    }
    
}
