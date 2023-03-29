public class Pet{

    //variables
    private String name;
    private int age;
    private String species;
    private Person owner;

    //constructor
    public Pet (String name, int age, String species){
        this.name = name;
        this.age = age;
        this.species = species;
    }

    //getters and setters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public  String getSpecies(){
        return species;
    }

    public void setOwner(Person owner){
        this.owner = owner;
    }
}
