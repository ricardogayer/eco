package com.mwave.eco;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScanNotaFiscalRepository extends JpaRepository<ScanNotaFiscal,Long> {

}
