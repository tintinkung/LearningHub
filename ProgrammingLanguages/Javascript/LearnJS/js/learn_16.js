/**
 * Javascript If Else statements
 */

{
    var age = prompt("whats your age");
    var name = prompt("Whats your name");

    /**Operators
     * 
     * == Equal - compare value
     * === StrictEqual - compare dataType AND value
     * != NotEqual
     * >= GreaterThanEqual
     * <= LessThenEqual
     * >  GreaterThan
     * <  LessThan
     * 
     * && AND
     * || OR
     * !  NOT
     * 
     */


    // if age less than 13 OR greater than equal 65
    if(age < 13 || age >= 65)
    {
        console.log("Welcome!");
    }

    if(name != "Caleb")
    {
        console.log("Welcome!!!!")
    }
    else
    {
        console.log("smh i hate you Caleb");
    }

    if(name === "Claire") console.log("HI Claire");
}


// Generalization