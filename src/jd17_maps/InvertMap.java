package jd17_maps;

import java.util.HashMap;
import java.util.Map;

public class InvertMap {
    public static void main(String[] args) {
        Map<Integer,Character> map = new HashMap<>();
        map.put(1, 'a');
        map.put(2, 'b');
        map.put(3, 'c');

        System.out.println(map);

        Map<Character,Integer> inv = invert(map);
        System.out.println(inv);
    }
    private static  <Character, Integer> Map<Character,Integer> invert(Map<Integer,Character> map){
        Map<Character,Integer> invert = new HashMap<>();
        for (Map.Entry<Integer,Character> each : map.entrySet()){
            invert.put(each.getValue(), each.getKey()) ;

        }
        return invert;
    }

}
/*
Create a class named InvertMap and write a program that returns a new map which is the
inverted version of the provided map, meaning the keys become values and the values become keys.
It is assumed that there are no duplicate values in the original map.

         Example:
               map = {1="a", 2="b", 3="c"}

         Output:
               {"a"=1, "b"=2, "c"=3}
 */
