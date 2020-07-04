package pl.yellowduck.netflix90.resouces;

public enum Category implements Discountable {
    COMEDY(0,"funny films"),
    FANTASY(5,"sci-fy films"),
    DRAMA(3,"got tissue"),
    HORROR(4,"Can't sleep at night"),
    MUSICAL(2,"wanna dance"),
    ACTION(1,"shot and drive fast");

    private final int discount;

    private final String description;

    Category(int discount, String description) {
        this.discount = discount;
        this.description = description;
    }

    public int getDiscount() {
        return discount;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return name() + " " + description;
    }

    @Override
    public int discount() {
        return discount;
    }
}
