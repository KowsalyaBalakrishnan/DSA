#include<stdio.h>

int main() {

    int size;
    printf("Enter the Size of the Array => ");
    scanf("%d", &size);
    printf("Size of the input array => %d\n", size);

    int arr[size];
    printf("Enter the %d elements to print\n", size);
    for(int i = 0; i < size; i++) {
        int element;
        scanf("%d", &element);
        arr[i] = element;
    }

    printf("Printing elements \n");
    for(int i = 0; i < size; i++) {
        printf("%d\n", arr[i]);
    }
    printf("Completed\n");

    return 0;
}