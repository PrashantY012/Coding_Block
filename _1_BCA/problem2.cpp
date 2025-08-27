//create an array of 10 elements
//create a fucntion which accepts an that array and returns its sum.
#include<iostream>
#include<vector>
#include<string>
using namespace std;

int findSum(vector<int>arr){
    int sum =0;
    int size = arr.size();

    for(int i=0;i<size;i++){
        sum = sum + arr[i];
    }
    return sum;
}


int main(){
    int size;cin>>size;
    vector<int>arr;
    for(int i=0;i<size;i++){
        cin>>arr[i];
    }
    cout<<"sum is: "<<findSum(arr)<<endl;
    return 0;
}