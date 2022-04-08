import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	private List<String> contatos = new ArrayList<>();

	public Agenda(List<String> contatos) {
        this.contatos = contatos;
    }
	public List<String> getContatos() {
		return contatos;
	}

	public void setContatos(List<String> contatos) {
		this.contatos = contatos;
	}

	public void removeCOntato(int index) {
		contatos.remove(index);
	}

}
