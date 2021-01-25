public class Nine {
    public static void main(String[] args) {
        int x=123;
        while(true){
            if((x/10)==0) break;
            else x=(x/10)+(x%10);
        }
        System.out.println(x);
    }
}
