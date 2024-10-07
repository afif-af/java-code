import java.util.Scanner;
public class palindrom {

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter Your Number : ");
            int num =input.nextInt();
            int sum=0;
            int rem;
            int tem =num;
            while(num!=0)
            {
                rem=num%10;
                sum=sum*10 +rem;
                num=num/10;
            }
            if(sum==tem)
            {
                System.out.println("Palindrome");
            }
            else
            {
                System.out.println("Not Palindrom");
            }
        }
}
