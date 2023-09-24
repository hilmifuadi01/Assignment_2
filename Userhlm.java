package com.postgresql.demo.hlm;

import com.postgresql.demo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Userhlm extends JpaRepository<User, Long> {
}
