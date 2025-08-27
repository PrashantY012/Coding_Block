//prob1:   you are given an array of intergers and an integer target, find two integers whose sum is target.

#include<iostream>
#include<vector>
#include<string>
using namespace std;


//vector === array === arraylist
vector<int> twoSum(vector<int>&arr, int target){//return of indcides of two elemetns whose sum is target


    int size = arr.size(); //we are finding size of array

    for(int firstIndex=0;firstIndex<size;firstIndex++){ //traversing on array

        int first_elem= arr[firstIndex]; //element present at index i
        int second_elem= target-first_elem;
        for(int j=firstIndex+1;j<size;j++){

            if(arr[j] == second_elem){
                return {firstIndex,j};
            }

        }

    }

    return {-1,-1};
}

int main(){
    cout<<"Hello Coders";
    vector<int>arr ={1,2,3,4,5};//user provided
    int target =21; //user provided
    twoSum(arr,target);
    return 0;
}



