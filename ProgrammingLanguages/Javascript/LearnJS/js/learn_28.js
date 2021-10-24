/**
 * Javascript function
 */

{/**Function in Javascript
  * - is a code block that input parameter and return output out.
  * - function in javascript can do anything like it is object.
  * @param {*} x - is first parameter
  * @param {*} y - is second parameter
  * @returns power of x by y
  */let power = function pow(x, y)
    {
        let total = 1;
        for(let i = 0; i < y; i++)
        {
            total *= x;
        }
        return total;
    }
    console.log(power(2, 3)); //function can now be declare anywhere
}

{/**Possibilities with functions
  * - function in javascipt is "first class citizens objects".
  * - function can basically do everything like objects does.
  * - see example below:
  */
    function pow(x, y)
    {
        let total = 1;
        for(let i = 0; i < y; i++)
        {
            total *= x;
        }
        return total;
    }

// 1. you can assign a function to a variable!
    let uwu = function log(message) { 
        return message; 
    }
    console.log("owo " + uwu("uwu"));

// 2. function can be added in array too!
    let coolFunctions = [pow];
    console.log(coolFunctions[0](3, 3));

// 3. function can be added to objects too!
    let mathFunctions = {
        power: pow
    };
    console.log(mathFunctions.power(3, 3));

// 4. we can ADD new object to a function too!
    pow.description = "Will raise number to a power"
    console.log(pow.description);

// 5. we can also make a function that return a callback to a function parameter too!
    function callBackExample(callback)
    {
        return callback(3, 5);
    }
    console.log(callBackExample(pow));

// 6. we can also return a function from function too!
    function returnAFunction()
    {
        return pow;
    }
    console.log(returnAFunction()(10, 3));
}