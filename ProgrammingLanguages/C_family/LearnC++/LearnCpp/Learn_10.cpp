/*
 * Cpp basic file output
 */


/*\ --- OUTPUT TO FILE ---
|*| IF FILE DOES NOT EXIST WITH A CERTAIN NAME, IT WILL BE CREATED.
|*| TEXT OT BINARY SAVING(FASTER)
|*| FILE-TYPE DOES NOT REALLY MATTER, IT WILL BE NEXT ANYWAY.
|*| FLAGS - IDK
|*|
|*| ***BECAREFUL WITH OPENING FILE AND SAVING STUFF.
|*| ***BECAREFUL WITH WHILE LOOP THAT CAUSE INFINITE LOOP.
|*| *TIP: USE FOR LOOP THAN WHILE LOOP.
\*/
//#include <fstream> //File Stream (to be able to print out stuff anf output to file)
//
//#include <iostream>
//#include <string>
//
//int main()
//{
//	// Daniel data
//	std::string name = "Daniel";
//	int age = 23;
//	std::string address ="SomeStreet 23 356795 SomeCountry";
//	double height = 1.75;
//	std::string catName = "Bob";
//
//
//
//	std::string data = "This is data \nHello This is from a new line 2";
//	std::string fileName = "LearningFile/learnFile_l10_dtbs.txt";
//	int i = 23; 
//
//
//	std::ofstream outFile;
//	outFile.open(fileName.c_str()); //Open the file from file name
//		
//
//	if (outFile.is_open())
//	{
//		std::cout << "I AM OPENED!!!" << std::endl;
//
//		//Assign data to database file.
//		outFile << name << std::endl
//			<< age << std::endl
//			<< address << std::endl
//			<< height << std::endl
//			<< catName << std::endl;
//	}
//
//	outFile.close(); //!IMORTANT: Must close the file !DO NOT FORGET
//
//	system("pause");
//	return 0;
//}