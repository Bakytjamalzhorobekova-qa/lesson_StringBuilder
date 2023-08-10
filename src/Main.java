import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        StringBuilder stringBuilder = new StringBuilder();
//       int [] nums ={1,2,3,4,5};
//        for (int i = 0; i < nums.length; i++) {
//
//            stringBuilder.append(nums[i]);
//
//        }
//        System.out.println(stringBuilder);

        FileWriter fileWriter = new FileWriter("Song.txt");
        fileWriter.write("Nothing else matters");
        fileWriter.write("Metallica");
        fileWriter.write("");
        fileWriter.write("So close, no matter how far\n" +
                "Couldn't be much more from the heart\n" +
                "Forever trusting who we are\n" +
                "And nothing else matters\n" +
                "Never opened myself this way\n" +
                "Life is ours, we live it our way\n" +
                "All these words I don't just say\n" +
                "And nothing else matters");
        fileWriter.close();
        FileReader fileReader = new FileReader("Song.txt");
        Scanner scanner = new Scanner(fileReader);

            Song song = new Song();
            song.setTitle("Nothing else matters");
            song.setAuthor("Metallica");
            song.setText("So close, no matter how far\n" +
                    "Couldn't be much more from the heart\n" +
                    "Forever trusting who we are\n" +
                    "And nothing else matters\n" +
                    "Never opened myself this way\n" +
                    "Life is ours, we live it our way\n" +
                    "All these words I don't just say\n" +
                    "And nothing else matters");
        fileReader.close();
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());

            }
        System.out.println(song);

        }
    }



