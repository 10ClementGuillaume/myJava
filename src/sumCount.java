import java.util.Scanner;

/**
 * @description 实现一个式子的求和
 * @author Clement
 * @date 2023/03/28
 */
public class sumCount {
    public static void main(String[] args) {    //对1到1/n求和
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0.0;

        for(int i = 1;i <=n; ++i){
            sum = sum + 1.0/i;      //注意1.0防止丢失精度
        }

        System.out.println(sum);
    }
}
