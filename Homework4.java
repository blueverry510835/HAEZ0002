import java.util.Scanner;//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Homework4 {
    public static void main(String[] args) {
        System.out.println("두 정수 입력 : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Algo al = new Algo();
        System.out.println(al.gcd(n, m));


    }
}

class Algo{
    int n;
    int m;
    int gcd(int n, int m){
        if (n==0){
            return m;
        }
        if (m==0){
            return n;
        }
        else if ( n> m ){
           return gcd(m, n%m);
        }
        else if (m>n){
            return gcd(n, m%n);
        }
        return n;
    }

}