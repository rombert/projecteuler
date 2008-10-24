package ro.robertmunteanu.eulerproject.problem1;

import static ro.robertmunteanu.eulerproject.util.AssertUtils.assertEquals;

/**
 * 
 * Fixes the problem by calculating sequences for 3 , 5 and substracting the duplicates ( 15 )
 * 
 * @author Robert Munteanu
 *
 */
public class Problem1SequenceSolution {

    // --------------------------------------------------------------------------------------------
    // Class methods
    // --------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        int limit = 999;

        int result = sumOfNumbersDivisibleBy(5, limit) + sumOfNumbersDivisibleBy(3, limit) - sumOfNumbersDivisibleBy(15, limit);

        System.out.println(result);

        assertEquals(result, 233168);

    }

    /* ----------------------------------------------------------------------------------------- */

    private static int sumOfNumbersDivisibleBy(int divisor, int limit) {

        int count = limit / divisor;

        return divisor * (count + 1) * count / 2;
    }

    /* ----------------------------------------------------------------------------------------- */

}
