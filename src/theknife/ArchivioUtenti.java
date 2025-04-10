/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package theknife;
import java.util.ArrayList;

/**
 *
 * @author SSSSUGOI
 */
public class ArchivioUtenti {
    ArrayList<Cliente> archivio;

    public ArchivioUtenti() {
        archivio = new ArrayList<>();
    }

    public ArrayList<Cliente> getArchivio() {
        return archivio;
    }

    public void setArchivio(ArrayList<Cliente> archivio) {
        this.archivio = archivio;
    }
    
    public void aggiungi(Cliente cliente){
        archivio.add(cliente);
    }
    
    public int cercaUsername(String username){
        for(Cliente cliente: archivio)
            if(cliente.getNomeUtente().equals(username))
                return 1;
        return 0;
    }
}
