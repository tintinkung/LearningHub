/**
 * Javascript, Playing w/ Object's Prototype pt.2
 */

 {
    function User() 
    {
        this.active = false;
    }
    
    function Student(name, major)
    {
        this.name = name;
        this.major = major;
    }

    //SET prototype of Student to their user object.
    // - User() is now inherith to both student and teacher.
    Student.prototype = new User();
    Teacher.prototype = new User();

    function Teacher(name, teaching)
    {
        this.name = name;
        this.teaching = teaching;
    }

    let student = new Student("Best student", "Japanese");
    let teacher = new Teacher("Caleb Curry", ["javascript", "python"]);

    // sayHello() is not 1 layer up closer to Teacher object
    Teacher.prototype.sayHello = function() {
        return this.name + " says hi";
    };
    console.log(teacher.sayHello());
    console.log(student, teacher);

// === Instance checking for prototype ===

    //Is teacher instance of Teacher class.
    console.log(teacher instanceof Teacher); // true
    console.log(teacher instanceof User); // true

    if(teacher instanceof Student) console.log("yep");
    else console.log("nope");

    function doSomething(user)
    {
        if(user instanceof User)
        {
            return 5;
        }
        return -1;
    }

    console.log(doSomething(teacher)); // 5 (do be instance of)
    console.log(doSomething("invalid")); // -1 (not instance of)


}