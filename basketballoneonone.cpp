#include <bits/stdc++.h>
using namespace std;

int main(){
    string s;
    getline(cin, s);
    
    int a=0,b=0;
    for(int i=0;i<s.length();i+=2){
        if(s[i] == 'A'){
            a+= s[i+1] - '0';
        }
        else{
            b += s[i+1] - '0';
        }
    }
    char result = (a>b)?'A':'B';
    cout<<result<<endl;
    return 0;
}