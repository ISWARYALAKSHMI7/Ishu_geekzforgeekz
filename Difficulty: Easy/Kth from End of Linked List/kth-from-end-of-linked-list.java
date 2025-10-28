/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        Node slow=head;
        Node fast=head;
        while(fast!=null){
            if(k==0) break;
            fast=fast.next;
            k--;
        }if(k>0){
            return -1;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }return slow.data;
    }
}