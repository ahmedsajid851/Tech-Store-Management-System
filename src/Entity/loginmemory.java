package Entity;
import GUI.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class loginmemory {
    private String memory;
    private File file;
    private FileWriter writer;
    public loginmemory() {
		//
    }

    public loginmemory(String memory) {
        this.memory = memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getMemory() {
        return memory;
    }

    public void addMemory1() {
        try {
            file = new File("bin/loginmemory.txt");
            file.createNewFile();
            writer = new FileWriter(file, true);
            writer.write(getMemory() + "\t ");
            writer.flush();
        } catch (IOException ioe) {
            ioe.printStackTrace();
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

    public boolean getMemory1(String memory) {
    boolean isAuth = false;
    String path = "bin/loginmemory.txt";
    try {
        File file = new File(path);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String storedMemory = scanner.nextLine();
                if (storedMemory.equals(memory)) {
                    isAuth = true;
                    break;
                }
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return isAuth;
	}
		public String getUsername() {
        String username = "";
        String path = "bin/loginmemory.txt";
        try {
            File file = new File(path);
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] parts = line.split("\t");
                    if (parts.length >= 1) {
                        username = parts[0];
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return username;
    }
}

