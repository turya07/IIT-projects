#include <stdio.h>
int main(int argc, char const *argv[])
{
    int num[3][3][3], counter = 1;
    for (int i = 0; i < 3; i++)
        for (int j = 0; j < 3; j++)
            for (int k = 0; k < 3; k++)
                num[i][j][k] = counter++;
    int *temp;
    temp = (*(*(num)));
    for (size_t i = 0; i < 27; i++)
    {
        printf("\n%p --> %d", temp + i, *(temp + i));
    }

    return 0;
}