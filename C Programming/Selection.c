#include <stdio.h>

int main() {
    char arr[] = {'z', 'd', 'a', 'f', 'c', 'b'};
    int n = sizeof(arr) / sizeof(arr[0]);

    // Selection Sort
    for (int i = 0; i < n - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        char temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }

    printf("Sorted Array: ");
    for (int i = 0; i < n; i++) {
        printf("%c ", arr[i]);
    }
    printf("\n");

    return 0;
}
