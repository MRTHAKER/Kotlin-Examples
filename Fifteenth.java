import java.util.HashSet;
import java.util.Set;
public class Fifteenth {
    public static void main(String args[]){
        int[] arr={5,11,6,3,9,2,11,7,4,11,1,8};
        Set<Integer> set=new HashSet<Integer>();
        for(int i:arr){
            set.add(i);
        }
        System.out.println(set.toString());
    }
}
