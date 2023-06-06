package processor;

import org.example.domaine.Produit;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Component
public class FileProduitProcessor implements ItemProcessor<String[], Produit> {
    @Override
    public Produit process(String[] strings) throws Exception {
        Produit produit = new Produit();
        produit.setNom(strings[0]);
        produit.setDescription(strings[1]);
        produit.setPhotoUrl(strings[2]);
        produit.setPrixHt(new BigDecimal(strings[3]));
        return produit;
    }
}
