import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        int[] arr2 = new int[3];
        int cont = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        for(int i = 0; i < arr2.length; i++){
            if(arr2[i] > arr[i]){
             cont += arr2[i] - arr[i];
            }
        }

        sc.close();
        System.out.println(cont);
    }
}
