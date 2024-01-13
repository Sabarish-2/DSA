// #include<cs50.h>
#include<stdio.h>
#include<inttypes.h>

int main()
{
    long long n = 4003600000000014;
    // scanf("%lld", &n);

    if (n < 4000000000001 || n > 4999999999999990)
{       printf("Invalid\n");
        return 0;
}    // else if (n > 34e15)

    int digit = 0, total = 0, odd = 0;

    while (n > 0)
    {
        if (n > 100)
        {
            // rem = 0;
            digit = (n) % 10;
            if ((odd & 1) == 1)
            {
                digit *= 2;
                total += (digit % 10);
                digit /= 10;
            }
            total += digit;
        }
        odd++;
        n /= 10;
    }
    printf("%d\n", total);

    return 0;
}
