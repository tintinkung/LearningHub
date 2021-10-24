/**
 *  Javascript Scope and variable (var, let, const)
 */

( // IIFE - IMMEDIATELY invoked function expression 

    function()
    {
        /**
         *  this age will STAY in the function scope 
         *  this is why vscode will grayed out this variable since theres no where used it.
         */
        var age_1 = 5;

        /** 
         *  this age will go up 1 scope and define it there
         *  since it have no variable to define it, it'll define to window
         */
        age_2 = 5;
    }
)
();

{ // block level
    // will limit y to only IN this block
    let y = 10;
    const x = 20;

    {
        let y = 6;
        console.log(y, x); // will log local y(nearest scope block)
    }
    console.log(y);

    /** NOTE:
     *  var will NOT restricted to block
     *  so z will still be declare globally in window object
     */
    var z = 100;

}