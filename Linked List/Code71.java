//gfg Merge two sorted linked lists
/*
  Node is defined as
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node temp1=head1;
        Node temp2=head2;
        Node dummy=new Node(-1);
        Node res=dummy;
        while(temp1 !=null & temp2 !=null){
            if(temp1.data<temp2.data){
                res.next=temp1;
                temp1=temp1.next;
            }
            else{
                res.next=temp2;
                temp2=temp2.next;
            } 
            res=res.next;
        }
        if(temp1!=null){
            res.next=temp1;
        }
        else res.next=temp2;
        return dummy.next;
    }
}
