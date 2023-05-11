package com.lafabrique.ERP.converter;

import com.lafabrique.ERP.domaine.Address;
import com.lafabrique.ERP.domaine.Client;
import com.lafabrique.ERP.dto.AddressDto;
import com.lafabrique.ERP.dto.ClientDetailDto;

public class ClientConverter {
    public static Client convertNoModelMapperClientDetailDtoToClientEntity(ClientDetailDto dto) {
        Client client = new Client();
        client.setAvatar(dto.getAvatar());
        client.setFirstname(dto.getFirstname());
        client.setSurname(dto.getSurname());
        client.setBirthday(dto.getBirthday());
        client.setAddress(convertAddressDtoToAddressEntity(dto.getAdresseDto()));
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
