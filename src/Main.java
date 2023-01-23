import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static java.nio.file.Files.write;

public class Main {
    public static void main(String[] args) throws IOException {

        write("ABCDEFGHIJKLMNOPQRSTUVWXYZ",12345678);
        System.out.println(read());

    }
    public static void write(String alphabet, int number) throws IOException {
        FileWriter fileWriter = new FileWriter("alphabet.txt");
        fileWriter.write(alphabet + "\n");
        fileWriter.write(number + "\n");
        fileWriter.close();
    }
    public static Alphabet read() throws IOException {
        FileReader fileReader = new FileReader("alphabet.txt");
        Scanner scanner = new Scanner(fileReader);
        Alphabet alphabet = new Alphabet();
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            stringBuilder.append(scanner.nextLine() + "\n");
        }
        alphabet.setAlphabet(stringBuilder.toString());

        fileReader.close();

        return alphabet;
    }

}
