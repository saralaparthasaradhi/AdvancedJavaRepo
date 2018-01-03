 
public class MyDynamicStack_Q1 {
 
    private int stackSize;
    private int[] stackArr;
    private int top;
 
    /**
     * constructor to create stack with size
     */
    public MyDynamicStack_Q1(int size) {
        this.stackSize = size;
        this.stackArr = new int[stackSize];
        this.top = -1;
    }
 
    /**
     * This method adds new entry to the top 
     * of the stack
     */
    public void push(int item){
        if(this.isStackFull()){
            System.out.println(("Stack is full. Increasing the capacity."));
            this.increaseStackCapacity();
        }
        System.out.println("Adding: "+item);
        this.stackArr[++top] = item;
    }
 
    /**
     * This method removes an entry from the 
     * top of the stack.
     */
    public int pop() throws Exception {
        if(this.isStackEmpty()){
            throw new Exception("Stack is empty. Can not remove element.");
        }
        int entry = this.stackArr[top--];
        System.out.println("Removed entry: "+entry);
        return entry;
    }
     
    /**
     * This method returns top of the stack
     * without removing it.
     */
    public long peek() {
        return stackArr[top];
    }
 
    private void increaseStackCapacity(){
         
        int[] newStack = new int[this.stackSize*2];
        for(int i=0;i<stackSize;i++){
            newStack[i] = this.stackArr[i];
        }
        this.stackArr = newStack;
        this.stackSize = this.stackSize*2;
    }
     
    /**
     * This method returns true if the stack is empty
     */
    public boolean isStackEmpty() {
        return (top == -1);
    }
 
    /**
     * This method returns true if the stack is full
     */
    public boolean isStackFull() {
        return (top == stackSize - 1);
    }
 
    public static void main(String[] args) {
        MyDynamicStack_Q1 stack = new MyDynamicStack_Q1(2);
        for(int i=1;i<5;i++){
            stack.push(i);
        }
        for(int i=1;i<4;i++){
            try {
                stack.pop();
            } catch (Exception e) {
                   e.printStackTrace();
            }
        }
    }
}

