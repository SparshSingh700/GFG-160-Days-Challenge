//gfg Rotate a Linked List
/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution {
    public Node rotate(Node head, int k) {
        // add code here
        if(head==null || head.next==null) return head;
        
        Node temp=head;
        int c=1;
        while(temp.next!=null){
            c++;
            temp=temp.next;
        }
        temp.next=head;
        
        k=k%c;
        if(k==0){
            temp.next=null;
            return head;
        }
        temp=head;
        for(int i=1; i<k;i++){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}
