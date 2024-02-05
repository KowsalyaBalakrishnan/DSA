#include<stdio.h>

int main() {

    int a[3] = {0,1,2};
    int *p;

    p = a;
    // p = &a[0]; Either of the above will work

    printf("\n");
    for(int i = 0; i < 3; i++) {
        printf("%d\n", p[i]);
    }
    
}