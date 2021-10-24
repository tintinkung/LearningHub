/**
 * Javascript. arrow function VS norminal function
 */

{
    let arrow = () => this;
    function norminal() { return this; }

    let functions = {
        arrow: arrow,
        norminal: norminal
    };

    // norminal function will change its `this` object refer to its current object.
    console.log("arrow function:\n", functions.norminal());
    // arrow function will NOT change its `this` object, it'll stays where the `this` object is created.
    console.log("norminal function:\n", functions.arrow());
}