import java.util.ArrayList;
import java.util.List;

public class GerenciadorUsuarios {
    private List<Usuario> usuarios = new ArrayList<>();

    public void adicionarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
