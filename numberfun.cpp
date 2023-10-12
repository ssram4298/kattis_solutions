#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;
    vector <string> v;
    while(n--){
        float a,b,c;
        cin>>a>>b>>c;
        if(a+b == c or a*b == c)
            v.push_back("Possible");
        else if(a/b == c or a-b ==c or b/a == c or b-a ==c)
            v.push_back("Possible");
        else
            v.push_back("Impossible");
    }
    
    for(int i=0;i<v.size();i++){
        cout<<v[i]<<endl;
    }
    
    return 0;
}