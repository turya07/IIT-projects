#include <stdio.h>
#include <string.h>

int main(void)
{
    char str[80] = "I like C";

    strcpy(str, "Hello");

    printf(str);
    return 0;
}
