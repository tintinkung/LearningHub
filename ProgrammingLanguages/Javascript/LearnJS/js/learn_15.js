/**
 * Javascript Function and object
 */

{
    let position = {
        x: 10,
        y: 20,
        print: function() {
            console.log(`X: ${this.x}, Y: ${this.y}`);
        },
        myObject: {sweetProperty: "Hello Friends"} //nested object

    }

    let myPosition = position;
    console.log(position);
    console.log(myPosition);

    myPosition.x = 15; //both changed to 15
    console.log(myPosition);
    console.log(position);
    
    position.print();


    function print()
    {
        "use strict";
        console.log("Hello World");
    }
    print();
    position.myObject.sweetProperty;
}