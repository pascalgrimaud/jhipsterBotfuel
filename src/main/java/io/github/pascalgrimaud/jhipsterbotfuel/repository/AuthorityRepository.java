package io.github.pascalgrimaud.jhipsterbotfuel.repository;

import io.github.pascalgrimaud.jhipsterbotfuel.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
