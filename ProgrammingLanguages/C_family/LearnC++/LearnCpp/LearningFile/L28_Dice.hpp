// --- preprocessor director ---
#ifndef L28_DICE_HPP //if not define
#define L28_DICE_HPP //define this keyword

#include <string>

class Dice
{
private:
	const int value;
	std::string color;


	// --- static variables ---
	static int ID;

public:
	// --- Constructors ---
	Dice(const int value = 6, const std::string color = "Black");

	// --- Destructors ---
	~Dice();

	// --- Accessors ---
	inline const int& getValue() const { return this->value; };
	inline const std::string& getColor() const { return this->color; };

	// --- Modifiers ---
	void setColor(const std::string color) { this->color = color;  }

	// --- Functions ---
	const int toss() const;

	static int getPrivateID();
};

#endif // !L28_DICE_HPP