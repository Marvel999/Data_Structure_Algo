package Heaps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hfc_official {
    public static void main(String[] args) {
        HashMap<Character,Integer> hs=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int cout=0;
        for(int i=0;i<s.length();i++){
            if(!hs.containsKey(s.charAt(i))){
            hs.put(s.charAt(i),1);
            }else {
                hs.put(s.charAt(i),hs.get(s.charAt(i))+1);
            }
        }

        char maxhch=s.charAt(0);

        for (Character key:hs.keySet()){
            if (hs.get(key) > hs.get(maxhch)) {
                maxhch=key;
            }

        }
        System.out.println(maxhch);
    }
}
