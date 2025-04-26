#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main() {
    srand(time(0)); 
    int secretNumber = rand() % 100 + 1; 
    int guess;

    cout << "I have generated a number between 1 and 100. Can you guess it?" << endl;

    do {
        cout << "Enter your guess: ";
        cin >> guess;

        if (guess < secretNumber) {
            cout << "Too low. Try again." << endl;
        } else if (guess > secretNumber) {
            cout << "Too high. Try again." << endl;
        } else {
            cout << "Congratulations! You guessed the number." << endl;
        }
    } while (guess != secretNumber);

    return 0;
}
