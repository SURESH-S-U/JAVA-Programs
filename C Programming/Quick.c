#include <stdio.h>

// Partition function (Hoare's partition scheme)
int partition(int arr[], int low, int high) {
    int pivot = arr[low]; // First element as pivot
    int i = low + 1;
    int j = high;
    int temp;

    while (1) {
        while (i <= j && arr[i] <= pivot) {
            i++;
        }
        while (i <= j && arr[j] > pivot) {
            j--;
        }
        if (i > j) {
            break;
        }
        // Swap arr[i] and arr[j]
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Place pivot in correct position
    arr[low] = arr[j];
    arr[j] = pivot;

    return j; // Pivot index
}

// Quick Sort function
void Quick(int arr[], int low, int high) {
    if (low < high) {
        int pi_index = partition(arr, low, high);

        Quick(arr, low, pi_index - 1);  // Sort left subarray
        Quick(arr, pi_index + 1, high); // Sort right subarray
    }
}

int main() {
    int arr[] = {1, 5, 3, 9, 6, 7};
    int n = sizeof(arr) / sizeof(arr[0]);

    // Print original array
    printf("Original Array: [");
    for (int i = 0; i < n; i++) {
        printf("%d", arr[i]);
        if (i < n - 1) printf(", ");
    }
    printf("]\n");

    Quick(arr, 0, n - 1);

    // Print sorted array
    printf("Sorted Array: [");
    for (int i = 0; i < n; i++) {
        printf("%d", arr[i]);
        if (i < n - 1) printf(", ");
    }
    printf("]\n");

    return 0;
}
