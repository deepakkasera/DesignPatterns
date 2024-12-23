package org.example.designpatterns.factory.factory;

public interface UIComponent {
    void refreshUI(); // non factory method.

    UIComponentFactory createUIComponentFactory(); //
}
