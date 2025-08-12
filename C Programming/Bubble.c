#include <stdio.h>
#include <stdbool.h>

int main() {
    int arr[] = {5, 3, 8, 4, 2, 2};
    int n = sizeof(arr) / sizeof(arr[0]);

    // Bubble Sort
    for (int i = 0; i < n - 1; i++) {
        bool swapped = false;

        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // Swap
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }

        // Optimization: Stop if no swaps (already sorted)
        if (!swapped) break;
    }

    printf("Sorted Array: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}
