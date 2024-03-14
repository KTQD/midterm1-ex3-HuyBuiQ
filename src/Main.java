import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        String tuCanThay = "Nha Trang";
        String tuThayVao = "Vũng Tàu";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
                content.append("\n");
            }
            reader.close();
            String editedText = content.toString().replaceAll(tuCanThay, tuThayVao);
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write(editedText);
            writer.close();

            System.out.println("Bai 3 thanh cong");
        } catch (IOException e) {
            System.err.println("Loi: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
