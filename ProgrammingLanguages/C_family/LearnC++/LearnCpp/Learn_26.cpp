/*
 * Cpp class defenitions
 */

/*\  ==== Readme ====
|*|	 --- Class  functiobs defining ---
|*|  - Create MyClass class
|*|  - We now only define accessors and functions without its defenition
|*|  - to define things outside MyClass, we says:
|*|  - MyClass::MyClass();
|*|       + by MyClass : is the origin class
|*|       + MyClass()  : is ANY functions to says "this is belongs to MyClass"
|*|  - then we can define anything like:  MyClass::add();  MyClass::MyFunction();
\*/

//#include <iostream>
//#include <string>
//#include <vector>
//
//class MyClass
//{
//private:
//	std::vector<std::string> myStrings;
//
//public:
//	MyClass();
//	// --- Accessors ---
//	const std::vector<std::string>& getMyStrings() const;
//
//	// --- Modifiers ---
//	
//	// --- Functions ---
//	void add(const std::string str);
//	const std::string toString() const;
//};
//
//
//
//int main()
//{
//	MyClass obj;
//
//	obj.add("uwu");
//	obj.add("Hi im daniel!");
//	obj.add("hehe idk what to type here");
//
//	std::cout << obj.toString() << std::endl;
//
//	system("pause");
//	return 0;
//}
//
//#pragma region MyClass Function Defenitions
//// MyClass(Origin)::(belongs to)MyClass(COnstructor)
//MyClass::MyClass()
//{
//	this->myStrings.push_back("Hi I am index 1!");
//
//}
//
//const std::vector<std::string>& MyClass::getMyStrings() const
//{
//	return this->myStrings;
//}
//
//void MyClass::add(const std::string str)
//{
//	this->myStrings.push_back(str);
//}
//
//const  std::string MyClass::toString() const
//{
//	std::string end = "";
//	for (size_t i = 0; i < this->myStrings.size(); i++)
//	{
//		end += std::to_string(i) + ": " + this->myStrings[i] + "\n";
//	}
//	return end;
//}
//#pragma endregion