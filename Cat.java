package animals;

public class Cat extends Animal{

    String breed;

    public Cat(String breed, String name, String age, String typeOfFeeding) {
        super(name, age, typeOfFeeding);
        this.breed = breed;
    }

    @Override
    public void animalSound() {
        System.out.println("Miaauuu!");
    }
    

  
}
