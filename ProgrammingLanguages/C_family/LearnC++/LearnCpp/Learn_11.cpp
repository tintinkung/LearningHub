/*
 * Cpp file Input-Output and file data Reading Example
 *
 */

//#include <iostream>
//#include <fstream>
//#include <string>
//
//int main()
//{
//	const char* fileName01 = "LearningFile/learnFile_l11.txt";
//	const char* fileName02 = "LearningFIle/LearnFile_l11_dtbs.txt";
//
//	#pragma region ExampleFile01 - data
//	std::string line = "unassigned";
//	char c = ' ';
//	int arOfAs = 0;
//	#pragma endregion
//
//	#pragma region DatabaseFile - data
//	std::string name = "";
//	int age = 0;
//	std::string bloodType = "";
//	std::string street = "";
//	std::string catName = "";
//	double height = 0.0;
//	#pragma endregion
//
//	#pragma region Word Getting Example File
//	// ifstream : IN FILE STREAM
//	std::ifstream inFile(fileName01); // OPEN file
//
//	if (inFile.is_open())
//	{
//		/* // GET WORD AT A TIME ---
//		 * // get something to line //WILL NOT WORK CAUSE CIN SILL STUCK ON WHITE SPACE.
//		 * inFile >> line; inFile >> c; 
//		 * std::cout << line << std::endl; 
//		 */
//
//		/*  // --- GET LINE BY STRING ---
//		 *	// while theres line to GET, KEEP getting line 
//		 *	while (std::getline(inFile, line))
//		 *	{
//		 *		std::cout << line << std::endl;
//		 *	}
//		 */
//		
//		/*	/// --- GET CHARACTER IN ALL LINE ---
//		 *	while (inFile.get(c))
//		 *	{
//		 *		std::cout << c;
//		 *	}
//		 */
//
//		/* /// -- GET CHARACTER BY CHARACTER
//		 *	while (inFile.get(c))
//		 *	{
//		 *		if (c == 'a' || c == 'A')
//		 *		{
//		 *			arOfAs++;
//		 *		}
//		 *
//		 *		std::cout << arOfAs << std::endl;
//		 *	}
//		 */
//
//
//		while (inFile.get(c))
//		{
//
//		}
//
//		std::cout << "Learn File01 is open!!" << std::endl; 
//	}
//	else
//	{
//		std::cout << "COULD NOT OPEN FILE: " << fileName01 << std::endl;
//	}
//
//	inFile.close(); // CLOSE file
//	#pragma endregion
//
//#pragma region --- DIVIDING LINE ---
//	std::cout << "\n===============================\n" << std::endl;
//#pragma endregion
//
//	#pragma region Database Example File
//	std::ifstream inFile_dtbs(fileName02);
//
//	if (inFile_dtbs.is_open())
//	{
//		std::cout << "Database File is open!!\n" << std::endl;
//
//		while (!inFile_dtbs.eof()) // eof : End Of File, while infile is NOT at the end of the file
//		{
//			#pragma region Read Line from Database file
//			std::getline(inFile_dtbs, name);
//
//			inFile_dtbs >> age;
//			inFile_dtbs.ignore(); //dodge cin to new line
//
//			std::getline(inFile_dtbs, bloodType);
//			std::getline(inFile_dtbs, street);
//			std::getline(inFile_dtbs, catName);
//
//			inFile_dtbs >> height;
//			inFile_dtbs.ignore();
//			#pragma endregion
//
//			std::cout //Output Read Data
//				<< name << std::endl
//				<< age << std::endl
//				<< bloodType << std::endl
//				<< street << std::endl
//				<< catName << std::endl
//				<< height << std::endl;
//		}
//	}
//	else
//	{
//		std::cout << "COULD NOT OPEN FILE: " << fileName02 << std::endl;
//	}
//
//	inFile_dtbs.close();
//	#pragma endregion
//	
//	system("pause");
//	return 0;
//}
