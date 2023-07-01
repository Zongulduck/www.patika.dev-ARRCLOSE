import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr = {12,42,-4,0,23,1,3,90,-32,19,21,5,-9,43,52,14,81,2,-15,74,33,27};
        Scanner inp = new Scanner(System.in);

        System.out.println("Dizi :" + Arrays.toString(arr));

        System.out.print("Bir sayi giriniz :");
        int input = inp.nextInt();
        int eyk = input;
        int eyb = input;
        //Diziyi küçükten büyüğe sıralayalım.
        Arrays.sort(arr);
        System.out.println("Dizinin Sıralı Hali :" + Arrays.toString(arr));
        //sayımızdan büyük en yakın sayıyı bulalım
        for (int item: arr){
            if (item > input){
                eyb = item;
                break;
            }
        }
        //sayımızdan küçük en yakın sayıyı bulalım
        for (int i = arr.length-1; i >= 0; i--){
            if (arr[i] < input){
                eyk = arr[i];
                break;
            }
        }
        System.out.println("Sayımızdan büyük en yakın sayı :" +eyb);
        System.out.println("Sayımızdan küçük en yakın sayı :" +eyk);
    }
}