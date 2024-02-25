package jd17_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueElements {
    public static void main(String[] args) {
        String str = "aabcccdeeeef";
        Map<Character,Integer> map = new LinkedHashMap<>();
        Map<Character,Integer> uniqueElements = new LinkedHashMap<>();

          for (char ch: str.toCharArray()){
              map.put(ch,map.getOrDefault(ch,0)+1 );
            if ((map.containsKey(ch))){
               map.remove(ch,map.getOrDefault(ch,0)+1);
            }
          }
          for (Map.Entry<Character,Integer> each : map.entrySet()){
              if (each.getValue() ==1){
                  uniqueElements.put(each.getKey(), each.getValue());
              }
          }
        System.out.println(uniqueElements);

    }
}
/*

5. Create a class named UniqueCharacters and write a program that returns the unique characters from a given
string as a map, with each character's frequency as the value. This should be done without using nested loops.

         Example:
               string = "aabcccdeeeef"

         Output:
               {b=1, d=1, f=1}
 */