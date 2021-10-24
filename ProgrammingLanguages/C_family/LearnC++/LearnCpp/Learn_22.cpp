/*
 *  Cpp vaiable scope
 */



 /*\  ==== README ====
 |*|  --- variable scop --
 |*|  - area that let stuff in, but not let stuff out.
 \*/
//#include <iostream>
//#include <string>
//
// --- Global Scope ---
//int GlobalInt = 1;
//
//void CheckInt();
//
//int main()
//{
//	// Origin Global Int
//	std::cout << "Origin Global Int: " << &GlobalInt << "\tpoint: " << GlobalInt << "\n" << std::endl; 
//	//----------------------------\\
//
//
//	GlobalInt = 20; //can access global int form inside
//
//	if (GlobalInt == 20)
//	{
//		GlobalInt = 30;
//	}
//	//GlobalInt address will be from the origin one.
//	std::cout << "Global Int: " << &GlobalInt /* will be local ID */<< "\tpoint: " << GlobalInt << std::endl;
//
//	// --- local scope ---
//	int GlobalInt = 240;//main() now have new local GLobalInt variable
//	if (GlobalInt == 240) //from here main() will now choose the LOCAL one, not GLOBAL.
//	{
//		GlobalInt = 350;
//	}
//
//	//GlobalInt address will now be GlobalInt from main() not the actual Global One
//	std::cout << "Local Int: " << &GlobalInt << "\tpoint: " << GlobalInt << std::endl;
//
//
//	// this function still use GlobalInt from global scope, so it didnt use the local one.
//	CheckInt();
//
//	system("pause");
//	return 0;
//}
//
//void CheckInt()
//{
//	GlobalInt = 69; //Can be access
//	std::cout << "Function Int: " << &GlobalInt << "\tpoint: " << GlobalInt << std::endl;
//}