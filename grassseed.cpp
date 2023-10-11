#include <bits/stdc++.h>
using namespace std;

int main(){
    double c;
    int l;
    
    cin>>c>>l;
    double result = 0.0;
    for(int i=0;i<l;i++){
        double p, q;
        cin>>p>>q; 
        result += p*q*c;
    }
    
    cout<<fixed<<setprecision(7);
    cout<<result<<endl;
    
    return 0;
}