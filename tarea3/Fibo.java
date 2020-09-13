class Fibo {

    public static void main(final String args[]) {

        int valor1 = 0;
        int valor2 = 1;
        int i = 0;

        System.out.println(valor1);
        System.out.println(valor2);

        while (i < 10) {
            final int valor3 = valor1 + valor2;
    System.out.println(valor3);
    i++;
    valor1 = valor2;
    valor2 = valor3;
    }
    }
}