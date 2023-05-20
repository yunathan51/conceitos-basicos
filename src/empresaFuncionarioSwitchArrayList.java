import javax.swing.*;
import java.util.ArrayList;

public class empresaFuncionarioSwitchArrayList {
    public static void main(String[] args) {

        ArrayList<String> funcionario = new ArrayList<>();
        ArrayList<String> sexo = new ArrayList<>();
        ArrayList<Integer> idade = new ArrayList<>();
        ArrayList<Integer> salario = new ArrayList<>();
        String encerrarProg = "N";

        do {
            int operador = Integer.parseInt(JOptionPane.showInputDialog("Oque deseja fazer?\n\n" +
                    "1 - CADASTRAR NOVO FUNCIONARIO\n" +
                    "2 - VISUALIZAR FUNCIONARIOS CADASTRADOS\n" +
                    "3 - PROCURAR FUNCIONARIO\n" +
                    "4 - DELETAR FUNCIONARIO\n" +
                    "5 - SAIR"));

            switch (operador) {
                case 1:
                    int qtdFuncionarios = Integer.parseInt(JOptionPane.showInputDialog("Quantos funcionarios serão cadastrados?"));
                    for (int i = 0; i < qtdFuncionarios; i++) {
                        funcionario.add(JOptionPane.showInputDialog("Informe o nome do funcionario " + (i+1)).toUpperCase());
                        while (funcionario.get(i).equalsIgnoreCase("")) {
                            funcionario.set(i, JOptionPane.showInputDialog("Nome invalido! Informe um nome valido:").toUpperCase());
                        }
                        sexo.add(JOptionPane.showInputDialog("Informe o sexo do funcionario " + funcionario.get(i)).toUpperCase());
                        while (sexo.get(i).equals("")) {
                            sexo.set(i, JOptionPane.showInputDialog("Sexo invalido! Informe um argumento valido! ").toUpperCase());
                        }
                        idade.add(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do funcionario "+ funcionario.get(i))));
                        while (idade.get(i) > 90 || idade.get(i) < 18) {
                            idade.set(i, Integer.parseInt(JOptionPane.showInputDialog("Informe uma idade valida! ")));
                        }
                        salario.add(Integer.parseInt(JOptionPane.showInputDialog("Informe o salario de " + funcionario.get(i))));
                        while (salario.get(i) == 0) {
                            salario.set(i, Integer.parseInt(JOptionPane.showInputDialog("Informe um salario valido! ")));
                        }
                    }
                    break;

                case 2:
                    String mostrarCADs = "Os funcionarios cadastrados são:\n\n\n";
                    for (int K = 0; K < funcionario.size(); K++) {

                        mostrarCADs += "NOME: " + funcionario.get(K) +"\n";
                        mostrarCADs += "SEXO: " + sexo.get(K) + "\n";
                        mostrarCADs += "IDADE: " + idade.get(K) + "\n";
                        mostrarCADs += "SALARIO: " + salario.get(K) + "\n\n";
                    }
                    JOptionPane.showMessageDialog(null, mostrarCADs);
                    break;

                case 3:
                    String indexFuncionario = JOptionPane.showInputDialog("Informe o nome do funcionario que deseja pesquisar:").toUpperCase();
                    String resultadoPesquisa = "Resultado da pesquisa:\n\n";
                    for (int P = 0; P < funcionario.size(); P++) {
                        if (funcionario.get(P).equals(indexFuncionario)){
                            resultadoPesquisa += "NOME: " + funcionario.get(P) +"\n";
                            resultadoPesquisa += "SEXO: " + sexo.get(P) + "\n";
                            resultadoPesquisa += "IDADE: " + idade.get(P) + "\n";
                            resultadoPesquisa += "SALARIO: " + salario.get(P) + "\n\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, resultadoPesquisa);
                    break;

                case 4:
                    String[] opcoes = funcionario.toArray(new String[0]);
                    int funcionarioSelecionado = JOptionPane.showOptionDialog(null, "Lista de funcionarios:\n\n", null, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

                    if (funcionarioSelecionado != JOptionPane.CLOSED_OPTION) {
                        funcionario.remove(funcionarioSelecionado);
                        sexo.remove(funcionarioSelecionado);
                        idade.remove(funcionarioSelecionado);
                        salario.remove(funcionarioSelecionado);
                        JOptionPane.showMessageDialog(null, "Funcionario removido com sucesso!");
                    }
                    break;

                case 5:
                    encerrarProg = JOptionPane.showInputDialog("TEM CERTEZA QUE DESEJA SAIR? S/N");
            }
        }while (encerrarProg.equalsIgnoreCase("N"));
    }
}