package Entity;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateAccount {
    private String address;
    private String userEmail;
    private String userName;
    private String userPassword;
    private File file;
    private FileWriter writer;
    private Scanner scanner;

    public CreateAccount() {}

    public CreateAccount(String address, String userEmail, String userName, String userPassword) {
        this.address = address;
        this.userEmail = userEmail;
        this.userName = userName;
        this.userPassword = userPassword;
    }



    public void setAddress(String address) {
        this.address = address;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getAddress() {
        return address;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void addAccount() {
        try {
            file = new File("bin/Users.txt");
            writer = new FileWriter(file, true);
            writer.write(getUserName() + "\t");
            writer.write(getUserPassword() + "\t");
            writer.write(getAddress() + "\t");
            writer.write(getUserEmail() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public boolean getAccount(String userName, String userPassword) {
        boolean isAuth = false;
        String path = "bin/Users.txt";
        try {
            file = new File(path);
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] value = line.split("\t");
                if (value[0].equals(userName) && value[1].equals(userPassword)) {
                    isAuth = true;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return isAuth;
    }
	
	public String getAccountInfo(String userName) {
    String userInfo = null;

    try {
        
        File file = new File("bin/Users.txt");
        Scanner scanner = new Scanner(file);

    
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] values = line.split("\t");

            
            if (values[0].equals(userName)) {
                
                userInfo = values[0] + "\t" + values[1] + "\t" + values[2] + "\t" + values[3];
                break;
            }
        }
        scanner.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

    return userInfo;
}

}

