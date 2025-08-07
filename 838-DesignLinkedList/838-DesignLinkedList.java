// Last updated: 8/7/2025, 6:18:24 PM
class MyLinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        
        Node(int i) {
            data = i;
        }
    }

    public MyLinkedList() {
        this.head = null;
    }
    
    public int get(int index) {
        if (index < 0) {
            return -1;
        }
        int i = 0;
        Node curr = this.head;
        while (i < index && curr != null) {
            curr = curr.next;
            i++;
        }
        if (curr == null) {
            return -1;
        }
        return curr.data;
    }
    
    public void addAtHead(int val) {
        Node newHead = new Node(val);
        newHead.next = this.head;
        this.head = newHead;
    }
    
    public void addAtTail(int val) {
        Node tail = new Node(val);
        Node head = this.head;
        if (head == null) {
            this.addAtHead(val);
            return;
        }
        while (head.next != null) {
            head = head.next;
        }
        
        head.next = tail;
    }
    
    public void addAtIndex(int index, int val) {
        Node node = new Node(val);
        if (index < 0) {
            return;
        }
        
        if (index == 0) {
            this.addAtHead(val);
            return;
        }
        
        Node head = this.head;
        for (int i = 0; i < index - 1; i++) {
            if (head == null) {
                return;
            }
            head = head.next;
        }
        
        if (head == null) {
            return;
        }
        
        node.next = head.next;
        head.next = node;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0) {
            return;
        }
        
        if (index == 0) {
            if (this.head != null) {
                this.head = this.head.next;
            }
            
            return;
        }
        
        Node curr = this.head;
        for (int i = 0; i < index - 1; i++) {
            if (curr == null || curr.next == null) {
                return;
            }
            curr = curr.next;
        }
        
        if (curr.next != null) {
            curr.next = curr.next.next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */