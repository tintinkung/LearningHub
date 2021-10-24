/*
 * Cpp basic array Examples
 */

//#include <iostream>
//#include <string>
//#include <array>
//
//int main()
//{
//	/*
//	 * MUST use CONST for array size, because :
//	 * Computer is NOT expecting variable that can change later in array size.
//	 */
//	#pragma region Int Array Example
//	const int arraySize = 10;
//	int myArray[arraySize] = { 0 }; // UN-INITIALIZE ARRAY
//	myArray[0] = 21;
//	myArray[1] = 21;
//	myArray[2] = 21;
//	myArray[3] = 21;
//	myArray[4] = 21;
//	myArray[5] = 21;
//	myArray[6] = 21;
//	myArray[7] = 23;
//	myArray[8] = 23;
//	myArray[9] = 23;
//
//	for(size_t i = 0; i < arraySize; i++)
//	{
//		std::cout << i << ": " << myArray[i] << std::endl;
//	}
//	#pragma endregion
//
//#pragma region --- DIVIDING LINE ---
//	std::cout << "\n===============================\n" << std::endl;
//#pragma endregion
//
//	#pragma region String Array Example
//	const int stringArraySize = 3;
//	std::string myStringArray[stringArraySize] = { "NONE" };
//
//	for (size_t i = 0; i < stringArraySize; i++)
//	{
//		std::cout << "Enter " << i + 1 << "st Person Name: ";
//		std::getline(std::cin, myStringArray[i]);
//	}
//
//	for (size_t i = 0; i < stringArraySize; i++)
//	{
//		std::cout << i + 1 << ": " << myStringArray[i] << std::endl;
//	}
//
//	#pragma endregion
//
//
//	system("pause");
//	return 0;
//}