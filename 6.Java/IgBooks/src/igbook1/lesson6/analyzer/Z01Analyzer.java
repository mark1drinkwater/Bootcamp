package igbook1.lesson6.analyzer;

public class Z01Analyzer {
    public static void main(String[] args) {
        String[] strList = {"tomorrow", "toto", "timbukto", "the", "hello", "heat"};
        String searchStr = "to";
        System.out.println("Searching for: " + searchStr);

        // Create regular class
        AnalyzerTool analyzeTool = new AnalyzerTool();

        System.out.println("===Contains===");
        for (String currentStr : strList) {
            if (analyzeTool.arrContains(currentStr, searchStr)) {
                System.out.println("Match: " + currentStr);
            }
        }

        // Call concrete class that implements StringAnalyzer
        ContainsAnalyzer contains = new ContainsAnalyzer();

        System.out.println("===Contains===");
        for (String currentStr : strList) {
            if (contains.analyze(currentStr, searchStr)) {
                System.out.println("Match: " + currentStr);
            }
        }

        // With the helper method, the main method shrinks to:
        Z03Analyzer.searchArr(strList, searchStr, contains);

        // ---------------------------------------------------
        // Implement anonymous inner class

        // Few drawbacks
        // Syntax is a bit complicated.
        // There's no class no, so when a class file is generated a number is assigned.
        // But if there's more than 1 anonymous inner class, it's difficult to figure out which class file goes with which source file.

        System.out.println("===Contains===");
        Z03Analyzer.searchArr(strList, searchStr,
            new StringAnalyzer() {
                @Override
                public boolean analyze(String target, String searchStr) {
                    return target.contains(searchStr);
                }
            }
                );

        // --------------------------------------------------------------
        // Lambda Expression replaces anonymous inner class
        /*
            With Java 8 a lambda expression can be substituted
         */
        System.out.println("==Contains==");

        // Much shorter, isn't it?
        Z03Analyzer.searchArr(strList, searchStr,
                (String target, String search) -> target.contains(search)
        );

        // Even Shorter. No need to specify types, it is inferred
        Z03Analyzer.searchArr(strList, searchStr,
                (t, s) -> t.contains(s)
                );

        // A lambda expression, anonymous inner class and concrete classes are all essentially equivalent.
        // A lambda expression is a new way to express code logic by using a functional interface as the base.

        // Lambda expressions can be treated like variables
        StringAnalyzer contains1 = (t, s) -> t.contains(s);
        StringAnalyzer startsWith = (t, s) -> t.startsWith(s);

        System.out.println("==Contains==");
        Z03Analyzer.searchArr(strList, searchStr, contains1);
        System.out.println("==Starts With==");
        Z03Analyzer.searchArr(strList, searchStr, startsWith);
    }
}
