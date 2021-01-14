package com.demo.controller;

import java.util.*;

public class MapCount {

    public static void main(String[] args) {

        int numbers[] = {54,87,32,7};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int current : numbers) {
            if (current > largest) {
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest) {
                secondLargest = current;
            }
        }

        System.out.println("Second largest number is: " + secondLargest);

        String text = "count the number of words in a a string using HashMap";
        String arr[] = text.split(" ");
        Map map = new HashMap();
        System.out.println("length "+arr.length);
        for(int i=0; i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int j = (int) map.get(arr[i]);
                map.put(arr[i],j+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        System.out.println(map);

    }
}
