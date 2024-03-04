package godfunrefun.ressentiment.repository;

import godfunrefun.ressentiment.domain.interaction.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InteractionRepository extends JpaRepository<Result, Long>{

}
