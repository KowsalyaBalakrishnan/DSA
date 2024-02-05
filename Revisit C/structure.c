#include<stdio.h>

struct Rectangle {
    int length;
    int breadth;
    char author; //takes 4 bytes but when allocates it takes 1 byte => called as padding and later discards last 3 bytes - easy to read structure - internal compiler
} rect[1];  // Declartion with Definition

//Global 
//struct Rectangle rect;

int main() {
    printf("Coding Structure...\n");
    
    // Local Declaration
    //struct Rectangle rect;
    rect[0].length = 10;
    rect[0].breadth = 25;

    /*rect[1].length = 10;
    rect[1].breadth = 35;*/

    for(int i = 0; i < 2; i++) {
        printf("Area of the Rectangle => %d\n\n", rect[i].length * rect[i].breadth);
    }

    printf("Size of the Structure Rectangle => %lu\n", sizeof(rect));
}