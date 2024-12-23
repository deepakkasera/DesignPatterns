package org.example.designpatterns.factory.factory;

public class AndroidUIComponent implements UIComponent {
    @Override
    public void refreshUI() {
        System.out.println("Refresh android UI.");
    }

    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new AndroidUIComponentFactory();
    }
}
