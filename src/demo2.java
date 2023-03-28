import java.util.Scanner;

/**
 * @description 实现一个逆向猜数 输入一个[1,100]的整数，让电脑使用二分法来猜测
 * @author Clement
 * @date 2023/03/28
 */
public class demo2 {
    public static void main(String[] args) {    //简单的猜数实现
        Scanner in = new Scanner(System.in);
        int num = (int)(Math.random()*100 + 1);     //[1,101)   通过一个随机数生成增强有趣性
        System.out.println("猜数游戏现在开始，请输入一个[1,100]的整数");
        int ans = in.nextInt();

        int left = 1,right = 100,cnt = 0;       //左标记和右标记  标记数
        while(num != ans){
            int oriNum = num;
            if(num > ans){
                right = num;
                num = (left + right) / 2;
                ++cnt;
            } else if (num < ans) {
                left = num;
                num = (left + right) / 2;
                ++cnt;
            }
            if(num != ans)
                System.out.println("本次没有猜对，您输入的是"+ans+",电脑本次猜的是"+oriNum+",电脑目前猜了"+cnt+"次");
        }
        System.out.println("猜数结束！您输入的是"+num+",电脑猜了"+cnt+"次");
    }
}
