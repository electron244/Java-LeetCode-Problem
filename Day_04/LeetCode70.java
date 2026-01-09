package Day_11;

public class LeetCode70{
    public static void main(String[] args){
        int n=2;
        int prev =1,current=2;
        if(n==0||n==1) System.out.println(1);

        for(int i =2;i<=n;i++){
            int temp = current;
            current = current+prev;
            prev= temp;
        }
        System.out.println(current);
    }
}
