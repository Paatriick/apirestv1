package cat.itb.damir.autenticacio.basic.loginbasic.model.repositoris;

import cat.itb.damir.autenticacio.basic.loginbasic.model.entitats.Videojoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoriVideojoc extends JpaRepository<Videojoc, Long> {

}
