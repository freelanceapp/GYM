package del.gym.modal.lap_modal;

public class LapTimeModal {
    private String minute;
    private String seconds;
    private String milliseconds;


    public LapTimeModal(String minute, String seconds, String milliseconds) {
        this.minute = minute;
        this.seconds = seconds;
        this.milliseconds = milliseconds;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public String getSeconds() {
        return seconds;
    }

    public void setSeconds(String seconds) {
        this.seconds = seconds;
    }

    public String getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(String milliseconds) {
        this.milliseconds = milliseconds;
    }
}
