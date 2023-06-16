package org.acme;

import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
    
    public Ratings greeting(int productId) {
        List<Rating> ratingList = new ArrayList<>();
        ratingList.add(0, new Rating("Alice", 3));
        ratingList.add(1, new Rating("Bob", 5));

        Ratings ratings = new Ratings(productId, ratingList);
        return ratings;
    }
}
