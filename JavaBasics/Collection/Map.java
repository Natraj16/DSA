package JavaBasics.Collection;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String,Integer> Class=new HashMap<>();
        //Adding element
        Class.put("Natraj",117);
        Class.put("Nishad",119);
        Class.put("Neelam",118);
        Class.put("Manisha",116);
        Class.put("Damini",115);

        Class.forEach((key,value)->//binconsumer
        {
            System.out.println(key+"=>"+value);


        });

        System.out.println(Class);

        System.out.println(Class.get("Neelam"));
    }
}
