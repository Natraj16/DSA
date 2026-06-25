package OOPs.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human natraj=new Human(20,"Natraj Kashyap",10000000,false);
        Human raj=new Human(19,"Raj",2500000,false);
        Human random=new Human(15,"Random",0,false);
        System.out.println(natraj.age );
        System.out.println(Human.population);

        Main fun=new Main();
        fun.greeting();
    }

    //this is not dependent on objects
    static void fun(){
        Main obj=new Main();
        obj.greeting();
        //you  cant access non static stuff wothout referencing their instances in a static context

//       greeting();//you cant use this because it requires an instance but the fucntion you are using it in does not depend on instances
    }
    //We know that someting which is not static, belongs to an obejct
      void greeting(){
        System.out.println("hello world");
    }

    void fun2(){
        greeting();
    }
}
