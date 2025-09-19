#include <stdio.h>
#include <ctype.h>

void toLowerCase(char str[]) {
    for (int i = 0; str[i] != '\0'; i++) {
        str[i] = tolower(str[i]); // built-in function
    }
}

int main() {
    char str[100];
    printf("Enter a string: ");
    scanf("%s", str);

    toLowerCase(str);
    printf("Lowercase string: %s\n", str);

    return 0;
}
