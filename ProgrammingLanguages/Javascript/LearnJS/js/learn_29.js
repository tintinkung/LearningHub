/**
 * Javascript, Hoisting
 */

{/**Hoisting
  * - Hoisting is where our code gets scan before it compile
  * 1. it scans for all variable and give it 'undefined' 
  * 2. it scans again but now if it found any variable, it assign its declared value to it
  * **the scane happens line BY line.
  * **this is why the code below will log 'undefined' 
  * more info: https://blog.bitsrc.io/hoisting-in-modern-javascript-let-const-and-var-b290405adfda
  */
    //[1]scans_1 - function call wont happen in this scan
    //[2]scans_2 - oh we found x undefined! log 'undefined' to the console
    console.log(x);
    //[1]scans_1 - give 'x' a 'undefined' value
    //[2]scans_2 - give 'x' a value of 10
    var x = 10;

// --- function decoration ---
    //[1]scans_1 - function call wont happen in this scan
    //[2]scans_2 - function is defined in scans_1, call the function!
    doStuff();

    //[1]scans_1 - define the function and its name
    //[2]scans_2 - nothing to do in this scan
    function doStuff()
    {
        console.log("uwu");
    }

// --- function expression ---
// - works like normal variable
// - cannot be assign BEFORE it initialize

 /**ERROR: doSomething is not a function.
  * <code>
  * doSomething();
  *
  * var doSomething = function() {
  *     console.log("owo");
  * }
  * </code>
  */
}