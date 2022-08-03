import java.util.*;

public class test2{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int jumlah;
        String[] nama = new String[20];
        int[] nilai = new int[20];
        System.out.print("MASUKKAN BANYAKNYA MAHASISWA : ");
        jumlah =input.nextInt();
        for(int a=1;a<=jumlah;a++){
            
            System.out.println("MAHASISWA KE : "+a);
            System.out.print("NAMA : ");
            nama[a] = input.next();
            System.out.print("NILAI : ");
            nilai[a] = input.nextInt();
            
        }
        System.out.println("|| NO ||  NAMA  ||   NILAI    ||  STATUS  ||");
        for(int a=1;a<=jumlah;a++){

            System.out.print("|| " + a );
            System.out.print("  ||   " + nama[a] );
            System.out.print("   ||   " + nilai[a] + "    ||");
            if(nilai[a] >= 65){
                System.out.println("   LULUS  ||");
            } 
                
             else {
                System.out.println("   Tidak LULUS ||");
            }
        }
        
    }
}