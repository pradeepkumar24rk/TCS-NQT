package DSA;

import java.util.HashMap;
import java.util.Map;

class LinkedNode {
    public int key;
    public String val;
    public LinkedNode next;
}

public class MapWithLinkedNode {
    LinkedNode head;
    void insertAtEnd(int key, String val) {
        LinkedNode node = new LinkedNode();
        node.key = key;
        node.val = val;
        if (head == null) {
            node.next = node;
            head = node;
        } else {
            LinkedNode p = head;
            while (p.next != head) {
                p = p.next;
            }
            node.next = head;
            p.next = node;
        }
    }

    void display() {
        if (head == null)
            System.out.println("List is empty");
        else {
            LinkedNode p = head;
            do {
                System.out.println(p.val);
                p = p.next;
            } while (p != head);
        }
    }
    
    void findSpecifickeyValueAndIndex(int target) {
        System.out.println("Find value: ");
        if (head == null)
            System.out.println("List is empty");
        else {
            LinkedNode k = head;
            int loc = 1;
            do {
                if(target == k.key)
                    System.out.println(k.key+" "+k.val+" "+ loc);
                loc++;
                k = k.next;
            } while(k!= head);
        }
    }

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        MapWithLinkedNode list = new MapWithLinkedNode();
        map.put(11, "TCS");
        map.put(12, "CTS");
        map.put(13, "HCL");
        map.put(14, "Accenture");
        map.put(15, "Wipro");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            list.insertAtEnd(entry.getKey(),entry.getValue());
        }
        list.display();
        list.findSpecifickeyValueAndIndex(12);
    }
}
