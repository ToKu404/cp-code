#include <iostream>
using namespace std;

void check(int value) {
    if (value >= 0 && value <= 100){
        cout << "YA" << endl;
    }else{
        cout << "TIDAK" << endl;
    }
}

int main(int argc, char const *argv[])
{
    int x; 
    cin >> x;
    check(x);
    return 0;
}


