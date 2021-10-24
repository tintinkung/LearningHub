/**
 * Javascript, break; continue;
 */

{
    let myString = "Search this E string boi"
    let charToSearch = "E";

    let skipChar = " ";

    console.log("scanning string...")
    for(let i = 0; i < myString.length; i++)
    {
        // [c]**continue will break to here

        if(myString[i] === charToSearch)
        {
            // catch a needed-to-search char
            console.log(myString[i] + " is found at index [" + i + "]")
            break; // [b]*break; OUT of whatever loop we currently
        }

        if(myString[i] === skipChar)
        {
            /**[c]*continue; will continue the current loop BUT break out of close-est loop
             *  - print the scan character by index
             * - continue; out of console log IF white space founded
             */
            continue; 
        }
        console.log("myString [" + i + "]: " + myString[i])
    }

    // [b]**will break to this line
}