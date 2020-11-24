package cl.desafiolatam.simpleweather.model;

import android.widget.ImageView;

public class Weather {

    private String city;
    private String date;
    private String temperature;
    private String unit_measure;

    public Weather(String city, String date, String temperature, String unit_measure) {
        this.city = city;
        this.date = date;
        this.temperature = temperature;
        this.unit_measure = unit_measure;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getUnit_measure() {
        return unit_measure;
    }

    public void setUnit_measure(String unit_measure) {
        this.unit_measure = unit_measure;
    }
}
