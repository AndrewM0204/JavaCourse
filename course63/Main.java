public class Main {
    public static void main(String[] args) {
        // Создание объектов StringBuffer и StringBuilder
        StringBuffer sbf = new StringBuffer("Hello");
        StringBuilder sbl = new StringBuilder("World");

        // Методы StringBuffer
        // 1. append() — добавляет строку в конец
        sbf.append(" Java");
        System.out.println("StringBuffer append: " + sbf);

        // 2. insert() — вставляет строку в указанную позицию
        sbf.insert(6, "Mutable ");
        System.out.println("StringBuffer insert: " + sbf);

        // 3. replace() — заменяет часть строки на другую
        sbf.replace(6, 14, "Beautiful");
        System.out.println("StringBuffer replace: " + sbf);

        // 4. delete() — удаляет часть строки
        sbf.delete(6, 15);
        System.out.println("StringBuffer delete: " + sbf);

        // 5. reverse() — разворачивает строку
        sbf.reverse();
        System.out.println("StringBuffer reverse: " + sbf);

        // Методы StringBuilder
        // 6. append() — добавляет строку в конец
        sbl.append(" Builder");
        System.out.println("StringBuilder append: " + sbl);

        // 7. insert() — вставляет строку в указанную позицию
        sbl.insert(5, " Dynamic");
        System.out.println("StringBuilder insert: " + sbl);

        // 8. replace() — заменяет часть строки на другую
        sbl.replace(6, 13, "Fast");
        System.out.println("StringBuilder replace: " + sbl);

        // 9. deleteCharAt() — удаляет символ по указанному индексу
        sbl.deleteCharAt(5);
        System.out.println("StringBuilder deleteCharAt: " + sbl);

        // 10. capacity() — возвращает текущую емкость строки
        System.out.println("StringBuilder capacity: " + sbl.capacity());
    }
}
