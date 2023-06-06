package processor;

import dto.ProduitDetailsDto;
import org.example.domaine.Produit;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Component
public class FileProduitProcessor implements ItemProcessor<ProduitDetailsDto, Produit> {
    @Override
    public Produit process(ProduitDetailsDto dto) throws Exception {
        Produit produit = new Produit();
        produit.setNom(dto.getNom());
        produit.setDescription(dto.getDescription());
        produit.setPhotoUrl(dto.getPhotoUrl());
        produit.setPrixHt(dto.getPrixHT());

        return produit;
    }
}
