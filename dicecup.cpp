#include <bits/stdc++.h>
using namespace std;

int main(){
    int a,b;
    
    cin>>a>>b;
    
    if(a>b) swap(a,b);
    int i = a+1;
    for(; i<b+2;){
        cout<<i<<endl;
        i+=1;
    }
    
    return 0;
}