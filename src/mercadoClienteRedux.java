import javax.swing.*;

public class mercadoClienteRedux {
    public static void main(String[] args) {

        String[] produto = new String[100];
        double[] precoProduto = new double[100];
        int posicaoDoArray = 0;
        String encerrar = "N";


        JOptionPane.showMessageDialog(null, "Bem vindo!");
        do {
            int continuarCompra;
            double precoCompra =0;
            String comprados ="";

            int operador = Integer.parseInt(JOptionPane.showInputDialog("Oque deseja fazer? \n\n 1 - Cadastrar novo produto ao estoque\n2 - Vizualizar estoque\n3 - Comprar\n4 - Sair"));

            if (operador==1){
                int qtdProd = Integer.parseInt(JOptionPane.showInputDialog("Quantos produtos serão cadastrados"));

                for (int i = 0; i < qtdProd; i++){
                    produto[posicaoDoArray] = JOptionPane.showInputDialog("Informe o nome do produto:");
                    precoProduto[posicaoDoArray] = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto " + (produto[i])+":"));
                    posicaoDoArray++;
                }
            } else if (operador==2) {
                String mensagem ="Produtos cadastrados:\n\n";
                for (int i = 0; i < posicaoDoArray; i++){
                    mensagem += "Nome: " + produto[i] +"\n";
                    mensagem += "Preço: " + precoProduto[i] + "\n\n";
                } JOptionPane.showMessageDialog(null, mensagem);

            } else if (operador==3) {
                String disponiveis = "Produtos disponiveis:\n\n";
                int selecionador;
                for (int i = 0; i < posicaoDoArray; i++) {
                    disponiveis += "cod: " + i +" |"+ " nome: " + produto[i] + "\n";
                    disponiveis += "Preço: " + precoProduto[i] + "\n\n";

                } do {
                    selecionador = Integer.parseInt(JOptionPane.showInputDialog("Informe o produto desejado\n" + disponiveis));
                    comprados +="\n"+"*"+produto[selecionador]+"*";
                    precoCompra += precoProduto[selecionador];
                    continuarCompra = JOptionPane.showConfirmDialog(null, "Deseja continuar comprando?");
                }while (continuarCompra==JOptionPane.YES_OPTION);
                System.out.println("==== Nota Fiscal ====");
                System.out.println("Produtos comprados: " + comprados);
                System.out.println("Preço total: R$" + precoCompra);
                System.out.println("====================");

            } else if (operador == 4) {
                encerrar = JOptionPane.showInputDialog("Tem certeza que deseja sair? S/N");
            }

        } while (encerrar.equalsIgnoreCase("N"));
    }
}
