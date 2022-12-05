package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ClienteCadastroController {

    @FXML
    private TextField bairro;

    @FXML
    private Button cadastrar_botao;

    @FXML
    private TextField cep;

    @FXML
    private TextField cidade;

    @FXML
    private TextField cnh;

    @FXML
    private TextField cpf;

    @FXML
    private TextField nome;

    @FXML
    private TextField num_casa;

    @FXML
    private TextField rua;

    @FXML
    private TextField telefone;

    @FXML
    void cadastrarMethod(ActionEvent event) {
        System.out.println("Cadastro realizado com sucesso!");
    }

}
