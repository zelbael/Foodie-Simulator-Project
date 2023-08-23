package exception;


@Component
public class JdbcRestaurantDao implements RestaurantDAO {

    private final JdbcTemplate jdbcTemplate;

    public JdbcRestaurantDao(Datasource datasource) {jdbcTemplate = new jdbcTemplate = new JdbcTemplate(dataSource);}

    public Restaurant getRestaurantById(int restaurantId);

    /*
    Get all restaurants from the datastore ordered alphabetically by name.

    @return List of all Restaurant objects, or an empty list if no Restaurants are found.
    */

    List<Restaurant> getRestaurants();

    /*
    Get all restaurants from the datastore for a specified user.
    Restaurants are ordered alphabetically by name.

    @param memberId the id of the member
    @return List of all the Restaurant members associated to the user, or an empty list if none are found.
     */

    List<Restaurant> getRestaurantByMemberId(int memberId);

    /*
    Get all public restaurants from the datastore that are associated to a specific user.
    Restaurants are ordered alphabetically by name.

    @param memberId the id of the user
    @return List of all the public restaurant objects associated to the user, or an empty list if none are found.
     */

    List<Restaurant> getPublicRestaurantByMemberId(int memberId);

    /*
    Get all restaurants from the datastore that are marked as public.
    Restaurants are ordered alphabetically by name.

    @return List of all the public Restaurant objects, or an empty list if none are found.
     */

    List<Restaurant> getPublicRestaurants();

    /*
    Get a list of restaurants from the datastore that are marked as flagged.
    Restaurants are ordered alphabetically by name.

    @return List of all the flagged restaurant objects, or an empty list if none are found.
     */

    List<Restaurant> getFlaggedRestaurant();

    /*
    Gets all bookmarks from the datastore that contain the filter criteria in either the name, cuisine, rating, or member.

    @param searchTerm the string to filter by
    @param publicOnly true if only public restaurants should be included, false otherwise
    @param useWildCard true if the searchTerm is wrapped by SQL wild card characters
    @return List of the filtered restaurant objects, or an empty list is none are found
     */

    List<Restaurant> filterRestaurant(String searchTerm, boolean publicOnly, boolean useWildCard);

    /*
    Adds a new restaurant to the datastore.

    @param newRestaurant the Restaurant object to add
    @return the added Restaurant object with its new id and any default values filled in
     */

    Restaurant createRestaurant(Restaurant newRestaurant);

    /*
    Removes a restaurant and any member associations from the bookstore.

    @param restaurantId The id of the Restaurant to remove. If the id is not found, no error will occur.
     */

    int deleteRestaurantById(int restaurantId);

    /*
    Update a restaurant in the bookstore.
    Only the name, address1, address2, city, state, zipcode.

    @param modifiedRestaurant the Restaurant object to update
     */

    Restaurant updateRestaurant(Restaurant modifiedRestaurant);


}
