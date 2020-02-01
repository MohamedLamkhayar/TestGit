package org.sid.dao;

import org.sid.entities.Operations;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OperationRepository extends JpaRepository<Operations, Long> {
	@Query("select o from Operations o where o.compte.codeCompte=:x order by o.dateOperation desc")
	public Page<Operations> listOpertion(@Param("x")String codeCpte,Pageable pageable);

}
