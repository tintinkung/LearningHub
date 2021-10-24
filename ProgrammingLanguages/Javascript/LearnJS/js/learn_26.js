/**
 * Javascript, Date()
 */

{   /**Date() - basically a date class
     * 
     * Date(years, month)
     * **month is zero base(december is 11) 
     * **will gets weird output if put invalid parameter
     */
   let myDate = new Date();

   console.log(myDate);
   console.log(Date.now()); // return huge milliseconds from unix "Epoch"

}

// ===== Date() Examples =====

{/**Playing with Date.now() - time calculating
  * - Date.now() will return milliseconds of right now time.
  * - can be calculate on how long iteration is taking the time.
  * - see use case below.
  */
    let start = Date.now();

    let x = 0;
    for(let i = 0; i < 100000000; i++)
    {
        x = x + i;
    }

    let end = Date.now();
    let total = end - start;
    console.log("Iterated over 1000000 number.\ntime took: " + total);
    console.log("Iteration result: " + x);
}

{/**Calculate days passed with Date()
  * - see use case below.
  */
    let before = new Date(2021, 10, 15);
    let after = new Date(2021, 10, 20);

    let oneDay = 1000 * 60 * 60 * 24; // 1 day = 1000 milliseconds * 60 secs * 60 mins * 24 hours
    let day = (after - before) / oneDay; // convert milliseconds to day

    console.log(`before: ${before},\nafter: ${after}.\nDay passed: ${day}`);

}

