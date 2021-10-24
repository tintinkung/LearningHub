/**
 * C++ RNG with #include <random>
 */
#include <iostream>
#include <random>
#include <string>


//typedef std::mt19937 MyRNG;  // the Mersenne Twister with a popular choice of parameters
//uint32_t seed_val;           // populate somehow
//
//MyRNG rng;                   // e.g. keep one global instance (per thread)
//
//void initialize()
//{
//	rng.seed(seed_val);
//}
//
//int main()
//{
//	bool rollNumber;
//	int tempInt = 1;
//
//
//	std::uniform_int_distribution<uint32_t> uint_dist;         // by default range [0, MAX]
//	std::uniform_int_distribution<uint32_t> uint_dist10(1, 10); // range [0,10]
//
//	std::uniform_real_distribution<double> uwu(0.10, 10.60);
//	// std::normal_distribution<double> normal_dist(mean, stddeviation);  // N(mean, stddeviation)
//
//	rollNumber = tempInt ? 1 : 0;
//
//
//	while (rollNumber)
//	{
//		std::cout << "random the number ? (0 = false, 1 = true): ";
//		std::cin >> tempInt;
//		rollNumber = tempInt ? 1 : 0;
//
//
//		std::cout 
//			<< "Rng by default range: " << uint_dist(rng) << "\n"
//			<< "Rng by custom range: " << uint_dist10(rng) << "\n"
//			<< "Rng by double range: " << uwu(rng) << "\n"
//			<< std::endl;
//
//	}
//	system("pause");
//	return EXIT_SUCCESS;
//}
