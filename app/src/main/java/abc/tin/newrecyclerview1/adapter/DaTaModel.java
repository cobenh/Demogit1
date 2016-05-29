package abc.tin.newrecyclerview1.adapter;

/**
 * Created by Administrator on 22/05/2016.
 */
public class DaTaModel {
    String ten;
    String nhiemvu;
    int id_;
    int image;

    public DaTaModel(String ten, String nhiemvu, int id_, int image) {
        this.ten = ten;
        this.nhiemvu = nhiemvu;
        this.id_ = id_;
        this.image=image;
    }


    public String getTen() {
        return ten;
    }


    public String getNhiemvu() {
        return nhiemvu;
    }

    public int getImage() {
        return image;
    }

    public int getId() {
        return id_;
    }
}
