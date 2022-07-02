package aula15;

public class Container {
    private int id;
    private String desc;
    private String paisOrigem;
    private boolean materialPerigoso;

    public Container(int id, String desc, String paisOrigem, boolean materialPerigoso) {
        this.id = id;
        this.desc = desc;
        this.paisOrigem = paisOrigem;
        this.materialPerigoso = materialPerigoso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public boolean isMaterialPerigoso() {
        return materialPerigoso;
    }

    public void setMaterialPerigoso(boolean materialPerigoso) {
        this.materialPerigoso = materialPerigoso;
    }
}
