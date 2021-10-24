# Arrays in Javascript

# Array defenitions
- box that store data by indexes
- [ data_1, data_2, data_3 ] 

# Arrays Iteration methods
* __pop()__ -> remove element from theend.
* __push()__ -> add an element (**modify whole data).
* __unshift()__ -> add element at the beginning.
* __pop()__ -> remove element from an end.
* __shift()__ -> remove element from the beginning.

* __splice(2, 3)__ -> starts at index 2 and delete 3 items.
* __splice(2, 0, 5, 6, 7, 8)__ -> add 5 6 7 8 to array start from index 2 and delete 0 data.
* __splice(2, 4, 0, 0, 0, 0)__ -> replace 4 data from index 2 by 0.

* __sort()__ -> sort a number by first index(default).
* __reverse()__ -> yea, reverse.
* __fill(-1, 0, data.length)__ -> fill -1 from index 0 and go all the way to data.lenth.

* __concat(dataB)__ -> add all element by dataB (**Not modifying data, it return new data).
* __includes(value)__ -> yes no answer is contains value.
* __indexOf(value)__ -> if value exist in the array, if yes return its index, if no return -1.
* __join(seperator)__ -> convert to string data with seperator.
* __slice(3, 5)__ -> extract section of array from [3] to [5] and return NEW array.