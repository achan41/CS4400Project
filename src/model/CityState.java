package model;

/**
 * represent a City Official Object
 */
public class CityState {

    private String city;
    private String state;

    /**
     * makes a City State with a city and state
     * @param city CityState city
     * @param state CityState state
     */
    public CityState(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
