package com.pfu.SpringDemo.testJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest {

    public static void testSort(){
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<50;i++){
            list.add(i);
        }

        Collections.shuffle(list);

        List<Integer> resultList = list.subList(0,6);
        Collections.sort(resultList);
        Collections.reverse(resultList);
        //resultList.removeIf((value)->value>25);
        int minValue = Collections.min(resultList);
        System.out.println("List:"+resultList+",min:"+minValue);
    }
}
