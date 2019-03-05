package de.cellarics.app.spring.ws.service;

import java.util.List;

import de.cellarics.app.spring.ws.shared.dto.AddressDto;

public interface AddressService {
  List<AddressDto> getAddresses(String userId);

  AddressDto getAddress(String addressId);
}