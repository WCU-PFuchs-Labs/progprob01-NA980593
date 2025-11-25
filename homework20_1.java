import java.util.Scanner;
/*
Given a sorted linked list, delete all nodes that have duplicate
numbers, leaving only distinct numbers from the original list.In this 
program, you need to 
(1) read 5 numbers and set them in a linkedlist in order
(2) delete duplicate

Example 1:
input: 1,2,3,3,5
output: head-->1-->2-->3-->5-->null

Example 2:
input: 1,1,1,2,3
output: head-->1-->2-->3-->null

Please complete the following program to fullfil the function.
*/
public class homework20_1
{
   public static void main(String[] args)
   {
      LinkedList list = new LinkedList();
      Scanner scanner = new Scanner(System.in);
      System.out.print("input: ");
      list.head = new ListNode(scanner.nextInt());
      list.head.next = new ListNode(scanner.nextInt());
      list.head.next.next = new ListNode(scanner.nextInt());
      list.head.next.next.next = new ListNode(scanner.nextInt());
      list.head.next.next.next.next = new ListNode(scanner.nextInt());
      System.out.println(list);
      deleteDuplicates(list);
      System.out.println(list); 
   }
   public static void deleteDuplicates(LinkedList llist)
   {
      //add your code here
      ListNode check = llist.head;
      while (check.next!=null){
         ListNode node = check.next;
         while (node.next!=null) {
            if (node.value == check.value) {
               node = node.next;
               check.next=node;
            }
            else {
               check=check.next;
               node=node.next;
            }
         }
         check=check.next;
      }
   }

}

class ListNode
{
   int value;
   ListNode next;
   ListNode(int v){value = v;}
}

class LinkedList
{
   ListNode head;
   public String toString()
   {
      String nodeData = "";
      ListNode ref = head;
      while(ref != null)
      {
         nodeData += ref.value + "-->";
         ref = ref.next;
      }
      return "head-->"+nodeData+"null";
   }
}