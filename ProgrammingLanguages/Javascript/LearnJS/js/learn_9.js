/**
 * Javascript special operator
 */

{
    /*Special operators
    
     += | x = x + y
     -= | x = x - y
     -- | x = + - 1
     ++ | x = x + 1

     */
    let sliceOfPizzas = 10;

    // sliceOfPizzas = sliceOfPizzas + 1;
    sliceOfPizzas += 1;
    sliceOfPizzas++;

    // sliceOfPizzas = sliceOfPizzas - 1;
    sliceOfPizzas -= 1;
    sliceOfPizzas--;

    console.log("old Pizza: ", sliceOfPizzas);

    //update newPizza && also assign sliceOfPizza + 1
    let newPizza = ++sliceOfPizzas; 
    console.log("slice Of Pizzas: ", sliceOfPizzas);
    console.log("new Pizza: ", newPizza);

}