package encuesta;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;

import com.pe.encuesta.dao.UserDao;
import com.pe.encuesta.dao.mongo.UserDaoImpl;
import com.pe.encuesta.model.Usuario;

public class UserDaoMock {
	


	@Test
	public void testValidateUser() {
		boolean flag= new UserDaoImpl().validateUser(new Usuario());
		assertEquals(true, flag);
	}

}
