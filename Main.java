import java.util.ArrayList;
import java.util.List;

import gerenciar.Cliente;
import gerenciar.GerenciarClientes;
import gerenciar.GerenciarLocacoes;
import gerenciar.GerenciarVeiculo;
import gerenciar.Locacao;
import gerenciar.Veiculo;
import gui.MenuPrincipal;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import controller.ClienteCadastroController;
public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
       //List<Veiculo> veiculos = new ArrayList<>(); 
       //List<Cliente> clientes = new ArrayList<>();
       //List<Locacao> locacoes = new ArrayList<>();

       
       

       //MenuPrincipal menuPrincipal = new MenuPrincipal(new GerenciarLocacoes(locacoes), new GerenciarClientes(clientes), new GerenciarVeiculo(veiculos));
        
        //MenuPrincipal menuPrincipal = new MenuPrincipal(new GerenciarLocacoes(), new GerenciarClientes(), new GerenciarVeiculo());
        //menuPrincipal.menuPrincipal();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("CadastroCliente.fxml"));
        Parent root = fxmlloader.load();
        Scene tela = new Scene(root);

        primaryStage.setTitle("Aluguel de Automoveis");
        primaryStage.setScene(tela);
        primaryStage.show();
        
    }
}
