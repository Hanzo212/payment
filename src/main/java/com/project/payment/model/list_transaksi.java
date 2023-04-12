package com.project.payment.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class list_transaksi {
	
	@Id
	@Column(name="id_transaksi")
	private Integer id_transaksi;
	@Column(name = "nama_paket")
	private String nama_paket;
	@Column(name = "id_pelanggan")
	private String id_pelanggan;
	@Column(name="nama_pelanggan")
	private String nama_pelanggan;
	@Column(name="nominal")
	private Double nominal;
	@Column(name="nomor_rek")
	private int nomor_rek;
	@Column(name="status_transaksi")
	private String status_transaksi;
	
}
