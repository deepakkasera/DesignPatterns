package org.example.designpatterns.factory.components;

public class IOSMenu implements Menu {
    @Override
    public void checkMenu() {
        System.out.println("IOS Menu.");
    }
}
