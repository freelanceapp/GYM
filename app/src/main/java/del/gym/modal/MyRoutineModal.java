package del.gym.modal;

import android.os.Parcel;
import android.os.Parcelable;

public class MyRoutineModal implements Parcelable {

    private int _id = 0;
    private String exercise;
    private String repetition;
    private String countSet;
    private String weight;
    private String days;

    public MyRoutineModal() {

    }

    public MyRoutineModal(String exercise, String repetition, String countSet,
                          String weight, String days) {
        this.exercise = exercise;
        this.repetition = repetition;
        this.countSet = countSet;
        this.weight = weight;
        this.days = days;
    }

    public MyRoutineModal(int _id, String exercise, String repetition, String countSet,
                          String weight, String days) {
        this._id = _id;
        this.exercise = exercise;
        this.repetition = repetition;
        this.countSet = countSet;
        this.weight = weight;
        this.days = days;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    protected MyRoutineModal(Parcel in) {
        exercise = in.readString();
        repetition = in.readString();
        countSet = in.readString();
        weight = in.readString();
    }

    public static final Creator<MyRoutineModal> CREATOR = new Creator<MyRoutineModal>() {
        @Override
        public MyRoutineModal createFromParcel(Parcel in) {
            return new MyRoutineModal(in);
        }

        @Override
        public MyRoutineModal[] newArray(int size) {
            return new MyRoutineModal[size];
        }
    };

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String extraStuffs) {
        this.exercise = extraStuffs;
    }

    public String getRepetition() {
        return repetition;
    }

    public void setRepetition(String repetition) {
        this.repetition = repetition;
    }

    public String getCountSet() {
        return countSet;
    }

    public void setCountSet(String countSet) {
        this.countSet = countSet;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(exercise);
        dest.writeString(repetition);
        dest.writeString(countSet);
        dest.writeString(weight);
        dest.writeString(days);
    }
}
