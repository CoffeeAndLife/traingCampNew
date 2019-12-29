package com.qf.test1;

/**
 * @author huangguizhao
 */
public class Bike extends JiaotongTool{

    private String name;

    public Bike(String name) {
        this.name = name;
    }

    @Override
    public void start(){
        System.out.println("转着风火轮疯狂跑起来");
    }

    @Override
    public void stop(){
        System.out.println("风一吹熄火，停下来了");
    }
}
