import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class StringOperation {

    private static ArrayList<String> arrayList = new ArrayList<>();//Generic type

    private  static DataInputStream da = new DataInputStream(System.in);

    public static void main(String[] args) throws IOException {


        boolean isNotExecutable = false;

        while(!isNotExecutable){
            System.out.println("\n1" +
                    "Enter choice: \n\t1-->create\n\t2-->append\n\t3-->insert\n\t4-->display\n\t5-->starts wit given letter\n\t6-->Exit");
           int ch = Integer.parseInt(da.readLine());
            switch(ch){
                case 1://create
                    System.out.println("----Create operations----");
                    System.out.println("Enter number of string to be added: ");
                    int n = Integer.parseInt(da.readLine());

                    for(int i = 0 ; i < n ; i ++){
                        arrayList.add(da.readLine());
                    }
                    break;
                case 2:
                    System.out.println("----Append operations----");
                    String s = da.readLine();
                    append(s);
                    break;
                case 3:
                    System.out.println("----Insert operations----");
                    System.out.println("Enter index to insert: ");
                    int index = Integer.parseInt(da.readLine());
                    System.out.println("Enter string to insert: ");
                    s = da.readLine();
                    insert(index - 1,s);
                    break;
                case 4:
                    System.out.println("----Displaying----");
                    printList();
                    break;
                case 5:
                    System.out.println("----Starts with given letter----");
                    System.out.println("Enter character: ");
                    String c = da.readLine();
                    startGiven(c);
                    break;
                case 6:
                    isNotExecutable = true;
                    System.out.println("Exiting the application.....");
                    break;

            }
        }

    }

    private static void append(String string){

        arrayList.add(string);
    }

    private static void printList(){

        for(int i = 0 ; i < arrayList.size() ; i++ ){
            System.out.print(arrayList.get(i)+" ");
        }
     }

     private static void insert(int index , String s){

        arrayList.add(index,s);
    }

    private static void startGiven(String s){

        for(int i = 0 ; i < arrayList.size(); i++){
            String str = arrayList.get(i);
            if(str.startsWith(s))
                System.out.println(arrayList.get(i));
        }
    }
}
