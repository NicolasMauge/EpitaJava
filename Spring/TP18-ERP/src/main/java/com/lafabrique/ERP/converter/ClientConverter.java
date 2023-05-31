package com.lafabrique.ERP.converter;

import com.lafabrique.ERP.domaine.*;
import com.lafabrique.ERP.dto.*;

import java.util.Optional;

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

    public static Address convertAddressDtoToAddressEntity(AddressDto addressDto) {
        Address address = new Address();
        address.setId(addressDto.getId());
        address.setPostalCode(addressDto.getPostalCode());
        address.setStreet(addressDto.getStreet());
        address.setCity(addressDto.getCity());
        return address;
    }
    public static Client convertClientMinDtoToClient(ClientDetailDto clientDetailDto) {
        Client client = new Client();
        client.setAvatar(clientDetailDto.getAvatar());
        client.setSurname(clientDetailDto.getSurname());
        client.setFirstname(clientDetailDto.getFirstname());
        client.setAddress(convertAddressDtoToAddressEntity(clientDetailDto.getAdresseDto()));
        return client;
    }
}
