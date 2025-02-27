package com.hiddless.tutorials._2_week;

public class _14_Methods {
    // 3-) Return lu parametresiz
    public String metotReturluParametresiz() {
        return "metot Returnlu Parametresiz";
    }


    // 4-) Return lu parametreli
    public Integer metotReturluParametreli(int number) {
        return number;
    }

    // PSVM
    public static void main(String[] args) {
        _14_Methods isReturn1 = new _14_Methods();

        String result1 = isReturn1.metotReturluParametresiz();
        System.out.println(result1);

        Integer result2 = isReturn1.metotReturluParametreli(123456);
        System.out.println(result2);
    }
}
