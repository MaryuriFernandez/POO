package animals;

public abstract class Animal{
   private String name, age, typeOfFeeding;
   
   public Animal(String name, String age, String typeOfFeeding){
       this.name = name;
       this.age = age;
       this.typeOfFeeding = typeOfFeeding;
   }
   
   public abstract void animalSound();
}
