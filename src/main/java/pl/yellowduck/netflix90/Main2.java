package pl.yellowduck.netflix90;

import pl.yellowduck.netflix90.resouces.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main2 {

    public static void main(String[] args) {

        Actor tommyActor = new Actor("Tommy", "Wiseau", Gender.MALE);
        Actor greg = new Actor("Greg", "Sestero", Gender.MALE);
        Actor juliette = new Actor("Juliette", "Danielle", Gender.FEMALE);
        Director tommy = new Director("Tommy", "Wiseau", Gender.MALE);
        Director tommyFe = new Director("Tommy", "Wiseau", Gender.FEMALE);

        List<Person> persons = new ArrayList<>();
        Set<Actor> actors = new HashSet<>();
        persons.add(tommy);
        persons.add(tommyFe);
        persons.add(tommyActor);
        persons.add(greg);
        persons.add(juliette);


        VideoCassete theRoom = new VideoCassete(
                "VID001",
                BigDecimal.valueOf(28),
                "The Room",
                tommy,
                Category.DRAMA,
                Set.of(tommyActor, greg, juliette));

//    for (Person person: persons){
//      person.introduce();
//    }

//        for (int i = 0; i < persons.size(); i++) {
//            Person person = persons.get(i);
//            person.introduce();
//        }

    }
}
