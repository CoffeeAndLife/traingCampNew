package com.qf.test1;

/**
 * @author huangguizhao
 */
public class ForTest {


    public static void main(String[] args){
        //求1-100的和
        //求1-100，3的倍数的数字之和
        //求1-100之间，遇到3的倍数则不输出，其他数字均输出
        //求1-10之间，遇到3的倍数则跳出循环，否则输出当前文字
        int sum = 0;
        for(int i=1;i<=100;i++){
            if(i%3 == 0){
                //continue;//继续的意思
                break;//跳出整个循环
            }
            System.out.println(i);
        }
        //System.out.println(sum);
    }
}
