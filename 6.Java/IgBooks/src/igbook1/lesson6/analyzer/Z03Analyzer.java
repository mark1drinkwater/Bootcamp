package igbook1.lesson6.analyzer;

public class Z03Analyzer {

    public static void searchArr(String[] strList, String searchStr, StringAnalyzer analyzer) {
        // By encapsulating the for loop into a static helper method, only one loop is needed
        // to process any sort of string test using the StringAnalyzer interface
        for (String currentStr : strList) {
            if (analyzer.analyze(currentStr, searchStr)) {
                System.out.println("Match: " + currentStr);
            }
        }
    }
}
