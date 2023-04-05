import javax.swing.JOptionPane;

public class firstStart {
    
    private String password;
    private String firstStarted = null;

    public void initialize() {
        password = JOptionPane.showInputDialog(null, "Please input a password");
        firstStarted = JOptionPane.showInputDialog(null, "Are you sure? You will be able to change these settings later. YES/NO");
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