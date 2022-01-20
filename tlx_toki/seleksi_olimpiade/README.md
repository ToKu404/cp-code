# Seleksi Olimpiade

Menentukan apakah perserta lolos seleksi atau tidak, 
rules :
1. Terdapat tiga sesi, poin sesi 1 (0-500), poin sesi2 (0-1000), poin sesi3(0-500)
2. Sesi 3 diprioritaskan, kemudian sesi 2 lalu sesi 1

Format input.
- baris 1: banyaknya seleksi (jumlah peserta diterima)
- seleksi baris 1: dua int, jumlah peserta dan sesi ke
- seleksi baris 2: id peserta yang akan dicek
- seleksi baris 3-n = id peserta, nilai sesi 1, nilai sesi2, nilai sesi 3

Format output:
- apakah peserta yang idnya diberikan lulus atau tidak pada seleksi saat itu

'''
contoh :
2
3 1
P0001
P0001 10 100 100
P0002 0 0 200
P0003 1 100 100
3 2
P0001
P0001 10 100 100
P0002 0 0 200
P0003 1 100 100
'''

output :
- TIDAK
- YA

Batasan :
- 1 ≤ T ≤ 8
- 1 ≤ N ≤ 80
- 0 ≤ M ≤ N
- Semua ID peserta terdiri dari tepat 5 karakter yang mungkin merupakan huruf besar atau angka.
- Dijamin tidak ada dua ID peserta yang identik pada suatu seleksi.
- Dijamin tidak ada dua peserta yang memperoleh nilai yang persis sama untuk semua sesi.