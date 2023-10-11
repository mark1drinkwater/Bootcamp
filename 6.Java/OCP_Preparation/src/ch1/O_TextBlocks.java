package ch1;

public class O_TextBlocks {
    public static void main(String[] args) {
        String eyeTest = "\"Java Study Guide\"\n by Scott & Jeanne";
        System.out.println(eyeTest);

        System.out.println("Pyramid:");
        String pyramid = """
         *
        * *
        * * *
        """;
        System.out.print(pyramid);
        System.out.println("Next one::::::::::::");

//        Let’s try a few examples. First, do you see why this doesn’t compile?
//        String block = """doe"""; // DOES NOT COMPILE

        String block = """
                        doe \
                        deer""";
        System.out.println(block);
        System.out.println("Next one::::::::::::");

//        Just one. The output is doe deer since the \ tells Java not to add a new line before deer.
//        Let’s try determining the number of lines in another text block:
          block = """
                    doe \n
                    deer
                    """;
        System.out.println(block);
//        This time we have four lines. Since the text block has the closing """ on a separate line,
//        we have three lines for the lines in the text block plus the explicit \n. Let’s try one more.
//        What do you think this outputs?
        System.out.println("Next one::::::::::::");
       block = """
                "doe\"\"\"
                \"deer\"""
               """;
        System.out.print("*"+ block + "*");
//        The answer is
//        * "doe"""
//        "deer"""

//                All of the \" escape the ". There is one space of essential whitespace on the doe and deer
//        lines. All the other leading whitespace is incidental whitespace.

    }
}
