package setPartiallyOrdered;

public class test {
    public static void main(String[] args) {
        set s = new set();
        boolean ifInitialized = s.init(new int [][] {
                {1,2},
                {2,4},
                {4,6},
                {2,10},
                {4,8},
                {6,3},
                {1,3},
                {3,5},
                {5,8},
                {7,5},
                {7,9},
                {9,4},
                {9,10},
        });

        s.print();
    }
}
