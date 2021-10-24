/**
 * Javascript, Loops
 */


{
    /**Loops in javascrips
     * 
     * --- type of loops ---
     * - While Loop => for infinite loop (while true)
     * - Do-While Loop => for guarantee to execute code atleast once.
     * - For Loop => most useful.
     * 
     * --- loop main pieces
     * 1. Initialization
     * 2. Conditions
     * 3. Updates
     * 
     */

    {   // ==== While Loop ====
        console.log("==== While Loop ====\n");

        let i = 0; // 1. Initialization

        while(i < 10) // 2. Conditions
        {
            // 3. Updates
            i++; 
            console.log("index: ", i);
        }
    }

    {   // ==== Do-While Loop ====
        console.log("==== Do-While Loop ====\n");

        let i = 0; // 1. Initialization

        do // 3. Updates
        { 
            // ***Will always execute ATLEAST once.
            console.log("index: ", i);
            i++;
        } 
        while(i < 10); // 2. Conditions
    }

    {   // ==== For Loop ====
        console.log("==== For Loop ====\n");

        // 1.2.3. Initialization && Conditions && Updates
        for(let i = 0; i < 10; i++)
        {
            // Code updates
            console.log("index: ", i);
        }
    }
}