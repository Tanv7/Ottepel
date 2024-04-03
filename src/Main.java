public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
} include <fstream>
using namespace std;
        int main() {
        ifstream ifst("input.txt");
        ofstream ofst("output.txt");
        int n;
        ifst >> n;
        int maxLength = 0;
        int currentLength = 0;
        for (int i = 0; i < n; ++i) {
        int temperature;
        ifst >> temperature;
        if (temperature > 0) {
        ++currentLength;
        }
        else {
        currentLength = 0;
        }
        maxLength = max(maxLength, currentLength);
        }
        ofst << maxLength;
        }