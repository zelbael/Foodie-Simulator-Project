package model;

public class Cuisine {
    private int cuisine_id;
    private String name;

    public Cuisine(int cuisine_id, String name) {
        this.cuisine_id = cuisine_id;
        this.name = name;
    }

    public Cuisine(String name) {
        this.name = name;
    }

    public int getCuisine_id() {
        return cuisine_id;
    }

    public void setCuisine_id(int cuisine_id) {
        this.cuisine_id = cuisine_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RestaurantRating{" +
                "cuisine_id=" + cuisine_id +
                "name='" + name + '\'' +
                '}';
    }
}

