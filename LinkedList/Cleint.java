package LinkedListDAS;

public class Cleint {
    public static void main(String[] args) throws Exception {
        LinkedLists<String> linkedLists=new LinkedLists<>();
        linkedLists.addLast("Hii");
        linkedLists.addLast("Hello");
        linkedLists.addLast("By");
        linkedLists.addLast("40");
        linkedLists.display();
        System.out.println(linkedLists.empty());


        linkedLists.addFirst("4");
        linkedLists.display();
        System.out.println(linkedLists.size());
        try {
            System.out.println(linkedLists.getFirst());
            System.out.println(linkedLists.getLast());
            System.out.println(linkedLists.getAt(4));

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            linkedLists.addAt(3,"dfk");
        } catch (Exception e) {
            e.printStackTrace();
        }
        linkedLists.display();
        linkedLists.removeFirst();
        linkedLists.display();
        linkedLists.removeLast();
        linkedLists.addAt(2,"Hye");
        linkedLists.removeAt(5);
        linkedLists.display();

    }
}
