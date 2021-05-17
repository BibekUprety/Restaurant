package com.resturant.management.resturant.service.impl;

import com.resturant.management.resturant.model.Restaurant;
import com.resturant.management.resturant.repository.RestaurantRepository;
import com.resturant.management.resturant.service.RestaurantService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    private RestaurantRepository restaurantRepository;

    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public List<Restaurant> findAllRestaurant() {
        return restaurantRepository.findAll();
    }
}
