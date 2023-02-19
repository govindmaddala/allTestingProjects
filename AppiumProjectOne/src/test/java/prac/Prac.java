package prac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prac {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        names.add("maddala");
        names.add("veera");

//        System.out.println(names);
//        Iterator n = names.iterator();
//        while(n.hasNext()){
//            System.out.println(n.next());
//        }
        List val= Stream.of(1,2,34).filter(x->x%2==0).collect(Collectors.toList());
        var count = names.stream().filter(x->x.endsWith("a")).collect(Collectors.toList());
        System.out.println(count);
    }

}
