#include <stdio.h>
#include <stdlib.h>

int main () {

    int *p;
    p =(int *) malloc(5 * sizeof(int));

    p[0] = 11;
    p[1] = 12;
    p[2] = 13;
    p[3] = 14;
    p[4] = 15;

    for(int i = 0; i < 5; i++) {
        printf("%d ", p[i]);
    }

    // Create a new array - copy data from p to q - deallocate p's address and make p point to q - deallocate q
    int *q = (int *) malloc(10 * sizeof(int));

    for(int i = 0; i < 5; i++) {
        q[i] = p[i];
    }

    free(p);

    p = q;

    printf("\nPrinting *q values\n");
    for(int i = 0; i < 10; i++) {
        printf("%d ", q[i]);
    }

    printf("\nPrinting *p values\n");
    for(int i = 0; i < 10; i++) {
        printf("%d ", p[i]);
    }

    q = NULL;
    free(q);

    printf("\n\n\n");
    return 0;
}