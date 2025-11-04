#include<bits/stdc++.h>
using namespace std;

int main(){
    // string s="my name is prashant";
    //i am from delhi
    string s;

    getline(cin,s); 
    s.push_back(' ');
    int ans=0;
    for(int i=0;i<s.length();i++){
        if(s[i]==' '&& i>0 &&s[i-1]!=' ')ans++;
    }
    cout<<ans<<endl;


    return 0;
}

  // my name is prashant
    //i am from delhi



    /*
    select t1.cust_id, t1.
    inner join t2  on t1.cust_id = t2.cust_id
    where t2.date 
    
    
    
    */
