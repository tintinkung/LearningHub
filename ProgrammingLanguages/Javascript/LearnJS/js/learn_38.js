/**
 * Javascript, Class(well technically)
 */

// NOTE: class in javascript is functions but we do more special thing init
{// 1. creating class (simple function)
    function User(name, interests)
    {
        this.name = name;
        this.interests = interests;
    }

    // creat new object from class constructor(funstion)
    let me = new User("Miko", ["uwu", "owo"]);
    let you = new User("Caleb", ["pizza", "cheeze"]);

    console.log("I'm ", me);
    console.log("You are ", you);
}

{// 2. creating class (factory function)
    function newUser(name ,interests)
    {
        let person = {
            name: name,
            interests: interests
        };
        return person;
    }

    // create new object from a whole function
    let me = newUser("Miko", ["uwu", "owo"]);
    let you = newUser("Caleb", ["pizza", "cheeze"]);
    console.log("I'm ", me);
    console.log("You are ", you);
}

{// 3. creating class (prototype function)
    function User(name, interests)
    {
        this.name = name;
        this.interests = interests;
        this.toString = function() {
            console.log("name: " + this.name + "\ninterests: " + this.interests);
        }
    }

// creating prototype function for classes
    User.prototype.greeting = function() {
        console.log("Hi! my name is " + this.name + " I likes " + this.interests);
    }

    // creat new object from class constructor(funstion)
    let me = new User("Miko", ["uwu", "owo"]);
    let you = new User("Caleb", ["pizza", "cheeze"]);

    me.toString(); //using class's function.
    me.greeting(); //using prototyped function.
    you.toString();
    you.greeting();
}