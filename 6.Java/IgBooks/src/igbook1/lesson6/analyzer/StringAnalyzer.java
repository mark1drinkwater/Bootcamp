package igbook1.lesson6.analyzer;

public interface StringAnalyzer {
    // Functional interface because it has only one method.
    boolean analyze(String sourceStr, String searchStr);
}
