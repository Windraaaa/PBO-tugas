package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Mahasiswa;
import id.ac.undiksha.siak.entities.Dosen;
import id.ac.undiksha.siak.entities.Pegawai;

public class main {

	public static void main(String[] args) {
		Mahasiswa mhs1 = new Mahasiswa(
				"Windra",
				"Denpasar", 
				"2115101075",
				true,
				"Ilmu Komputer",
				"Teknik Informatika",
				"Teknik dan Kejuruan"
				);

		
		Dosen dos1 = new Dosen(
				"198806222015041003",
				"A.A Gede Yudhi Paramartha, S.Kom., M.Kom.",
				true,
				"singaraja",
				"Koorprodi",
				"Ilmu Komputer",
				"Teknik Informatika",
				"Teknik dan Kejuruan"
				);
		
		Pegawai pgw1 = new Pegawai(
				"850043814",
				"Indra K Ortega",
				true,
				"Singaraja",
				"Perpustakaan",
				"No Info"
				);
		mhs1.printAllInfo();
		System.out.println("\n");
		dos1.printAllInfo();
		System.out.println("\n");
		pgw1.printAllInfo();
		
	}

}