#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;
    cin.ignore(1,'\n');
    vector<string> v;
    string s;
    for(int i=0;i<n;i++){
        getline(cin, s);
        v.push_back(s);
    }
    
    for(int i=0;i<n;i++){
        if(i%2==0){
            cout<<v[i]<<endl;
        }
    }
    return 0;
}