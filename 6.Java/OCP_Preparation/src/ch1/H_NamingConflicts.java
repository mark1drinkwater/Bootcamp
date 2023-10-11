package ch1;

import java.util.Date;
import java.sql.*;

public class H_NamingConflicts {
}

class Conflicts {
    // What import can we use?
    // Either import.util.*;
    // Or java.util.Date;
    Date date;

    // But What if we also want to use the Date class in the sql package?
    // It gets more tricky then, since they have the same class name.

    // Solution: Instead of just saying Date, we use the fully qualified class name.
    java.sql.Date sqlDate;

}