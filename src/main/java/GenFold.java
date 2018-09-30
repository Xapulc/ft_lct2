import java.io.File;
import java.util.Random;
import java.io.IOException;

public class GenFold {
    public static void main(String[] args) {
        Random rnd = new Random();
        int len = 1 + rnd.nextInt(19);
        String d_name = new String();
        for (int i = 0; i < len; i++)
            d_name += (char) (97 + rnd.nextInt(27));
        File dir = new File(d_name);
        if (!(dir.exists()))
            dir.mkdir();
        File f = new File(dir, "test.txt");
        if (!(f.exists())) {
            try {
                f.createNewFile();
            } catch (IOException e){};
        }
    }
}
