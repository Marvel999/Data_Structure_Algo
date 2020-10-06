package HashMap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class High_Frequency_char {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        HashMap<Character,Integer> hm=new HashMap();
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(hm.containsKey(ch)){
                int of=hm.get(ch);
                of=of+1;
                hm.put(ch,of);
            }else{
                hm.put(ch,1);
            }
        }

        Set<Character> keys= hm.keySet();
        int max=0;
        char out=' ';
        for(char ch:keys){
            if(max<hm.get(ch)){
                max=hm.get(ch);
                out=ch;
            }
        }

        System.out.println(out);

    }

}
