package org.example.designpatterns.observer;

public class MobileDisplay implements Subscriber {
    private WeatherData weatherData;
    private float temperature;
    private float humidity;

    public MobileDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerSubscriber(this);
    }

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        System.out.println("Updating weather data for Mobile display");
    }
}
