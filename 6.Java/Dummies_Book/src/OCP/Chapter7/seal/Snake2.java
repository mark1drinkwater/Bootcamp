package OCP.Chapter7.seal;

// Because Snake2 and Cobra2 are in different java files
// The permits keyword IS required!
public sealed class Snake2 permits Cobra2 {}