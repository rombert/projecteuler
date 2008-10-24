package ro.robertmunteanu.eulerproject.problem2;

import static ro.robertmunteanu.eulerproject.util.AssertUtils.assertEquals;

import java.util.ArrayList;
import java.util.List;

/**
 * Calculates the result without taking advantage of the fact that only even numbers should be
 * added 
 * 
 * @author Robert Munteanu
 *
 */
public class Problem2BruteForceSolution {

    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------

    private static List<Long> _resultCache = new ArrayList<Long>();
    static {
        _resultCache.add(1L);
        _resultCache.add(2L);
    }

    // --------------------------------------------------------------------------------------------
    // Class methods
    // --------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        long limit = 4 * 1000 * 1000;

        long result = fibSum(limit);

        System.out.println(result);

        assertEquals(result, 4613732);

    }

    /* ----------------------------------------------------------------------------------------- */

    private static long fibSum(long limit) {

        long sum = 0;

        long nextNumber = 1;

        int position = 1;

        while (nextNumber < limit) {

            if (nextNumber % 2 == 0)
                sum += nextNumber;

            nextNumber = fib(position);

            position++;

        }

        return sum;

    }

    /* ----------------------------------------------------------------------------------------- */

    private static long fib(long value) {

        if (value <= 2)
            return value;

        long result = _resultCache.get(_resultCache.size() - 1) + _resultCache.get(_resultCache.size() - 2);

        _resultCache.add(result);

        return result;
    }
    /* ----------------------------------------------------------------------------------------- */

}
