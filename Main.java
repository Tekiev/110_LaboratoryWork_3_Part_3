package DEV110_3_3_Tekiev;

public class Main {

    public static void main(String[] args) {

        LinkedLists list = new LinkedLists();

        list.printAll();
        list.ifEmpty();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(0);
        list.addFirst(-1);
        list.addFirst(-2);
        list.addFirst(-3);
        list.addEnd(6);
        list.addEnd(7);
        list.addEnd(8);
        list.addEnd(9);
        list.addEnd(10);
        list.addEnd(11);
        list.addEnd(12);
        list.addEnd(13);
        list.addEnd(14);
        list.printAll();
        list.ifEmpty();
        list.printAll();
        list.getHead();
        list.printAll();
        list.getHeadAndDelete();
        list.printAll();
        list.getHeadAndDelete();
        list.printAll();
        list.getHeadAndDelete();
        list.printAll();
        list.getHeadAndDelete();
        list.printAll();
        list.getHeadAndDelete();
        list.printAll();
        list.getLast();
        list.printAll();
        list.getLastAndRemove();
        list.printAll();
        list.getHeadAndDelete();
        list.printAll();
        list.findKey(4);
        list.printAll();
        list.findKey(25);
        list.printAll();
        list.findKeyAndDelete(9);
        list.printAll();



    }

}
