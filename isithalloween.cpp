#include <bits/stdc++.h>
using namespace std;

int main(){
    string s;
    getline(cin, s);
    
    string month;
    
    for(int i=0;i<3;i++)
        month.push_back(s[i]);
        
    string date;
    date.push_back(s[4]);
    date.push_back(s[5]);
    
    if(month == "OCT" && date == "31")
        cout<<"yup"<<endl;
    else if(month =="DEC" && date == "25")
        cout<<"yup"<<endl;
    else
        cout<<"nope"<<endl;
    return 0;
}