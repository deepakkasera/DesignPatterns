package org.example.designpatterns.factory.components;

public class AndroidButton implements Button {
    @Override
    public void clickButton() {
        System.out.println("Clicking android button.");
    }
}
