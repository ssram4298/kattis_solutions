#include <bits/stdc++.h>
using namespace std;

int main(){
    set <int> s;
    int t;
    for(int i=0;i<10;i++)
    {
        cin>>t;
        s.insert(t%42);
    }
    
    cout<<s.size()<<endl;
    
}