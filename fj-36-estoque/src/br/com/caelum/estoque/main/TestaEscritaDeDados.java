package br.com.caelum.estoque.main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.estoque.rmi.ItemEstoque;

public class TestaEscritaDeDados {
	
	public static void main(String[] args) throws IOException {
		
		try(ObjectOutputStream oss = new ObjectOutputStream(
				                     new FileOutputStream("itens.bin"))){
				
			ItemEstoque item1 = new ItemEstoque("ARQ", 150);
			ItemEstoque item2 = new ItemEstoque("SOA", 100);
					
			List<ItemEstoque> itens = new ArrayList<ItemEstoque>() ;
			
			itens.add(item1);
			itens.add(item2);
					
			oss.writeObject(itens);			
		}
	}	
	
}