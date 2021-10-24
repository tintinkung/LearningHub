/*
 * Cpp basic function #2
 */

//#include <iostream>
//#include <string>

 /*\ MUST REMEMBER: 
 |*| FUNCTION REFERENCE PARAMETERS
 |*| PASS BY VALUE
 |*| PASS BY REFERENCE
 \*/
//void ChangeNameOf_value(std::string nameToChange, std::string name) // PASS BY VALUE
//{
//	/*
//	 *	Function will change the name variable\
//	 *  name -> will be COPY of any variable.
//	 */
//	nameToChange = name;
//}									 
//void ChangeNameOf_ref(std::string &nameToChange, std::string name) // PASS BY REFERENCE
//{
//	/*
//	 *	Function will change the "name" variable (BY REFERENCE).
//	 *  &name -> Will be alias: copy of DATA ADDRESS of variable.
//	 */
//	nameToChange = name;
//}
//
//void IncrementEXP(int& exp, int level)
//{
//	exp += 20 + level * 2 - 3;
//}
//
//int main()
//{
//	#pragma region Player Default Data
//	std::string characterName = "anomymous";
//	int level = 1;
//	int exp = 0;
//	#pragma endregion
//
//	ChangeNameOf_value(characterName, "Daniel"); //this wont change anything
//
//	#pragma region Assign Player Data
//	/* * * * * *
//	 * will JUMP OUT to computer memory 
//	 * and find where "CharacterName" ADDRESS is, then change it.
//	 * * * * * */
//	ChangeNameOf_ref(characterName, "Daniel");  //will change the CharacterName from its origin.
//	IncrementEXP(exp, level);
//	std::cout 
//		<< "Player: " << characterName << std::endl
//		<< "EXP: " << exp << std::endl 
//		<< "Level: " << level << std::endl;
//	#pragma endregion
//
//	system("pause");
//	return 0;
//}