#include <stdio.h>
#include <string.h>
char *p[][2] = {{"Red Delicious", "red"},
                {"Golden Delicious", "yellow"},
                {"Winesap", "red"},
                {"Gala", "reddish orange"},
                {"Lodi", "green"},
                {"", ""}};

int main(void)
{
    int i;
    char apple[80];
    printf("Enter name of apple: ");
    gets(apple); // take input

    for (i = 0; *p[i][0]; i++)
    {
        if (!strcmp(apple, p[i][0]))
        {
            printf("%s is %s\n", apple, p[i][1]);
        }
    }

    return 0;
}
