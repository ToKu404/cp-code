#include <iostream>

using namespace std;

int main(int argc, char const *argv[])
{
    int a = 5;

    //int a punya nilai dan address

    //pointer 
    int *aPtr = &a;

    cout << "nilai dari a: " << a << endl;
    cout << "alamat dari a:" << aPtr << endl;
    cout << "mengambil nilai dari address:" << *aPtr << endl;


    return 0;
}
