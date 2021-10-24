/**
 * Javascript, `this` value modifying
 */

{
    function doStuff(input_1, input_2) 
    {
        console.log("this: ", this);
        console.log("input: ", input_1, input_2);
    }

    // `this` is refer to window object
    doStuff(5);

// === `this` modifier ===
// 1. change value RIGHT where function is invoke
    // to specify what the value of `this`  should be
    doStuff.call("hello", 5, 10); // `this` is now refer to string called "hello"

    // same as call() but takes an array of arguments
    doStuff.apply("owo", [5, 10]);

// 2. give a new function where `this` is permanantly changed
    let newFunction = doStuff.bind("qwq", 5, 10); // created new function
    newFunction();
}
