/**
 * Javascript, `this`
 */

{
// `this` with
    let me = {
        name: "miko",
        outputMe: function() {
            // `this` is attach to the whole object
            console.log(this);
            // `this` can be works like this
            console.log(this.name);
        }
    }
    me.outputMe();

// norminal `this`
    function outputThis() {
        console.log(this);
    }
    outputThis(); //output: global window

// `this` with strict mode
    function outputThis_Strict() {
        /**CASE SENSITIVE
         * - will change funtianality of various pieces
         * - everything after this will be strict mode
         */
        "use strict";
        console.log(this);
    }
    outputThis_Strict(); //output undefined

// `this` with function constructors
    function Person() 
    {
        console.log("Constructor initialization:\n", this);
        this.name = "Miko";
        console.log(this);
    }

    let person = new Person();
    console.log("new person: ", person);
}