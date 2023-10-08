package OCP.Chapter7.seal;

// You have 1 java file with
// 2 top-level classes defined inside it

public sealed class Snake1 permits Cobra1 {}
final class Cobra1 extends Snake1 {}

// The permits clause is optional and can be omitted.
// But the extends keyword is still required.

//public sealed class Snake1 {}
//final class Cobra1 extends Snake1 {}