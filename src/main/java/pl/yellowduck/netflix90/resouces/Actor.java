package pl.yellowduck.netflix90.resouces;

public class Actor extends Person {


    public Actor(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
//        super(firstName, lastName.endsWith("i") ? Gender.MALE : Gender.FEMALE);
    }

    @Override
    public String toString() {
        return  firstName + " "  + lastName;
    }

    public void introduce() {
        if (Gender.MALE.equals(gender)) {
            System.out.println("my name is " + firstName + " " + lastName + ", im a actor!");
        }
        if (Gender.FEMALE.equals(gender)) {
            System.out.println("my name is " + firstName + " " + lastName + ", im a actress!");
        }
    }
}
