package pl.yellowduck.netflix90.resouces;

import java.math.BigDecimal;
import java.util.Set;

public class VideoCassete {
    private String id;
    private BigDecimal price;
    private String title;
    private Director director;
    private Category category;
    private Set<Actor> actors;

    public VideoCassete(String id, BigDecimal price, String title, Director director, Category category, Set<Actor> actors) {
        this.id = id;
        this.price = price;
        this.title = title;
        this.director = director;
        this.category = category;
        this.actors = actors;
    }

    public void printOut() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("|").append(this.id).append("|")
                .append("|").append(this.title).append("|")
                .append("|").append(this.price).append("|")
                .append("|").append(this.director).append("|")
                .append("|").append(this.category).append("|")
                .append('\n').append("Actors: ").append(this.actors);

        System.out.println(stringBuilder.toString());
    }
}
