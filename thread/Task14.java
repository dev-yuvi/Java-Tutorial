import java.util.*;
class Task14
{
    public static void main(String[] args)
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        int r=sc.nextInt();
        for (int i = 1; i <= r; i++) {
            if ((i >= 51 && i <= 59) || (i >=251 && i <=259 ) || (i >= 500 && i <= 599) || (i % 10 == 5) || (i % 100 == 50) || (i % 1000 == 500)) {
                System.out.print(i + " ");
            }
        }
    }
}