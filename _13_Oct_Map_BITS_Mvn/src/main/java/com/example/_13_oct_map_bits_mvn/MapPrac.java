package com.example._13_oct_map_bits_mvn;

import java.util.HashMap;

public class MapPrac {
    public void main(String[] args){
        HashMap<String, Integer> petCount = new HashMap<>();

        //insert
        //ape 1, dog 2, frog 3, cat 7

        petCount.put("ape",1);
        petCount.put("dog",2);
        petCount.put("frog",3);
        petCount.put("cat", 4);

        System.out.print(petCount);


    }
}
