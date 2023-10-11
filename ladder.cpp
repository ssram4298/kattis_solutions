#include <bits/stdc++.h>
using namespace std;

int main(){
    int a,b;
    
    cin>>a>>b;
    
    double radians = M_PI/180.0 * b;  
    
    int res = ceil(a/(sin(radians)));
    
    cout<<res<<endl;
    
}