/*
 *   Cpp static 
 */

 /*\  ===== Readme =====
 |*|  --- Static ---
 |*|  - unique type of variable
 |*|  - will make the variable declared static only be define once
 |*|  - see usage below
 |*|  -*see Dice.hpp & Dice.cpp for used in different file.
 \*/
 
//#include <iostream>
//#include <string>
// 
//
//class Person
//{
//private:
//	std::string name;
//	int age;
//	int _id; // save the private id
//
//	// --- Static variable ---
//	/** static int ID
//	 *  - this variable WILL NOT CHANGE, and be specific to the WHOLE class object.
//	 *  - and this ID will be the same, no matter what Person object it has.
//	 */
//	static int ID; 
//
//public:
//	// --- Constructors ---
//	Person(std::string name, int age);
//
//	// --- Destructors ---
//	~Person() {};
//
//	// --- Static Functions ---
//	int getID()
//	{
//		return this->_id;
//	}
//	static int getPrivateID()
//	{
//		return Person::ID;
//	}
//
//};
//Person::Person(std::string name = "EMPTY", int age = -1)
//{
//	Person::ID++;
//	this->_id = Person::ID;
//	this->name = name;
//	this->age = age;
//}
//
//// --- Initialize static variables for the class
//int Person::ID = 0;
//
////test
//static void print();
//static void print(char c);
//
//int main()
//{
//
//	for (size_t i = 0; i < 10; i++)
//	{
//		/** static
//		 *  - make variable only be define once
//		 *  - so each loop, it use the first "number" in define
//		 *  - else it we arent using static, it'll define new int variable every loop.
//		 */
//		static int number = 10; 
//
//		number++;
//
//		std::cout << number << std::endl;
//	}
//	
//	print();
//	print('u');
//
//	// --- Person class ---
//	std::cout << std::endl;
//
//	Person person_1;
//	std::cout << "PersonID: " << person_1.getID() << std::endl;
//
//	Person person_2;
//	std::cout << "PersonID: " << person_1.getID() << std::endl;
//
//	Person person_3;
//	std::cout << "PersonID: " << person_1.getID() << std::endl;
//
//	std::cout << "ClassID: " << Person::getPrivateID() << std::endl;
//	std::cout << "AddressID: " << Person::getPrivateID << std::endl; //why does it return address id, idk
//	
//	system("pause");
//	return 0;
//}
//
//static void print()
//{
//	std::cout << "Hello world!" << std::endl;
//}
//
//static void print(char c)
//{
//	std::cout << "Hello world! " << c << std::endl;
//}