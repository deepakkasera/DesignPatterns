package org.example.designpatterns.observer;

public class TVDisplay implements Subscriber {
    private WeatherData weatherData;
    private float temperature;
    private float humidity;

    public TVDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerSubscriber(this);
    }

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        System.out.println("Updating weather data for TV display");
    }
}
