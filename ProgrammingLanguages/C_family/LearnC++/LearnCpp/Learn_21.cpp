/*
 * Cpp basic function #5 - function optimizing
 */


/*\  ==== README ====
|*|	--- Function Optimizing ---
|*| - Use value references to safe resource getting Input address.
|*| - make const value in one-use funcion.
|*| - get better performance.
\*/

//#include <iostream>
//
///*  create const integer refence that copy over address 
// *  that WONT be change from outside.
// */
//void change(int& valueToChange, const int& value)
//{
//	/* Get a variable as a reference 
//	 * and replace its value with another value.
//	 */
//	valueToChange = value;
//}
//
///*
// *  We do have to use it anywhere outside this function, 
// *  so we safe resource by using thr input's reference
// */
//const float& median(const int&  a, const int& b, const int& c)
//{
//	return (a + b + c) / 3.0f;
//}
//
//int main()
//{
//	int a, b, c;
//	
//	std::cout << "Enter Three Integers(a, b, c): ";
//	std::cin >> a >> b >> c;
//
//	std::cout << "Changed a value to c: ";	change(a, c); //change a to 30 by a reference.
//	std::cout << "a is now: " << a << std::endl;
//	std::cout << "Calculated value of median(a, b, c): ";
//	std::cout << median(a, b, c) << std::endl;
//
//
//	system("pause");
//	return 0;
//}