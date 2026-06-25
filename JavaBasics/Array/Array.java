package JavaBasics.Array;

public class Array {
    public static void main(String[] args) {
        //Q:store a roll number
        int a =19;
        //Q:Store a person name
        String name="Raj";
        //Q:Store five roll numbers
        int roll1=25;
        int roll2=26;
        int roll3=27;
        int roll4=96;
        int roll5=74;

        //Syntax
        //datatype[] variable_name= new datatype[size];

        //store 5 roll no
        int[] roll= new int[5];
        //1.datatype mentioned what is being stored in the array
        //2.all data type should be same in the array
        //roll is a reference variable pointing to an array object that contains type integer data type

        //or directly
        int[] roll_2={23,35,24,26,14};

        int[] rno; //declaration of array, rno is getting defined in the stack

        rno=new int[5];//initialization: actually here object is being created in the heap memory
        //if we dont mention the size it will give me an error
        //declaration is basically happens at compile time and initialization happens at run time

        //the stack memory has the fucntion call and reference variable
        // and reference variable of the array arr is stored in the stack memory and it points to the array object(which is stored in the heap memory) having the array elements

        //in C and C++, the array elements are stored in the ram with the continuous memory allocation because of the pointer it had
        //But java have JVM that decide whether it will be continuous or not
        //1.Objects are created in the heap.
        //Java Language specification mentioned that the heap objects are not continuos
        //2.Heap memory are not continuos(java says that)
        //3.Heap is the run time data area from which the memory for all the classes and instances like all the array get allocated

        //Array is called collection of continuous data but in java it may be not continuous

        //****************************************
        //Index of an array:position of the array,starts from zero
        //arr[]=[3,8,11,19,99,7,28,33]
        //print(arr[0])=>3

        //new keyword:it is used to create an object
        //new int[5]=>it will create an array objet in the heap of size 5

        System.out.println(rno[1]);//empty array have 0 as elements in heap

        String[] arr=new String[4];
        System.out.println(arr[1]);//null in the case of strings


        //Null is a literal (Special literal)
        //Special literal,that we can assign to a non primitive data and but not a primitve one

        String str= null;
        
        //any reference variable, by default it has null value

        //String[] arr= new String[5];
        //internal working of an object,
        //Primitive are stored in the stack memory only but all the others are stored in the heap memory


        }
}
