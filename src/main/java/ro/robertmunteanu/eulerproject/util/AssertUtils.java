package ro.robertmunteanu.eulerproject.util;

/**
 * Utility methods
 * 
 * @author Robert Munteanu
 *
 */
public class AssertUtils {

    // --------------------------------------------------------------------------------------------
    // Class methods
    // --------------------------------------------------------------------------------------------

    public static void assertEquals(long actual, long expected) {

        if (actual != expected)
            throw new IllegalArgumentException(actual + " != " + expected);

    }

    /* ----------------------------------------------------------------------------------------- */

}
