package PracticeRecursion;

public class PrintFirstIndex {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int x=scan.nextInt();
        int fi=firstIndex(arr,0,x);
        System.out.println(fi);
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx==arr.length)
            return -1;

        if(arr[idx]==x)
            return idx;
        else{
            int fis=firstIndex(arr,idx+1,x);
            return fis;

        }
    }
}
