 import java.util.*;

class NextSmallerElementLeft{
	
	public static int[] nsel(int[] arr){
		int[] ans=new int[arr.length];
        Stack<Integer> st =new Stack<>();
         st.push(0);
		 for(int i=1;i<arr.length;i++){
			 while(st.size()>0 && arr[i]<=arr[st.peek()]){
				 int pos=st.peek();
				 ans[pos]=arr[i];
				 st.pop();
			 }
			 st.push(i);
		 }
		 while(st.size()>0){
			 int pos=st.peek();
				 ans[pos]= -1;
				 st.pop();
		 }
        return ans;		  
	}
public static void main(String[] ags){
	
	int[] arr={1,3,4,2,1,3,36};
	 int[] ans=nsel(arr);
	 for(int element:ans){
		 System.out.print(element+" ");
	 }

}
}