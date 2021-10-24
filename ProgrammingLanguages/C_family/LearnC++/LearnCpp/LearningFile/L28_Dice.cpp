#include "L28_Dice.hpp"

int Dice::ID = 0; // define static
int Dice::getPrivateID()
{
	return Dice::ID;
}

Dice::Dice(const int value, const std::string color)
	: value(value)
{
	this->color = color;
	Dice::ID++; //++ ID product it make dice unique id each object
}

Dice::~Dice()
{

}

const int Dice::toss() const
{
	return rand() % this->value + 1;
}