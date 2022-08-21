public class doublyLinkedList{
    // create head 
    public node head;

    // constructor
    public doublyLinkedList()
    {
        this.head = null;
    }
    public void addToFront(int ele)
    {
        node temp = new node(ele);
        if (head == null)
        {
            head = temp;
        } 
        else{
            temp.next = head;
            temp.prev = null;
            head = temp;
        }
    }
    public void printdll()
    {
        node temp1 = head;
        if (temp1 == null)
        {
            return;
        }
        else{
            System.out.println(temp1.data);
            temp1 = temp1.next;
        }
    }

}