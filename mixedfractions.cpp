#include <bits/stdc++.h> 
using namespace std;

int main(){
    int a,b;
    cin>>a>>b;
    
    while(a!=0 and b!=0){
        int q,r;
        
        r = a%b;
        q = a/b;
        
        cout<<q<<" "<<r<<" / "<<b<<endl;
        
        cin>>a>>b;
    }
    
    return 0;
}