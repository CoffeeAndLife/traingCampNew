package com.qf.test1;

/**
 * @author huangguizhao
 */
public abstract class JiaotongTool {

    private String name;

    //默认的无参的构造方法就没有了
    public JiaotongTool(){}
    public JiaotongTool(String name) {
        this.name = name;
    }

    public abstract void start();
    //alt+insert
    public abstract void stop();
}
