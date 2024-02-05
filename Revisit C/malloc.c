#include<stdio.h>
#include<stdlib.h>

int main() {

    // create array in heap memory using malloc
    int *p;
    p = (int *) malloc(3 * sizeof(int)); //Equivalent to => p = new int[5];

    p[0] = 11;
    p[1] = 12;
    p[2] = 13;
    p[3] = 14;
    p[4] = 15;

    for (int i = 0; i < 5; i++) {
        printf("%d\n", p[i]);
    }
    free(p); // Deallocating heap memory after completing
}