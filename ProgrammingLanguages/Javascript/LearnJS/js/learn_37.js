/**
 * Javascript, Try Catch Throw Error handling
 * more info: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Control_flow_and_error_handling#Exeption_handling_statments
 */

{
// --- example_1 ---
    try // try doing anything
    {
        doesntExist;
    }
    catch(error) // catch any error
    {
        console.log(error);
    }
    finally // method that will Finally execute(always execute)
    {
        console.log("FINALLY!");
    }

// --- example_2 ---

    function doSomething()
    {
        throw { error: "tis broke", code: -1 }
    }

    try
    {
        doSomething();
    }
    catch(error)
    {
        console.log(error);
        console.log("Error");
    }
    finally
    {
        console.log("Wrapping things up...");
    }
}

{
    // more info: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error#Error_Types
    throw new Error(); //special constructor that create error for us
}