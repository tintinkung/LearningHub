/**
 * Javascript, nested loop
 */

{
    /**
     *  -> going to log 0 - 9 every iteration of outer loop
     *0 1
     *0 2
     *0 3
     *  - 0 is i
     *  - 1, 2, 3 is k
     */
    log("started loop_1");
    for(let i = 0; i <= 3; i++)
    {
        for(let k = 0; k <= 3; k++)
        {
            log(i + " " + k);
        }
    }
    log("loop_1 ended");

    // --- playing in html ---
    let d = document.getElementById("destination");
    for(let i = 0; i < 10; i++)
    {
        for(let k = i; k >= 0; k--)
        {
            d.append(k + " ");
        }
        var br = document.createElement("br"); // create a break (endline)
        d.appendChild(br);
    }
}

// ignore this
function log(message) { console.log(message); }