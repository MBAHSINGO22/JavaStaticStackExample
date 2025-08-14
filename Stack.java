package PERTEMUAN12.StackDataDinamis;

import java.util.LinkedList;

public class Stack {
    private LinkedList<Object> tumpukan;

    // Konstruktor untuk membuat stack baru
    public Stack() {
        tumpukan = new LinkedList<>();
    }

    // Metode untuk menambahkan item ke atas stack
    public void push(Object item) {
        tumpukan.addFirst(item);
    }

    // Metode untuk menghapus dan mengembalikan item dari atas stack
    public Object pop() {
        // Jika stack kosong, kembalikan null
        if (isEmpty()) {
            return null;
        }
        // Hapus dan kembalikan item dari atas stack
        return tumpukan.removeFirst();
    }

    // Metode untuk mengembalikan ukuran stack
    public int size() {
        return tumpukan.size();
    }

    // Metode untuk memeriksa apakah stack kosong
    public boolean isEmpty() {
        return tumpukan.isEmpty();
    }
}
