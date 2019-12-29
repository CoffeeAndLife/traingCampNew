package com.qf.test2;

/**
 * @author huangguizhao
 */
public class Main {

    public static void main(String[] args){
        //1.买一台榨汁机
        Zhazhiji zhazhiji = new Zhazhiji();
        //2.买一个雪梨
        Peal peal = new Peal();
        //3.开始榨汁
        zhazhiji.zhazhi(peal);
        //4.买一个苹果
        Apple apple = new Apple();
        zhazhiji.zhazhi(apple);
    }
}
