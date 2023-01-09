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
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) throws Exception {
       List<Veiculo> veiculos = new ArrayList<>(); 
       List<Cliente> clientes = new ArrayList<>();
       List<Locacao> locacoes = new ArrayList<>();

       launch(args);
       

       MenuPrincipal menuPrincipal = new MenuPrincipal(new GerenciarLocacoes(locacoes), new GerenciarClientes(clientes), new GerenciarVeiculo(veiculos));
        
        //MenuPrincipal menuPrincipal = new MenuPrincipal(new GerenciarLocacoes(), new GerenciarClientes(), new GerenciarVeiculo());
        menuPrincipal.menuPrincipal();




    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CadastrarLocacaoController.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);

        primaryStage.setTitle("Cadastro");
        primaryStage.setScene(tela);
        primaryStage.show();
    }
}
