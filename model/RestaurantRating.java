package model;

public class RestaurantRating {
    private int rating_id;
    private int restaurant_id;

    public RestaurantRating(int rating_id, int restaurant_id) {
        this.rating_id = rating_id;
        this.restaurant_id = restaurant_id;
    }

    public int getRating_id() {
        return rating_id;
    }

    public void setRating_id(int rating_id) {
        this.rating_id = rating_id;
    }

    public int getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(int restaurant_id) {
        this.restaurant_id = restaurant_id;
    }


    @Override
    public String toString() {
        return "RestaurantRating{" +
                "rating_id=" + rating_id +
                "restaurant_id=" + restaurant_id + '\'' +
                '}';
    }
}
