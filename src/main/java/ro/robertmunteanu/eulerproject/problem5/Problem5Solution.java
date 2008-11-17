package ro.robertmunteanu.eulerproject.problem5;

/**
 * Solves the problem by using a table in which the largest count of a prime to be added in the 
 * product is held.
 * 
 * Hardcoded to 20 for now
 * 
 * @author Robert Munteanu
 *
 */
public class Problem5Solution {

    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------

    private final int[] _primes = { 2, 3, 5, 7, 11, 13, 17, 19 };
    private final int[] _exponents = new int[_primes.length];

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    public int findResult() {

        int upperRange = 20;

        for (int i = 2; i < upperRange; i++)
            fillExponentsWithDivisorsOf(i);

        return calculateResultFromExponents();

    }

    /* ----------------------------------------------------------------------------------------- */

    private int calculateResultFromExponents() {

        int sum = 0;

        for (int i = 0; i < _primes.length; i++) {

            int prime = _primes[i];
            int exponent = _exponents[i];

            sum += Math.pow(prime, exponent);
        }

        return sum;
    }

    /* ----------------------------------------------------------------------------------------- */
}
