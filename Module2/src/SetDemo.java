import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(23);
        set.add(89);
        set.add(100);
        set.add(23);
        set.add(1);
        System.out.println(set);

    }
}
