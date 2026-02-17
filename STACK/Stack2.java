
//Stack using array list
import java.util.ArrayList;



public class Stack2 {
   static class Stackclass{
        ArrayList<Integer> list =new ArrayList<>();
        public boolean isEmpty(){
            return list.size()==0;
        }
        public void push(int data){
            list.add(data);
        }
        public int pop(){
            if(isEmpty()){
                 System.out.println("Stack is empty");
                 return -1;

            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            return list.get(list.size()-1);
        }

    }
      public static void main(String[] args) {
        Stackclass s = new Stackclass();

        s.push(10);
        s.push(20);
        s.push(30);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    
}
}
