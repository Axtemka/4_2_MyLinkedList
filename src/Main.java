// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.addFirst(4);

        for (Integer num: myLinkedList) {
            System.out.println(num);
        }
        System.out.println();

        myLinkedList.remove(4);

        for (Integer num: myLinkedList) {
            System.out.println(num);
        }
    }
}