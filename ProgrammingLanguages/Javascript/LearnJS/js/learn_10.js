/**
 * Javascript Number parsing
 */

{
    let x = 5;
    let y = "10";

    // convert x to String then plus
    console.log("string addition: ", x + y);

    // parsing y to Int
    let yInt = Number.parseInt(y);
    console.log("parsed number addition: ", x + yInt);

    // parseInt will only get Int
    yInt = Number.parseInt("10.6584"); // will CUT out at the decemal point
    console.log("bad parseInt: ", x + yInt);
    
    // float parsing
    yFloat = Number.parseFloat("10.265454651546");
    console.log("parsed float: ", yFloat);

}