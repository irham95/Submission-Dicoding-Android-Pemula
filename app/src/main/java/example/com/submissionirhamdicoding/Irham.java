package example.com.submissionirhamdicoding;

import android.os.Parcel;
import android.os.Parcelable;

public class Irham implements Parcelable {
    private String name, pengarang, photo, deskripsi, terbit, harga;

    protected Irham(Parcel in) {
        name = in.readString();
        pengarang = in.readString();
        photo = in.readString();
        deskripsi = in.readString();
        terbit = in.readString();
        harga = in.readString();
    }

    public static final Creator<Irham> CREATOR = new Creator<Irham>() {
        @Override
        public Irham createFromParcel(Parcel in) {
            return new Irham(in);
        }

        @Override
        public Irham[] newArray(int size) {
            return new Irham[size];
        }
    };

    public Irham() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getTerbit() {
        return terbit;
    }

    public void setTerbit(String terbit) {
        this.terbit = terbit;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.pengarang);
        parcel.writeString(this.photo);
        parcel.writeString(this.deskripsi);
        parcel.writeString(this.terbit);
        parcel.writeString(this.harga);
    }
}
