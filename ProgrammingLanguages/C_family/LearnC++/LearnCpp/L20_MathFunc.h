// IF USING VISUAL_STUDIO
// #pragma once 
// ENDIF


#ifndef L20_MATHFUNCTION_H
#define L20_MATHFUNCTION_H

// ORIGIN FUNCTION
int add(int a, int b) { return a + b; }

// OVERLOADING FUNCTION - same function, more optional option.
int add(int a, int b, int c) { return a + b + c; }
float add(float a, float b) { return a + b; }
float add(float a, float b, float c) { return a + b + c; }
double add(double a, double b) { return a + b; }
double add(double a, double b, double c) { return a + b + c; }



int substract(int a, int b) { return a - b; }

int multiply(int a, int b) { return a * b; }

#endif // !L20_MATHSUNCTION_H