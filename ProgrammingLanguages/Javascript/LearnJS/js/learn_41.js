/**
 * Javascript, how prototyping works.
 */


/* {MUST READ}
 * when creating function, javascript will generate constructors for function 
 * which points to the actual function
 * owo -> object.constructors -> owo
 * 
 * - Basically javascript will TRANSFER prototype of function to each object that created.
 */
/**Window inspect console:
 * when typing owo.prototype in window dev console with get this.
 * <code>
 *  > owo.prototype *[1]
 *    \/{constructor: f}
 *      \/ constructor: f owo()
 *        \/ {expression}
 *          \/ owo.prototype  *[2]
 *            ...will keep repeat this forever...
 * </code>
 */

function owo() {
    return 1 + 1;
}

let test = new owo();
if(owo.prototype === Object.getPrototypeOf(test));
{   // new javascript object will get the same prototype as the actual funtion
    console.log("match");
}

function tacos()
{
    this.toppings = ["cheese"];
}

tacos.prototype.make = function()
{
    console.log("Making tacos...");
}

let myTacos = new tacos();
let newTacos = new tacos();


