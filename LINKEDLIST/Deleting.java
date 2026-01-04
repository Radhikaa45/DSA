public class Deleting {
    Node head;
    class Node{
        int data;
        Node next;

          Node (int data){
            this.data=data;
            this.next=null;
        }
    }




      //add element at begining:
    public void addfirst(int data){
        Node newnode=new Node(data);
        if (head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

   
   
   
   
    //add element at last:
      public void addlast(int data){
        Node newnode=new Node(data);
         if (head==null){
            head=newnode;
            return;
        }
        Node curnode=head;
        while(curnode.next!=null){
            curnode=curnode.next;
         }
        curnode.next=newnode;
        }




      //add element at given position:
     public void addpos(int data,int pos){
        Node newnode=new Node(data);
        if(pos==0){
            newnode.next=head;
            head=newnode;
            return;
        }
        Node curnode=head;
        for(int i=0;i<pos-1;i++){
            curnode=curnode.next;
          }
         newnode.next=curnode.next;
        curnode.next=newnode;
     }



     
     //printing of linked list:
      public void printll(){
        Node curnode=head;
        while(curnode!=null){
            System.out.print(curnode.data+"->");
            curnode=curnode.next;

        }
        System.out.println("null");
     }


                                      //DELETION


     //deleting from begining :
     public void deletefirst(){
        if(head==null){
            return;
        }
       head=head.next;
     }





        //delete from last:
        public void deletelast(){
            if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }
            Node curnode=head;
            while(curnode.next.next!=null){
                curnode=curnode.next;
            }
            curnode.next=null;
        }




     //delte from a position
     public void deletepos(int pos){
        if (head == null) return;
        Node curnode=head;
        if (pos==0){
         head=head.next;
        }
        for(int i=0;i<pos-1;i++){
         curnode=curnode.next;
        }
        curnode.next=curnode.next.next;

     }






    public static void main(String[] args){
    Deleting ll=new Deleting();
    ll.addfirst(1);
    ll.addlast(3);
    ll.addlast(4);
    ll.addpos(2, 1);
    ll.addlast(5);
    ll.addlast(6);
    ll.addlast(7);
    ll.addlast(8);
    ll.printll();
    ll.deletefirst();
    ll.printll();
    ll.deletelast();
    ll.printll();
    ll.deletepos(2);
    ll.printll();

}
}
