/**
 * 
 */
package br.com.jcmar.dao;

import br.com.jcmar.dao.generic.GenericDAO;
import br.com.jcmar.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

}
