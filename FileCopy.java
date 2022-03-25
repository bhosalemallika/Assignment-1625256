package Tasks;

import java.io.*;
import java.util.Scanner;

public class FileCopy 
{
    public static void main(String[] args) throws Exception
    {
        FileWriter writer = new FileWriter("file1.txt", true);
        BufferedWriter buffer = new BufferedWriter(writer);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter text to be added in first file");
        String stringg = sc.nextLine();
        buffer.write(stringg);
        buffer.close();

        File file = new File("file1.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String stt;
        FileWriter writer1 = new FileWriter("file2.txt", true);
        BufferedWriter buffer1 = new BufferedWriter(writer1);

        while(( stt  = br.readLine()) != null)
        {
            String f2 = stt;
            buffer1.write(f2);
        }
        
        System.out.println("Successful");
        buffer1.close();
    }
}
