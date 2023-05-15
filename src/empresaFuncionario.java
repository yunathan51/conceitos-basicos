import javax.swing.*;

public class empresaFuncionario {
    public static void main(String[] args) {
        String encerramentoconfirmar;
        String encerramento = "N";
        String[] funcionario= new String[1000];
        String[] sexo = new String[1000];
        int[] salario= new int[1000];
        int[] idade= new int[1000];
        int posicaoDoArray = 0;
        do {
            int operador = Integer.parseInt(JOptionPane.showInputDialog("Oque deseja fazer ?\n 1 - cadastrar novo usuario\n 2 - visualizar usuarios cadastrados \n 3 - sair "));



            if (operador == 1) {
               int qtdPessoas = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas serão registradas"));
                    for (int i = 0; i < qtdPessoas; i++) {
                        funcionario[posicaoDoArray] = JOptionPane.showInputDialog("Informe o NOME do funcionario" + (posicaoDoArray+1) + ":");
                        sexo[posicaoDoArray] = JOptionPane.showInputDialog("Informe o SEXO do funcionario" + (posicaoDoArray+1) + ":");
                        idade[posicaoDoArray] = Integer.parseInt(JOptionPane.showInputDialog("Informe o IDADE do funcionario" + (posicaoDoArray+1) + ":"));
                        salario[posicaoDoArray] = Integer.parseInt(JOptionPane.showInputDialog("Informe o SALARIO do funcionario" + (posicaoDoArray+1) + ":"));

                        posicaoDoArray++;
                    }
            } else if (operador == 2) {
                String mensagem = "Usuários cadastrados:\n\n";
                for(int i = 0; i < posicaoDoArray; i++) {
                    mensagem += "Nome: " + funcionario[i] + "\n";
                    mensagem += "Sexo: " + sexo[i] + "\n";
                    mensagem += "Sexo: " + idade[i] + "\n";
                    mensagem += "Salario: " + salario[i] + "\n\n";
                }JOptionPane.showMessageDialog(null, mensagem);
            } else if (operador == 3) {
                encerramentoconfirmar = JOptionPane.showInputDialog("DESEJA REALMENTE ENCERRAR O PROGRAMA? S/N");
                encerramento = encerramentoconfirmar;
            } else { JOptionPane.showMessageDialog(null, "Opção invalida!"); }


        } while (encerramento.equalsIgnoreCase("n"));
    }
}
