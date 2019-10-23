package queue.queueOverload;

public class Queue {

    private int putLoc;
    private int getLoc;
    private char[] array;
    private char a;

    //Конструктор на основе размера массива
    public Queue(int size) {
        this.putLoc = 0;
        this.getLoc = 0;
        this.array = new char[size + 1];
    }

    //Конструктор на основе массива символов
    public Queue(char[] array) {
        this.putLoc = 0;
        this.getLoc = 0;
        this.array = new char[array.length + 1];

        for (int i = 0; i <= array.length - 1; i++) {
            put(array[i]);
        }
    }

    //Конструктор на основе объекта
    public Queue(Queue ob) {
        this.putLoc = ob.putLoc;
        this.getLoc = ob.getLoc;
        this.array = new char[ob.array.length];

        for (int i = this.getLoc + 1; i <= this.putLoc; i++) {
            this.array[i] = ob.array[i];
        }
    }

    //Запись в очередь
    public void put(char ch) {

        if (this.putLoc == this.array.length - 1) {
            System.out.println("This Queue is Full");
            return;
        }
        putLoc++;
        this.array[putLoc] = ch;
    }

    //Чтение из очереди
    public char get() {
        if (getLoc == putLoc) {
            System.out.println("This Queue Empty");
            return (char) 0;
        } else {
            getLoc++;
            return this.array[this.getLoc];
        }
    }
}
