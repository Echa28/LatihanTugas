import java.util.Scanner;

public class Jarak {
    public static void main(String[] args) {
        int[][] daftar_jarak= new int[3][4];

        System.out.println("Input Data jarak ");
        System.out.println("____________________");
        for(int baris=0;baris<3;baris++){
            for(int kolom=0;kolom<4;kolom++){
                try {
                    Scanner inputjarak = new Scanner(System.in);
                    System.out.print("Input baris ke "+baris+" kolom ke "+ kolom+ "= ");
                    int jarak = inputjarak.nextInt();
                    daftar_jarak[baris][kolom] = jarak;
                    System.out.println(" ");
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println("\nData jarak yang diinput ");
        System.out.println("_____________________________");
        for(int baris=0;baris<3;baris++){
            for(int kolom=0;kolom<4;kolom++){
                System.out.print(daftar_jarak[baris][kolom]+" ");
            }
            System.out.println(" ");
        }
    }
}
