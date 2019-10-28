package queue.Two;


public class Queue {

    private int putLoc; //Индекс записи элементов в очередь
    private int getLoc; //Индекс чтение элементов из очереди
    private char[] array; // Массив для очереди
    private int putLocEnd; //Идикатор конца строки (записи)

    //конструктор
    Queue(int sizeArray) {
        putLoc = 0;
        getLoc = 0;
        array = new char[sizeArray];
        putLocEnd = 0;
    }

    //Метод записи в очередь
    public void put(char value) {
        if (putLocEnd != 0) {
            if (putLoc < getLoc) {
                zeroingLoc();
                record(value);
            } else {
                System.out.println("This Queue is Full");
            }
        } else if (putLoc <= array.length - 1) {
            zeroingLoc();
            record(value);
        } else {
            if (getLoc != 0) {
                putLocEnd = 1;
                putLoc = 0;
                zeroingLoc();
                record(value);
            } else {
                System.out.println("This Queue is Full");
            }
        }
    }
    //Запись элемента в массив
    private void record(char value) {
        array[putLoc] = value;
        putLoc++;
    }

    //Обнуления индексов
    private void zeroingLoc() {
        if (getLoc == putLoc) {
            getLoc = 0;
            putLoc = 0;
            putLocEnd = 0;
        }
    }

    //Чтение из очереди
    public char get() {
        if ((getLoc <= array.length - 1) && (getLoc < putLoc)) {
            return array[getLoc++];
        } else {
            System.out.println("The Queue is Empty");
            return ' ';
        }
    }


}
