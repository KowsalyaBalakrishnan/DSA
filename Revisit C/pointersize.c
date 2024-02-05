#include<stdio.h>

struct  Rectangle
{
    /* data */
    int length;
    int breadth;
};


int main() {
    printf("Pointers size\n");

    int *p1;
    char *p2;
    float *p3;
    double *p4;
    long *p5;
    struct Rectangle *p6;

    printf("p1 => %lu\n", sizeof(p1));
    printf("p2 => %lu\n", sizeof(p2));
    printf("p3 => %lu\n", sizeof(p3));
    printf("p4 => %lu\n", sizeof(p4));
    printf("p5 => %lu\n", sizeof(p5));
    printf("p6 => %lu\n", sizeof(p6));

}