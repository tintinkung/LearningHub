/*
 *	Cpp basic function #3 - function defenition.
 */



/*\  === README ===
|*|  --- FUNCTION PROTOTYPING ---
|*|  - to protype a function before defenition 
|*|  - Best practice for writing function bcuz we can keep our int main() on the top of file.
|*|  - MUST declare defenition function somewhere else it'll be blank function.
\*/

//#include <iostream>
//
//// Function PROTOTYPE - function header with no body
//void MyFunction_1(); // PROTOTYPE
//void MyFunction_2();
//float MyDivisionFunction(float a, float b);
//
//int main()
//{
//	MyFunction_1();
//	MyFunction_2();
//
//	#pragma region Basic division function	
//	float a, b;
//	std::cout << "Type a number to divide: ";
//	std::cin >> a >> b;
//	std::cout << MyDivisionFunction(a, b) << std::endl;
//	#pragma endregion
//
//	system("pause");
//	return 0;
//}
//
//
//// Function Defenition
//void MyFunction_1() // DEFENITION
//{
//	std::cout << "Hello World w/ MyFunction_1" << std::endl;
//} 
//void MyFunction_2() // DEFENITION
//{
//	std::cout << "Hello World w/ MyFunction_2" << std::endl;
//}
//float MyDivisionFunction(float a, float b)
//{
//	if (b == 0)
//	{
//		std::cout << "DIVIDE BY 0! ILLEGAL OPERATION!" << std::endl;
//		return 0.0f; //EXITS FUNCTION
//	}
//	return a / b;
//}