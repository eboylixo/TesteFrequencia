import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotaFrequenciaTest {
    NotaFrequencia notaFrenquecia = new NotaFrequencia();

    @Test
    void deveRetornarReprovadoFrequenciaMenorQue70PorcentoIndepenteDeFreq(){
        assertEquals("Reprovado", notaFrenquecia.valida(5,60));
    }

    @Test
    void deveRetornarReprovadoMediaMenorQue6IndependenteDeFreq(){
        assertEquals("Reprovado",notaFrenquecia.valida(5,100));
    }

    @Test
    void deveRetornarAprovadoMedia6OuMaiorEFrequenciaMaiorOuIgualA70(){
        assertEquals("Aprovado",notaFrenquecia.valida(8,75));
    }
    @Test
    void deveLancarUmaExcecaoCasoNotaOuFrequenciaForNegativa(){
        assertThrows(IllegalArgumentException.class, () ->
                notaFrenquecia.valida(-5,-80));
    }
}
