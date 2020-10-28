#include <stdio.h>
#include <string.h>

int main(void) {
    char str1[30];
    printf("Provide input: ");
    fgets(str1, 20, stdin); 
    char password[] = "password";
    printf("Str1: %s\n", str1);
    printf("Size of Str1: %ld\n", strlen(str1)-1);
    if (strncmp(password, str1, strlen(str1)-1) == 0) printf("Access Granted\n");
    return 0;
}