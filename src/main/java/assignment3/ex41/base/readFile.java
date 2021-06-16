package assignment3.ex41.base;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class readFile {
     public static int i;

    public void openFile() {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("/Users/brandon/UCF/Summer 2021/COP 3330/exercise41_input.txt"));
            ArrayList<String> s = new ArrayList<>();
            String line = "";
            while((line=br.readLine())!=null) {
                i=++i;
                s.add(line);
            }br.close();
            Collections.sort(s);
            FileWriter wr = new FileWriter("/Users/brandon/UCF/Summer 2021/COP 3330/exercise41_output.txt");
            wr.write("total of ");
            wr.write( String.valueOf(i) );
            wr.write(" names");
            wr.write("\r\n");
            wr.write("-----------------");
            wr.write("\r\n");
            for(String str:s){
                wr.write(str);
                wr.write("\r\n");
            }wr.close();
        } catch (Exception ex) {
            return;
        }
    }
}



