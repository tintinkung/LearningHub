/**
 * Javascript Arithmetic Operators, Precedence, Associativity
 */

{
    /**Arithmetic Operators

     +  plus operator
     -  minus operator
     *  multiplication operator
     /  divition operator
     %  modulas operator - get left over of divition operator

    */

    var precedence_1 = 5 + 3 * 12 - 20 / 10; //pure 
    var precedence_2 = 5 + (3 * 12) - (20 / 10); //how it actually ivaluated

    // will output the same value
    console.log(precedence_1);
    console.log(precedence_2);
}