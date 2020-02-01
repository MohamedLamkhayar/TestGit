package org.sid.metier;

import java.util.Optional;

import org.sid.entities.Compte;
import org.sid.entities.Operations;
import org.springframework.data.domain.Page;

public interface IBanqueMetier {
public Optional<Compte> consulterCompte(String codeCpte);
public void verser(String codeCpte,double montant);
public void retirer(String codeCpte,double montant);
public void virement(String codeCpte1,String codeCpte2,double montant);
public Page<Operations> listOperation(String codeCpte,int page,int size);


}
