package com.creational.factory.components.button;

public class AndroidButton implements Button {
    @Override
    public void click() {
        System.out.println("AndroidButton clicked");
    }
}
