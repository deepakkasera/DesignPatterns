package org.example.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Publisher {
    private List<Subscriber> subscribers;
    private float temperature;
    private float humidity;

    public WeatherData() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println("Registering a subscriber for Weather Data.");
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println("Removing a subscriber from Weather Data.");
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(temperature, humidity);
        }
    }

    public void setWeatherDetails(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifySubscribers();
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
