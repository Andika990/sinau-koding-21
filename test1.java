import java.util.Scanner;

public class test1 {
    static int menu;
    /**
     * @param args
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("Hitung Luas dan keliling");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("Pilihan :");
        int menu = input.nextInt();
        System.out.println("==========================");

        if(menu == 1){
            System.out.println("==========================");
            System.out.println("1. Hitung Luas");
            System.out.println("2. Hitung keliling");
            int pilihan = input.nextInt();
            System.out.println("==========================");
            if (pilihan == 1){
                System.out.println("Masukan sisi");
                int s = input.nextInt();
                luasPersegi(s);
            }
            if (pilihan == 2){
                System.out.println("Masukan sisi");
                int s = input.nextInt();
                kelPersegi(s);
            }
        }
        if(menu ==2){
            System.out.println("==========================");
            System.out.println("1. Hitung Luas Persegi Panjang");
            System.out.println("2. Hitung keliling Persegi Panjang");
            int pilihan = input.nextInt();
            System.out.println("==========================");
            if (pilihan == 1){
                System.out.println("Masukan Panjang");
                int p = input.nextInt();
                System.out.println("Masukan Lebar");
                int l = input.nextInt();
                luasPersegiPanjang(p,l);
            }
            if (pilihan == 2){
                System.out.println("Masukan Panjang");
                int p = input.nextInt();
                System.out.println("Masukan Lebar");
                int l = input.nextInt();
                kelPersegiPanjang(p,l);
            }

        }
        if(menu ==3){
            System.out.println("==========================");
            System.out.println("1. Hitung Luas Segitiga");
            System.out.println("2. Hitung Keliling Segitiga");
            int pilihan = input.nextInt();
            System.out.println("==========================");
            if (pilihan == 1){
                System.out.println("Masukan Alas");
                int a = input.nextInt();
                System.out.println("Masukan Tinggi");
                int t = input.nextInt();
                luasSegitiga(a,t);
            }
            if (pilihan == 2){
                System.out.println("Masukan Sisi 1");
                int a = input.nextInt();
                System.out.println("Masukan Sisi 2");
                int b = input.nextInt();
                System.out.println("Masukan Sisi 3");
                int c = input.nextInt();
                kelSegitiga(a,b,c);
            }
        }
        
}

/**
 * @param s 
 */
static void luasPersegi(int s){
    double luas = s * s;
    System.out.println("Luas Persegi = " + luas);
}
static void kelPersegi(int s){
    double keliling = s * 4;
    System.out.println("Keliling Persegi = " + keliling);
}
static void luasPersegiPanjang(int p,int l){
    double luas = l * p;
    System.out.println("Luas Persegi Panjang = " + luas);
}
static void kelPersegiPanjang(int p,int l){
    double keliling = (l * 2) + (p * 2);
    System.out.println("Keliling Persegi Panjang = " + keliling);
}

static void luasSegitiga(int a,int t){
    double luas = 0.5 * a *t ;
    System.out.println("Luas Segitiga= " + luas);
}
static void kelSegitiga(int a,int b,int c){
    double keliling = a + b + c;
    System.out.println("Keliling Segitiga= " + keliling);
}

}
