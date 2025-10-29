public class Main {
    public static void main(String[] args) {
        System.out.println("--- Calculadora Java ---");
        
        calculadora calc = new calculadora();

        double num1 = 10;
        double num2 = 5;

        double resultadoSoma = calc.somar(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + resultadoSoma); 

        double resultadoSub = calc.subtrair(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + resultadoSub); 

        double resultadoMult = calc.multiplicar(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + resultadoMult); 

        double resultadoSoma2 = calc.somar(7, 3);
        System.out.println("7 + 3 = " + resultadoSoma2); 
    }
}