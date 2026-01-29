
class unit1 {
    static void printNumbers(int... numbers) {

        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {

        printNumbers(1, 2);
        printNumbers(10, 20, 30);
        printNumbers(); // valid
    }
}
