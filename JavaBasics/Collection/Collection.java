package JavaBasics.Collection;
import java.util.*; //import all classes from util package
public class Collection {
    public static void main(String[] args) {
        System.out.println("Welcome to java");

        //Create Collection
        //Type Safe Collection:Same type of elements(objects) are added to collection
        //Un Type Safe Collection:Different types of elements can be added in the collection

        //Type safe collection
        ArrayList<String> names=new ArrayList<String>();
        names.add("Natraj");
        names.add("Nishad");
        names.add("Neelam");
        names.add("Manisha");
        names.add("Damini");
        names.add("Natraj");
        //names.add(234);  //Inside a type safe collection whatever you've specified in the <> brackets you've have to add that element only
        System.out.println(names);
        System.out.println(names.get(0));
        System.out.println(names.get(3));
        System.out.println("Size="+ names.size());
        //Remove an item
        names.remove("Natraj");
        System.out.println(names);
        //returns the size
        System.out.println("Size="+ names.size());

        //check items are there are not
        //Type ka equals method call karta hai checking krne

        System.out.println(names.contains("Neelam"));
        //un typesafe collection
        LinkedList list=new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Natraj");

        System.out.print(list.get(1));

        //check for empty
        System.out.println(names.isEmpty());
        //setting value
        names.set(4,"Ram"); // it will replace the element for which the index is specified
        names.add(1,"Dhyam");
        System.out.println(names);

        //remove all elements
        names.clear();
        System.out.println(names);


        Vector<String> vec=new Vector<>();
        vec.addAll(list);//copy the elements of the different collection
        System.out.println("Vector:"+vec);

        System.out.println("-------------------------------------------------------------");

        HashSet<Double> nms=new HashSet<>();
        //in hashset primitive data type is not allowed, you need to use Wrapper Class
        nms.add(400.00);
        nms.add(14.14);
        nms.add(63.36);
        nms.add(999.99);
        System.out.println("HashSet:"+nms);//it will print in an unordered sequence as it don't preserve the order of the object

        TreeSet<Double> tree=new TreeSet<>();
        tree.addAll(nms);
        System.out.println("Tree:"+tree);//it will print the sorted version of the HashSet

        }
}
