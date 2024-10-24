package com.creational.factory;

import com.creational.factory.components.button.AndroidButton;
import com.creational.factory.components.button.Button;
import com.creational.factory.components.menu.AndroidMenu;
import com.creational.factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
