package pl.yellowduck.netflix90.resouces;

public class Director extends Person {

    public Director(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public void introduce() {
        switch (this.gender) {
            case MALE:
                System.out.println("my name is " + toString() + ", im a director!");
                break;
            case FEMALE:
                System.out.println("my name is " + toString() + ", im a director(s)!");
                break;
        }


//        if (Gender.MALE.equals(gender)) {
//            System.out.println("my name is " + firstName + " " + lastName + ", im a director!");
//        }
//        if (Gender.FEMALE.equals(gender)) {
//            System.out.println("my name is " + firstName + " " + lastName + ", im a director!");
//        }
    }
}
