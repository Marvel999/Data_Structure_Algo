import java.util.*;

class NextSmallerElementRight{
	
	public static int[] nser(int[] arr){
		int[] ans=new int[arr.length];
        Stack<Integer> st =new Stack<>();
         st.push(arr[arr.length-1]);
         ans[arr.length-1]=-1;
          for(int i=arr.length-1;i>=0;i--){
			  while(st.size()>0 && arr[i]<=st.peek()){
				  st.pop();
			  }
			  if(st.size()==0){
				  ans[i]=-1;
			  }else{
				  ans[i]=st.peek();
			  }
			  st.push(arr[i]);
		  }		
        return ans;		  
	}
public static void main(String[] ags){
	
	int[] arr={1,3,4,2,4,2,36}; 
	 int[] ans=nser(arr);
	 for(int element:ans){
		 System.out.print(element+" ");
	 }

}
}