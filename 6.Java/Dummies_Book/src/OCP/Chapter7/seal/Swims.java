package OCP.Chapter7.seal;

public sealed interface Swims permits Duck, Swan, Floats {
}

final class Duck implements Swims {}
final class Swan implements Swims {}
//final class Goose implements Swims {} // Does not compile!

non-sealed interface Floats extends Swims {}
//final interface Floats extends Swims {} Does not compile