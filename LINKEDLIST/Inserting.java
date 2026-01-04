public class Inserting {
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
     public static void main(String[] args){
    Inserting ll=new Inserting();
    ll.addfirst(1);
    ll.addlast(3);
     ll.addlast(4);
     ll.addpos(2, 1);
    ll.printll();

}
}
