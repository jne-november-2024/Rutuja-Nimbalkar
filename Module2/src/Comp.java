import java.util.ArrayList;
import java.util.Collections;

public class Comp {

    public static void main(String[] args) {

        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student(1,90));
        list.add(new Student(2,89));
        list.add(new Student(3,95));
        list.add(new Student(4,80));

        Collections.sort(list,(s1,s2)->{
            return s1.marks>s2.marks?1:s1.marks<s2.marks?-1:0;
        });
        System.out.println(list);

    }


}

class Student{

    int id;
    int marks;
    Student(int id,int marks){
        this.id=id;
        this.marks=marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", marks=" + marks +
                '}';
    }
}