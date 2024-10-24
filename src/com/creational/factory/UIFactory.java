package com.creational.factory;

import com.creational.factory.components.button.Button;
import com.creational.factory.components.menu.Menu;

public interface UIFactory {
    public Button createButton();
    public Menu createMenu();
}
