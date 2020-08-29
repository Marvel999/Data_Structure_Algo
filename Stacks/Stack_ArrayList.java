package Stacks;

import java.util.ArrayList;

public class Stack_ArrayList<E> {
   ArrayList<E> list=new ArrayList<>();

    public void push(E x){
       list.add(x);
    }

    public E peek(){
       return list.get(list.size()-1);
    }

     public E pop(){
       return list.remove(list.size()-1);
    }


    public static void main(String[] args) {
        Stack_ArrayList<Integer> st=new Stack_ArrayList();
        st.push(10);
        st.push(20);
        st.push(30);
        st.pop();
        System.out.println(st.peek());
    }

}
