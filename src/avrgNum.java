import java.util.Scanner;

/**
 * 输入数字统计输入次数
 * @author Clement
 * @date 2023/03/28
 */
public class avrgNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int [] nums = new int[10];
        while(num != -1){
            if(num >=0 && num <= 9) {
                nums[num]++;
            }
            num = in.nextInt();
        }
        for(int i = 0;i < nums.length;++i) {
            if(nums[i] != 0) {
                System.out.println(i+"出现了:"+nums[i]+"次");
            }
        }
    }
}
