package Heaps;

import java.util.PriorityQueue;

public class Heaps_Basic {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int[] rank={10,20,2,3,8,5,50};
        for(int val:rank){
            pq.add(val);
        }
        while (pq.size()>0){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
