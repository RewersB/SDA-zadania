package pl.yellowduck.netflix90;

import pl.yellowduck.netflix90.resouces.Category;

import static pl.yellowduck.netflix90.resouces.Category.*;

public class Main_Category {
    public static void main(String[] args) {

        Category category = Category.DRAMA;
        System.out.println("simple print "+category);
        System.out.println("simple print "+category.toString());
        System.out.println("simple print "+category.name());
        System.out.println("simple print "+category.ordinal());


        Category comedy= Category.COMEDY;
        System.out.println("simple print "+comedy);
        System.out.println("simple print "+comedy.toString());
        System.out.println("simple print "+comedy.name());
        System.out.println("simple print "+comedy.ordinal());




    }
}
