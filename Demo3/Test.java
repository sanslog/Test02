package Demo3;

//import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        LinkedList<Teacher> teachers = new LinkedList<>();
        teachers.add(new Teacher("1","lihua",19));
        teachers.add(new Teacher("2","zhansan",23));
        teachers.add(new Teacher("3","wangwu",34));

        for(Teacher t : teachers){
            System.out.println(
                    "id:    "+t.getId()+'\n'+
                    "name:  "+t.getName()+'\n'+
                    "age:   "+t.getAge()+'\n'
            );



        }
    }
}
