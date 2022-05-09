import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        BubbleSort BubbleSort;
        BubbleSort = new BubbleSort();
        int n;
        // Loading data from file
        BufferedReader readFile = new BufferedReader(new FileReader("TestWordList.txt"));

        String line = readFile.readLine();

        // Checking for end of file
        List<String> listOfWords = new ArrayList<>();
        while (line != null) {
            listOfWords.add(line);
            line = readFile.readLine();
        }

        readFile.close();

        // Inserting Strings into array
        String[] engDataset = listOfWords.toArray(new String[0]);
        n = engDataset.length;
        BubbleSort.bubbles(engDataset, n);
        System.out.println("Strings in sorted order are :");
        for (int z = 0; z < n; z++)
            System.out.println(engDataset[z]);
    }
}
