import static java.lang.Math.pow;
import java.util.Scanner;
public class armstrong {
        public static void main(String[] args) {
            int count,sum,rem,temp;
            System.out.println("Enter your Range : ");
            Scanner input=new Scanner(System.in);
            int n =input.nextInt();
            for(int i=1;i<=n;i++)
            {
                int ori=i;
                int tem=i;
                int m=i;
                sum=0;
                count=0;
                while(m!=0)
                {
                    m=m/10;
                    count++;
                }
                while(tem!=0)
                {
                    rem=tem%10;
                    sum=(int) (sum+pow(rem,count));
                    tem=tem/10;
                }

                if(sum==ori)
                {
                    System.out.println(i +" ");
                }
            }


    }
