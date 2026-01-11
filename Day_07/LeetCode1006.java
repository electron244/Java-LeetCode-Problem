public class LeetCode1006 {
    public static void main(String[] args) {
        int n = 10;
        switch (n){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(6);
                break;
            case 4:
                System.out.println(7);
                break;
        }
        int remainder = n%4;
        if (remainder == 0){
            System.out.println(n+1);

        }else if (remainder == 1){
            System.out.println(n+2);
        }else if (remainder == 2){
            System.out.println(n+2);
        }else{
            System.out.println(n-1);
        }
    }
}
