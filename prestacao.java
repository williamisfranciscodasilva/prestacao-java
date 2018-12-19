import javax.swing.JOptionPane;
class prestacao
{
    public static void main(String args[])
    {
        float valor, taxa, tempo, pres;

        valor = Float.parseFloat(
        JOptionPane.showInputDialog("Digite o valor do boleto: "));
        taxa = (valor /100) * 2;
        tempo = Float.parseFloat(
        JOptionPane.showInputDialog("Digite a quantidade de dias em atraso"));
        pres = valor + (valor * (taxa/100) * tempo);

        JOptionPane.showMessageDialog(null,"boleto: "+valor+"\nTaxa: "+taxa+
        "\nDias em atraso: "+tempo+"\nPrestação atualizada: "+pres);

        System.out.println("boleto: "+valor);
        System.out.println("Taxa: "+taxa);
        System.out.println("Dias em atraso: "+tempo);
        System.out.println("Prestação atualizada: "+pres);
    }
}