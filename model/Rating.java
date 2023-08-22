package model;

public class Rating {
    private int rating_id;
    private boolean thumbs_up;
    private boolean thumbs_down;

    public Rating(boolean thumbs_up, boolean thumbs_down) {
        this.thumbs_up = thumbs_up;
        this.thumbs_down = thumbs_down;
    }

    public int getRating_id() {
        return rating_id;
    }

    public void setRating_id(int rating_id) {
        this.rating_id = rating_id;
    }

    public boolean isThumbs_up() {
        return thumbs_up;
    }

    public void setThumbs_up(boolean thumbs_up) {
        this.thumbs_up = thumbs_up;
    }

    public boolean isThumbs_down() {
        return thumbs_down;
    }

    public void setThumbs_down(boolean thumbs_down) {
        this.thumbs_down = thumbs_down;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "rating_id=" + rating_id +
                ", thumbs_up='" + thumbs_up + '\'' +
                ", thumbs_down='" + thumbs_down +
                '}';
    }
}

