import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        
        // 1. Deklarasi variabel integer dengan nama 'nilai'
        int nilai;

        // 2. Deklarasi variabel string dengan nama 'kata' yang berisi 'struktur'
        String kata = "struktur";

        // 3. Deklarasi array satu dimensi dengan nama 'arraySatu' yang berisi angka (12, 10, 40)
        int[] arraySatu = {12, 10, 40};

        // 4. Deklarasi array dua dimensi dengan nama 'arrayDua' (2 baris, 3 kolom)
        int[][] arrayDua = {
            {12, 10, 40},
            {13, 11, 41},
            {14, 12, 42}
        };

        // 5. Deklarasi linked list dengan elemen (10, 20, 30, 40, 50)
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        // Output untuk memeriksa deklarasi
        nilai = 200;
        System.out.println("Nilai: " + nilai);
        System.out.println("Kata: " + kata);
        
        System.out.print("Array Satu: ");
        for (int num : arraySatu) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("Array Dua:");
        for (int[] row : arrayDua) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        System.out.print("Linked List: ");
        for (int num : linkedList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
