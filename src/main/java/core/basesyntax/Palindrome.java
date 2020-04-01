package core.basesyntax;

public class Palindrome {

    /**
     * <p>Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
     * Палиндромом называется строка, которая читается одинаково слева направо
     * и справа налево (в том числе пустая).
     * При определении "палиндромности" строки должны учитываться только буквы и цифры. А пробелы,
     * знаки препинания, а также регистр символов должны игнорироваться.</p>
     *
     * <p>Пример: Madam, I'm Adam!</p>
     * <p>Результат: true</p>
     */
    public boolean isPalindrome(String text) {
        StringBuilder forward = new StringBuilder();
        forward.append(text.toLowerCase().replaceAll("[^a-z^[0-9]]", ""));
        StringBuilder reverse = new StringBuilder();
        reverse.append(forward).reverse();
        return forward.toString().equals(reverse.toString());
    }
}
