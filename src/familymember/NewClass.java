package familymember;

class ScopeTest {
int test = 10;
    void printTest() {
       int test = 20;
        System.out.println("Test: " + test);
    }
    
}
