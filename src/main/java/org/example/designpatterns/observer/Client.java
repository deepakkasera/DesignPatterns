package org.example.designpatterns.observer;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        MobileDisplay mobileDisplay = new MobileDisplay(weatherData);
        TVDisplay tvDisplay = new TVDisplay(weatherData);
        WebsiteDisplay websiteDisplay = new WebsiteDisplay(weatherData);

        weatherData.setWeatherDetails(35.0F, 48.0F);

        weatherData.setWeatherDetails(40.0F, 51.0F);

        weatherData.setWeatherDetails(27.0F, 55.0F);
    }
}
