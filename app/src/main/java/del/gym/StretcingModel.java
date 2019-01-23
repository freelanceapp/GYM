package del.gym;

import android.os.Parcel;
import android.os.Parcelable;

public class StretcingModel implements Parcelable {

    private int image1;
    private String name;

    public StretcingModel(int image1, String name) {
        this.image1 = image1;
        this.name = name;
    }

    protected StretcingModel(Parcel in) {
        image1 = in.readInt();
        name = in.readString();
    }

    public static final Creator<StretcingModel> CREATOR = new Creator<StretcingModel>() {
        @Override
        public StretcingModel createFromParcel(Parcel in) {
            return new StretcingModel(in);
        }

        @Override
        public StretcingModel[] newArray(int size) {
            return new StretcingModel[size];
        }
    };

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(image1);
        dest.writeString(name);
    }
}
