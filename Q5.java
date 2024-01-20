import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        System.out.println("Enter the year to be Checked");
        Scanner sc = new Scanner(System.in);
        int yr = sc.nextInt();
        if(yr%4==0 && yr%100!=0|| yr%400==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a Leap year");
        }
    }
}
