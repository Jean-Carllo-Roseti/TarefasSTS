/**
 * 
 */
package br.com.jcmar.service;

import br.com.jcmar.domain.Cliente;
import br.com.jcmar.exceptions.DAOException;
import br.com.jcmar.services.generic.IGenericService;


public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

}
