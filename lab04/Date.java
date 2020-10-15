package lab04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
public class Date {
    //The private instance variables
    private  int year,month,day;

  public  Date(int year, int month, int day){
      this.year = year;
      this.month = month;
      this.day = day;
  }
  /**Returns the year*/
  public int getYear() {return this.year;}
  /**Returns the month*/
  public  int getMonth() {return this.month;}
  /**Returns the day*/
  public int getDay() {return this.day;}
  /**Sets the year.No input validation*/
  public void setYear(int year) {this.year = year;}
  /**Sets the month.No input validation*/
  public void setMonth(int month) {this.month = month;}
  /**Sets the day.No input validation*/
  public void setDay(int day) {this.day = day;}

  public String toString() {
      return String.format("%0.2d/%0.2d/%4d", month, day, year);}
      /** Sets year,month,day.No input validation*/
       public  void setDate(int year,int month, int day) {
           this.year = year;
           this.month = month;
           this.day = day;
       }
}
