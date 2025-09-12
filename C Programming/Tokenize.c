#include <stdio.h>
#include <string.h>

int main() {
    int n;

    printf("Enter number of words: ");
    scanf("%d", &n);
    getchar(); // clear newline left by scanf

    char sentence[200];
    char words[n][50]; // ✅ VLA: n rows, 50 chars each (works in C99+)
    int wordCount = 0;

    printf("Enter the sentence: ");
    scanf("%[^\n]", sentence);  // Read full line

    char *token = strtok(sentence, " ");
    while (token != NULL && wordCount < n) {
        strcpy(words[wordCount++], token);
        token = strtok(NULL, " ");
    }

    printf("\nStored Words:\n");
    for (int i = 0; i < wordCount; i++) {
        printf("%d: %s\n", i + 1, words[i]);
    }

    return 0;
}
