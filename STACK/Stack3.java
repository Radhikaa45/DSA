//stack using array 

public class Stack3 {
    static class stackclass{
        int arr[];
        int top;
        int size;
        public stackclass(int size){
            this.size=size;
            arr=new int[size];
            top=-1;
        }

        public boolean isempty(){
            return top==-1;
        }
        public void push(int data){
            if(top==size-1){
                System.out.println("stack is full");
            }
            top++;
            arr[top]=data;
          
        }
        public int pop(){
            if(isempty()){
                 System.out.println("stack is empty");
                 return -1;
            }
            int value=arr[top];
            top--;
            return value;
        }
        public int peek(){
            if(isempty()){
                 System.out.println("stack is empty");
                 return -1;
            }
            return arr[top];
           
        }
        }
     public static void main(String[] args) {
        stackclass s = new stackclass(5);

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top element: " + s.peek());
        System.out.println("Popped: " + s.pop());
        System.out.println("Top after pop: " + s.peek());
    }
    }
   
    

