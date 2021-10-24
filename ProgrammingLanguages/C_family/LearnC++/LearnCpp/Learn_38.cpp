/*
 *
 */

#include <iostream>

int main()
{
	int W, L; //cm
	int Y; //cm
	int ROOM_1_TILES, ROOM_2_TILES;


	std::cout << "Input W(meter): "; std::cin >> W;
	std::cout << "Input L(meter): "; std::cin >> L;
	W += 100;
	L += 100;
	Y = 0;

	int ROOM_1 = W * L;
	float ROOM_2 = 0.5f * (L + Y) * W;

	int tile = 225; //15 * 15 cm

	if ((ROOM_1 % tile) != 0) ROOM_1_TILES = (ROOM_1 / tile) + 1;
	else ROOM_1_TILES = (ROOM_1 / tile);


	if ((static_cast<int>(ROOM_2) % tile) != 0) ROOM_2_TILES = (ROOM_2 / tile) + 1;
	else ROOM_2_TILES = (ROOM_2 / tile);

	std::cout << "Room 1's area: " << ROOM_1 << " cm^2\n"
		<< "Room 2's area(atleast): " << ROOM_2 << " cm^2\n"
		<< "Room 1's tile: " << ROOM_1_TILES << " pieces\n"
		<< "Room 2's tile(atleast): " << ROOM_2_TILES << " pieces\n"
		<< "All tiles(must have): " << ROOM_1_TILES + ROOM_2_TILES << " pieces" << std::endl;


	system("pause");
	return EXIT_SUCCESS;
}