/**
 * Javascript, Playing w/ Object's Prototype pt.1
 */

{   
    //#region === SET UP ===
    let user = {
        active: true,
        sayHello: function() 
        {   //will search for this.name level by level, if doesnt has return undefined
            return this.name + " says hi";
        }
    };

    let teacher = {
        name: "Mike vasalski",
        teaching: ["math", "art"],
        sayHello: function() 
        {
            let message = this.name + " teaches ";
            this.teaching.forEach(function(e) {
                message += e + " ";
            });

            return message;
        }
    };

    let student = {
        name: "Miko Neko",
        major:  "Japanese"
    }
    //#endregion

//#region --- Constructors calling ---

    // setting prototype of teacher to be user
    Object.setPrototypeOf(teacher, user);
    Object.setPrototypeOf(student, user);

    // teacher is now inherite from user
    console.log("teacher alive: ", teacher.active);  // output: true;
    
    teacher.active = false; // modifying will look on teacher object's prototype
    console.log("teacher alive: ", teacher.active, teacher.sayHello()); 
    console.log("student alive: ", student.active, student.sayHello());// wont change student's active

    console.log("Teacher", teacher);
    console.log("Student:", student);
//#endregion

//#region  having each object do each version of their object 
// --- this is called 'Polymorphism' ---
    let newMembers = [teacher, student];

    newMembers.forEach(function(e) {
        console.log(e.sayHello());
    });
//#endregion

//#region --- checking property in object ---

    //--- checking name in property using `in` keyword
    /**- look in teacher object, 
     * - check to see if it has property called "name", 
     * - then return
     * (else return undefined)
     */
    console.log("Name in teacher? ", "name" in teacher);
    console.log("Name in teacher?", teacher.name !== undefined);

    /**.hasOwnProperty()
     * - check property inside object
     * - wont check the prototype
     */
    console.log("Name in student?", teacher.hasOwnProperty("name"));
    console.log("student active?", student.hasOwnProperty("active")); // return false because active = true; is inside prototype
//#endregion

//#region --- pushing property to an array ---
    let studentProperties = [];

    for(let prop in student)
    {
        //ignore prototype list from props(in this case we ignored "active" prototype)
        if(student.hasOwnProperty(prop))
        {
            studentProperties.push(prop);
        }
    }
    console.log("student properties:", studentProperties);
//#endregion

}