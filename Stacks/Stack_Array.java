package Stacks;

public class Stack_Array {
    int size;
    int top;
    int stack[];
    private Stack_Array(int size){
        this.size=size;
        this.stack=new int[size];
        this.top=-1;
    }

    private void push(int x){
        if(top>=size-1){
            System.err.println("stack over flow");
        }else {
            top = top + 1;
            stack[top] = x;
        }
    }

    private void pop(){
        if(top==-1){
            System.err.println("stack is under flow");
        }else {
        stack[top]=0;
        top--;
        }
    }

    private int peek(){
        if(top==-1){
            System.err.print("stack is under flow");
            return -1;
        }else {
        return stack[top];
        }
    }

    private boolean isEmpty(){
        if(top==-1){

            return true;
        }else {
            return false;
        }
    }

 private boolean isfull(){
        if(top==size-1){

            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Stack_Array st=new Stack_Array(3);

        st.push(10);
        st.push(30);
        st.push(20);
        st.push(20);
        System.out.println(st.peek());

        st.pop();
        st.pop();
        st.pop();

        System.out.println(st.peek());


        System.out.println(st.isfull());

        System.out.println(st.isEmpty());
    }


}
