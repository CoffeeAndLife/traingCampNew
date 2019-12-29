package com.qf.test1;

/**
 * @author huangguizhao
 */
public class Car extends JiaotongTool{

    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void start(){
        System.out.println("跑车狂飙起来");
    }
    //alt+insert
    @Override
    public void stop(){
        System.out.println("飚过头了,熄火了");
    }
}
