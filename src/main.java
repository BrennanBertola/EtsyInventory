import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class main {

    private static final String FILE_PATH = "key.txt";
    private static String apiKey = "default";

    public static void main(String[] args) {
        File file = new File(FILE_PATH);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            if ((apiKey = br.readLine()) == null) {
                throw new Exception();
            }
        } catch (Exception ex) {
            System.out.println("error reading in api key");
            return;
        }
    }
}
