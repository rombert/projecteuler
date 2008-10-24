package ro.robertmunteanu.eulerproject.problem2;

import java.util.ArrayList;
import java.util.List;

public class Problem2Solution {

    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------

    private static List<Integer> _resultCache = new ArrayList<Integer>();
    static {
        _resultCache.add(1);
        _resultCache.add(2);
    }

    // --------------------------------------------------------------------------------------------
    // Class methods
    // --------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        long limit = 4 * 1000 * 1000;

        System.out.println(fibSum(limit));

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

        int result = _resultCache.get(_resultCache.size() - 1) + _resultCache.get(_resultCache.size() - 2);

        _resultCache.add(result);

        System.out.println(value + " -> " + result);

        return result;
    }
    /* ----------------------------------------------------------------------------------------- */

}
