package com.lafabrique.ERP.converter;

import com.lafabrique.ERP.domaine.Address;
import com.lafabrique.ERP.domaine.Client;
import com.lafabrique.ERP.dto.AddressDto;
import com.lafabrique.ERP.dto.ClientDetailDto;

public class ClientConverter {
    public static Client convertNoModelMapperClientDetailDtoToClientEntity(ClientDetailDto clientDetailDto) {
        Client client = new Client();
        client.setAvatar(clientDetailDto.getAvatar());
        client.setFirstname(clientDetailDto.getFirstname());
        client.setSurname(clientDetailDto.getSurname());
        client.setBirthday(clientDetailDto.getBirthday());
        client.setAddress(convertAddressDtoToAddressEntity(clientDetailDto.getAdresseDto()));
        return client;
    }

    public static Address convertAddressDtoToAddressEntity(AddressDto addressDto) {
        Address address = new Address();
        address.setPostalCode(addressDto.getPostalCode());
        address.setStreet(addressDto.getStreet());
        address.setCity(addressDto.getCity());
        return address;
    }
}
