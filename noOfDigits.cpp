#include<bits/stdc++.h>
using namespace std;

int main(){
    int n = 20;
    int b  = 2;
    int ans = int(log(n)/log(b)) + 1;
    cout << ans << endl;
    return 0;
}