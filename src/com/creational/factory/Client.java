package com.creational.factory;

import com.creational.factory.components.button.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory andriodFactory =  flutter.createUIFactory("Android");
        Button andriodButton = andriodFactory.createButton();
        andriodButton.click();

        UIFactory iosFactory =  flutter.createUIFactory("IOS");
        Button iosButton = iosFactory.createButton();
        iosButton.click();
    }
}
