/*
 *  Cpp deep copy vs shallow copy
 */

 /*\  ===== Readme =====
 |*|  -- copy constructors --
 |*|  - this must understand alot when playing with pointers
 |*|  - if referenciiing it wrong, will get memory leaks.
 |*|  - *i knows nothing with this topic i tried understand but cant ;-;
 \*/
 
#include <iostream>
#include <string>
#include <vector>
 
//int main()
//{
//    /** --- basic shallow copy (with no pointers) ---
//     *  - mostly wont create any memory leak and safe.
//     */
//
//    int num_1 = 10;
//    int num_2 = 20;
//
//    num_1 = num_2; //basically shallow copy
//    std::cout << "Basic shallow copy: " << num_1 << std::endl;
//
//#pragma region Playing with pointers
//    // ====== POINTERS =======
//    /** int* intptr = &num_1;
//     *  -ex. num_1 has address of x213,
//     *       - then intptr now holds address of x213.
//     *  - then if we print it, it'll go to address and print it.
//     */
//    // int* intptr = &num_1; 
//    int* intptr_1 = new int(30);
//    int* intptr_2 = new int(50);
//
//    // --- Shallow Copy ---
//    /* int*intptr_1 = new int(50); 
//     * --- THIS CREATE MEMORY LEAK! ---
//     */
//
//    // --- Deep Copy ---
//    *intptr_1 = *intptr_2; // this is SAFE!. 
//
//
//    std::cout  << "Deep Copy with pointers: " << intptr_1 << std::endl;
// 
//    // -- remember we've CREATED new memory by pointer ---
//    // -- do we need to delete every thing at the end of program ---
//    delete intptr_2;
//    delete intptr_1;
//#pragma endregion
//
// 	system("pause");
// 	return 0;
//}