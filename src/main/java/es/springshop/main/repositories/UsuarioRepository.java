package es.springshop.main.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import es.springshop.main.models.Usuarios;
import es.springshop.main.services.IUsuario;

@Repository
@Transactional
public class UsuarioRepository implements IUsuario{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Usuarios> getUsuarios() {
		String query = "FROM Usuario";
		return entityManager.createQuery(query).getResultList();
	}

	@Override
	public void borrarUsuario(Long id) {
		Usuarios usuario = entityManager.find(Usuarios.class, id);
		entityManager.remove(usuario);
	}

	@Override
	public void registrarUsuario (Usuarios usuario) {
		entityManager.merge(usuario);
	}

	@Override
	public boolean loguearUsuario(Usuarios usuario) {
		String query = "FROM Usuario WHERE email = :email AND pwd = :pwd";
		List<Usuarios> lista = entityManager.createQuery(query).setParameter("email", usuario.getEmailUsuario()).setParameter("pwd", usuario.getPsswrdUsuario()).getResultList();
		return !lista.isEmpty();
		
	}
}
