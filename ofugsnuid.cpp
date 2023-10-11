#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;
    
    vector <int> v;
    int k;
    for(int i=0;i<n;i++)
    {
        cin>>k;
        v.push_back(k);
    }
    
    auto iter = v.rbegin();
    for(; iter!=v.rend();iter++){
        cout<<*iter<<"\n";
    }
    
}