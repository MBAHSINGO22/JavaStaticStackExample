package PERTEMUAN12.StackDataDinamis;

public class MainStack {
    public static void main(String[] args) {
        // Membuat instance dari Stack
        Stack stack = new Stack();

        // Menambah elemen ke dalam stack
        stack.push("A");
        System.out.println("Setelah push A: " + stack.size() + " elemen");

        stack.push("B");
        System.out.println("Setelah push B: " + stack.size() + " elemen");

        stack.push("C");
        System.out.println("Setelah push C: " + stack.size() + " elemen");

        // Menghapus elemen dari stack
        System.out.println("Pop: " + stack.pop());
        System.out.println("Setelah pop, ukuran stack: " + stack.size());

        System.out.println("Pop: " + stack.pop());
        System.out.println("Setelah pop, ukuran stack: " + stack.size());

        // Memeriksa apakah stack kosong
        System.out.println("Apakah stack kosong? " + stack.isEmpty());

        // Menghapus elemen terakhir dari stack
        System.out.println("Pop: " + stack.pop());
        System.out.println("Apakah stack kosong setelah semua elemen di-pop? " + stack.isEmpty());
    }
}
