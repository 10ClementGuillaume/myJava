import java.util.Scanner;

/**
 * 最大公约数 与 辗转相除法
 * a和b的最大公约数    a % b = r   a = b   b = r   直到b = 0时，a即为gcd
 * @author Clement
 * @date 2023/03/28
 */
public class greatCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();   //输入两个数
        int gcd = 1;        //最大公约数
        //枚举法
     /* for(int i = 2;i <= Math.min(a,b);++i){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }   */
        //辗转相除法
        int oa = a,ob = b;
        while(b != 0){
            int res = a % b;
            a = b;
            b = res;
        }
        gcd = a;
        System.out.println(oa+"和"+ob+"的最大公约数是"+gcd);
    }
}
