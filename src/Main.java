import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 2.6");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 0, 3, 4, 4, 5, 5, 6, 7, -1, -22222221, 15, -5, -2, -1000));
        printOddNumbers(nums);
        sortAndPrintEvenNumbers(nums);
        List<String> words = new ArrayList<>(List.of("один", "привет", "закат", "привет", "текст", "Ноль", "закат", "один"));
        printUniqWords(words);
        printNumberOfTakes(words);
    }

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

    public static void sortAndPrintEvenNumbers(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("Массив пустой");
        } else {
            Set evenNums = new HashSet();
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 == 0) {
                    evenNums.add(numbers.get(i));
                }
            }
            List sortedEvenNums = new ArrayList(evenNums);
            Collections.sort(sortedEvenNums);
            ;
            System.out.println(sortedEvenNums);
        }
    }

    public static void printUniqWords(List<String> words) {
        if (words.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            Set uniqWords = new HashSet<>(words);
            System.out.println(uniqWords);
        }
    }

    public static void printNumberOfTakes(List<String> words) {
        if (words.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            int count = 0;
            Set<String> duplicate = new HashSet<>(words);
            for (String word : duplicate) {
                for (int i = 0; i < words.size(); i++) {
                    if (word.equals(words.get(i))) {
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.print(count + " ");
                }
                count = 0;
            }
        }
    }

}