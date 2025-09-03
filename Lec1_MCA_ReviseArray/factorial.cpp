#include<iostream>
using namespace std;

int getFact(int n){
    int ans=1;
    for(int i=n;i>0;i--){
        ans*=i;
    }
    return ans;
}

int main(){
    int n;cin>>n;
    cout<<"factorial of: "<<n<<"  is: "<<getFact(n);

    return 0;

}

