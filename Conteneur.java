package cmd;
// This class is not part of the architecture; it mimics the Java class to avoid receiving the error 'Container object can't be found'.
public class Conteneur {

    private Integer conteneurId;

    private String code;

    private String nom;

    private Float temp;

    private String piece;

    private Integer nbrNiv;

    private Integer nbrEnc;

    private String description;

    private Boolean archive = false;


    public Integer getConteneurId() {
        return conteneurId;
    }

    public void setConteneurId(Integer conteneurId) {
        this.conteneurId = conteneurId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Float getTemp() {
        return temp;
    }

    public void setTemp(Float temp) {
        this.temp = temp;
    }

    public String getPiece() {
        return piece;
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }

    public Integer getNbrNiv() {
        return nbrNiv;
    }

    public void setNbrNiv(Integer nbrNiv) {
        this.nbrNiv = nbrNiv;
    }

    public Integer getNbrEnc() {
        return nbrEnc;
    }

    public void setNbrEnc(Integer nbrEnc) {
        this.nbrEnc = nbrEnc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }
}
