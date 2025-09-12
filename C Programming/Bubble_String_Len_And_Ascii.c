#include <stdio.h>
#include <string.h>

int main() {
    char words[5][50] = {"dog", "apple", "bat", "car", "ant"};
    int n = 5;

    // Bubble sort logic (length first, then ASCII)
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            int len1 = strlen(words[j]);
            int len2 = strlen(words[j + 1]);

            // Compare by length first
            if (len1 > len2 || (len1 == len2 && strcmp(words[j], words[j + 1]) > 0)) {
                // Swap strings
                char temp[50];
                strcpy(temp, words[j]);
                strcpy(words[j], words[j + 1]);
                strcpy(words[j + 1], temp);
            }
        }
    }

    printf("Sorted words:\n");
    for (int i = 0; i < n; i++) {
        printf("%s\n", words[i]);
    }

    return 0;
}
