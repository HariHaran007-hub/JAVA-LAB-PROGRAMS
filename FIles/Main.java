import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;

public class Main {
    private  static DataInputStream da = new DataInputStream(System.in);
    public static void main(String [] args) throws IOException {

        System.out.println("Enter absolut path of the file: ");
        String str = da.readLine();
        FileOperating fileOperating = new FileOperating(str);

        int ch;
        boolean isNotExetuable = false;
        while(!isNotExetuable){
			 System.out.println("Enter operations to be performed on file:  \n\t1->Generate result\n\t2->Write\n\t3->Read\n\t4->Exit");
	         ch = Integer.parseInt(da.readLine());
	         switch(ch){
				 case 1:
				 	fileOperating.generatingResult();
				 	break;
				 case 2:
				 	 fileOperating.write();
				 	 break;
				 case 3:
 					fileOperating.read();
 					break;
				 case 4:
				 	isNotExetuable  = true;
				 	break;

			 }
	}

    }
}