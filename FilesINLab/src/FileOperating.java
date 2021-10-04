import java.io.File;


public class FileOperating {
    private String str;
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
}
