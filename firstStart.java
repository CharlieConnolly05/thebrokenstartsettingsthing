import javax.swing.JOptionPane;

public class firstStart {
    
    private String password = null;
    private String firstStarted = null;
    private boolean check = false;
    private boolean finished = false;

    public void initialize() {

        if (check = false && password == null) {
            password = JOptionPane.showInputDialog(null, "Please input a password");
            firstStarted = JOptionPane.showInputDialog(null, "Are you sure? You will be able to change these settings later. YES/NO");

            if (firstStarted.equals("YES")){
                check = true;
                finished = true;
            }
            else {
                check = false;
            }
        }
        else if (password == null){
            JOptionPane.showMessageDialog(null, "You need to input a password");
        }
        else if (finished = false){
            JOptionPane.showMessageDialog(null, "You need to enter YES");
        }
        else {
            System.out.println("Charlie you fucking bozo it doesn't work");
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstStarted() {
        return firstStarted;
    }

    public void setFirstStarted(String firstStarted) {
        this.firstStarted = firstStarted;
    }
}