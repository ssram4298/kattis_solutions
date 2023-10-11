#include <bits/stdc++.h>
using namespace std;

int main(){
    int n,t;
    cin>>n>>t;
    vector <int> arr;
    for(int i=0;i<n;i++){
        int temp;
        cin>>temp;
        arr.push_back(temp);
    }
    switch(t){
        case 1:{
            map <int, int> m;
            for(int i=0;i<n;i++){
                m[arr[i]] = i;
            }
            bool flag = false;
            for(int i = 0;i<n;i++){
                if(m.find(7777-arr[i]) != m.end()){
                    flag=true;
                    cout<<"Yes"<<endl;
                    break;
                }
            }
            if(!flag){
                cout<<"No"<<endl;
            }
            break;
        }
        case 2:{
            unordered_set <int> s;
            
            for(int i=0;i<n;i++){
                s.insert(arr[i]);
            }
            
            if(s.size() < arr.size())
                cout<<"Contains duplicate"<<endl;
            else
                cout<<"Unique"<<endl;
            break;
        }
        case 3:{
            unordered_map <int, int> m;
            for(int i=0;i<n;i++){
                m[arr[i]]++;
            }
            
            int max_count = 0, res = -1;
            
            for(auto i: m){
                if(max_count < i.second){
                    max_count = i.second;
                    res = i.first;
                }
            }
            
            if(max_count > n/2){
                cout<<res<<endl;
            }
            else{
                cout<<-1<<endl;
            }
            break;
        }
        case 4:{
            vector <int> v(arr);
            sort(v.begin(), v.end());
            
            if(v.size()%2 == 0)
                cout<<v[(n/2)-1]<<" "<<v[n/2]<<endl;
            else
                cout<<v[n/2]<<endl;
            break;
        }
        case 5:{
            vector <int> v = arr;
            sort(v.begin(), v.end());
            
            for(int i=0;i<n;i++){
                if(v[i]>99 and v[i]<1000){
                    cout<<v[i]<<" ";
                }
            }
            cout<<endl;
            break;
        }
    }
    return 0;
}