/**
 * Javascript, labels with breake, continue
 */

{
    let grades = [
        [16, 8, 96, 19, 65, 46, 23],
        [16, 18, 38, 17, 98, 14, 48, 64, 11, 99],
        [46, 19, 34, 47, 14]
    ]

    /**outerLoop
     * - is javascript Label
     * - can label anything and define it anywhere
     */
    outerLoop: for(let i = 0; i < grades.length; i++)
    {
        for(let k = 0; k < grades[i].length; k++)
        {
            console.log(grades[i][k]);
            if(grades[i][k] === 64)
            {
                console.log("value 64 founded");
                /**Go to next iteration of "outerLoop" imediately
                 * - it skip everything after this is called
                 */
                continue outerLoop; //[1] this code triggered "outerLoop" label
                // IF:
                // break outerLoop; //[2] this code will jump OUT of "outrtLoop" label
                // ENDIF
            }
        }
        /**[1] this code will be ignored from "continue outerLoop;"
         * BUT, this will NOT be ignored with break;
         */
        console.log("~~~~~~~ENDROW~~~~~~~"); 
    }
    //[2]The break outerLoop; will break out to this line.
}