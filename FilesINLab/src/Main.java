
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;

public class Main {
    private  static DataInputStream da = new DataInputStream(System.in);
    public static void main(String [] args) throws IOException {

        System.out.println("Enter absolut path of the file: ");
        String str = da.readLine();
        FileOperating fileOperating = new FileOperating(str);
        fileOperating.generatingResult();
    }
}
