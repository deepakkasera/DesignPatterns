package org.example.designpatterns.factory.components;

public class IOSButton implements Button {
    @Override
    public void clickButton() {
        System.out.println("Clicking IOS Button.");
    }
}
