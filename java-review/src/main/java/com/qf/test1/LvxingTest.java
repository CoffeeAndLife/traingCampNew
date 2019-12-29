package com.qf.test1;

/**
 * @author huangguizhao
 * 申明
 */
public class LvxingTest {
    public static void main(String[] args){
        //Bike
        //1.买辆自行车
        Bike bike = new Bike("凤凰牌");
        //2.买辆汽车
        Car car = new Car("保时捷牌的拖拉机");
        //3.买辆飞机
        Plane plane = new Plane("歼20");
        //2.来一个人
        Person person = new Person("李雷");
        //3.人骑自行车
        System.out.println("吹着口哨，愉快玩耍起来");
        //person.start(bike);
        //person.start(car);
        person.start(plane);
        System.out.println("沿途风景无限.......");
        //person.stop(car);
        person.stop(plane);
        //OCP 开闭原则
        //当有需求变更的时候，对新增代码保持一个开放的状态 OPEN
        //Person CLOSE

    }
}
