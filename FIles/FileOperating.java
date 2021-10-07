import java.io.*;
import java.util.*;


public class FileOperating {
    private String str;
    private static Scanner sc = new Scanner(System.in);
    public FileOperating(String str){
        this.str = str;
    }

    void generatingResult(){
        File file = new File(this.str);

        if(file.exists()){
            System.out.println("File "+this.str+" exist.");
            if(file.canRead())
                System.out.println("File is readable!!");
            if(file.canWrite())
                System.out.println("File is writable!!");
            System.out.println("File size: "+file.length()+" bytes");
            System.out.println("File type: "+file.getName());
        }else
            System.out.println("File does not exist :(");

    }

    void read() throws IOException{

		System.out.println("Reading the file");

		FileReader reader  = new FileReader(this.str);//opening in read mode
		BufferedReader bfr = new BufferedReader(reader);

		int i;
		while((i = bfr.read()) != -1){
			System.out.print((char)i);

		}
		bfr.close();
	}

	void write() throws IOException{

		BufferedWriter bw = new BufferedWriter(new FileWriter(this.str));
		bw.flush();
		bw.write(sc.nextLine());
		bw.close();


	}
}
