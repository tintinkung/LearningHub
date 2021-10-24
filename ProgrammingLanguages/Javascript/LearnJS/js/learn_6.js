/** 
 * Differents between Primitives and Objects
 */

{
    /**Primitive declaring
     * - put to primitive variable.
     */
    let myName = "Caleb";

    /**Object declaring
     * - put to new Object.
     * - 99% of thi time wont be using this (cus backend stuff).
     */
    let yourName = new String("uwu");
    let age = new Number(6);
   

    console.log(`myName: ${typeof(myName)}`); // - myName is primitive string.
    console.log(`yourName: ${typeof(yourName)}`); // - yourName is now Object.
    console.log(`age: ${typeof(myName)}`);

    console.log(`value of age: ${age.valueOf()}`); // - gets the primitive value of age

}