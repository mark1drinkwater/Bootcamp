package OCP.Chapter7.seal;

public sealed interface Antelope permits Gazelle, Wildebeast{} //doesn't need to permit if in the same file or within the sealed class

final class Gazelle implements Antelope {}

//public class George extends Gazelle {} // DOES NOT COMPILE

non-sealed interface Wildebeast extends Antelope {}
