package com.wavelet.repository;

import com.wavelet.model.Health;
import org.springframework.data.repository.CrudRepository;

public interface HealthRepository extends CrudRepository<Health, String> {
}