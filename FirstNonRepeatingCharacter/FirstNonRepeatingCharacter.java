import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        int index = processInput();
        if(index == -1) {
            System.out.println("No non repeating character found!");
        } else {
            System.out.println("The index is: " + index);
        }
    }

    private static int processInput() {
        String finalString = null;
        Map<Character, Integer> map = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        if (scanner.hasNext()) {
            String string = scanner.nextLine();
            finalString = string;
            char[] charArray = string.toCharArray();
            for(char letter : charArray){
                if(map.containsKey(letter)){
                    map.put(letter, map.get(letter)+1);
                } else {
                    map.put(letter, 1);
                }
            }
        } else {
            System.out.println("Invalid input!");
        }
        for(Map.Entry<Character,Integer> set : map.entrySet()){
            if(set.getValue() == 1){
                System.out.println("key: " + set.getKey());
                System.out.println("count: " + set.getValue());
                return finalString.indexOf(set.getKey());
            }
        }
        return -1;
    }
}
