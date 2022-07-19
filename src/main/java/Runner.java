public class Runner {

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.insert(3);
        ll.insert(5);
        ll.insertAt(1, 9);
        ll.insertAt(0, 19);
        ll.insertAt(1, 99);
        ll.show();
        System.out.println("value is removed : "+ ll.remove(99));
        ll.show();
}
}