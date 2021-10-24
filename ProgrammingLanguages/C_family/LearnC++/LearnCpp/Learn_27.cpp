/*
 *  Cpp class list initializing
 */

/*\  ===== Readme =====
|*|  --- class list initializing ---
|*| <code>
|*|  Dice::Dice(int value)
|*|		: value(value) //Initializer list for class const member variables and references
|*|  {
|*|
|*|  }
|*|  </code>
\*/

//#include <iostream>
//#include <string>
//#include <vector>
//#include <ctime>
//
//
//class Dice
//{
//public:
//	// --- Constructors ---
//	Dice(int value);
//
//	// --- Destructors ---
//	virtual ~Dice();
//
//	// --- Accessors ---
//	const int& getValue() const;
//
//	// --- Modifiers ---
//
//	// --- Functions ---
//	const int toss() const;
//
//private:
//	const int value;
//	
//};
//
//
//
//int main()
//{
//	srand(static_cast<unsigned int>(time(0)));
//
//	Dice standardDice(6);
//
//	int stillDicing = 1;
//
//	while (stillDicing == 1)
//	{
//		std::cout << "Dice a Dice?(1: Dice, O: Quit): ";
//		std::cin >> stillDicing;
//		for (size_t i = 0; i < 6; i++)
//		{
//			std::cout << standardDice.toss() + 1 << std::endl;
//		}
//	}
//
//	system("pause");
//	return 0;
//}
//
//#pragma region Dice Class Defenition
//Dice::Dice(int value)
//	: value(value) //Initializer list for class const member variables and references
//{
//
//}
//
//Dice::~Dice()
//{
//
//}
//
//const int& Dice::getValue() const
//{
//	return this->value;
//}
//
//const int Dice::toss() const
//{
//	return rand() & this->value + 1;
//}
//
//#pragma endregion