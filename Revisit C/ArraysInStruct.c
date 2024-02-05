#include<stdio.h>

struct Test {
    int n;
    int arr[5];
};

void modifyArrayInStructure(struct Test *t) {
    t -> arr[0] = 11;
}

void display(struct Test t) {
    for(int i=0; i < 3; i++) {
        printf("%d\n", t.arr[i]);
    }
}

int main() {
    struct Test t;
    t.n = 3;
    t.arr[0] = 10;
    t.arr[1] = 20;
    t.arr[2] = 30;

    modifyArrayInStructure(&t);
    display(t);
}
