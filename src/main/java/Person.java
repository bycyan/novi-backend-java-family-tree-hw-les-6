import java.util.ArrayList;
import java.util.List;
public class Person{

    private String name;
    private String middleName;
    private String lastName;
    private char sex;
    private int age;
    private Person mother;
    private Person father;
    private List<Person> siblings;
    private List<Person> children;
    private List<Pet> pets;

    //constructor met name, lastname, age en sex
    public Person(String name, String lastName, int age, char sex){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }
    //constructor met name, middleName, lastname, age en sex
    public Person(String name, String middleName, String lastName, int age, char sex){
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    //getters
    public String getName (){
        return name;
    }
    public String getMiddleName(){
        return middleName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public char getSex(){
        return sex;
    }
    public Person getMother(){
        return mother;
    }
    public Person getFather(){
        return father;
    }
    public List<Person> getSiblings(){
        return this.siblings;
    }
    public List<Person> getChildren(){
        return this.children;
    }
    public List<Pet> getPets(){
        return pets;
    }

    //setters
    public void setAge(int age){
        this.age = age;
    }
    public void setSex(char sex){
        this.sex = sex;
    }

    //addParents methode
    public void setMother(Person mother){
        this.mother = mother;
    }
    public void setFather(Person father){
        this.father = father;
    }

    //add children, pets and siblings
    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }
    public void setChildren(List<Person> children) {
        this.children = children;
    }
    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }


    //Methods
    public void addParents (Person father, Person mother, Person child){
        child.setMother(mother);
        mother.addToChildren(mother, child);
        father.setFather(father);
        father.addToChildren(father, child);
    }
    public void addToChildren(Person parent, Person child){
        List<Person> children = new ArrayList<>();
        if(parent.getChildren()!=null){
            children.addAll(parent.getChildren());
        }
        children.add(child);
        parent.setChildren(children);
    }
    public void addPet(Person person, Pet pet){
        List<Pet> pets = new ArrayList<>();
        if(person.getPets() != null){
            pets.addAll(person.getPets());
        }
        pets.add(pet);
        person.setPets(pets);
    }

    public void addSiblings(Person person, Person siblings){
        List<Person> brothersAndSisters = new ArrayList<>();
        if(person.getSiblings()!=null){
            brothersAndSisters.addAll(person.getSiblings());
        }
        brothersAndSisters.add(siblings);
        person.setSiblings(brothersAndSisters);
    }

    public List<Person> getGrandChildren(Person person){
        List<Person> grandChildren = new ArrayList<>();
        if(person.getChildren() != null){
            for (Person children : person.getChildren()) {
                if(children.getChildren() != null){
                    grandChildren.addAll(children.getChildren());
                }
            }
        }
        return grandChildren;
    }

}
