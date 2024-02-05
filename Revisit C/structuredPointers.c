#include<stdio.h>
#include<stdlib.h>

struct Rectangle
{
    /* Stack memory by default */
    int length;
    int breadth;
} recObj;

int main() {

    struct Rectangle *pointer;
    pointer = &recObj;

    pointer -> length = 10;
    pointer -> breadth = 20;

    printf("Length %d, Breadth %d\n", recObj.length, recObj.breadth);

    // Dynamic Memory Allocation in Heap
    struct Rectangle *dynamicPointer;
    dynamicPointer = (struct Rectangle *) malloc(sizeof(struct Rectangle));

    dynamicPointer -> length = 30;
    dynamicPointer -> breadth = 40;

    printf("STACK => Length %d, Breadth %d\n", recObj.length, recObj.breadth);
    printf("HEAP => Length %d, Breadth %d\n", dynamicPointer -> length, dynamicPointer -> breadth);

}
