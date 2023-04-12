package com.project.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.payment.model.list_transaksi;

public interface ListTransaksiRepository extends JpaRepository<list_transaksi, Integer> {
}
