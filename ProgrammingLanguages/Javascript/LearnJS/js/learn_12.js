/**
 * Javascript Method and Instancing Method
 */

{
    /**Javascript Instance Method
     * extension metho of javascript instance object
     */

    console.log(Number(5.6).toString()); // convert x to string
    console.log(Number(5215).toExponential(5)); // get the exponential number 
    console.log(Number(5.6365).toFixed(2)); // fixed digits of decemal number
    console.log(Number(1000000).toLocaleString()); // print number on region manner
    
    let x = new Number(55659521);
    console.log(x.valueOf());
    console.log(typeof(x.valueOf()));
    console.log(typeof(x));

}

{
    /**Javascript Math Object
     * Math.Method();
     */

    // Absolute: get absolute number(positive)
    var abs = Math.abs(-36); // 36
    // Ceiling: round to ceiling
    var goUp = Math.cell(.0000001); // 1
    // Floor: round to floor
    var goDown = Math.floor(.9999999); // 0
    // Power: raise {first args} to {second args} 
    var powerUp = Math.pow(3, 2); // 9
    // Round: round up or down, up to value of the decimals
    var roundUp = Math.round(4.9); // 5
    var roundDown = Math.round(5.1); // 5
    // Sign: sign of number.
    var isPositive = Math.sign(-Infinity); // -1(false)
    // Truncate: chops all the decimals
    var getInt = Math.trunc(4.999999); // 4
}