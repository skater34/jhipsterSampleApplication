package com.mindfulwebs.jhipster.application.repository;

import com.mindfulwebs.jhipster.application.domain.Authority;

/**
 * Spring Data Couchbase repository for the Authority entity.
 */
public interface AuthorityRepository extends N1qlCouchbaseRepository<Authority, String> {
}
