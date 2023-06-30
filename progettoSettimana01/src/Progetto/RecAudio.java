package Progetto;

public class RecAudio extends ElementoMultimedia implements Riproducibile {

	private int durata;
	private int volume;

	public RecAudio(String titolo, int durata, int volume) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
	}

	public int getDurata() {
		return durata;
	}

	public void abbassaVolume() {
		if (volume == 0) {
			volume--;
		}
	}

	public void alzaVolume() {
		volume++;
	}

	public void play() {
		for (int i = 0; i < durata; i++) {
			System.out.println(getTitolo() + ": " + "!".repeat(volume));
		}
	}
}
