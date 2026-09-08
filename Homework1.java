// 2026_9_8 객체지향프로그래밍 과제 202210889 홍유빈
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Homework1 homework1 = new Homework1();
        homework1.run();
    }
}



class Homework1 {
    void run(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i <= 4; i++){
            System.out.println("정수를 입력하세요:");
            int num = sc.nextInt();
            sum = sum + num;
            System.out.printf("현재까지 입력된 정수의 합은 %d입니다\n ", sum);


    }
}

}