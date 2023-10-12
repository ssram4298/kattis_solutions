#include <bits/stdc++.h>
using namespace std;

int getSum(int n){
    int sum = 0;
    
    while(n>0){
        sum = sum + n%10;
        n = n/10;
    }
    return sum;
}

int main(){
    
    int l,d,x;
    cin>>l>>d>>x;
    
    int n = l;
    while(n<=d){
        if(getSum(n) == x)  
            break;
        n++;
    }
    
    int m = d;
    while(m>=n){
        if(getSum(m) == x)
            break;
        m--;
    }
    
    cout<<n<<endl;
    cout<<m<<endl;
    
    return 0;
}
