import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Collection<Integer> values=new ArrayList<>();
        values.add(27);
        values.add(89);
        values.add(8);
        values.add(812);
        values.add(811);

       // values.add(1,88);  not support idx in collection


        // values.add("Ru");

        System.out.println(values);

//        Iterator<Integer> itr=values.iterator();
//        while(itr.hasNext()){
//            int result= itr.next();
//            System.out.print(" "+result);
//        }


        for (int result : values) {
            System.out.print(" " + result);
        }

        values.remove(89);



        System.out.println();
        for (int result : values) {
            System.out.print(" " + result);
        }




        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(1,2);
        System.out.println(list);

        list.forEach(System.out::print);



        ArrayList<Integer> al=new ArrayList<>();
        al.addAll(values);

        Comparator<Integer> comp=(o1,o2)->{
            if(o1%10>o2%10)
                return 1;
            return -1;
        };

        Collections.sort(al,comp);
        System.out.println("--------------"+al);


        Collections.sort((al));

        System.out.println("-------------");

        System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);



    }
}