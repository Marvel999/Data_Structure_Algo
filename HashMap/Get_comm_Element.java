package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Get_comm_Element {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();

        HashMap<Integer,Integer> hm=new HashMap();
        for(int i=0;i<n1;i++){
            int input=sc.nextInt();
            if(hm.containsKey(input)){
                int of=hm.get(input);
                of=of+1;
                hm.put(input,of);
            }else{
                hm.put(input,1);
            }

        }
        int n2=sc.nextInt();
        for(int i=0;i<n2;i++){
            int input=sc.nextInt();
            if(hm.containsKey(input)){
                System.out.println(input);
                hm.remove(input);
            }

        }


    }
}
