/*
 *  Cpp Unary and Binary operator overloading
 */

 /*\  ===== Readme =====
 |*|  - a class modifier that difine operator's overloading
 |*|  - see https://www.tutorialspoint.com/cplusplus/unary_operators_overloading.htm
 \*/
 
 #include <iostream>
 #include <string>
 #include <vector>
 
class Card
{
private:
	std::string name;
	int value;

public:
	// --- Constructors ---
	Card(int value, std::string name);

	// --- Destructors ---
	~Card();

	// --- Accessors ---
	inline const int& getValue() const { return this->value;  }
	inline const std::string& getName() const { return this->name; }
	
	// --- Modifiers ---
	const Card operator-();
	const Card operator+(const Card& card);
};



//int main()
//{
//	Card card_1(5, "Jotaro");
//	Card card_2(-card_1);
//
//	Card card_3 = (card_1 + card_2);
//	std::cout << "Card 3: " << std::endl;
//	std::cout << "Value: " << card_3.getValue() << std::endl
//		<< "CardName: " << card_3.getName() << std::endl;
// 
// 
// 	system("pause");
// 	return 0;
//}

#pragma region Card Defenitions
Card::Card(int value, std::string name)
{
	this->value = value;
	this->name = name;
}
Card::~Card() {}
const Card Card::operator-()
{ 
	Card temp(-this->value, this->name + "-");
	return temp; 
}
// operator '-' that return a whole card object but negative value
const Card Card::operator+(const Card& card)
{ 
	Card temp(this->value + card.value, this->name + " + " + card.name);
	return temp; 
}
#pragma endregion