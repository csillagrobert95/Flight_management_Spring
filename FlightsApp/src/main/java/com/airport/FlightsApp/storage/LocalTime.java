package com.airport.FlightsApp.storage;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Created by Robi on 11/1/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalTime {
    private int gmtOffset;
    private int timestamp;
    private String status;
    private String message;
    private String formatted;

    public LocalTime() {

    }

    @Override
    public String toString() {
        return "LocalTime{" +
                "gmtOffset=" + gmtOffset +
                ", timestamp=" + timestamp +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", formatted='" + formatted + '\'' +
                '}';
    }

    public int getGmtOffset() {
        return gmtOffset;
    }

    public void setGmtOffset(int gmtOffset) {
        this.gmtOffset = gmtOffset;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFormatted() {
        return formatted;
    }

    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }
}
