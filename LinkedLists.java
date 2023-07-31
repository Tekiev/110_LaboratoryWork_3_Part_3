package DEV110_3_3_Tekiev;

import java.util.Arrays;
public class LinkedLists {
    private Node head;
    private Node current;
    public void addFirst(int data) { // добавление значений в начало списка

        if (head == null) {

            Node node = new Node();

            node.addArrayFirst(data);

            head = node;

            current = head;

        } else {

            if (!current.full) {

                current.addArrayFirst(data);

            } else {

                Node node = new Node();

                node.addArrayFirst(data);

                node.next = head;

                head = node;

                current = head;

            }
        }
    }

    public void getHead() { // метод извлекает значение из начала списка без его удаления из списка

        if (head != null) {

            if (head.array[0] != null) {

                int i = head.array[0];

                System.out.println("Первый элемент списка: " + i);

            }
        }

    }

    public void getHeadAndDelete() { // метод извлекает значение из начала списка с его удалением из списка

        if (head != null) {

            int i = head.array[0];

            for (int j = 0; j < head.array.length - 1; j++) {

                head.arrayTmp2[j] = head.array[j + 1];
            }
            head.array = head.arrayTmp2;

            if (head.array[0] != null) {

                System.out.println("Первый элемент списка  " + i + " удален");

            } else {

                head = head.next;

                if (head != null) {

                    System.out.println("Первый элемент списка  " + i + " удален");

                }
            }
        }
    }

    public void addEnd(int data) {  // метод добавляет значение в конец списка

        if (head == null) {

            Node node = new Node();

            node.addArrayEnd(data);

            head = node;

            current = head;

        } else {

            if (!current.full) {

                current.addArrayEnd(data);

            } else {

                current.next = new Node();

                current.next.addArrayEnd(data);

                current = current.next;
            }
        }
    }
    public void getLast() { // метод извлекает значение из конца списка без его удаления из списка

        if (head != null) {

            Node current = head;

            while (current.next != null) {

                current = current.next;
            }

            for (int i = 9; i >= 0; i--) {

                if (current.array[i] != null) {

                    System.out.println("Последний элемент списка: " + current.array[i]);
                    return;
                }
            }
        }
    }

    public void getLastAndRemove() { // метод извлекает значение из конца списка и его удаляет его из списка

        if (head != null) {

            int h = 0;

            Node current = head;

            while (current.next != null) {

                current = current.next;
            }

            for (int i = 9; i >= 0; i--) {

                if (current.array[i] != null) {

                    h = current.array[i];

                    current.array[i] = null;

                    System.out.println("Последний элемент списка: " + h + " удален");
                    return;

                }

            }
        }
    }

    public void findKey(int key) {   // метод проверяет, содержит ли связанный список заданное значение

        current = head;

        while ((current) != null) {

            for (Integer i: current.array) {

                if ((i != null) && i == key) {
                    System.out.println("Список содержит элемент: " + key);
                    return;

                }

            }

            current = current.next;
        }

        System.out.println("Список не содержит элемент: " + key);

    }


    public void ifEmpty() {                     // метод проверяет является ли список пустым

        current = head;

        while ((current) != null) {

            for (int i = 0; i < current.array.length; i++) {

                if (current.array [i] != null) {

                    System.out.println("Связанный список не пустой" );
                    return;

                }
            }
            current = head.next;
        }
        System.out.println("Связанный список пустой" );
    }
    public void findKeyAndDelete(int key) {   // * метод удаляет заданное значение в списке, если значения в списке нет, ничего не происходит

        current = head;

        while ((current) != null) {

            for (int i = 0; i < current.array.length; i++) {

                if ((current.array[i] != null) && (current.array[i] == key)) {

                    current.array[i] = null;

                    System.out.println("Список содержит элемент: " + key + ". Данный элемент удален");
                    return;
                }
            }
            current = current.next;
        }
    }

    public void printAll() {   // печать всех элементов массива

        current = head;

        while ((current) != null) {

            for (Integer i: current.array) {

                if (i != null) {
                    System.out.print(i + ", ");                        // печать элементов подряд
                }
            }


            current = current.next;
        }
    }

    public static class Node {
        Integer[] array = new Integer[10];
        Integer[] arrayTmp = new Integer[array.length + 1];
        Integer[] arrayTmp2 = new Integer[10];
        boolean full;
        Node next;
        public void addArrayEnd(Integer data) {

            for (int i = 0; i < array.length; i++) {

                if (array[i] == null) {

                    array[i] = data;

                    break;

                } else if (i == (array.length - 2)) {

                    this.full = true;

                }
            }
        }
        public void addArrayFirst(Integer data) {

            for (int i = 0; i < array.length; i++) {

                if (array[i] == null) {

                    array[i] = data;

                    for (int j = 0; j < array.length - 1; j++) {

                        arrayTmp[j + 1] = array[j];

                        arrayTmp[1 + i] = null;

                        arrayTmp[0] = data;
                    }
                    break;
                } else if (i == (array.length - 2)) {

                    this.full = true;
                }
            }
            System.arraycopy(arrayTmp, 0, array, 0, array.length);
        }

    }

}


