public class LeetCode1598 {
    public static void main(String[] args) {
        int depth = 0;
        String[] logs = {"d1/","d2/","../","d21/","./"};
        for(int i = 0;i<logs.length ; i++){
            if(logs[i].equals("./")){
                continue;
            }else if(logs[i].equals("../")){
                if(depth > 0){
                    depth--;
                }
            }else{
                depth++;
            }
        }
        System.out.println(depth);
    }
}
