/**
 * Javascript, Arrow function
 */

{
    /**Norminal function
     * syntax: function <name>(parameter) { <expression> }
     */
    function cube(x)
    {
        return x * x * x;
    }

    console.log(cube(5));

    /**Arrow function
     * syntax: any = (parameter) => { expression };
     * - if expression does not being in {}, everything will wrap with return; instead
     */
    let cubeArrow = x => x * x * x;
    let cubArrowX = (x) => {
        console.log("calculating...");
        return x * x * x;
    }

    console.log(cubeArrow(5));
    console.log(cubArrowX(5));
}