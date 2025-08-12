#include <stdio.h>

// Merge two sorted subarrays: Left [start, mid), Right [mid, end)
void Merge_Function(int arr[], int start, int mid, int end) {
    int joined[end - start]; // Temporary array to store merged result
    int i = start, j = mid, k = 0;

    // Merge while both halves have elements
    while (i < mid && j < end) {
        if (arr[i] < arr[j]) {
            joined[k++] = arr[i++];
        } else {
            joined[k++] = arr[j++];
        }
    }

    // Copy remaining elements from left half (if any)
    while (i < mid) {
        joined[k++] = arr[i++];
    }

    // Copy remaining elements from right half (if any)
    while (j < end) {
        joined[k++] = arr[j++];
    }

    // Copy merged elements back into original array
    for (int z = 0; z < k; z++) {
        arr[start + z] = joined[z];
    }
}

// Main Merge Sort function
// start -> inclusive index
// end   -> exclusive index (end must be arr length)
void Merge_Sort(int arr[], int start, int end) {
    if (end - start == 1) return; // Base case: 1 element

    int mid = (start + end) / 2;

    Merge_Sort(arr, start, mid); // Sort left half
    Merge_Sort(arr, mid, end);   // Sort right half

    Merge_Function(arr, start, mid, end); // Merge sorted halves
}

int main() {
    int arr[] = {1, 2, 3, 4, 5};
    int n = sizeof(arr) / sizeof(arr[0]);

    Merge_Sort(arr, 0, n); // Sort whole array

    // Print sorted array
    printf("[");
    for (int i = 0; i < n; i++) {
        printf("%d", arr[i]);
        if (i < n - 1) printf(", ");
    }
    printf("]\n");

    return 0;
}
