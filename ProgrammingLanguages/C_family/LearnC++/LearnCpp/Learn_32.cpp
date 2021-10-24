/*
 *  Cpp loop performance improve(faster)
 */

 /*\  ===== Readme =====
 |*|  - Optimization loops
 |*|  - 3 Methods
 |*|     + normal method: basic for loop
 |*|     + for loop with auto variable
 |*|     + iterator range loop
 \*/
 
//#include <iostream>
//#include <string>
//#include <ctime>
//#include <vector>
// 
//int main()
//{
//     // ==== Initialize ====
//     std::vector<int> intArray(100000, 1);
//     int sum = 0;
//
//// ==== Optimization loops ====
//     int start_t = clock();
//
//#pragma region Method 1: normal
//     // ==== Normal loops (avg: 0.0035ms)
//     for (size_t i = 0; i < intArray.size(); i++)
//     {
//         sum += intArray[i];
//     }
//#pragma endregion
//
//#pragma region Method 2: foreach loop
//     // ==== C++11 foreach loop ==== (avg 0.001ms, MUCH faster)
//     for (auto &i : intArray) //auto is a way from c++ to create variable with AUTOMATIC type.
//     {
//         sum += i;
//     }
//#pragma endregion
//
//#pragma region Method 2: Iterator range loop
//     // ==== Iterator range loop ==== (avg 0.0135ms)
//     const std::vector <int>::const_iterator end = cend(intArray); //Iterator chaching
//     for (std::vector <int>::const_iterator it = cbegin(intArray); it != end; ++it)
//     {
//         sum += *it;
//     }
//#pragma endregion 
//
//
//     int end_t = clock();
//
//     std::cout << "Time: " << (end_t - start_t) / double(CLOCKS_PER_SEC) << std::endl;
//     std::cout << "Sum: " << std::endl;
// 
// 	system("pause");
// 	return 0;
//}