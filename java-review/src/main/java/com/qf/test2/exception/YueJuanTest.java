package com.qf.test2.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @author huangguizhao
 */
public class YueJuanTest {

    public static void main(String[] args){
        //IO流
        System.out.println("训练营自动阅卷系统V1.0");
        //接收键盘录入
        Scanner input = new Scanner(System.in);

        while (true){
            //
            System.out.println("请输入正确答案的路径：");
            String path = input.next();
            //java异常体系
            try {
                FileReader reader = new FileReader(path);
                System.out.println("开始阅卷....");
                System.out.println("完成阅卷....");
                break;
            } catch (FileNotFoundException e) {
                //e.printStackTrace();
                System.out.println("路径不正确，请输入正确的路径");
            }
        }

    }
}
