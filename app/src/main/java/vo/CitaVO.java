package vo;

/**
 * Created by Christian on 7/6/2016.
 */
public class CitaVO {

    private  String tituloCita;
    private String fechaCIta;
    private String horaCita;

    public CitaVO(){

    }

    public CitaVO(String tituloCita, String fechaCIta, String horaCita) {
        this.tituloCita = tituloCita;
        this.fechaCIta = fechaCIta;
        this.horaCita = horaCita;
    }

    public String getTituloCita() {
        return tituloCita;
    }

    public void setTituloCita(String tituloCita) {
        this.tituloCita = tituloCita;
    }

    public String getFechaCIta() {
        return fechaCIta;
    }

    public void setFechaCIta(String fechaCIta) {
        this.fechaCIta = fechaCIta;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }
}
