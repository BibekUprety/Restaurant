package com.resturant.management.resturant.service;

import com.resturant.management.resturant.model.Restaurant;

import java.util.List;

public interface RestaurantService {

    Restaurant addRestaurant(Restaurant restaurant);

    List<Restaurant> findAllRestaurant();
}
