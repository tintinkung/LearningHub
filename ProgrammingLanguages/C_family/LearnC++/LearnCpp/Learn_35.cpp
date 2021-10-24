/*
 *  Cpp dynamic memory organizing
 */

 /*\  ===== Readme =====
 |*|  --- fuck i knows nothing at this ---
 |*|
 |*|
 |*|
 |*|
 |*|
 \*/
 
#include <iostream>
#include <string>
#include <vector>
#include <cstdlib>
#include <sstream> 

class Car
{
private:
	std::string name;
	int *horsePower;

public:
	// --- Constructors ---
	Car(std::string name, int horsePower);
	Car(const Car& obj); // Copy constructor

	// --- Destructors ---
	~Car();
	// --- Operators ---
	void operator = (const Car& obj);

	// --- Accessors ---

	// --- Modifiers ---

	// --- Functions ---
	const std::string& getName() const;
	const int& getHorsePower() const;
};


std::string getCarStringData(Car car);
void tab() { std::cout << std::endl; }

//int main()
//{
//	Car car_1("Audi A4", 2000);
//	Car car_2("Auguei BG3", 50000);
//
//	Car car_3(car_1); // Copy constructors
//	Car car_4 = car_2; // Assignment operator
//
//	car_4 = car_2;
//
//	tab();
//	std::cout << getCarStringData(car_1) << std::endl;
//	tab();
//	std::cout << getCarStringData(car_2) << std::endl;
//	tab();
//	std::cout << getCarStringData(car_3) << std::endl;
//	tab();
//	std::cout << getCarStringData(car_4) << std::endl;
//	tab();
//
//
// 
//	system("pause");
//	return 0;
//}

#pragma region Car Class Defenitions
Car::Car(std::string name, int horsePower)
{
	this->name = name;
	this->horsePower = new int(horsePower);
}
Car::Car(const Car& obj)
{
	if (this != &obj) //could use this here aswell
	{
		this->name = obj.name;
		this->horsePower = new int(*obj.horsePower);

		std::cout << "Copy constructor used!" << std::endl;
	}
}
Car::~Car()
{
	delete this->horsePower;
}
void Car::operator = (const Car& obj)
{
	if (this != &obj) //check so it wont be on the SAME memory location (not the same obj)
	{
		// --- Clearn old data ---
		delete this->horsePower;

		// --- Copy over data ---
		this->name = obj.name; this->horsePower = new int(*obj.horsePower);

		this->horsePower = new int(*obj.horsePower); // Deep copy, safe!
		/** this->horsePower = obj.horsePower;
		 *  -> WRONG! shallow copy!
		 */
		std::cout << "Overloaded addignment operator used!" << std::endl;
	}
}

const std::string& Car::getName() const
{
	return this->name;
}
const int& Car::getHorsePower() const
{
	return *this->horsePower;
}
#pragma endregion

std::string getCarStringData(Car car)
{
	std::stringstream ss;

	ss << "Car Name: " << car.getName() << std::endl
		<< "Horse Power: " << car.getHorsePower();

	return ss.str();
}