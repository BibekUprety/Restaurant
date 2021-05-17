package com.resturant.management.resturant.controller;

import com.resturant.management.resturant.model.Restaurant;
import com.resturant.management.resturant.service.RestaurantService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    private RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Restaurant> findAllRestaurant() {
        return restaurantService.findAllRestaurant();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Restaurant saveRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.addRestaurant(restaurant);
    }
}
