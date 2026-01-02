public class listprac {
    Node head;
    
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
        this.next=null; }
    }

    //add element first:
    public void addfirst(String data){
       Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    //add last
    public void addlast(String data){
        Node newNode= new Node(data);
        if(head==null){
            head= newNode;
            
        }
        Node curnode=head;
        while(curnode.next!=null){
            curnode=curnode.next;
        }
        curnode.next=newNode;

    }
    


    //print
    public void printll(){
        Node curnode=head;
        while(curnode!=null){
            System.out.print(curnode.data+"->");
            curnode=curnode.next;
        }
         System.out.println("null");
    }

    //delete first
    public void deletefirst(){
        if(head==null){
            return;
        }
       
        head=head.next;
    }
     public void deletelast(){
 if (head == null) {
        return;
    }

    // case 2: only one node
    if (head.next == null) {
        head = null;
        return;
    }

    // case 3: more than one node
    Node currNode = head;
    while (currNode.next.next != null) {
        currNode = currNode.next;
    }
    currNode.next = null;
}

 public static void main(String[] args) {
    listprac ll=new listprac();
     ll.addfirst("is");
      ll.addfirst("name");
    ll.addfirst("my");
    ll.printll();
    ll.addlast("radhika");
    ll.printll();
    ll.deletefirst();
    ll.deletefirst();
    ll.printll();
    ll.deletelast();
    ll.printll();
 }
}