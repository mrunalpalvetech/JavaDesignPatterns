package com.creational.factory;

import com.creational.factory.components.button.Button;
import com.creational.factory.components.button.IOSButton;
import com.creational.factory.components.menu.IOSMenu;
import com.creational.factory.components.menu.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
