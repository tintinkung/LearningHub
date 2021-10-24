/*
 *  Cpp Pointers and array for classes
 */

 /*\  ===== Readme =====
 |*|  --- pointers for class object ---
 |*|  - see example program, i've no idea ow it works bruh
 |*|
 \*/
 
//#include <iostream>
//#include <string>
//#include <sstream> //able to push stream to string
//#include <ctime>
//
//class Person
//{
//private:
//	std::string name;
//	int age;
//
//public:
//	// --- Constructors ---
//	Person(std::string name, int age);
//
//	// --- Destructors ---
//	~Person() {};
//
//	// --- Functions ---
//	const std::string toString() const
//	{
//		// cout but instead of going to console, we push it to string object as .str()
//		std::stringstream ss;
//
//		ss  << "Name: " << this->name << "\n"
//			<< "Age: " << this->age << "\n";
//
//		return ss.str();
//	}
//};
//
//Person::Person(std::string name = "EMPTY", int age = -1)
//{
//	this->name = name;
//	this->age = age;
//}
//
// int main()
// {
//	 // -------------------------------------------- \\
//	
//	 srand(time(NULL));
// 
//	 Person Me("Tintin", 15);
//	 Person Friend("Daniel", 24);
//
//	 Person* seat = nullptr;
//
//	 if(rand() % 2 > 0)
//	 {   //assign me to seat if random case is true
//		 seat = &Me; 
//	 }
//	 else
//	 {   //else assign my friend
//		 seat = &Friend;
//	 }
//
//	 std::cout << seat->toString();
//
//	 std::cout << std::endl;
//	 // -------------------------------------------- \\
//
//	 Person* newPerson = new Person("Dude", 50);
//
//	 std::cout << newPerson->toString();
//
//	 delete newPerson;
//
//	 std::cout << std::endl;
//	 // --------------------------------------------- \\
//
//	 const int arraySize = 5;
//	 Person **personArray = new Person*[arraySize];
//
//
//	 for (size_t i = 0; i < arraySize; i++)
//	 {
//		 personArray[i] = new Person("SomeDude", i);
//		 std::cout << personArray[i]->toString();
//	 }
//
//	 // --- array deletions ---
//	 for (size_t i = 0; i < arraySize; i++)
//	 {
//		 // 1st: delete all the created object in pointers.
//		 delete personArray[i];
//	 }
//	 // 2nd: then we delete the actual array.
//	 delete[] personArray;
// 
//
//
// 	system("pause");
// 	return 0;
// }