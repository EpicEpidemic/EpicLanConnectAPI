package com.epicepidemic.lanconnectapi.service;

import com.epicepidemic.lanconnectapi.dao.Credentials;
import com.epicepidemic.lanconnectapi.dao.Provider;
import com.epicepidemic.lanconnectapi.dao.User;
import com.epicepidemic.lanconnectapi.repository.CredentialsRepository;
import com.epicepidemic.lanconnectapi.repository.ProviderRepository;
import com.epicepidemic.lanconnectapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAddService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    ProviderRepository providerRepository;
    @Autowired
    CredentialsRepository credentialsRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User addUser(String firstName, String lastName, String username, String email) {
        Provider provider = providerRepository.findOne(1L);
        if(provider == null) {
            provider = new Provider();
            provider.setName("Facebook");
            provider = providerRepository.save(provider);
            System.out.println("Created new provider, Facebook with an id of: " + provider.getId());
        }
        User newUser = new User();
        newUser.setFirstName(firstName);
        newUser.setLastName(lastName);
        newUser.setUsername(username);
        newUser.setEmail(email);
        User savedUser = userRepository.save(newUser);

        Credentials credentials = new Credentials();
        credentials.setToken("testtoken");
        credentials.setUserId(savedUser);
        credentials.setProviderId(provider);
        Credentials savedCredentials = credentialsRepository.save(credentials);
        if(savedCredentials != null ) {
            System.out.println("New credential id = " + savedCredentials.getId().toString());
        }
        return new User();
    }
}
