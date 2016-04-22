package com.clearfaun.dp_hw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here


        //this creates a linked list of random numbers from
        //1-25
        //there are 100 entries
        LinkedList randomLinkedList = randomLinkedList ();

        //just prints
        //output
        //Size of LinkedList : 100
        printLinkedList(randomLinkedList);



        //puts into a hashmap
        //then back into a linked list
        //0(n)
        LinkedList removedDuplicates = putInHashMap(randomLinkedList);


        //new output
        //Size of LinkedList : 25
        printLinkedList(removedDuplicates);


    }


    public static LinkedList putInHashMap(LinkedList randomLinkedList){

        HashMap<String, String> hashMap = new HashMap<String, String>();
        LinkedList newLinkedList = new LinkedList<>();

        for(int i = 0 ; i < randomLinkedList.size(); i ++){

            //System.out.println(randomLinkedList.get(i));

            hashMap.put(randomLinkedList.get(i) + "", randomLinkedList.get(i) + "");

        }


        int count = 0;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            //System.out.println(pair.getKey() + " = " + pair.getValue());

            newLinkedList.add(count, pair.getValue());
            //System.out.println("count " + count);
            count++;
        }


        return newLinkedList;
    }







    public static void printLinkedList (LinkedList randomLinkedList ){
        //Construct the array we're using here


        for(int i = 0 ; i < randomLinkedList.size(); i ++){

            System.out.println(randomLinkedList.get(i));




        }

        System.out.println("Size of LinkedList : " + randomLinkedList.size());
        System.out.println();

    }


    public static LinkedList randomLinkedList (){
        //Construct the array we're using here
        LinkedList ll = new LinkedList<>();

        for(int i = 0 ; i < 100; i ++){

            ll.add(0, (int)(Math.random() * ( 25 )));

        }

        return ll;
    }
}
