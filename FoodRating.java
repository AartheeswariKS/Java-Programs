package foodrating;
import java.util.*;
public class FoodRating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Ratings with their ID's:");
        int N = scanner.nextInt();
        Map<Integer, Double> dishRatings = new HashMap<>();
        System.out.println("Enter Ratings with their ID's:");
        for (int i = 0; i < N; i++) {
            int dishId = scanner.nextInt();
            int rating = scanner.nextInt();

            if (dishRatings.containsKey(dishId)) {
                double currentRating = dishRatings.get(dishId);
                dishRatings.put(dishId, (currentRating + rating) / 2);
            } else {
                dishRatings.put(dishId, (double) rating);
            }
        }

        int maxDishId = -1;
        double maxRating = -1.0;

        for (Map.Entry<Integer, Double> entry : dishRatings.entrySet()) {
            int dishId = entry.getKey();
            double rating = entry.getValue();

            if (rating > maxRating || (rating == maxRating && dishId < maxDishId)) {
                maxDishId = dishId;
                maxRating = rating;
            }
        }

        System.out.println("ID of Best Dish based on Rating:"+maxDishId);
    }
}

