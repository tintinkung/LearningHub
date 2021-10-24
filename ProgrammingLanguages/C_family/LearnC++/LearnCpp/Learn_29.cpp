/*
 *  Cpp Input validations
 */

 /*\  ===== Readme =====
 |*|  --- function input validations ---
 |*|  - when using template <typename T>
 |*|      + we can make function have flexible parameter.
 |*|      + ex. function that needs int para. can have string para. too
 \*/

//#include <iostream>
//#include <string>
//#include <iomanip> //input output manipulation, helps set the width of << stream
//
//template <typename T>
//void getChoice(T& choice);
//
//int main()
//{
//	int choice = -1;
//
//	getChoice(choice);
//
//
//	while(choice > 0)
//	{
//		switch (choice)
//		{
//			case 1:
//				std::cout << "Option One: " << std::endl;
//				break;
//			case 2:
//				std::cout << "Option Two" << std::endl;
//				break;
//			case 3:
//				std::cout << "Option Three: " << std::endl; 
//				break;
//			case 4:
//				std::cout << "Option Four: " << std::endl; 
//				break;
//
//			default:
//				std::cout << "Option is Valid" << std::endl;
//				break;
//		}
//
//		getChoice(choice);
//	}
//
//	std::cout << "Quitting..." << std::endl;
//
//	system("pause");
//	return 0;
//}
//
//template <typename T>
//void getChoice(T& choice)
//{
//	// T choice = 0;
//
//	std::cout << " - Enter Choice: ";
//	/** std::setw(int num)
//	 * - parts of <iomainip>
//	 * - it sets width of stream of input
//	 * - in this case, we only want 1 int for input, so we set it to 1
//	 */
//	std::cin >> std::setw(1) >> choice;
//
//	//Error check
//	while (!std::cin.good())
//	{
//		// --- Report Problems
//		std::cout << "ERROR: Faluty input! Please try again..." << std::endl;
//
//		// --- Clear Stream ---
//		//clear \n character in the stream that ruin our next getline() command.
//		std::cin.clear();
//
//		//ask HOW many character to ignore(remove as many as we can for INT_MAX)
//		std::cin.ignore(INT_MAX, '\n');
//
//		// --- Get Input again ---
//		std::cout << " - Enter Choice: ";
//		std::cin >> std::setw(1) >> choice;
//	}
//
//	// --- Final Clear Stream ---
//	std::cin.clear();
//	std::cin.ignore(INT_MAX, '\n');
//}