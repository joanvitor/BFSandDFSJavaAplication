package TelaMatriz;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.table.TableColumn;

public class telaMatriz extends JFrame {

    private static final long serialVersionUID = 1L;
    // variaveis para uso da JTable
    //private JButton button4;
    private JTable table;
    private final Object colunas[] = {"  ", "Itabaiana", "Frei Paulo", "Moita Bonita", "Lagarto", "Laranjeiras",
            "Macambira", "Malhador", "Aparecida", "Gloria", "Dores", "Socorro", "Pedra Mole", "Pinhao", "Riachuelo",
            "Ribeiropolis", "São Cristovao", "Sao Domingos", "Carira", "Areia Branca", "Simao Dias", "Aracaju", "Campo do Brito"};
    private final Object[][] dados = {
            {"Itabiana", "0", "1", "1", "0", "0",
                    "1", "1", "0", "0", "0", "0", "0", "0", "0",
                    "1", "0", "0", "0", "1", "0", "0", "1"},
            {"Frei Paulo", "1", "0", "0", "0", "0",
                    "1", "0", "1", "1", "0", "0", "1", "1", "0",
                    "1", "0", "0", "0", "0", "0", "0", "0"},
            {"Moita Bonita", "1", "0", "0", "0", "0",
                    "0", "1", "0", "0", "1", "0", "0", "0", "0",
                    "1", "0", "0", "0", "0", "0", "0", "0"},
            {"Lagarto", "0", "0", "0", "0", "0",
                    "0", "0", "0", "0", "0", "0", "0", "1", "0",
                    "0", "0", "1", "0", "0", "1", "0", "0"},
            {"Laranjeiras", "0", "0", "0", "0", "0",
                    "0", "0", "0", "0", "0", "0", "0", "0", "1",
                    "0", "1", "0", "0", "1", "0", "1", "0"},
            {"Macambira", "1", "1", "0", "0", "0",
                    "0", "0", "0", "0", "0", "0", "1", "1", "0",
                    "1", "0", "1", "1", "0 ", "0", "0", "1"},
            {"Malhador", "1", "0", "1", "0", "0",
                    "0", "0", "0", "0", "0", "0", "0", "0", "1",
                    "0", "0", "0", "0", "1", "0", "0", "0"},
            {"Aparecida", "0", "1", "0", "0", "0",
                    "0", "0", "1", "0", "0", "1", "1", "1", "0",
                    "1", "0", "0", "1", "0", "0", "0", "0"},
            {"Gloria", "0", "1", "0", "0", "0",
                    "0", "0", "1", "0", "0", "0", "1", "1", "0",
                    "1", "0", "0", "1", "0", "0", "0", "0"},
            {"Dores", "0", "0", "1", "0", "0",
                    "0", "0", "0", "0", "1", "0", "0", "0", "0",
                    "1", "0", "0", "0", "0", "0", "0", "0"},
            {"Socorro", "0", "0", "0", "0", "1",
                    "0", "0", "0", "0", "0", "0", "0", "0", "0",
                    "0", "0", "0", "0", "0", "0", "1", "0"},
            {"Pedra Mole", "0", "1", "0", "0", "0",
                    "1", "0", "1", "1", "0", "0", "0", "1", "0",
                    "1", "0", "0", "1", "0", "1", "0", "0"},
            {"Pinhao", "0", "1", "0", "1", "0",
                    "1", "0", "1", "1", "0", "0", "1", "0", "0",
                    "1", "0", "0", "1", "0", "1", "0", "0"},
            {"Riachuelo", "0", "1", "0", "1", "0",
                    "1", "0", "1", "1", "0", "0", "1", "0", "0",
                    "1", "0", "0", "1", "0", "1", "0", "0"},
            {"Ribeiropolis", "1", "1", "1", "0", "0",
                    "1", "0", "1", "1", "1", "0", "1", "1", "0",
                    "0", "0", "0", "1", "0", "0", "0", "0"},
            {"Sao Cristovao", "0", "0", "0", "0", "1",
                    "0", "0", "0", "0", "1", "1", "0", "0", "1",
                    "0", "0", "0", "0", "1", "0", "1", "0"},
            {"Sao Domingos", "0", "0", "0", "1", "0",
                    "1", "0", "0", "0", "0", "0", "0", "0", "0",
                    "0", "0", "0", "0", "0", "1", "0", "1"},
            {"Carira", "0", "1", "0", "0", "0",
                    "1", "0", "1", "1", "0", "0", "1", "1", "0",
                    "1", "0", "0", "0", "0", "0", "0", "0"},
            {"Areia Branca", "1", "0", "0", "0", "1",
                    "0", "1", "0", "0", "0", "0", "0", "0", "1",
                    "0", "1", "0", "0", "0", "0", "1", "1"},
            {"Simao Dias", "0", "0", "0", "1", "0",
                    "0", "0", "0", "0", "0", "0", "1", "1", "0",
                    "0", "0", "0", "0", "0", "0", "0", "0"},
            {"Aracaju", "0", "0", "0", "0", "1",
                    "0", "0", "0", "1", "0", "1", "0", "0", "1",
                    "0", "1", "0", "0", "0", "1", "0", "0"},
            {"Campo do Brito", "1", "0", "0", "0", "0",
                    "1", "0", "0", "0", "0", "0", "0", "0", "0",
                    "0", "0", "1", "0", "1", "0", "0", "0"}
    };

    public telaMatriz() {
        setLayout(new FlowLayout());// tipo de layout
        setSize(new Dimension(900, 500));// tamanho do Formulario
        setLocationRelativeTo(null);// centralizado
        setTitle("Consultando Matriz de Adjacencias");// titulo
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// setando a ação padrão de fechamento do Formulário,
        // neste caso irá fechar o programa

        // instanciando a JTable
        table = new JTable(dados, colunas);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TableColumn col = table.getColumnModel().getColumn(0);
        int width = 200;
        col.setPreferredWidth(width);

        table.setPreferredScrollableViewportSize(new Dimension(800, 400));// barra de rolagem
        table.setFillsViewportHeight(true);


        // adicionando a tabela em uma barra de rolagem, ficará envolta , pela mesma
        JScrollPane scrollPane = new JScrollPane(table);

        // adicionando ao JFrame "Formulário" a JTable "Tabela"
        add(scrollPane);

    }

    //public static void main(String[] args) {
      //  new telaMatriz().setVisible(true);
    //}

}