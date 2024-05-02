package S1.Pdf3;

public class Ejemplo3 {

    @FunctionalInterface
    public interface IFuncionLambda {
        // metodo abstracto para sumar 2 numeros, que lo implementara el
        // programador a partir de una expresion lambda
        void suma(int a, int b);
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        // se implementa el metodo de la inferfaz con una
        // expresion lambda
        IFuncionLambda iflambda = (a, b) -> {
            System.out.println(a + b);
        };

        //se utiliza el método con la implementación y se le
        //envía los valores de x e y
        iflambda.suma(x, y);
    }
}
