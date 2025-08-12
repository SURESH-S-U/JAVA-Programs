#include <stdio.h>

int main() {
    char arr[] = {'m', 'e', 'k', 'a', 'h', 'b'};
    int n = sizeof(arr) / sizeof(arr[0]);

    for (int i = 1; i < n; i++) {
        char key = arr[i];
        int j = i - 1;

        if (arr[j] <= key) continue;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }

    printf("Sorted Array: ");
    for (int i = 0; i < n; i++) {
        printf("%c ", arr[i]);
    }
    printf("\n");

    return 0;
}
