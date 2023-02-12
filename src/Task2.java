import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
public class Task2 {
    public static Deque<Object> fillList(){
        Deque<Object> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        return list;
    }
    public static void printList(Deque<Object> list){
        for(Object el: list){
            System.out.printf(el + " ");
        }
        System.out.println();
    }
    public static void enqueue(Deque<Object> list){
        System.out.println("Ввести элемент, с которым хотите произвести действие: ");
        Scanner sc1 = new Scanner(System.in);
        Object element = sc1.nextLine();
        list.addLast(element);
        //sc1.close();
    }
    public static Object dequeue(Deque<Object> list){
        Object item = list.pollFirst();
        return item;
    }
    public static Object first(Deque<Object> list){
        return list.peekFirst();
    }
    public static void main(String[] args) {
        Deque<Object> que = new LinkedList<>();
        que = fillList();
        printList(que);
        System.out.println("Ввести: 1 - поместить элемент в конец очереди; 2 - вернуть первый элемент из очереди и удалить его; 3 - вернуть первый элемент из очереди, не удаляя");

        while(true){
            Scanner sc = new Scanner(System.in);
            int cmd = sc.nextInt();
            if (cmd == 1){
                enqueue(que);
                printList(que);
                continue;
            }
            if (cmd == 2) {
                System.out.println("Этот первый элемент вернули из очереди и удалили его: " + dequeue(que));
                printList(que);
                continue;
            }
            if (cmd == 3){
                System.out.println("Этот первый элемент вернули из очереди и НЕ удалили его:" + first(que));
                continue;
            }

            sc.close();
        }

    }

}