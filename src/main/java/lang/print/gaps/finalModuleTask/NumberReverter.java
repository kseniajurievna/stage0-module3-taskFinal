package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int one = number % 10;
        number = (number - one) / 10;
        int two = number % 10;
        number = (number - two) / 10;
        System.out.print(one);
        System.out.print(two);
        System.out.print(number);
    }

}
