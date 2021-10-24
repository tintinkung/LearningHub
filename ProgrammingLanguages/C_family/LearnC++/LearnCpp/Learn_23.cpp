/*
 *  Cpp array printing review
 */

 /*\  ==== README ====
 |*| --- array printing review
 |*| - reviewing us of array for function parameter.
 |*| - can be used by asking pointer of an array.
 \*/
//#include <iostream>
//#include <vector>
//
//void PrintArray(const int& size, int* array); 
//void ReplaceArray(const int& size, int* array, const int& value);
//void PrintVector(const std::vector<int>& vector);
//
//int main()
//{
//	#pragma region array example
//
//	const int arraySize = 10;
//	int array[arraySize];
//
//	std::cout << "Array Data:" << std::endl;
//	ReplaceArray(arraySize, array, 200);
//	PrintArray(arraySize, array);
//	#pragma endregion
//
//	std::cout << std::endl;
//
//	#pragma region vector example
//
//	std::vector<int> myVector;
//	const int vectorSize = 15;
//
//	for (size_t i = 0; i < vectorSize; i++) myVector.push_back(i);
//	
//
//	std::cout << "Vector Data:" << std::endl;
//	ReplaceArray(vectorSize, myVector.data(), 250);
//	PrintVector(myVector);
//	#pragma endregion
//
//	system("pause");
//	return 0;
//}
//
//
//void ReplaceArray(const int& size, int* array, const int& value)
//{
//	for (size_t i = 0; i < size; i++)
//	{
//		array[i] = value;
//	}
//}
//
//// every array must be pointer(`int* array`) or use const `int array[]`
//// ***EVERY array is a POINTER to the element. thats why we can use pointer int for array parameter.
//void PrintArray(const int& size, int* array)
//{
//	for (size_t i = 0; i < size; i++)
//	{
//		std::cout << "index [" << i << "]: " << array[i] << std::endl;
//	}
//}
//
//// vector is easier for parameter, because we can track its size by vector.size()
//void PrintVector(const std::vector<int>& vector)
//{
//	for (size_t i = 0; i < vector.size(); i++)
//	{
//		std::cout << "index [" << i << "]: " << vector[i] << std::endl;
//	}
//}