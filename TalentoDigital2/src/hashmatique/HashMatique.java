package hashmatique;
import java.util.HashMap;
import java.util.Set;

public class HashMatique {

	HashMap<String, String> trackList = new HashMap<String, String>();
	//constructor;
	public HashMatique() {
		trackList.put("Yesterday", "Yesterday, all my troubles seem so far away");
		trackList.put("Let it be", "There will be an answer, let it be");
		trackList.put("Across the universe", "They slip away across the universe");
		trackList.put("Blackbird", "Blackbird singing in the dead of night");
	}
	
	public void buscaLetra(String lyrics) {
		System.out.println(trackList.get(lyrics));
	}
	public void listadoCanciones() {
		Set<String>tracksAndLyrics = trackList.keySet();
		for(String key:tracksAndLyrics) {
			System.out.println(key+ ": "+trackList.get(key));
		}
	}
	
	public static void main(String[] args) {
		HashMatique test = new HashMatique();
		//test.buscaLetra("Let it be");
		test.listadoCanciones();

	}

}
