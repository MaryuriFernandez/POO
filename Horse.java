package animals;

public class Horse extends Animal{
    
    String raza;

    public Horse(String raza, String name, String age, String typeOfFeeding) {
        super(name, age, typeOfFeeding);
        this.raza = raza;
    }

    @Override
    public void animalSound() {
        System.out.println("Hiiii!!");
    }
    
    
}
