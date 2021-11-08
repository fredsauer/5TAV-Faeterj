package testeCalc;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import 5TAV_Faeterj_Calculadora.faeterj.Calculadora;

public class CalculadoraTeste {
    @Test
    public void testarSoma() {
        Calculadora calc = new Calculadora();
	int esperado = 10;
	double resultado = Calc.somar(4,6);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testarSubtracao() {
        Calculadora calc = new Calculadora();
	int esperado = 2;
	double resultado = Calc.subtrair(6,4);
	assertEquals(esperado, resultado);
    }

    @Test
    public void testarDivisao() {
        Calculadora calc = new Calculadora();
	int esperado = 6;
	double resultado = Calc.dividir(12,2)
	assertEquals(esperado, resultado);
    }

    @Test
    public void testarMultiplicacao() {
        Calculadora calc = new Calculadora();
	int esperado = 12;
	double resultado = Calc.multiplicar(6,2);
	assertEquals(esperado, resultado);
    }

    @Test
    public void testarResto() {
        Calculadora calc = new Calculadora();
	double esperado = 3;
	double resultado = Calc.resto(243,5)
	assertEquals(esperado, resultado);
    }
}

    @Test
    public void testarPercentual() {
        Calculadora calc = new Calculadora();
	double esperado = 1;
	double resultado = Calc.percentual(1,100)
	assertEquals(esperado, resultado);
    }
}
    @Test
    public void testarExponencial() {
        Calculadora calc = new Calculadora();
	double esperado = 4;
	double resultado = Calc.exponencial(2,2)
	assertEquals(esperado, resultado);
    }
}
    @Test
    public void testarRaiz() {
        Calculadora calc = new Calculadora();
	double esperado = 3;
	double resultado = Calc.raiz(9)
	assertEquals(esperado, resultado);
    }
}
