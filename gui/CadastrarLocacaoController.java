package gui;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CadastrarLocacaoController {

    @FXML
    private TextField DataFinalAno;

    @FXML
    private TextField DataFinalDia;

    @FXML
    private TextField DataFinalMes;

    @FXML
    private TextField DataInicialAno;

    @FXML
    private TextField DataInicialDia;

    @FXML
    private TextField DataInicialMes;

    @FXML
    private TextField EscreverCPF;

    @FXML
    private TextField EscreverPlaca;


    void fazerCadastro(ActionEvent event){
        String cpf = EscreverCPF.getText();
        String placa = EscreverPlaca.getText();
        String dia = DataInicialDia.getText();
        String mes = DataInicialMes.getText();
        String ano = DataInicialAno.getText();

        String dia2 = DataFinalDia.getText();
        String mes2 = DataFinalMes.getText();
        String ano2 = DataFinalAno.getText();

        
       
    }
}


