/**
 * Javascript Number and string type converting
 */

{
    var input_1 = prompt("put in number yo");
    /**ex. number "11" 
     * - can be 11 in decimal and 3 in binary 
     * - and different in other number
     */
    console.log("Decimal    : ", input_1);
    console.log("Binary     : ", Number.parseInt(input_1, 2));
    console.log("Octal      : ", Number.parseInt(input_1, 8));
    console.log("Hex        : ", Number.parseInt(input_1, 16));

    var input_2 = Number(prompt("put in DECIMAL number yo"));

    console.log(input_2 + " in decimal to decimal: " + input_2);
    console.log(input_2 + " in decimal to binary: " + input_2.toString(2));
    console.log(input_2 + " in decimal to octal: " + input_2.toString(8));
    console.log(input_2 + " in decimal to hex: " + input_2.toString(16));
}       