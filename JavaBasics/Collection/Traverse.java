package JavaBasics.Collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Traverse {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<String>();
        names.add("Natraj");
        names.add("Nishad");
        names.add("Neelam");
        names.add("Manisha");
        names.add("Damini");
        names.add("Natraj");

        //foreach loop
        for(String str:names)
        {
            System.out.println(str+"\t"+str.length()+"\t");
            StringBuffer br=new StringBuffer(str);
            System.out.println(br.reverse());

        }
        System.out.println("__________________________________________");

        //traversing using iterator(Forward Traversing)

        Iterator<String> itr= names.iterator();
        while(itr.hasNext()){//hasNext check whether there is element in
            String next= itr.next();
            System.out.println(next);
        }
        System.out.println("______________________________________________");
    //backward traversal(ListIterator)
        ListIterator<String> litr= names.listIterator(names.size());
        //for backward traversing, we need to pass the size of the list to take the cursor to the last element of the list


        while(litr.hasPrevious()){
            String prev=litr.previous();
            System.out.println(prev);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++");
        //Enumeration
        //for each method
        names.forEach(str->{
            System.out.println(str); //functional interface ke method ke implementation ke lie
        });
        System.out.println("++++++++++Tree Set Traversal++++++++++++++");
        TreeSet<String> name= new TreeSet<>();
        name.addAll(names);
        name.forEach(e->{
            System.out.println(e);// will print sorted data
        });

        //Comparable
        //Comparator
        //Custom Sorting logic





    }
    }

