/**
 * Javascript, Loops example
 */

{ // stupid Guessing game with do-while loop and for loop debug

    let password;
    let correctPassword = "let me in";

    do // Ask for password as long as user havent guessed the right one.
    {
        password = prompt("What is the password?: ");
        
        passwordTrigger(password, correctPassword);
        for(let i = 0; i < password.length; i++)
        {
            console.log(`your password character [${i}]: ${password[i]}`)
        }   
        
    }
    while(password !== correctPassword); // right password is hardcoded to "let me in".
}

function passwordTrigger(password, correctPassword) 
{ 
    if(password === correctPassword) console.log("--- YOU PASSED ---");
    else console.log("Incorrect Password");
}