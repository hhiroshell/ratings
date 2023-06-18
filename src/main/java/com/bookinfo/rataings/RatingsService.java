package com.bookinfo.rataings;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface RatingsService {

    public Ratings getByProductId(int productId);
}
