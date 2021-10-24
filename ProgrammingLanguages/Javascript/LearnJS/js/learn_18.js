/**
 * Javascript, Ternary operator
 */

{
    let math = prompt("1 + 1 = ?");

    let points = 0;

    /**Ternary Operator
     * - an operator to make faster variable declaration(1 line if)
     */
    // something = isThisTrue   ?     yes      :   no        ;
    points       = (math === 2) ? points += 10 : points -= 10;

    /**Equalant:
     * if(math === 2) points += 10;
     * else points -= 10;
     */

    console.log("Your points is: ", points);
}