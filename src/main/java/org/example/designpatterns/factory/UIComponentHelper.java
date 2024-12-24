package org.example.designpatterns.factory;

import org.example.designpatterns.factory.factory.AndroidUIComponent;
import org.example.designpatterns.factory.factory.IOSUIComponent;
import org.example.designpatterns.factory.factory.UIComponent;

public class UIComponentHelper {
    //Practical Factory.
    public static UIComponent getUIComponentForPlatform(String platform) {
        UIComponent uiComponent = null;
        if (platform.equals("Android")) {
            uiComponent = new AndroidUIComponent();
        } else if (platform.equals("IOS")) {
            uiComponent = new IOSUIComponent();
        }

        return uiComponent;
    }
}
