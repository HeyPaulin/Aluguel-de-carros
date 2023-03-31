import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class Aluguel extends JFrame {
    public static void main(String[] args) {
        Aluguel aluguel = new Aluguel();
        aluguel.preparatelaJFormattedTextField();
    }

    private void preparatelaJFormattedTextField() {
        Container janela = getContentPane();
        janela.setLayout(null);

        JLabel labelDadosdoCarro = new JLabel("Dados do Carro");
        JLabel labelDadosdoCliente = new JLabel("Dados do Cliente");
        JLabel labelNome = new JLabel("Nome:");
        JLabel labelCPF = new JLabel("CPF:");
        JLabel labelTel = new JLabel("Tel:");

        JLabel labelModelo = new JLabel("Modelo:");
        JLabel labelPlaca = new JLabel("Placa:");
        JLabel labelAno = new JLabel("Ano:");
        JLabel labelDatadeLocacao = new JLabel("Data de Locação:");
        JLabel labelDatadeEntrega = new JLabel("Data de Entrega:");

        janela.add(labelNome);
        janela.add(labelCPF);
        janela.add(labelTel);

        janela.add(labelModelo);
        janela.add(labelPlaca);
        janela.add(labelAno);
        janela.add(labelDatadeLocacao);
        janela.add(labelDatadeEntrega);

        labelDadosdoCliente.setBounds(50, 5, 100, 20);
        labelDadosdoCarro.setBounds(50, 120, 100, 20);
        labelNome.setBounds(50, 40, 100, 20);
        labelCPF.setBounds(50, 60, 100, 20);
        labelTel.setBounds(50, 80, 100, 20);

        labelModelo.setBounds(50, 150, 100, 20);
        labelPlaca.setBounds(50, 170, 100, 20);
        labelAno.setBounds(50, 190, 100, 20);
        labelDatadeLocacao.setBounds(50, 210, 100, 20);
        labelDatadeEntrega.setBounds(50, 230, 100, 20);

        MaskFormatter mascaraNome = null;
        MaskFormatter mascaraCPF = null;
        MaskFormatter mascaraTel = null;

        MaskFormatter mascaraModelo = null;
        MaskFormatter mascaraPlaca = null;
        MaskFormatter mascaraAno = null;
        MaskFormatter mascaraDatadeLocacao = null;
        MaskFormatter mascaraDatadeEntrega = null;
        try {
            mascaraCPF = new MaskFormatter("###.###.###-##");
            mascaraTel = new MaskFormatter("(##)#####-####");
            mascaraAno = new MaskFormatter("##/##");
            mascaraDatadeLocacao = new MaskFormatter("##/##/####");
            mascaraDatadeEntrega = new MaskFormatter("##/##/####");
            mascaraAno.setPlaceholderCharacter('_');
            mascaraDatadeLocacao.setPlaceholderCharacter('_');
            mascaraDatadeEntrega.setPlaceholderCharacter('_');
            mascaraCPF.setPlaceholderCharacter('_');
            mascaraTel.setPlaceholderCharacter('_');
        } catch (ParseException excp) {
            System.err.println("Erro na formatação" + excp.getMessage());
            System.exit(-1);
        }
        JButton salvar = new JButton("Salvar");
        JFormattedTextField JFormattedTextNome = new JFormattedTextField(mascaraNome);
        JFormattedTextField JFormattedTextCPF = new JFormattedTextField(mascaraCPF);
        JFormattedTextField JFormattedTextTel = new JFormattedTextField(mascaraTel);
        JFormattedTextField JFormattedTextModelo = new JFormattedTextField(mascaraModelo);
        JFormattedTextField JFormattedTextPlaca = new JFormattedTextField(mascaraPlaca);
        JFormattedTextField JFormattedTextAno = new JFormattedTextField(mascaraAno);
        JFormattedTextField JFormattedTextDatadeLocacao = new JFormattedTextField(mascaraDatadeLocacao);
        JFormattedTextField JFormattedTextDatadeEntrega = new JFormattedTextField(mascaraDatadeEntrega);
        JFormattedTextNome.setBounds(150, 40, 200, 20);
        JFormattedTextCPF.setBounds(150, 60, 100, 20);
        JFormattedTextTel.setBounds(150, 80, 100, 20);
        JFormattedTextModelo.setBounds(150, 150, 100, 20);
        JFormattedTextPlaca.setBounds(150, 170, 100, 20);
        JFormattedTextAno.setBounds(150, 190, 100, 20);
        JFormattedTextDatadeLocacao.setBounds(150, 210, 100, 20);
        JFormattedTextDatadeEntrega.setBounds(150, 230, 100, 20);
        salvar.setBounds(150, 300, 100, 20);



        janela.add(labelDadosdoCliente);
        janela.add(labelDadosdoCarro);
        janela.add(labelNome);
        janela.add(labelCPF);
        janela.add(labelTel);
        janela.add(labelModelo);
        janela.add(labelPlaca);
        janela.add(labelAno);
        janela.add(labelDatadeLocacao);
        janela.add(labelDatadeEntrega);
        janela.add(JFormattedTextNome);
        janela.add(JFormattedTextCPF);
        janela.add(JFormattedTextTel);
        janela.add(JFormattedTextModelo);
        janela.add(JFormattedTextPlaca);
        janela.add(JFormattedTextAno);
        janela.add(JFormattedTextDatadeLocacao);
        janela.add(JFormattedTextDatadeEntrega);
        janela.add(salvar);

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}