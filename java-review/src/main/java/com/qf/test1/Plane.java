package com.qf.test1;

/**
 * @author huangguizhao
 */
public class Plane extends JiaotongTool{
    private String name;

    public Plane(String name){
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("加速，飞上青天");
    }

    @Override
    public void stop() {
        System.out.println("飞机安全降落");
    }
}
