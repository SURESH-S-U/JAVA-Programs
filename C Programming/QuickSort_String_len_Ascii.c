#include <stdio.h>
#include <string.h>
#include <stdbool.h>

int Partition(char arr[][50] , int low , int high)
{
    char pivot[50];
    strcpy(pivot , arr[low]);
    int i = low + 1;
    int j = high;

    while(true)
    {
        while(i <= j && (strlen(arr[i]) < strlen(pivot) || (strlen(arr[i]) == strlen(pivot) && strcmp(arr[i] , pivot) <= 0)))
        {
            i++;
        }

        while(i <= j && (strlen(arr[j]) > strlen(pivot) || (strlen(arr[j]) == strlen(pivot) && strcmp(arr[j] , pivot) > 0)))
        {
            j--;
        }

        if(i > j) break;

        char word[50];
        strcpy(word , arr[i]);
        strcpy(arr[i] , arr[j]);
        strcpy(arr[j] , word);
    }

    strcpy(arr[low] , arr[j]);
    strcpy(arr[j] , pivot);

    return j;
}

void QuickSort(char arr[][50] , int low , int high)
{
    if(low < high)
    {
        int pi_idx = Partition(arr , low , high);

        QuickSort(arr , low , pi_idx - 1);
        QuickSort(arr , pi_idx + 1 , high);
    }
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

    QuickSort(words , 0 , n - 1);

    for(int i=0;i<n;i++)
    {
        printf("%s ", words[i]);
    }
}