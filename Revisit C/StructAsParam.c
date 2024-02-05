#include<stdio.h>

struct Rectangle
{
    /* data */
    int length;
    int breadth;
};

int calculateAreaByValue(struct Rectangle r) {
    return r.length * r.breadth;
}

int calculateAreaByAddress(struct Rectangle *pointer) {
    return (*pointer).length * pointer -> breadth;
}

void changeStructureLength(struct Rectangle *pointer, int newLength) {
    pointer -> length = newLength;
}

int main() {
    struct Rectangle r;
    r.length = 10;
    r.breadth = 15;
    int area = calculateAreaByValue(r);
    printf("Area of the Rectangle => %d\n", area);

    int areaByAddr = calculateAreaByAddress(&r);
    printf("Area of the Rectangle => %d\n", areaByAddr);

    changeStructureLength(&r, 25);
    printf("Area of the Rectangle with newLength => %d\n", r.length * r.breadth);
}
