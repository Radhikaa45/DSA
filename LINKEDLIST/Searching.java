public class Searching {
      Node head;
    class Node{
        int data;
        Node next;

          Node (int data){
            this.data=data;
            this.next=null;
        }
    }

     public void search(int key){
        Node curnode=head;
        int pos=1;
        while(curnode!=null){
            if(curnode.data==key){
                System.out.println("element found at "+pos);
            }
            curnode=curnode.next;
            pos++;

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
public static void main(String[] args){
    helloll ll=new helloll();
    ll.addfirst(1);
    ll.addlast(3);
     ll.addlast(4);
     ll.addpos(2, 1);
    ll.search(2);
   
    

}
}
    

