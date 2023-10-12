#include <bits/stdc++.h>
using namespace std;

int main(){
    string s;
    getline(cin, s);
    
    string temp;
    for(int i=0;i<s.length();i++)
    {
        if(s[i] == 'e') temp.push_back('e');
    }
    
    s.insert(1, temp);
    cout<<s<<endl;
    return 0;
}