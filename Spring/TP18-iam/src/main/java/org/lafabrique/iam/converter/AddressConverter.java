package org.lafabrique.iam.converter;

import org.lafabrique.iam.domaine.Address;
import org.lafabrique.iam.dto.AdresseDto;

public class AddressConverter {
    public static Address convertAdresseDtoToAddressEntity(AdresseDto adresseDto) {
        Address address = new Address();

        address.setCity(adresseDto.getCity());
        address.setStreet(adresseDto.getStreet());
        address.setPostalCode(adresseDto.getPostalCode());

        return address;
    }

    public static AdresseDto convertAddressEntityToAdresseDto(Address address) {
        AdresseDto adresseDto = new AdresseDto();

        adresseDto.setCity(address.getCity());
        adresseDto.setStreet(address.getStreet());
        adresseDto.setPostalCode(address.getPostalCode());
        adresseDto.setId(address.getId());

        return adresseDto;
    }
}
