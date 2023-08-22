package model;

public class RestaurantCuisine {
    private int restaurant_id;
    private int cuisine_id;

    public RestaurantCuisine(int restaurant_id, int cuisine_id) {
        this.restaurant_id = restaurant_id;
        this.cuisine_id = cuisine_id;
    }

    public int getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(int restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public int getCuisine_id() {
        return cuisine_id;
    }

    public void setCuisine_id(int cuisine_id) {
        this.cuisine_id = cuisine_id;
    }

    @Override
    public String toString() {
        return "RestaurantCuisine{" +
                "restaurant_id=" + restaurant_id +
                "cuisine_id=" + cuisine_id + '\'' +
                '}';
    }
}

