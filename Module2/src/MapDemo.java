import java.util.*;

public class MapDemo {

    public static void main(String[] args) {

        Map<Integer,String> map=new HashMap<>();
        map.put(9812,"Rutuja");
        map.put(9813,"John");
        map.put(9812,"Smith");
        System.out.println(map);
        System.out.println(map.get(9812));
        Set<Integer> set=map.keySet();
        Collection<String> c=map.values();

        for(Integer i:set){

            System.out.println(i +" "+map.get(i));
        }


        for(Map.Entry<Integer,String> i: map.entrySet()){
            System.out.println("key is "+i.getKey()+" and value is "+i.getValue());
        }

    }

}
