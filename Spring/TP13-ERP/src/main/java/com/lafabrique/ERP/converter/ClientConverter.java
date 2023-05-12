package com.lafabrique.ERP.converter;

import com.lafabrique.ERP.domaine.*;
import com.lafabrique.ERP.dto.*;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class ClientConverter {
    public static Client convertClientDetailDtoToClientEntity(ClientDetailDto clientDetailDto) {
        Client client = new Client();
        Address address = new Address();

        Optional.ofNullable(clientDetailDto).ifPresent((c) -> {
                    client.setId(clientDetailDto.getId());
                    client.setAvatar(clientDetailDto.getAvatar());
                    client.setFirstname(clientDetailDto.getFirstname());
                    client.setSurname(clientDetailDto.getSurname());
                    client.setBirthday(clientDetailDto.getBirthday());
                }
        );

        Optional.ofNullable(clientDetailDto.getAdresseDto()).ifPresent((adr) -> {
                    address.setId(adr.getId());
                    address.setPostalCode(adr.getPostalCode());
                    address.setStreet(adr.getStreet());
                    address.setCity(adr.getCity());
                    client.setAddress(address);
                }
        );

        return client;
    }

    public static ClientDetailDto convertClientEntityToClientDetailDto(Client client) {
        ClientDetailDto clientDetailDto = new ClientDetailDto();
        clientDetailDto.setId(client.getId());
        clientDetailDto.setAvatar(client.getAvatar());
        clientDetailDto.setFirstname(client.getFirstname());
        clientDetailDto.setSurname(client.getSurname());
        clientDetailDto.setBirthday(client.getBirthday());
        clientDetailDto.setAdresseDto(convertAddressEntityToAddressDto(client.getAddress()));
        return clientDetailDto;
    }

    public static AddressDto convertAddressEntityToAddressDto(Address address) {
        AddressDto addressDto = new AddressDto();
        addressDto.setId(address.getId());
        addressDto.setPostalCode(address.getPostalCode());
        addressDto.setStreet(address.getStreet());
        addressDto.setCity(address.getCity());
        return addressDto;
    }

    public static ProduitDetailDto convertProduitEntityToProduitDetailDto(Produit produit) {
        ProduitDetailDto produitDetailDto = new ProduitDetailDto();

        Optional.ofNullable(produit).ifPresent((p) -> {
                    produitDetailDto.setDescription(p.getDescription());
                    produitDetailDto.setId(p.getId());
                    produitDetailDto.setName(p.getName());
                    produitDetailDto.setPhoto(p.getPhoto());
                    produitDetailDto.setPrice(p.getPrice());
                }
        );

        return produitDetailDto;
    }

    public static DevisDetailDto convertDevisEntityToDevisDetailDto(Devis devis) {
        ClientDetailDto client;
        DevisDetailDto devisDetailDto = new DevisDetailDto();

        Optional.ofNullable(devis).ifPresent((d) -> {
                    devisDetailDto.setId(d.getId());
                }
        );

        Optional.ofNullable(devis.getClient()).ifPresent((c) -> {
                    devisDetailDto.setClientDetailDto(convertClientEntityToClientDetailDto(c));
                }
        );

        Optional.ofNullable(devis.getLigneDevis()).ifPresent((l) -> {
                    Set<LigneDevisDto> ligneDevisDtoSet = new HashSet<LigneDevisDto>();

                    for (LigneDevis ligne : l) {
                        LigneDevisDto ligneDevisDto = new LigneDevisDto();

                        ligneDevisDto.setProduitDetailDto(convertProduitEntityToProduitDetailDto(ligne.getProduit()));
                        ligneDevisDto.setQuantity(ligne.getQuantity());

                        ligneDevisDtoSet.add(ligneDevisDto);
                    }

                    devisDetailDto.setLigneDevisDto(ligneDevisDtoSet);
                }
        );

        return devisDetailDto;
    }
}
