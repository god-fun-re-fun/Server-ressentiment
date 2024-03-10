package godfunrefun.ressentiment.repository;

import godfunrefun.ressentiment.domain.interaction.Result;
import godfunrefun.ressentiment.dto.response.InteractionResultResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InteractionRepository extends JpaRepository<Result, Long>{

    //최신값 하나만 가져온다.
    @Query("select r from Result r order by r.resultId desc limit 1")
    Result findNewest();
}
