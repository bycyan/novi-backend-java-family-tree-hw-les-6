import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @org.junit.jupiter.api.Test
    void getName() {
        //Arrange
        Person personOne = new Person("Cyan","Crazy ","Dalebout", 27, 'm');
        //Act
        String name = personOne.getName();
        //Assert
        assertEquals("Cyan", name);
    }

    @org.junit.jupiter.api.Test
    void getMiddleName() {
        //Arrange
        Person personOne = new Person("Cyan","Crazy","Dalebout", 27, 'm');
        //Act
        String name = personOne.getMiddleName();
        //Assert
        assertEquals("Crazy", name);
    }

    @org.junit.jupiter.api.Test
    void getLastName() {
        //Arrange
        Person personOne = new Person("Cyan","Crazy ","Dalebout", 27, 'm');
        //Act
        String name = personOne.getLastName();
        //Assert
        assertEquals("Dalebout", name);
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        //Arrange
        Person personOne = new Person("Cyan","Crazy ","Dalebout", 27, 'm');
        //Act
        int number = personOne.getAge();
        //Assert
        assertEquals(27, number);
    }

    @org.junit.jupiter.api.Test
    void getSex() {
        //Arrange
        Person personOne = new Person("Cyan","Crazy ","Dalebout", 27, 'm');
        //Act
        char sex = personOne.getSex();
        //Assert
        assertEquals('m', sex);
    }

    @org.junit.jupiter.api.Test
    void getMother() {
        //Arrange
        Person personOne = new Person("Cyan","Crazy ","Dalebout", 27, 'm');
        Person personTwo = new Person("Reevy","Dalebout", 56, 'v');
        personOne.setMother(personTwo);
        //Act
        Person mother = personOne.getMother();
        //Assert
        assertEquals(personTwo, mother);
    }

    @org.junit.jupiter.api.Test
    void getFather() {
        //Arrange
        Person personOne = new Person("Cyan","Crazy ","Dalebout", 27, 'm');
        Person personTwo = new Person("Marc","Dalebout", 55, 'm');
        personOne.setFather(personTwo);
        //Act
        Person father = personOne.getFather();
        //Assert
        assertEquals(personTwo, father);
    }

    @org.junit.jupiter.api.Test
    void getSiblings() {
        //Arrange
        Person personOne = new Person("Cyan","Crazy ","Dalebout", 27, 'm');
        Person personTwo = new Person("Frans","Bouwer", 100, 'm');
        List<Person> bro = new ArrayList<>();
        bro.add(personTwo);
        personOne.setSiblings(bro);
        //Act
        List<Person> siblings = personOne.getSiblings();
        //Assert
        assertEquals(bro, siblings);
    }

    @org.junit.jupiter.api.Test
    void getChildren() {
        //Arrange
        Person mother = new Person("Fransien", "Goudebogen", 25, 'v');
        Person personOne = new Person("Cyan", "Cyanson", 102, 'm');
        Person personTwo = new Person("Esther", "Frogois", 300, 'v');
        Person personThree = new Person("Tomas", "Thomasson", 31, 'v');
        List<Person> children = new ArrayList<>();
        children.add(personOne);
        children.add(personTwo);
        children.add(personThree);
        mother.setChildren(children);
        //Act
        List<Person> totalChildren = mother.getChildren();
        //Assert
        assertEquals(children, totalChildren);
    }

    @org.junit.jupiter.api.Test
    void getPets() {
        //Arrange
        //Act
        //Assert
    }

    @org.junit.jupiter.api.Test
    void setAge() {
        //Arrange
        //Act
        //Assert
    }

    @org.junit.jupiter.api.Test
    void setSex() {
        //Arrange
        //Act
        //Assert
    }

    @org.junit.jupiter.api.Test
    void setMother() {
        //Arrange
        //Act
        //Assert
    }

    @org.junit.jupiter.api.Test
    void setFather() {
        //Arrange
        //Act
        //Assert
    }

    @org.junit.jupiter.api.Test
    void setSiblings() {
        //Arrange
        //Act
        //Assert
    }

    @org.junit.jupiter.api.Test
    void setChildren() {
        //Arrange
        //Act
        //Assert
    }

    @org.junit.jupiter.api.Test
    void setPets() {
        //Arrange
        //Act
        //Assert
    }

    @org.junit.jupiter.api.Test
    void addParents() {
        //Arrange
        //Act
        //Assert
    }

    @org.junit.jupiter.api.Test
    void addToChildren() {
        //Arrange
        //Act
        //Assert
    }

    @org.junit.jupiter.api.Test
    void addPet() {
        //Arrange
        Person dogOwner = new Person("Mini", "Me", 8, 'A');
        Pet dog = new Pet("Woef", 7, "Golden");
        List<Pet> pets = new ArrayList<>();
        pets.add(dog);

        //Act
        dogOwner.addPet(dogOwner, dog);
        //Assert
        assertEquals(pets, dogOwner.getPets());
    }

    @org.junit.jupiter.api.Test
    void addSiblings() {
        //Arrange
        //Act
        //Assert
    }

    @org.junit.jupiter.api.Test
    void getGrandChildren() {
        //Arrange
        List<Person> grandChildren = new ArrayList<>();
        Person personOne = new Person("Cyan", "Cyanson", 102, 'm');
        Person personTwo = new Person("Esther", "Frogois", 300, 'v');
        Person personThree = new Person("Tomas", "Thomasson", 31, 'v');
        grandChildren.add(personOne);
        //Act
        personTwo.addToChildren(personTwo, personOne);
        personThree.addToChildren(personThree, personTwo);
        List<Person> whosTheGranny = personThree.getGrandChildren(personThree);
        //Assert
        assertEquals(grandChildren, whosTheGranny);
    }
}