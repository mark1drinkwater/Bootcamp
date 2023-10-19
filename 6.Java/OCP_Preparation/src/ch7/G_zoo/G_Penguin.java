package ch7.G_zoo;

public class G_Penguin {}
//sealed class Penguin permits Emperor {}  // Uncomment together
//final class Emperor {} // DOES NOT COMPILE. Uncomment together


/*
Every class that directly extends a sealed class must specify exactly one of the following three modifiers: final, sealed, or non-sealed.
 */
//////////////////// A final Subclass
sealed class Antelope permits Gazelle {}
final class Gazelle extends Antelope {}
//class George extends Gazelle {} // DOES NOT COMPILE

//////////////////// A sealed subclass
sealed class Mammal permits Equine {}
sealed class Equine extends Mammal permits Zebra {}
final class Zebra extends Equine {}

/////////////////////// A non-sealed subclass
sealed class Wolf permits Timber {}
non-sealed class Timber extends Wolf {}
class MyWolf extends Timber {}
class MyFurryWolf extends MyWolf {}
////////////////////////////// Omitting the permits Clause
sealed class Snake permits Cobra {}
final class Cobra extends Snake {}
///////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////
// Sealed interface
// Sealed interface
sealed interface Swims permits Duck, Swan, Floats {}
// Classes permitted to implement sealed interface
final class Duck implements Swims {}
final class Swan implements Swims {}
// Interface permitted to extend sealed interface
non-sealed interface Floats extends Swims {}

/*
Reviewing Sealed Class Rules
Any time you see a sealed class on the exam, pay close attention to the subclass declaration
and modifiers.
Sealed Class Rules
■ Sealed classes are declared with the sealed and permits modifiers.
■ Sealed classes must be declared in the same package or named module as their direct
subclasses.
■ Direct subclasses of sealed classes must be marked final, sealed, or non-sealed.
■ The permits clause is optional if the sealed class and its direct subclasses are declared
within the same file or the subclasses are nested within the sealed class.
■ Interfaces can be sealed to limit the classes that implement them or the interfaces that
extend them.
 */