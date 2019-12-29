package com.qf.test1;

/**
 * @author huangguizhao
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    //面向抽象编程
    public void start(JiaotongTool jiaotongTool){
        //约定
        jiaotongTool.start();
    }

    public void stop(JiaotongTool jiaotongTool){
        jiaotongTool.stop();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
