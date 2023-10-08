package OCP.Chapter7.seal;

public sealed class Snake3 permits Snake3.Cobra {
    final class Cobra extends Snake3 {}
}