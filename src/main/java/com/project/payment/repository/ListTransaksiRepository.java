package com.project.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.payment.model.ListTransaksi;

public interface ListTransaksiRepository extends JpaRepository<ListTransaksi, Integer> {
}
