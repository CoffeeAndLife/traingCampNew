package com.qf.test2.collection;

import java.util.ArrayList;

/**
 * @author huangguizhao
 */
public class CollectionTest {

    public static void main(String[] args){
        //底层采用的就是数组
        //可自动扩展的数组
        ArrayList arrayList = new ArrayList();
        arrayList.add("马云1");
        arrayList.add("马云2");
        arrayList.add("马云3");
        arrayList.add("马云4");
        arrayList.add("马云5");
        arrayList.add("马云6");
        arrayList.add("马云7");
        arrayList.add("马云8");
        arrayList.add("马云9");

        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
