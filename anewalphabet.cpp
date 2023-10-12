#include <bits/stdc++.h>
using namespace std;

int main(){
    string s;
    getline(cin, s);
    
    unordered_map <char, string> map {
        {'A', "@"},
        {'B', "8"},
        {'C', "("},
        {'D', "|)"},
        {'E', "3"},
        {'F', "#"},
        {'G', "6"},
        {'H', "[-]"},
        {'I', "|"},
        {'J', "_|"},
        {'K', "|<"},
        {'L', "1"},
        {'M', "[]\\/[]"},
        {'N', "[]\\[]"},
        {'O', "0"},
        {'P', "|D"},
        {'Q', "(,)"},
        {'R', "|Z"},
        {'S', "$"},
        {'T', "']['"},
        {'U', "|_|"},
        {'V', "\\/"},
        {'W', "\\/\\/"},
        {'X', "}{"},
        {'Y', "`/"},
        {'Z', "2"}
    };
    
    string result;
    for(int i=0;i<s.length();i++){
        char t = (char)toupper(s[i]);
        if(map.find(t) != map.end()){
            result.append(map[t]);
        }
        else{
            result.push_back(t);
        }
    }
    
    cout<<result<<endl;
    
    return 0;
}