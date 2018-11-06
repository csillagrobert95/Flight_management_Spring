package com.airport.FlightsApp.persistance;

import javax.persistence.*;
/**
 * Created by Robi on 10/31/2018.
 */

@Entity
@Table(name = "city")
public class City {
    @Id
    @Column(name = "city_name")
    private String cityName;
    @Column(name = "country")
    private String country;
    @Column(name = "latitude")
    private double latitude;
    @Column(name = "longitude")
    private double longitude;

    public City() {
    }

    public City(City city) {
        this.cityName = city.getCityName();
        this.country = city.getCountry();
        this.latitude = city.getLatitude();
        this.longitude = city.getLongitude();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

}
