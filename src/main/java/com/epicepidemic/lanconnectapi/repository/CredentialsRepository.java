package com.epicepidemic.lanconnectapi.repository;

import com.epicepidemic.lanconnectapi.dao.Credentials;
import org.springframework.data.repository.CrudRepository;

public interface CredentialsRepository extends CrudRepository<Credentials, Long> {
}
