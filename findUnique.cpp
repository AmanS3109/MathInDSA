#include<bits/stdc++.h>
using namespace std;

int unique(int arr[], int size){
    int distinct = 0;
    for (int i = 0; i < size; i++)
    {
        int n = arr[i];
        distinct ^= n;
    }
    return distinct;
}
int main(){
    int arr[] = {2, 3, 4, 3, 2};
    int size = 5;
    int result = unique(arr, size);
    cout << result << endl;
    return 0;
}