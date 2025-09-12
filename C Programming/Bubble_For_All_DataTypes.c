#include <stdio.h>
#include <stdbool.h>
#include <string.h>

void bubbleSortInt(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
        bool swapped = false;
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }
        if (!swapped) break;
    }
}

void bubbleSortChar(char arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
        bool swapped = false;
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                char temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }
        if (!swapped) break;
    }
}

void bubbleSortString(char arr[][50], int n) {
    for (int i = 0; i < n - 1; i++) {
        bool swapped = false;
        for (int j = 0; j < n - i - 1; j++) {
            if (strcmp(arr[j], arr[j + 1]) > 0) {
                char temp[50];
                strcpy(temp, arr[j]);
                strcpy(arr[j], arr[j + 1]);
                strcpy(arr[j + 1], temp);
                swapped = true;
            }
        }
        if (!swapped) break;
    }
}

int main() {
    int n;

    // Integer Array
    printf("Enter number of integers: ");
    scanf("%d", &n);
    int intArr[n];
    printf("Enter %d integers:\n", n);
    for (int i = 0; i < n; i++) scanf("%d", &intArr[i]);

    bubbleSortInt(intArr, n);
    printf("Sorted Integers: ");
    for (int i = 0; i < n; i++) printf("%d ", intArr[i]);
    printf("\n");

    // Character Array
    printf("\nEnter number of characters: ");
    scanf("%d", &n);
    char charArr[n];
    printf("Enter %d characters:\n", n);
    for (int i = 0; i < n; i++) scanf(" %c", &charArr[i]);  // space before %c to ignore newline

    bubbleSortChar(charArr, n);
    printf("Sorted Characters: ");
    for (int i = 0; i < n; i++) printf("%c ", charArr[i]);
    printf("\n");

    // String Array
    printf("\nEnter number of strings: ");
    scanf("%d", &n);
    char strArr[n][50];                                    // Note the line clearly.
    printf("Enter %d strings:\n", n);
    for (int i = 0; i < n; i++) scanf("%s", strArr[i]);   // No need to put &.

    bubbleSortString(strArr, n);
    printf("Sorted Strings: ");
    for (int i = 0; i < n; i++) printf("%s ", strArr[i]);
    printf("\n");

    return 0;
}
