//gfg Remove loop in Linked List
/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        // code here
        if(head==null || head.next==null) return;
        Node slow=head, fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                if(slow==fast){
                    while(fast.next!=slow){
                        fast=fast.next;
                    }
                    fast.next=null;
                    return;
                }
                while(slow.next!=fast.next){
                    slow=slow.next;
                    fast=fast.next;
                }
                fast.next=null;
                return;
            }
        }
    }
}
