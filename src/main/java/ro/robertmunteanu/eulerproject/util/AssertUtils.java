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

    public static void assertEquals(int actual, int expected) {

        if (actual != expected)
            throw new IllegalArgumentException(actual + " != " + expected);

    }

    /* ----------------------------------------------------------------------------------------- */

}
