package org.example.designpatterns.factory.factory;

import org.example.designpatterns.factory.components.AndroidButton;
import org.example.designpatterns.factory.components.AndroidMenu;
import org.example.designpatterns.factory.components.Button;
import org.example.designpatterns.factory.components.Menu;

public class AndroidUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
