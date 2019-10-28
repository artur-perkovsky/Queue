package queue.Two;

public class QueueDemo {
    public static void main(String[] args) {

        Queue q1 = new Queue(7);
        char ch;

        //Заполнить очередь
        for (int i = 0; i < 4; i++) {
            q1.put((char) ('a' + i));
        }

        //Чтение очереди
        for (int i = 0; i < 4; i++) {
            ch = q1.get();
            if (ch != ' '){
                System.out.print(ch + " ");
            }
            else break;
        }

        //Заполнить очередь повторно
        for (int i = 0; i < 7; i++) {
            q1.put((char) ('z' - i));
        }

        System.out.println();



    }
}
