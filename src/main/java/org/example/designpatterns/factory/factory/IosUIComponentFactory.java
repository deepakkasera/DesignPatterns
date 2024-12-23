package org.example.designpatterns.factory.factory;

import org.example.designpatterns.factory.components.Button;
import org.example.designpatterns.factory.components.IOSButton;
import org.example.designpatterns.factory.components.IOSMenu;
import org.example.designpatterns.factory.components.Menu;

public class IosUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
