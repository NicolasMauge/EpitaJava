package org.lafabrique.iam.converter;

import org.lafabrique.iam.domaine.Address;
import org.lafabrique.iam.domaine.Client;
import org.lafabrique.iam.domaine.Role;
import org.lafabrique.iam.dto.AdresseDto;
import org.lafabrique.iam.dto.ClientDto;
import org.lafabrique.iam.dto.RoleDto;

import java.util.List;

public class ClientConverter {
    public static Client convertClientDtoToClientEntity(ClientDto clientDto) {
        Client client = new Client();

        client.setEmail(clientDto.getEmail());
        client.setPassword(clientDto.getPassword());

        List<Role> roles = RoleConverter.convertRoleDtoToRoleEntity(clientDto.getRoles());
        client.setRoles(roles);

        System.out.println("roles : "+ roles);

        Address address = AddressConverter.convertAdresseDtoToAddressEntity(clientDto.getAdresseDto());
        client.setAddress(address);

        return client;
    }

    public static ClientDto convertClientDtoToClientEntity(Client client) {
        ClientDto clientDto = new ClientDto();

        clientDto.setEmail(client.getEmail());
        clientDto.setPassword(client.getPassword());
        clientDto.setId(client.getId());

        List<RoleDto> rolesDto = RoleConverter.convertRoleEntityToRoleDto(client.getRoles());
        clientDto.setRoles(rolesDto);

        AdresseDto adresseDto = AddressConverter.convertAddressEntityToAdresseDto(client.getAddress());
        clientDto.setAdresseDto(adresseDto);

        return clientDto;
    }
}
