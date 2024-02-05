#include<stdio.h>
#include<stdlib.h>

int * allocateHeapMemory(int n) {
    int *pointer;
    pointer = (int *)malloc (n * sizeof(int));
    return pointer;
}

void print(int array[], int size) {
    for(int i = 0; i < size; i++) {
        printf("Number %d is residing at %d\n", array[i], &array[i]);

    }
}

int main() {

    int *arr;
    arr = allocateHeapMemory(5);
    printf("Starting address of arr => %d\n", arr);

    int a[5] = {11,12,13,14,15};
    print(a, 5);

}

