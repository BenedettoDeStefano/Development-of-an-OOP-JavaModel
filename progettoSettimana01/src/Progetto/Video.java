package Progetto;

public class Video extends ElementoMultimedia implements Riproducibile {
	private int durata;
	private int volume;
	private int luminosita;
	
	public Video(String titolo, int durata, int volume, int luminosita) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
		this.luminosita = luminosita;
	}

	public int getDurata() {
		return durata;
	}

	public void aumentaLuminosita() {
		luminosita++;
	}
	
	public void diminuisciLuminosita() {
		if (volume > 0) {
			luminosita--;
		}
	}
	
	public void play() {
		for (int i = 0; i < durata; i++) {
			System.out.println(getTitolo() + ": " + "!".repeat(volume) + "*".repeat(luminosita));
		}
	}
}
