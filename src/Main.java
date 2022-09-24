import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 2.6");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 0, 3, 4, 4, 5, 5, 6, 7, -1, -22222221, 15));
        printOddNumbers(nums);

    }
    //## Задание 1
    public static void printOddNumbers(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("Массив пустой");
        } else {
            List<Integer> oddNums = new ArrayList<>();
            for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) % 2 != 0) {
                        oddNums.add(numbers.get(i));    //можно и просто печатать в цикле, но если пригодиться этот список то его вернём из метода
                }
            }
            System.out.println(oddNums);
        }
    }


}