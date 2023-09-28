import javax.swing.*;

public class NotaFrequenciaMain {
    public static void main(String[] args) {
        NotaFrequencia notaFrequencia = new NotaFrequencia();

        int media = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da media"));
        int frequencia = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da frequencia"));
        System.out.println(notaFrequencia.valida(media,frequencia));

    }



}
