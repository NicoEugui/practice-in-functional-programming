package S1.Pdf1;

public class Ejemplo3 {

    public static void main(String[] args) {

        Converter<String, Integer> stringToInteger = Integer::valueOf;
        System.out.println(stringToInteger.convert("1234"));
    }

    @FunctionalInterface
    interface Converter<F, T> {
        T convert(F from);
    }
}
