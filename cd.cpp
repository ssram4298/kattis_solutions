#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main()
{
    int a, b, temp;
    cin>>a>>b;
    
    while(a!=0 and b!=0){
        unordered_set <int> s;
        
        for(int i=0;i<a;i++){
            cin>>temp;
            s.insert(temp);
        }
        
        int res = 0;
        for(int i=0;i<b;i++){
            cin>>temp;
            if(s.count(temp)){
                res++;
            }
        }
        cout<<res<<endl;
        cin>>a>>b;
    }

    return 0;
}