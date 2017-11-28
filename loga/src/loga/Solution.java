package loga;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Scanner;
@Embeddable
public class Solution {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("if new user press 0\nalready a customer press 1 to login");
        Scanner s=new Scanner(System.in);
        int a;
        a=s.nextInt();
        if(a==0){
            Signup su=new Signup();
        }
        else if(a==1){
        String username;
        String password;
        System.out.print("Enter your username:");
        username=s.next();
        System.out.print("Enter your password:");
        password=s.next();
        
        }
    }
}