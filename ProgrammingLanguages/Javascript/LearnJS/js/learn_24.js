/**
 * Javascript, foreach loops w/ array
 */

{
//#region Simple Array with foreach Loop
    let grades = [12, 13, 34, 54, 24, 35, 43];
    grades.length = 30; // add empty index for example purpose

    console.log("=== Method 1 ===");
    for(let i = 0; i < grades.length; i++)
    {
        if(grades[i] !== undefined) // this is how to prevent printing undefine
            console.log(grades[i] + " [" + i + "]");
    }

    console.log("=== Method 2 ===");
    // built in foreach method for array, it loop through elements in array.
    grades.forEach( 
        (element, i) => { //Call back functions
            console.log(element + " [" + i + "]");
        }
    );
//#endregion

//#region Multi dimentional array w/ foreach
console.log("=== Multi dimentional array ===");

    console.log("- Nested for loop Method ")
    let gradeList = [
        [15, 92, 29, 34, 14, 61, 64],
        [65, 29, 14, 35, 18, 14, 17, 18, 26, 17],
        [56, 72, 34, 65, 28]
    ];

    for(let i = 0; i < gradeList.length; i++)
    {
        for(let k = 0; k < gradeList[i].length; k++)
        {
            console.log(gradeList[i][k]);
        }
        console.log("~~~~ ENDROW ~~~~")
    }

    console.log("- foreach Method");
    gradeList.forEach(
        (row) =>
        {
            row.forEach(
                (column) =>
                {
                    console.log(column);
                }
            )
            console.log("~~~~ ENDROW ~~~~");
        }
    );

//#endregion
}