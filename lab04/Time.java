package lab04;

public class Time {
    private int second, minute, hour;

    /**Constructs a Time instance with the given second,minute and hour.No input validation*/
    public Time(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
    /**Constructs a Time instance with the default values */
    public Time() {
        this.second = 0;
        this.minute = 0;
        this.hour = 0;
    }
    /** Return the second */
    public int getSecond() {return this.second;}
    /** Return the minute */
    public int getMinute() {return this.minute;}
    /** Return the hour */
    public int getHour() {return this.hour;}
    /**Set the second.No input validation */
    public void setSecond(int second) {this.second = second; }
    /**Set the minute.No input validation */
    public void  setMinute(int minute) {this.minute = minute; }
    /**Set the hour.No input validation */
    public void setHour(int hour) {this.hour = hour; }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public void setTime(int second, int minute, int hour) {
        //No input validation
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
    public Time nextSecond() {
      ++second;
      if (second >= 60) {
          second = 0;
          ++minute;
          if (minute >= 60) {
              minute = 0;
              ++hour;
              if (hour >= 24) {
                  hour = 0;
              }
          }
      }
return this;
    }
}
