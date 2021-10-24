/**
 * Javascript, memorization
 */

{
// --- function ---
    // memory data
    pow.calculated = {};

    /**Simple Power function
     * - this function uses power.calculated array to memorize data
     * - it remember the key value passed by input
     * - if the key existed before, it return out and not loss time calculating duplicated value
     * @returns power of x by y
     */
    function pow(x, y)
    {  
    console.log("~~~~~ calculating pow ~~~~~")
        let stringVersion = x + "^" + y;
        console.log("key: ", stringVersion);

        if(stringVersion in pow.calculated)
        {
            console.log("value got calculated before");
            return pow.calculated[stringVersion];
        }

        console.log("Calculating!");
        let total = 1;
        for(let i = 0; i < y; i++)
        {
            total *= x;
        }
        // pow.calculated.push(total);
        pow.calculated[stringVersion] = total;
        console.log(pow.calculated);

    console.log("~~~~~ finished calculation ~~~~~")
        return total;
    }

// --- testerizing ---
    pow(3, 3); //first time with this key
    pow(3, 3); //got calculated beofore, return the calculated value
    pow(3, 3);
    pow(10, 3);
    pow(5, 6);

    console.log(pow(3, 3));
}