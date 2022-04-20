
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Rating {
    //key = rating (which is between 0 and 5), value = the num of people who are rating
    Map<Integer, Integer> ratings = new HashMap<>();

    public void addRating(int stars){
        if(stars >= 0 && stars <= 5){
            if( ratings.containsKey(stars)){
                ratings.put(stars, ratings.get(stars) + 1);
            }
            else{
                ratings.put(stars, 1);
            }
        }
        else{
            System.out.println("not in range!");
        }
    }

    public int getAmountRatings(){
        int sum = 0;
        for (int rating: ratings.keySet()) {
            sum += ratings.get(rating) * rating;
        }
        return sum;
    }

    public int getAmountRatings(int stars){
        int sumOfSpecificRating = 0;
        if(stars >= 0 && stars <= 5){
            sumOfSpecificRating = stars * ratings.get(stars);
            return sumOfSpecificRating;
        }
        else {
            return 0;
        }
    }

    public float getAverageRating(){
        int numberOfRatings = 0;
        float averageOfRatings;
        if(!ratings.isEmpty()){
            for (int value: ratings.values()) {
                numberOfRatings += value;
            }
            averageOfRatings = (float)getAmountRatings() / numberOfRatings;
            return averageOfRatings;
        }
        else{
            return -1;
        }
    }

}