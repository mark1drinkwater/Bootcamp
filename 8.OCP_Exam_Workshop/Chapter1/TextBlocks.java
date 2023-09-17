public class TextBlocks {
	public static void main (String[] args) {
		String pyramid = """
		  *
		 * *
		* * *
		""";
		
		String block1 = """
						doe""";

		
		String block2 = """
			doe \
			deer""";
			
		String block3 = """
		  "doe\"\"\"
		  \"deer\"""
		 """;
		
		System.out.println("*" + block3 + "*");

		//System.out.println(pyramid);
	}
}