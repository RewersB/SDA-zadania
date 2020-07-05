package pl.yellowduck.netflix90;

import pl.yellowduck.netflix90.resouces.Actor;
import pl.yellowduck.netflix90.resouces.Director;
import pl.yellowduck.netflix90.resouces.Gender;
import pl.yellowduck.netflix90.resouces.Person;

import java.util.HashSet;
import java.util.Set;

public class Main_Person {

  public static void main(String[] args) {
    System.out.println("Hello Netflix90");
    Actor tommyActor = new Actor("Tommy", "Wiseau",Gender.MALE);
    Actor greg = new Actor("Greg", "Sestero", Gender.MALE);
    Actor juliette = new Actor("Juliette", "Danielle", Gender.FEMALE);
    Director tommy = new Director("Tommy", "Wiseau", Gender.MALE);
    Director tommyFe = new Director("Tommy", "Wiseau", Gender.FEMALE);
    greg.getFirstName();

    Set<Person> persons = new HashSet<>();
    persons.add(tommy);
    persons.add(tommyFe);
    persons.add(tommyActor);
    persons.add(greg);
    persons.add(juliette);

    for (Person person: persons){
      person.introduce();
    }

//    for(int i =0;i<persons.size()-1; i++){
//      Person person = persons.get(i);
//      person.introduce();
//    }

  }
}
