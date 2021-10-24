/*
 * Cpp vector Example
 */

//#include <iostream>
//#include <string>
//#include <vector>
//#include <list>
//
//
//int main()
//{	
//	#pragma region IntArray Example
//	//vector that can only holds integer
//	std::vector<int> myIntVector;
//
//	//PUSH something to the BACK of vector
//	myIntVector.push_back(22);
//	myIntVector.push_back(2);
//	myIntVector.push_back(265);
//	myIntVector.push_back(54);
//
//	int integerToRemove = 2;
//	bool erased = false; // havent found the element
//
//	for(size_t i = 0; i < myIntVector.size() && !erased; i++)
//	{
//		if(myIntVector[i] == integerToRemove)
//		{
//			myIntVector.erase(myIntVector.begin() + i);
//			std::cout << integerToRemove << " has been erased!" << std::endl;
//			erased = true;
//		}
//	}
//	for (size_t i = 0; i < myIntVector.size(); i++)
//	{
//		std::cout << myIntVector[i] << " ";
//	}
//	if (!erased)
//		std::cout << integerToRemove << " was not found in myIntVector" << std::endl;
//
//	#pragma endregion
//
//	std::cout << std::endl;
//
//	#pragma region StrArray Example
//	//vector that can only holds string
//	std::vector<std::string> myStringVector;
//
//	//PUSH something to the BACK of vector
//	myStringVector.push_back("Bob");
//	myStringVector.push_back("Daniel");
//	myStringVector.push_back("Sukrit");
//	myStringVector.push_back("Toon");
//
//
//	//Remove Something ad position 2 from BEGINNING (0 is first element)
//	myStringVector.erase(myStringVector.begin() + 1);
//
//	// myStringVector.clear();
//
//	std::cout << std::endl;
//
//	for (size_t i = 0; i < myStringVector.size(); i++)
//	{
//		std::cout << myStringVector[i] << " ";
//	}
//
//	std::cout << std::endl;
//
//	#pragma endregion
//
//	std::cout << std::endl;
//	std::cout << "Size of my int vector: " << myIntVector.size() << std::endl;
//	std::cout << "Size of my int vector: " << myStringVector.size() << std::endl;
//
//	system("pause");
//	return 0;
//}