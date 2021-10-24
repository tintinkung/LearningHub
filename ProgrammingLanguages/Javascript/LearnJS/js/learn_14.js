/**
 * Javascript, Playing with string #2
 */

{
    var favFood = "tacos";
    console.log(favFood.charAt(2));
    console.log(favFood.concat(" are total lit")); // add more string to favFood
    

    // --- Javascript string searching ---
    let content = "\tuwu today I am learning javascript with Caleb Curry,\n\
 he Is a very cool man I love him hehe.";

    let search_1 = "u";
    let search_2 = "javascript";

    console.log("\n --- string searching --- \n")

    console.log("first index that finds \'u\': ", content.indexOf(search_1));
    console.log("last index that finds \'u\': ",content.lastIndexOf(search_1));
    console.log("index that finds \'javascript\': ", content.indexOf(search_2));
    console.log("slice to second \'u\' char: ", content.indexOf(search_1, content.indexOf(search_1) +1));

    console.log("\n --- substring str slice --- \n");

    // substring of index to start at and end index
    console.log("substring between index 3 and 23: ", content.substring(3, 23)); 
    // substring between first and next number we want to include (dont count white space)
    console.log("substr between index 3 and 23: ", content.substr(3, 23)); 
    // slice: works similar to substring
    console.log("sliced string: ", content.slice(3, 23));

    console.log("\n --- content modifying --- \n");
    // convert all content to lower or upper case
    console.log("upper case:\n", content.toUpperCase());
    console.log("lower case:\n", content.toLowerCase());
    // trim: trim any kind of white space before and after char
    console.log("trimmed content:\n", content.trim()); //more: trimeLeft(), trimRight()
    // repeat content (args) times
    console.log("repeated 3 times:\n", content.trim().repeat(3));
    // split content by {character} 
    console.log("splitted with white space:\n", content.split(" ")); //split content by splitting white space(" ") to new index

}