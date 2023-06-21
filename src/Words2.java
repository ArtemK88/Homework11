//Є рядок із текстом англійською мовою. Виділити всі унікальні слова.
// Для кожного слова підрахувати частоту його входження в текст. Слова, які
// відрізняються регістром літер, вважати різними. Використовувати клас
// HashMap.
import java.util.HashMap;

public class Words2 {

    public static void main(String[] args) {
        String text = "Hello world hello World is Is a A the The";
        String[] words = text.split(" ");
        HashMap<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            if (wordFrequency.containsKey(word)) {
                int frequency = wordFrequency.get(word);
                wordFrequency.put(word, frequency + 1);
            } else {
                wordFrequency.put(word, 1);
            }
        }
        for (String word : wordFrequency.keySet()) {
            int frequency = wordFrequency.get(word);
            System.out.println(word + ": " + frequency);
        }
    }
}
