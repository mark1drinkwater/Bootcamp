package igbook2.lesson15;

public class ThreadProblems {
    /*
        Thread Safety: Classes should continue to behave correctly when accessed from multiple threads.
        Performance: Deadlock & Livelock. Threads typically interact with other threads. As more threads are introduced
        into an application, the possibility exists that threads will reach a point where they cannot continue.

        Shared Data:
        Static and instance fields are potentially shared by threads.
        Shared data must be accessed cautiously. Instance and static fields.
        -- Are created in an area of memory known as heap space.
        -- Can potentially be shared by any thread.
        -- Might be changed concurrently by multiple threads.
           -- There are no compiler or IDE warnings.
           -- Safely accessing shared fields is your responsibility.

        Debugging Threads:
        Can be difficult because the frequency & duration of each thread can vary:
        -- Thread scheduling is handled by an OS and OS may have different scheduling algos.
        -- Machines have different counts and speeds of CPUs
        -- Other applications may be placing load on system
        This may be one of those cases where it seems to function perfectly in development but
        strange problems manifest in production because of scheduling variations.

        Non-shared Data:
        Some variables are never shared. These are always thread-safe:
        -- Local variables
        -- Method parameters
        -- Exception handler parameters
        -- Immutable data

        Any shared data that is immutable such as Strings or final fields are thread-safe because they can be read not written.


     */
}
