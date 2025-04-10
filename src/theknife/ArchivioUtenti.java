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
    ArrayList<Cliente> archivio = new ArrayList<>();

    public ArchivioUtenti() {
    }

    public ArrayList<Cliente> getArchivio() {
        return archivio;
    }

    public void setArchivio(ArrayList<Cliente> archivio) {
        this.archivio = archivio;
    }
    
}
