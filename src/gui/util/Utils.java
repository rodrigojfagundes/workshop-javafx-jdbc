package gui.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

//classe utilitaria, q serve para RETORNAR o STAGE/PALCO atual
//ou SEJA em QUAL TELA esta aberta atualmente no software
public class Utils {
	
	//exemplo SE aperta em um BOTAO e para pegar o STAGE desse BOTAO...
	
	//funcao q retorna o STAGE/PALCO/TELA atual
	public static Stage currentStage(ActionEvent event) {
		return (Stage)((Node)event.getSource()).getScene().getWindow();
	}
}
