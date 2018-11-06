package com.airport.FlightsApp.persistance;

import com.airport.FlightsApp.storage.LocalTime;
import org.springframework.web.client.RestTemplate;


/**
 * Created by Robi on 11/1/2018.
 */
public class LocalCity extends City {
    private String localTimeStr;

    public LocalCity(City city) {
        super(city);
    }

    public LocalCity() {

    }

    public String getLocalTimeStr() {
        return localTimeStr;
    }

    public void setLocalTimeStr(String localTimeStr) {
        this.localTimeStr = localTimeStr;
    }

    public void updateLocalTime(){
        RestTemplate restTemplate = new RestTemplate();
        LocalTime response = restTemplate.getForObject("http://api.timezonedb.com/v2.1/get-time-zone?key=K51ZRGXA0M1J&format=json&by=position&lat=" + this.getLatitude() + "&lng=" + this.getLongitude(), LocalTime.class);

        this.localTimeStr = response.getFormatted();
    }
}
