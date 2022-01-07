import java.util.*;
import java.io.*;
/**
 * Write a description of class PetDriver here.
 *
 * @author Shiroya R.
 * @version 03-18-2020
 */
public class PetDriver
{
    public static StringTokenizer stok;
    
    public static void main(String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(new File("rescue.txt"));
        String line = new String(keyboard.nextLine());
        
        stok = new StringTokenizer(line, ",");
        while (stok.hasMoreTokens())
        {
            System.out.println(stok.nextToken());
        }
        Pets P1;
        Pets P2;
        Pets P3;
        System.out.println(P1.toString());
        System.out.println(P2.toString());
        System.out.println(P3.toString());
        int comp = P1.compareTo(P3);
        boolean equal = P1.equals(P2);
    }
}
