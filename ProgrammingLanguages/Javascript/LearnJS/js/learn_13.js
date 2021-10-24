/**
 * Javascript, playing with String #1
 */

{
    /**Playing with strings casting and more
     * see example below and see all use cases
     */
    let myName = "Caleb";

    // -- array indexes grabbing by String ---
    console.log(myName[2]); // 'l' character
    console.log(myName[450]); // 'undefined'

    let yourName = new String("Clarie\tMuhammad\n\\cool guy");

    console.log("Your name is " + yourName + "!!!");
    console.log(`Your name is ${yourName}!!!`);

    let text = "lol i love my doggo haha idk what\
 am i doing here hmmm e uwu.\
 bruh this is so long\
 what is this"

    console.log(text);
    console.log("lenght of the text above: ", text.length);
}