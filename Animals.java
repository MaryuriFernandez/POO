package animals;

public class Animals {

    public static void main(String[] args) {
        
        Animal Dog = new Dog("Chihuahua", "Chihuahueño", "5", "Omnívoro");
        Dog.animalSound();
        
        Animal Cat = new Cat("Persa", "Perchita", "3", "Omnívoro");
        Cat.animalSound();
        
        Animal Bird = new Bird("loro", "Pajarraco", "1", "Frugívoro");
        Bird.animalSound();
        
        Animal Horse = new Horse("Pinto", "Spirit", "10", "hervívoro");
        Horse.animalSound();
    }
    
}
