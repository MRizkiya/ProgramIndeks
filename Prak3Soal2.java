
package praktikumpemdas;
import java.util.Scanner;

public class Prak3Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double laptop = 850.56;
        double bukuTulis = 250.11;
        double kotakPensil = 25.31;
        double smartphone = 200;
        double indeks = 0;
        
        System.out.println("masukan jumlah laptop :");
        laptop = input.nextDouble();
        indeks = 850.56*laptop;
        
        System.out.println("masukan jumlah buku tulis :");
        bukuTulis = input.nextDouble();
        indeks += 250.11*bukuTulis;
        
        System.out.println("masukan jumlah kotak pensil :");
        kotakPensil = input.nextDouble();
        indeks += 25.31*kotakPensil;
        
        System.out.println("masukan jumlah smartphone :");
        smartphone = input.nextDouble();
        indeks += 200*smartphone;
        
        if(indeks <= 0){
            System.err.println("ERROR - Tidak diperkenankan bilangan negatif!");        
    }
        else if(indeks > 2000){
            System.err.println("Berat barang melebihi ketentuan");
        }          
        else  {
            System.out.println("Bawaan barang tidak melebihi ketentuan, amannn…");
        }      
    }

}
