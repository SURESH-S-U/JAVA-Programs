#include <stdio.h>
#include <strings.h> // for strcasecmp()

int main() {
    char str1[50] = "Hello";
    char str2[50] = "hello";

    if (strcasecmp(str1, str2) == 0)
        printf("Strings are equal (case-insensitive).\n");
    else
        printf("Strings are not equal.\n");

    return 0;
}
