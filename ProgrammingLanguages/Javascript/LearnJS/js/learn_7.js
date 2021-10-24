/**
 *  Number data types
 */

{
    /**Javascript number
     * - javascript has no specific type of number(No int, float, double)
     * - just "Number"
     */
    let x = 5; // this is technically int, but number in javascript
    x = 5.5; // still being number, not float
    
    /**Number.MAX_SAFE_INTEGER
     * - maximum number x64bit can store
     */
    console.log(Number.MAX_SAFE_INTEGER); // output: 9007199254740991

    let badNum = 9007199254740992;
    /**badNum will NOT be safe integer
     * - means badnum wont store number correctly
     * - ex. badNum can store 9007199254740992 but cant store 9007199254740993
     */
    console.log(Number.isSafeInteger(badNum)); // returns false

    let babies = 9007199254740991;
    console.log(Math.pow(babies, 200)); //Infinity
    console.log(Math.pow(-babies, 201)); //Negative Infinity

    // --- Wrongly math output ---
    console.log(console.log() + 2); // NaN, using math wrongly
    console.log(1 / 0); // this works in javascript as Infinity output
}