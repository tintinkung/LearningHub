/**
 * We can get specific element of html from childNodes.
 * From example below. we are accessing website frontend's childNodes bu indexes. 
 * ex. childNodes index 17 is our <div> tag which show ordered list
 * 
 * more info: https://developer.mozilla.org/en-US/docs/Web/API/Node/nodeType#Node_Type_constants
 */
{/* Getting HTML DOM element by indexes id */
    var divList = document.childNodes[1].childNodes[2].childNodes[17];
    
    //list is now <div> element from index.html
    console.log(divList);
    // grab a node's parent
    console.log(divList.parentElement);
    // slicing to nex siblings
    console.log(divList.nextSibling.nextSibling);
}

{/* Getting HTML DOM element */
    // getting All of the list items
    var listTags = document.getElementsByTagName("li");
    console.log("<li> tags:", listTags); // output: HTML collection of all <li> tag

    var classes = document.getElementsByClassName("food");
    console.log("food class:", classes)
}

{/* Checking element Node type */
    // Checking for [0] element of tag <li> (in this case: "Miko")
    var list = document.getElementsByTagName("li");

    // Checking nodeType of this element
    if(list[0].childNodes[0].nodeType === 1)
    {   // nodeType 0 is an element
        console.log("the type is element");
    }
    else if(list[0].childNodes[0].nodeType === 3)
    {   // nodeType 3 is Text
        console.log("the type is text");
    }
    console.log("value:", list[0].childNodes[0]);
    console.log("Type:", list[0].childNodes[0].nodeType);
    console.log("Name:", list[0].childNodes[0].nodeName); //things also has nodeNames
}

{/* Get and Modifying html tag by element childNodes */
    let spans = document.getElementsByTagName("span");
    console.log(spans); // will get span tag with #uwu id
    // we can get data out of the tag
    console.log("value: "
        + spans[0].childNodes[0].data // this is <span> tag index [0]
        + spans[0].childNodes[1].innerText // we have <strong> tag in index [1]
        + spans[0].childNodes[2].data // and html seperate mor tag to <span> index [2]
    ); 

// ==== Modifying ====
    //we can change its nodeValue by goin to all childNodes.
    spans[0].childNodes[1].childNodes[0].nodeValue = "3D";
    console.log("changed to:", spans[0].childNodes[1]);

    console.log("value: " // value will be edited by the code above.
        + spans[0].childNodes[0].data 
        + spans[0].childNodes[1].innerText 
        + spans[0].childNodes[2].data 
    ); 
}

{/* Event listener with elementNodes */
    let orderList = document.getElementsByTagName("ol");
    console.log(orderList);

    let ourList = orderList[0];
    console.log(ourList);

    // we can get the listener from the element and play with it
    ourList.onmouseover = function() {
        console.log("mouse on miko!");
        ourList.childNodes[3].childNodes[0].nodeValue = "Miko sees you owo";
    }
    ourList.onmouseleave = function() {
        ourList.childNodes[3].childNodes[0].nodeValue = "Miko";
    }
}

{/* Accessing Attributes with elementNodes */

    /**HTML atribute dont acts the same  way as simple element
     * - childeNodes of attribute is empty
     * - it has specific Node called "attributes" that store all value
     */

    // this is how to access a attribute value (index.html l38)
    document.getElementById("input").value = "hamburger"; //changes from 'stuff' to value
    // getting attributes
    console.log(document.getElementById("input").attributes);
    // getting attributes values
    console.log("tacos is", document.getElementById("input").getAttribute("tacos"));

}

{/* Creating new Node from elements */

    //get button by id (index.html l43 )
    let button = document.getElementById("clickme");

    button.onclick = function() {
        // create new node element when button is clicked
        node = document.createElement("li");
        console.log(node);

        // create a text bu our input (index.html l38)
        node.appendChild(document.createTextNode(
            document.getElementById("input").value
        ));

        // adding new list to "foodList" (index.html l45)
        let list = document.getElementById("foodList");
        list.appendChild(node);
    }
}