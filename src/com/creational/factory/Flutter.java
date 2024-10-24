package com.creational.factory;

public class Flutter {

    public void setRefreshRate(){
        System.out.println("Setting Refresh rate");
    }

    public void setTheme(){
        System.out.println("Setting theme");
    }

    public UIFactory createUIFactory(String platform){
        return UIFactoryImpl.getUIFactoryByPlatform(platform);
    }
}
