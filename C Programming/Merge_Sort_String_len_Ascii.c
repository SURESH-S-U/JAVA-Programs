#include <stdio.h>
#include <string.h>
#include <stdbool.h>

void MergeFunction(char arr[][50] , int st , int mid , int end)
{
    int s = end - st;
    char joined[s][50];
    int i = st , j = mid , k = 0;

    while( i < mid && j < end)
    {
        int len1 = strlen(arr[i]);
        int len2 = strlen(arr[j]);
        if(len1 < len2 || (len1 == len2 && strcmp(arr[i] , arr[j]) < 0))
        {
            strcpy(joined[k++] , arr[i++]);
        }
        else
        {
            strcpy(joined[k++] , arr[j++]);
        }
    }

    while(i < mid)
    {
        strcpy(joined[k++] , arr[i++]);
    }

    while(j < end)
    {
        strcpy(joined[k++] , arr[j++]);
    }

    for(int z = 0; z < k ; z++)
    {
        strcpy(arr[st + z] , joined[z]);
    }
}

void MergeSort(char arr[][50] , int st , int end)
{
    if(st != (end - 1)) printf("%d - %d\n", st , (end - 1));
    else printf("%d\n" , st);                                  // To print only couple elements , just remove this.

    if(end - st == 1) return;      // To print Only pares , Just make it <= 2.

    int len = end - st;
    int mid;
    if(len % 2 == 0) mid = st + len / 2;
    else mid = st + (len + 1) / 2;

    MergeSort(arr , st , mid);
    MergeSort(arr , mid , end);

    MergeFunction(arr , st , mid , end);
}


int main()
{
    int n;
    scanf("%d",&n);

    getchar();
    char sentance[200];
    scanf("%[^\n]" , sentance);

    char words[n][50];
    int count = 0;
    char *token = strtok(sentance , " ");
    while(token != NULL && count < n)
    {
        strcpy(words[count++] , token);
        token = strtok(NULL , " ");
    }

    MergeSort(words , 0 , n);

    for(int i=0;i<n;i++)
    {
        printf("%s ", words[i]);
    }
}