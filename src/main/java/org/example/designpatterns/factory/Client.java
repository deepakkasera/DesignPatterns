package org.example.designpatterns.factory;

import org.example.designpatterns.factory.components.Button;
import org.example.designpatterns.factory.components.Menu;
import org.example.designpatterns.factory.factory.AndroidUIComponent;
import org.example.designpatterns.factory.factory.IOSUIComponent;
import org.example.designpatterns.factory.factory.UIComponent;
import org.example.designpatterns.factory.factory.UIComponentFactory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String platform = scanner.nextLine();

        //platform == Android -> AndroidUIComponent -> AndroidUIComponentFactory

        UIComponent uiComponent = UIComponentHelper.getUIComponentForPlatform(platform);
        UIComponentFactory uiComponentFactory = uiComponent.createUIComponentFactory();

        Button button = uiComponentFactory.createButton();
        button.clickButton();

        Menu menu = uiComponentFactory.createMenu();
        menu.checkMenu();
    }
}
