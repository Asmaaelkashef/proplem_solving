#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    double r ; 
    cout << "enter raduis of circle : ";
    cin >> r ;
    cout << fixed << setprecision(9) << 3.141592653*r*r;
}