#include<stdio.h>

int main() {
    int a = 10;
    int *p;
    p = &a;

    printf("Printing a = %d\n", a);
    printf("Address of a => %d , %d\n", p, &a);
    printf("Values at the pointer address => %d\n", *p);

}