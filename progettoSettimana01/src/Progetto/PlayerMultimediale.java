package Progetto;

import java.util.Scanner;

public class PlayerMultimediale {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ElementoMultimedia[] elementi = new ElementoMultimedia[5];

		System.out.println("⚠️ Registra 5 elementi ⚠️");

		for (int i = 0; i < 5; i++) {
		    System.out.print("Inserisci il titolo dell'elemento multimediale: ");
		    String titolo = scanner.nextLine();

		    System.out.print("Seleziona il tipo di elemento (1 = Registrazione audio, 2 = Video, 3 = Immagine): ");
		    int tipo = scanner.nextInt();
		    scanner.nextLine();


		    if (tipo == 1) {
		        System.out.print("Inserisci la durata dell'elemento multimediale: ");
		        int durata = scanner.nextInt();
		        scanner.nextLine();

		        System.out.print("Inserisci il volume della registrazione audio: ");
		        int volume = scanner.nextInt();
		        scanner.nextLine();

		        elementi[i] = new RecAudio(titolo, durata, volume);
		    } else if (tipo == 2) {
		        System.out.print("Inserisci la durata dell'elemento multimediale: ");
		        int durata = scanner.nextInt();
		        scanner.nextLine();

		        System.out.print("Inserisci il volume del video: ");
		        int volume = scanner.nextInt();
		        scanner.nextLine();

		        System.out.print("Inserisci la luminosità del video: ");
		        int luminosita = scanner.nextInt();
		        scanner.nextLine();

		        elementi[i] = new Video(titolo, durata, volume, luminosita);
		    } else if (tipo == 3) {
		        System.out.print("Inserisci la luminosità dell'immagine: ");
		        int luminosita = scanner.nextInt();
		        scanner.nextLine();

		        elementi[i] = new Immagine(titolo, luminosita);
			} else {
				System.out.println("🚫 Errore nella scelta del tipo 🚫️");
				i--;
		        continue;
			}
			System.out.println("✅ Elemento creato ✅");
		}

		int scelta = -1;
		while (scelta != 0) {
			System.out.print("Seleziona un elemento da eseguire (1-5) oppure 0 per uscire: ");
			scelta = scanner.nextInt();
			scanner.nextLine();

			if (scelta >= 1 && scelta <= 5) {
				ElementoMultimedia elemento = elementi[scelta - 1];

				if (elemento instanceof Riproducibile) {
					Riproducibile riproducibile = (Riproducibile) elemento;
					riproducibile.play();
				} else if (elemento instanceof Immagine) {
					Immagine immagine = (Immagine) elemento;
					immagine.show();
				}
			}
		}
		System.out.println("Programma terminato");
		scanner.close();
	}
}