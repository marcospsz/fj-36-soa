package br.com.caelum.estoque.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebMethod;

import br.com.caelum.estoque.ws.ItemEstoque;

public class EstoqueService extends UnicastRemoteObject 
                            implements EstoqueRMI{

	private static final long serialVersionUID = 9059955802637362132L;
	
	
		
		
		public	ItemEstoque	getQuantidade(String codigo)	{		
						return	repositorio.get(codigo);
		}
					
	}	
}
