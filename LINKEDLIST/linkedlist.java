class linkedlist 
{
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    //add-first,last 
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

      public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node curnode=head;
        while(curnode.next!=null){
            curnode=curnode.next;

        }
        curnode.next=newNode;
    }
      public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public void deletefirst(){
        if(head == null){
            return ;
        }
        head=head.next;
       
    }
    public static void main(String[] args) {
        linkedlist list=new linkedlist();
        list.addFirst("hii");
        list.addFirst("radhika");
         list.addFirst("hello");
          list.printList();
        list.deletefirst();
 list.printList();
    }
}