package main;

import javax.swing.*;
import javax.swing.JCheckBox;
public class Guia extends JFrame {

    private JTextArea campoTexto;
    private JComboBox<String> selecionar;
    private String[] opcao = {"Baixa","Média","Alta","Urgente"};

    public Guia(){
        setTitle("Cadastro de Tarefas");
        setSize(600,350);
        configurarGuia();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void configurarGuia() {
        JPanel painel = new JPanel();
        painel.setLayout(null);

        campoTexto = new JTextArea(30,80);
        campoTexto.setBounds(50,40,500,90);
        campoTexto.setBorder(BorderFactory.createLineBorder(getForeground()));

        JLabel label = new JLabel("Tarefa");
        label.setBounds(50,8,100,30);
        label.setOpaque(true);

        JLabel label2 = new JLabel("Prioridade");
        label2.setBounds(50,140,100,30);
        label2.setOpaque(true);

        selecionar = new JComboBox<>(opcao);
        selecionar.setBounds(50,180,500,30);

        JButton botaoSalvar = new JButton("Salvar");
        botaoSalvar.setBounds(450, 280, 100, 25);

        JButton botaoCancela = new JButton("Cancelar");
        botaoCancela.setBounds(320, 280, 100, 25);

        JCheckBox checkBox = new JCheckBox("Finalizado");
        checkBox.setBounds(45,220,100,25);

        painel.add(label);
        painel.add(label2);
        painel.add(botaoSalvar);
        painel.add(botaoCancela);
        painel.add(checkBox);
        painel.add(selecionar);
        painel.add(campoTexto);
        add(painel);
    }
}