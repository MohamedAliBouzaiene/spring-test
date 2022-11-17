package tn.esprit.dalitest.service;

import tn.esprit.dalitest.entity.Produit;

import java.util.List;

public interface IProduitService {
    List<Produit> retrieveAllProduits();
    Produit addProduit(Produit p, Long idRayon, Long idStock);
    Produit retrieveProduit(Long id);
    void assignProduitToStock(Long idProduit, Long idStock);
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) ;
}
