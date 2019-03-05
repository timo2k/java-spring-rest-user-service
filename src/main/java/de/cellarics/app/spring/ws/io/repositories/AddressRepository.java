package de.cellarics.app.spring.ws.io.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.cellarics.app.spring.ws.io.entity.AddressEntity;
import de.cellarics.app.spring.ws.io.entity.UserEntity;

@Repository
public interface AddressRepository extends CrudRepository<AddressEntity, Long> {
  List<AddressEntity> findAllByUserDetails(UserEntity userEntity);

  AddressEntity findByAddressId(String addressId);
}