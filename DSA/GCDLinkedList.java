package DSA;

class Linkedlist {
    public int val;
    public Linkedlist next;
}

public class GCDLinkedList {
    Linkedlist head;
    void insertValue(int a) {
        Linkedlist node = new Linkedlist();
        node.val = a;
        node.next = null;
        if(head==null) {
            // System.out.println("Head is null");
            head = node;
        } else {
            Linkedlist p = head;
            while(p.next!=null) {
                p = p.next; 
            }
            p.next = node;
        }
    }
    
    void insertAtRandomPostion(int val, int index) {
        Linkedlist node = new Linkedlist();
        node.val = val;
        node.next = null;
        if(head==null) {
            // System.out.println("Head is null");
            head = node;
        } else {
            // System.out.println("Head is not null");
            int loc = 0;
            Linkedlist p = head;
            while(p.next!=null && loc<(index-1)) {
                p = p.next; 
                loc++;
            }
            Linkedlist temp = p.next;
            node.next = temp;
            p.next = node;
        }
    
    }
    
    void displayList() {
        Linkedlist p = head;
        System.out.println("Output");
        while(p!=null) {
            System.out.print(p.val+" ");
            p = p.next; 
        }
    }
    
    int gcd(int a, int b) {
        int gcd = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        return gcd;
    }
    
    void GetTwoValue() {
        System.out.println("\nGCD");
        Linkedlist p = head;
        int loc = 1;
        while(p.next!=null) {
            System.out.print(p.val+" ");
            System.out.print(p.next.val+" ");
            System.out.println();
            int gcd = gcd(p.val, p.next.val);
            System.out.println(gcd+" "+loc);
           
            p = p.next; 
            insertAtRandomPostion(gcd, loc);
            loc+=2;
        }
        
    }
    
    public static void main(String[] args) {
        GCDLinkedList list = new GCDLinkedList();
        list.insertValue(18);
        list.insertValue(6);
        // list.insertValue(2);
        list.insertValue(10);
        list.insertValue(3);
        list.displayList();
        // list.insertAtRandomPostion(0, 2);
        // list.displayList();
        list.GetTwoValue();
        list.displayList();
        
    }
}
