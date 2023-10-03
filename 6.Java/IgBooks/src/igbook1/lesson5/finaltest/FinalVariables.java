package igbook1.lesson5.finaltest;

public class FinalVariables {
    /*
        The final modifier can be applied to variables.
        Final variables may not change their values after they are intialized.
        Final variables can be:
          -- Class fields
          -- Method parameters
          -- Local variables

        In terms of objects: Final references must always reference the same object,
          but the contents of that object may be modified.

        Benefits and Drawbacks of Final Variables:
          Bug prevention:
            Final variables can never have their values modified after they are initialized.
            This behavior functions as a bug-prevention mechanism.
          Thread Safety:
            The immutable nature of final variables eliminates any of the concerns that come with
            concurrent access by multiple threads.
          Final Reference to Objects:
            A final object reference only prevents a reference from pointing to another object.
            If you're designing immutable objects, you must prevent the object's fields from being modified.
            Final references also prevents you from assigning a value of null to the reference.
            Maintaining an object's references prevents that object from being available for garbage collection.
     */
}
