/*
 * Cpp Array and 2d Array example.
 */

//#include <iostream>
//#include <string>
//#include <fstream>
//#include <array>
//
//int main()
//{
//	const int arraySize = 5;
//
//	// --- 2D ARRAY ---
//	// [56 ][213][][][]
//	// [767][  3][][][]
//	// [879][ 23][][][]
//	// [89 ][ 34][][][]
//	// [80 ][ 45][][][]
//	   
//	int my2DArray[arraySize][arraySize]; //2D array
//
//	for (size_t i = 0; i < arraySize; i++)
//	{
//		for (size_t k = 0; k < arraySize; k++) //NESTED FOR LOOP
//		{
//			my2DArray[i][k] = 0;
//		}
//		
//	}
//
//	my2DArray[0][0] = 10;
//	my2DArray[0][4] = 10;
//	my2DArray[4][0] = 10;
//	my2DArray[4][4] = 10;
//
//	for (size_t i = 0; i < arraySize; i++)
//	{
//		for (size_t k = 0; k < arraySize; k++) //NESTED FOR LOOP
//		{
//			std::cout << my2DArray[i][k] << " ";
//		}
//		std::cout << std::endl;
//	}
//
//
//	system("pause");
//	return 0;
//}