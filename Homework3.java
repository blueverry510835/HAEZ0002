import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inpu ip = new Inpu();
        ip.numinpu();
        ip.maxfind();
        ip.minfind();


    }
}


class Inpu{
    int n =0;
    int max = 0;
    int min = 0;
    int[] arr;
    Scanner scanner = new Scanner(System.in);

    void numinpu(){
        System.out.print("몇개의 정수를 입력하시겠습니까? : ");
        n = scanner.nextInt();
        arr = new int[n];
        System.out.printf("%d개의 정수 입력 : ", n);
        for (int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
    }
    void maxfind(){
        max = arr[0];
        for (int i =1; i<n; i++){
            if (arr[i] >= max){
                max = arr[i];
            }
        }
        System.out.printf("최댓값은 %d 입니다 ", max);
    }
    void minfind(){
        min = arr[0];
        for (int i =1; i<n; i++){
            if (arr[i] <= min){
                min = arr[i];
            }
        }
        System.out.printf("최솟값은 %d 입니다 ", min);
    }

}