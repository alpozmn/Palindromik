import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kelimeyi al
        System.out.print("Bir kelime girin: ");
        String word = scanner.nextLine();

        // Palindrom kontrolü için metodu çağır
        if (isPalindrome(word)) {
            System.out.println(word + " bir palindromiktir.");
        } else {
            System.out.println(word + " bir palindromik değildir.");
        }

        scanner.close();
    }

    // Palindrom kontrolü için metot
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        // Kelimenin başından ve sonundan başlayarak karakterleri kontrol et
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false; // Eğer karakterler eşleşmiyorsa, kelime palindromik değildir
            }
            left++;
            right--;
        }
        return true; // Eğer hiçbir karakter eşleşmiyorsa, kelime palindromiktir
    }
}
