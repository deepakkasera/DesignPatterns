package org.example.designpatterns.factory.factory;

import org.example.designpatterns.factory.components.Button;
import org.example.designpatterns.factory.components.Menu;

public interface UIComponentFactory {
    //All the factory methods.
    Button createButton(); // factory method

    Menu createMenu(); // factory method
}
