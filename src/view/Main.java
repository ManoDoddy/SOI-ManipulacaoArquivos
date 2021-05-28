package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Main {
	public static void main(String[] args) {
		
		IArquivosController arquivosController = new ArquivosController();
		String dirWin = "C:\\Windows";
		String path = "C:\\TEMP";
		String nome = "texte";
		
		try {
			//arquivosController.readDir(dirWin);
			//arquivosController.createFile(path, nome);
			//arquivosController.readFile(path, nome);
			arquivosController.openFile(path, nome);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
