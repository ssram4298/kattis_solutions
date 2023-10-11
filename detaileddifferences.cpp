#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;
    cin.ignore(1, '\n');
    vector <string> result;
    for(int i=0;i<n;i++){
        string x,y,res;
        
        getline(cin, x);
        getline(cin, y);
        
        for(int i=0;i<x.size();i++){
            if(x[i] == y[i])
                res.push_back('.');
            else
                res.push_back('*');
        }
        result.push_back(x);
        result.push_back(y);
        result.push_back(res);
    }
    
    for(int i=0;i<n;i++){
        cout<<result[i*3]<<endl;
        cout<<result[i*3+1]<<endl;
        cout<<result[i*3+2]<<endl;
        cout<<endl;
    }
    
    return 0;
}