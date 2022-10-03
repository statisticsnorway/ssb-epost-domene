package no.ssb.epost;
import javax.xml.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lrb on 15.06.2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "mottaker",
        "emne",
        "tekst",
        "vedleggNavnOgFil"
})
@XmlRootElement(name = "epostDefinisjon",namespace = "http://www.ssb.no/")
public class EpostDefinisjon {
    String mottaker;
    String emne;
    String tekst;

    HashMap<String, byte[]> vedleggNavnOgFil = new HashMap();
    public String getMottaker() {
        return mottaker;
    }

    public void setMottaker(String mottaker) {
        this.mottaker = mottaker;
    }
    public String getEmne() {
        return emne;
    }
    public void setEmne(String emne) {
        this.emne = emne;
    }
    public String getTekst() {
        return tekst;
    }
    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public HashMap<String, byte[]> getVedleggNavnOgFil() {
        return vedleggNavnOgFil;
    }

    public void setVedleggNavnOgFil(HashMap<String, byte[]> vedleggNavnOgFil) {
        this.vedleggNavnOgFil = vedleggNavnOgFil;
    }

    public void addVedlegg(String navn, byte[] data){
        vedleggNavnOgFil.put(navn,data);
    }
}

