package Strings;

public class Strings {

    public static void main(String[] args) {
        String str = "I like Java!!!";
        System.out.println("Последний символ строки : " + str.charAt(str.length() - 1));
        boolean end = str.endsWith("!!!");
        System.out.println("Заканчивается  лимоя строка на '!!!'? : " + end);
        boolean start = str.startsWith("I like");
        System.out.println("Начинается ли моя строка на 'I like'? : " + start);
        String substring = "Java";
        System.out.println("Содержит ли моя строка, подстроку 'Java'? : " + str.contains(substring));
        String index = "Java";
        System.out.println("Позиция подстроки 'Java' : " + str.indexOf(index));
        System.out.println("Заменяем символы 'a' на 'o' : " + str.replace('a', 'o'));
        String strUpper = str.toUpperCase();
        System.out.println("Изменение строки в верхний регистр : " + strUpper);
        String strLower = str.toLowerCase();
        System.out.println("Изменение строки в нижний регистр : " + strLower);
        System.out.println("Вырезаем строку 'Java' : " + str.substring(7, 11));
    }
}