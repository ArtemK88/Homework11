//1. Є рядок із текстом англійською мовою. Виділити всі унікальні слова.
//   Слова, які відрізняються лише регістром букв, вважати однаковими.
//   Використовуйте клас HashSet.
import java.util.HashSet;


public class Words1 {
    public static void main(String[] args) {
        String text = "Hello world hello World is Is a A the The ";
        text = text.replaceAll("[^a-zA-Z ]", "");
        HashSet<String> uniqueWords = new HashSet<>();
        String[] words = text.split("\\W+");
        for (String word : words) {
            String lowercaseWord = word.toLowerCase();
            uniqueWords.add(lowercaseWord);
        }
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}

