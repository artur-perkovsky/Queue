package queue.queueOverload;

public class QueueDemo {
    public static void main(String[] args) {

        //Создать пустую очередь для хранения 10 элементов
        Queue q1 = new Queue(10);

        char[] ch = {'T', 'o', 'T'};
        //Создать очередь на основе массива
        Queue q2 = new Queue(ch);

        char cha;

        //Поместить ряд символов в очередь q1
        for (int i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }

        //Создать одну очередь на основе другой
        Queue q3 = new Queue(q1);

        //Показать очередь
        System.out.print("Содержимое очереди q1: ");
        for (int i = 0; i < 10; i++) {
            cha = q1.get();
            System.out.print(cha + " ");
        }

        System.out.print("\n");
        System.out.print("Содержимое очереди q2: ");
        for (int i = 0; i < 3; i++) {
            cha = q2.get();
            System.out.print(cha + " ");
        }

        System.out.print("\n");
        System.out.print("Содержимое очереди q3: ");
        for (int i = 0; i < 10; i++) {
            cha = q3.get();
            System.out.print(cha + " ");
        }





    }
}
