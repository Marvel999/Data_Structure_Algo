package HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMap_Basic {
    public static void main(String[] args) {
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('A',1);
        hm.put('B',2);
        hm.put('C',3);
        hm.put('D',4);
        System.out.println(hm);
        Set<Character> hs=hm.keySet();
        for (char key:hs){
            System.out.println(hm.get(key));
        }
    }
}
