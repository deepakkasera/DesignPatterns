package org.example.designpatterns.factory.factory;

public class IOSUIComponent implements UIComponent {
    @Override
    public void refreshUI() {
        System.out.println("Refresh IOS UI.");
    }

    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new IosUIComponentFactory();
    }
}
