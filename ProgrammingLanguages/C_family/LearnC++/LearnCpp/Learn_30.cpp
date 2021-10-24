/*
 * Cpp class inside a class example
 */

 /*\  ===== Readme =====
 |*|  --- CLASS INSIDE A CLASS ---
 |*|  - great for making class has its own class member
 |*|  - prevent prople making class thats should not exist globally.
 \*/

//#include <iostream>
//#include <string>
//
//class Car
//{
//private:
//	class Wheel
//	{
//	public:
//		// --- Valiables ---
//		int pressure;
//
//		// --- Constructors ---
//		Wheel(int pressure) { this->pressure = pressure; };
//
//		// --- Destructors ---
//		~Wheel() {};
//	};
//
//	Wheel wheel_tl;
//	Wheel wheel_tr;
//	Wheel wheel_bl;
//	Wheel wheel_br;
//public:
//	// --- Constructors ---
//	Car() : wheel_tl(1), wheel_tr(2),  wheel_br(3), wheel_bl(4) {}
//	// --- Destructors ---
//	~Car() {};
//	// --- Functions ---
//	void printWheels()
//	{
//		std::cout << "Wheels: \n"
//			<< "TOP LEFT: " << wheel_tl.pressure << "\n"
//			<< "TOP RIGHT: " << wheel_tr.pressure << "\n"
//			<< "BOTTOM LEFT: " << wheel_bl.pressure << "\n"
//			<< "BOTTOM RIGHT: " << wheel_br.pressure << "\n"
//			<< std::endl;
//	}
//};
//
//int main()
//{
//	Car car_1;
//
//	car_1.printWheels();
//
//
//	system("pause");
//	return 0;
//}