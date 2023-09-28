public class NotaFrequencia {

    public String valida(int media, int frequencia) {
        if (media < 0 || frequencia < 0) {
            throw new IllegalArgumentException("Não é permitido valores negativos");
        } else if (frequencia < 70) {
            return "Reprovado";
        } else if (media < 6) {
            return "Reprovado";
        } else {
            return "Aprovado";
        }
    }
}
