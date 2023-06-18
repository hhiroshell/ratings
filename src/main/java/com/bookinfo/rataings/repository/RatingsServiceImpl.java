package com.bookinfo.rataings.repository;

import java.util.ArrayList;
import java.util.List;

import com.bookinfo.rataings.Rating;
import com.bookinfo.rataings.Ratings;
import com.bookinfo.rataings.RatingsService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class RatingsServiceImpl implements RatingsService {

    @Inject
    EntityManager em;

    @Override
    public Ratings getByProductId(int productId) {
        List<RatingEntity> entities = em.createQuery("select r from RatingEntity r where r.productId = :productId", RatingEntity.class)
            .setParameter("productId", productId)
            .getResultList();

        List<Rating> ratingList = new ArrayList<>(entities.size());
        for (RatingEntity entity : entities) {
            ratingList.add(new Rating(entity.getReviewer(), entity.getStars()));
        }

        Ratings ratings = new Ratings(productId, ratingList);
        return ratings;
    }
    
}
