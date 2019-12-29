package com.qf.test2.array;

/**
 * @author huangguizhao
 */
public class ArrayTest {

    public static void main(String[] args){
        //1.相同数据类型
        String[] names = new String[6];
        //
        names[0] = "马云";
        names[1] = "马化腾";
        names[2] = "雷军";
        names[3] = "李彦宏";
        names[4] = "李开复";
        names[5] = "黄桂钊";
        //Array Index OutOfBoundsException: 5
        //2.长度是固定的
        //names[5] = "";

        //遍历
        for(int i=0;i<=names.length;i++){
            System.out.println(names[i]);
        }
    }
}
