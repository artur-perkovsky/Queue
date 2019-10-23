package queue.Two;

public class Queue {

    private int putLoc; //Индекс записи элементов в очередь
    private int getLoc; //Индекс чтение элементов из очереди
    private char[] array; // Массив для очереди
    private char a;

    //конструктор
    Queue(int sizeArray) {
        putLoc = 0;
        getLoc = 0;
        array = new char[sizeArray];
        
    }

    //Метод записи в очередь
    public void get(char value) {
        resetLoc();
        if (getLoc <= array.length - 1) {
            array[getLoc] = value;
            getLoc++;
        } else if (check()) {
            getLoc = 0;
            if (getLoc > putLoc) {
                array[getLoc] = value;
                getLoc++;
            }
        } else {
            System.out.println("The Queue is Full");
            return;
        }
    }

    //Проверка индекса чтение ядля обнуления индекса записи
    private boolean check() {
        return putLoc != 0;
    }

    //Обнуления ондесов
    private void resetLoc() {
        if (getLoc == putLoc) {
            getLoc = 0;
            putLoc = 0;
        }
    }

    //Чтение из очереди
    public char put() {
        if ((putLoc <= array.length - 1) & (putLoc < getLoc)) {
            a = array[putLoc];
            array[putLoc] = ' ';
            putLoc++;
            return a;
        } else {
            System.out.println("The Queue is Empty");
            return ' ';
        }

    }
}
