/**
 * Javascript, `this` value modifying w/ arrow function
 */

{
// --- arrow function ---
    let arrow = () => this;

    console.log(arrow()); // output: Window object
    // change th value of `this` from bind() method
    let newFunction = arrow.bind("hello"); 
    
    //BUT: yes, you can't change value of `this` from the arrow function.
    console.log(newFunction()); // output: Window object

// --- norminal function ---
    function norminal() { return this; }
    //yes, you can only modify value of `this` in norminal function
    console.log(norminal.bind("this")()); // output: String {'this'}
}
