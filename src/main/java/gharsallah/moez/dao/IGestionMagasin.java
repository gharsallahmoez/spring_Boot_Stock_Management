package gharsallah.moez.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import gharsallah.moez.model.Magasin;



@Repository
public interface IGestionMagasin extends CrudRepository<Magasin, Integer> {}
