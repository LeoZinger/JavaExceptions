/**
 * Created by leo.zinger on 4/17/17.
 */
import java.io.File;
import java.io.FileReader;

public class FilenotFound_Demo {

    public static void main(String args[]) {
        try{
            File file = new File("C://file.txt");
            FileReader fr = new FileReader(file);
        }
        catch (Exception e) {
            //System.out.println("File Reader Exception: " + e.toString());
        }

        int num[] = {1, 2, 3, 4};
        //System.out.println(num[5]);

        try {
            System.out.println("try finally block says: hello");
            //System.exit(0);
            return;
        }
        finally {
            System.out.println("finally:bye!");
        } // try-finally

    }

}

