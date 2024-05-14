package Entity;
import GUI.*;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CreateOrders {
    private String ProductN;
    private double Price;
    private File file;
    private FileWriter writer;
    public CreateOrders()
    {
        this.ProductN = "";
    }

    public CreateOrders(String ProductN,double Price)
    {
        this.ProductN=ProductN;
        this.Price=Price;

    }

    public void setProductname(String ProductN) {
        this.ProductN = ProductN;
    }
    public void setprice(double Price) {
        this.Price = Price;
    }

    public String getProductname() {
        return ProductN;
    }
    public double getprice() {
        return Price;
    }

    public void addOrders()
    {
        try
        {
            file = new File("bin/Oders.txt");
            file.createNewFile();
            writer  = new FileWriter(file,true);
            writer.write(getProductname()+  "\t");
            writer.write(getprice()+  "\n");
            writer.flush();
            writer.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
	
	public double getTotalPrice() {
		double totalPrice = 0;
		try {
			FileReader fileReader = new FileReader("bin/Oders.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String line;

			while ((line = bufferedReader.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);
				st.nextToken();
				double price = Double.parseDouble(st.nextToken());
				totalPrice += price;
			}
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return totalPrice;
	}
	

}
