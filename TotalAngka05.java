import java.util.Scanner;

public class TotalAngka05{
    
    static int hitungTotal(int n, int jumlah) {
        if (n == 0) {
            return jumlah;
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka ke-" + (n) + ": ");
        int angka = sc.nextInt();
        
        return hitungTotal(n - 1, jumlah + angka);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();

        int total = hitungTotal(n, 0);

        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + total);

    }
}