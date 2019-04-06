package proky.springframework.kypetclinic.services;

import proky.springframework.kypetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}
