# Roadmap Pengembangan Aplikasi Laundry 🧺

File ini berisi checklist tugas untuk memudahkan pemantauan progress pengembangan aplikasi laundry Anda.

## 🚀 Tahap 1: Inisialisasi & Database
- [ ] Inisialisasi proyek (Backend & Frontend)
- [ ] Perancangan Schema Database (ERD)
- [ ] Konfigurasi ORM (Drizzle/Prisma) & Migrasi Database
- [ ] Setup Environment Variables (`.env`)

## 🔐 Tahap 2: Autentikasi & User Management
- [ ] Implementasi Auth (Login/Register)
- [ ] Proteksi Route (Middleware Auth)
- [ ] Implementasi Role-Based Access Control (Admin, Pelanggan, Kurir)
- [ ] UI Form Login & Register

## 👔 Tahap 3: Manajemen Layanan & Order
- [ ] CRUD Data Master Layanan (Harga per kg/item)
- [ ] Fitur Input Order (Pelanggan)
- [ ] Fitur Verifikasi & Timbang Cucian (Admin)
- [ ] Logika Kalkulasi Total Harga Otomatis
- [ ] Sistem Update Status (Cuci -> Jemur -> Setrika -> Selesai)

## 💳 Tahap 4: Pembayaran & Notifikasi
- [ ] Integrasi Payment Gateway (Midtrans/Xendit)
- [ ] Fitur Upload Bukti Bayar (Jika Manual)
- [ ] Integrasi Notifikasi WhatsApp/Email
- [ ] Fitur Generate Nota/Invoice (PDF)

## 📊 Tahap 5: Dashboard & Reporting
- [ ] Dashboard Ringkasan (Total Order, Pendapatan)
- [ ] Grafik Statistik Penjualan
- [ ] Laporan Riwayat Transaksi (Export CSV/Excel)
- [ ] Manajemen Stok Bahan Baku (Sabun/Parfum)