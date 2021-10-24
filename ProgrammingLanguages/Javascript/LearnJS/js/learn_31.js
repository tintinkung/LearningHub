/**
 * Javascript function default parameter, implict parameter
 */

{//Function with default value example
    function pow(x, y = 2/*Set default value of y to 2*/, ...extra)
    {
        if(extra[0] !== undefined) console.log("detected useless parameter: ", extra);
        let total = 1;
        for(let i = 0; i < y; i++)
        {
            total *= x;
        }
        return total;
    }

    console.log(pow(3)); // we already set the defaulr value of y so it wont get error.
    console.log(pow(4, 2, 6, 5, 4)); // function in js have no overload, anything thats not needed become useless

}

{/**function with infinite parameter example
  * @param {*} x - initialize parameter
  * @param  {...any} extra - any extra parameter
  * @returns largest parameter
  */
    function largest(x, ...extra)
    {
        let largest = x;
        for(let i = 0; i < extra.length; i++)
        {
            if(extra[i] > largest)
            {
                largest = extra[i]
            }
        }
        return largest;
    }

    console.log(largest(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
}