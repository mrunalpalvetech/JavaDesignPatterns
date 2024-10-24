package com.creational.factory;

public class UIFactoryImpl {
    public static UIFactory getUIFactoryByPlatform(String platform) {
        if (platform.equals("Android")) {
            return new AndroidUIFactory();
        } else if (platform.equals("IOS")) {
            return new IosUIFactory();
        }
        return null;
    }
}
