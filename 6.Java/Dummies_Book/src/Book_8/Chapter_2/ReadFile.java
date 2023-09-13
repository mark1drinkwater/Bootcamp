package Book_8.Chapter_2;

import java.text.NumberFormat;

public class ReadFile
{
    public static void main(String[] args) {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        BufferedReader in = getReader("movies.txt");
        Movie movie = readMovie(in);
        while (movie != null)
        {
            
        }
    }
}
