/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter1;

/**
 *
 * @author Mark
 */
public class VariableInitTes {

    /**
     * @param args the command line arguments
     */
    
    public static float hello;
    public static char defaultTest;
    
    public static void main(String[] args) {
        double defaultLocalTest;
        
        final int HELLO = 5;

//        System.out.println("A"+defaultTest+"B");
        
        var blocky = """
            squirrel \s
              pigeon \
            termite""";
        System.out.print(blocky);
    }
    
}
