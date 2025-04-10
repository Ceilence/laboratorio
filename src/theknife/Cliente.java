/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package theknife;
import java.util.ArrayList;

/**
 *
 * @author davim antoniopardo alefrigio
 */
public class Cliente extends ArchivioUtenti{
    
    private String nomeUtente;
    private String mailUtente;
    private String posizioneUtente;
    private String passUtente;
    private int id;

    public Cliente(String nomeUtente, String mailUtente, String posizioneUtente, String passUtente, int id) {
        this.nomeUtente = nomeUtente;
        this.mailUtente = mailUtente;
        this.posizioneUtente = posizioneUtente;
        this.passUtente = passUtente;
        this.id = id;
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    public String getMailUtente() {
        return mailUtente;
    }

    public void setMailUtente(String mailUtente) {
        this.mailUtente = mailUtente;
    }

    public String getPosizioneUtente() {
        return posizioneUtente;
    }

    public void setPosizioneUtente(String posizioneUtente) {
        this.posizioneUtente = posizioneUtente;
    }

    public String getPassUtente() {
        return passUtente;
    }

    public void setPassUtente(String passUtente) {
        this.passUtente = passUtente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
