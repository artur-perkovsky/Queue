package queue.Two;

public class QueueDemo {
    public static void main(String[] args) {

        Queue q1 = new Queue(5);
        char ch;

        //Заполнить очередь
        for (int i = 0; i < 3; i++) {
            q1.get((char) ('a' + i));
        }

        //Чтение очереди
        for (int i = 0; i < 5; i++) {
            ch = q1.put();
            if (ch != ' '){
                System.out.print(ch + " ");
            }
            else break;
        }

        //Заполнить очередь повторно
        for (int i = 0; i < 5; i++) {
            q1.get((char) ('z' - i));
        }

        System.out.println();



    }
}
