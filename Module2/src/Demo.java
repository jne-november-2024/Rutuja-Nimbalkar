import java.util.*;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(89);
        list.add(2);
        list.add(123);

        for(int i:list){
            System.out.println(i);
        }

        //Map<Integer,Integer> mp=new HashMap<>();

        Collections.sort(list);
        System.out.println(list);

        Comparator<Integer> comp=(o1,o2)->{
            return -Integer.compare(o1,o2);
        };

        Collections.sort(list,comp);
        System.out.println("---"+list);

        String day="Sun";
        switch (day){
            case "Sun","Sat"->System.out.println("6am");

            default -> System.out.println("nn");

        };

        String result=switch (day){
            case "Sun","Sat"->"6am";

            default -> "7am";

        };

        List<Integer> nums=Arrays.asList(5,896,7,2,33,88);
        System.out.println(nums);

        //for 0 to size()
        //for(int n:nums)

        //list interface method
        //consumer accept() FunctionalInterface
        nums.forEach(n->System.out.println(n));

        Stream<Integer> st=nums.stream();

        Stream<Integer> s1=st.filter(n-> n%2==0);
        Stream<Integer> s2=s1.map(n->n*2);
        int result1=s2.reduce(0,(n1,n2)->n1+n2);

        System.out.println("------"+ result1);

       // System.out.println("------");
        //s1.forEach(n-> System.out.println(n));

       // System.out.println("------");
       // s2.forEach(n-> System.out.println(n));


        int r=nums.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(c,e)->c+e);

        System.out.println(r);

        Stream<Integer> stream=nums.stream().sorted();
        stream.forEach(n->System.out.println(n));

//java 10
//        public static void update{
//            var i=90;
//
//        }

    }


}
