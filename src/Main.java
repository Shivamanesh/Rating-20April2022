import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Rating rating = new Rating();
        Map<Integer, Integer> movieRating = new HashMap<>();
        rating.addRating(3);
       rating.addRating(3);
       rating.addRating(4);
        System.out.println("this is the whole amount: " + rating.getAmountRatings());
        System.out.println("This is the whole amount of specific stars: " + rating.getAmountRatings(3));
        System.out.println("This is the whole amount of specific stars: " + rating.getAmountRatings(37));
        System.out.println("This is the average of ratings: " + rating.getAverageRating());
    }
}
