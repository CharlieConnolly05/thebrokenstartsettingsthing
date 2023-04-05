import java.util.Scanner;
import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {    
    

        Scanner input = new Scanner(System.in);
        firstStart testing = new firstStart();

        System.out.println("Would you like to run a test environment?");
        String environemnt = input.nextLine();

        if (environemnt.equals("yes")){
            testing.initialize();
        }
        else{
            System.out.println("Why not bozo");
        }
    }
}