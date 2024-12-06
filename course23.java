class Animal {}
class Dog extends Animal {}

public class course23{
    public static void main(String[] args) {
        int a = 10;
        a += 5; // a = 15
        a -= 3; // a = 12
        a *= 2; // a = 24
        a /= 4; // a = 6
        a %= 5; // a = 1

        int x = 5, y = 10;
        int max = (x > y) ? x : y; // max = 10

        boolean b1 = true, b2 = false;
        boolean result = b1 || b2; // result = true
        result = b1 && b2; // result = false

        int p = 5, q = 3; // 5 = 0101, 3 = 0011
        int bitwiseOr = p | q; // 0101 | 0011 = 0111 (7)
        int bitwiseXor = p ^ q; // 0101 ^ 0011 = 0110 (6)
        int bitwiseAnd = p & q; // 0101 & 0011 = 0001 (1)

        boolean isEqual = (p == q); // false
        boolean notEqual = (p != q); // true
        boolean greater = (p > q); // true
        boolean greaterOrEqual = (p >= q); // true
        boolean less = (p < q); // false
        boolean lessOrEqual = (p <= q); // false

        int shiftLeft = p << 1;  // 0101 << 1 = 1010 (10)
        int shiftRight = p >> 1; // 0101 >> 1 = 0010 (2)

        int sum = p + q;       // 5 + 3 = 8
        int difference = p - q; // 5 - 3 = 2
        int product = p * q;   // 5 * 3 = 15
        int division = p / q;  // 5 / 3 = 1
        int remainder = p % q; // 5 % 3 = 2

        int u = 10;
        int preIncrement = ++u; // u = 11, preIncrement = 11
        int postIncrement = u++; // postIncrement = 11, u = 12
        int preDecrement = --u; // u = 11, preDecrement = 11
        int postDecrement = u--; // postDecrement = 11, u = 10

        int negation = ~p;  // ~0101 = 1010 (в двоичной форме)
        boolean notTrue = !b1; // false

        String s1 = "Hello";
        String s2 = "World";

        String concatenated = s1 + " " + s2; // "Hello World"

        s1 += " Java"; // s1 = "Hello Java"

        // Сравнение
        boolean EqualS = s1 == s2; // false (сравниваются ссылки)
        boolean notEqualS = s1 != s2; // true

        String greeting = (s1.length() > s2.length()) ? "Longer" : "Shorter"; // "Longer"

        //2
        Animal animal = new Animal();
        Dog dog = new Dog();

        boolean check = animal instanceof Animal; // true
        check = dog instanceof Dog; // true
        check = dog instanceof Animal; //true
        check = animal instanceof Dog; //false
        animal = null;
        check =  animal instanceof Animal; //false
    }
}
