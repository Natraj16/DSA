package JavaBasics.Stacks;

public class CustomStack {
    protected int[] data;
    //imagine this is not like a dynamic stack: this is an array, it can be full
  int ptr=-1;
    private static final int DEFAULT_SIZE=10;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    //the above constructor defines that whenever it doesn't gievn a size it should return with default size

    public CustomStack(int size){
        this.data=new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;

    }

    private boolean isFull() {
        return ptr==data.length-1; // ptr is at the last index

    }

    private boolean isEmpty(){
        return ptr==-1;
    }

    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }
//        int removed=data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }

    public int peek() throws StackException{
        if (isEmpty()){
            throw new StackException("Cannot peek from an empty stack");
        }
        return data[ptr];
    }
}
