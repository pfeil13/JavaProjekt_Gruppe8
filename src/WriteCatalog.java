import java.util.*;
import java.io.*;

public class WriteCatalog {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("src/user_catalog.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("test test test");
        bw.write("tset tset tset");

        bw.close();

    }
}
