package org.example.models;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Jobs {
    private String Job_title;
    private int Job_id;
    private double min_sal;
    private double max_sal;

     public Jobs(String Job_title, int Job_id, double min_sal, double max_sal  ){
         this.Job_title = Job_title;
         this.Job_id = Job_id;
         this.min_sal=min_sal;
         this.max_sal=max_sal;

     }
     public Jobs (ResultSet rs) throws SQLException {
         Job_title = rs.getNString("Job_title");
         Job_id = rs.getInt("Job_id");
         min_sal = rs.getDouble("min_salary");
         max_sal = rs.getDouble("max_salary");

     }
     @Override
    public String toString() {
         return "Jobs{" +
                 "Job_title='" + Job_title + '\'' +
                 ", Job_id= " + Job_id +
                 ",min_salary= " + min_sal +
                 ",max_salary= " + max_sal +
                 '}';

     }

    public String getJob_title() {
        return Job_title;
    }

    public void setJob_title(String job_title) {
        Job_title = job_title;
    }

    public double getMin_sal() {
        return min_sal;
    }

    public void setMin_sal(double min_sal) {
        this.min_sal = min_sal;
    }

    public int getJob_id() {
        return Job_id;
    }

    public void setJob_id(int job_id) {
        Job_id = job_id;
    }

    public double getMax_sal() {
        return max_sal;
    }

    public void setMax_sal(double max_sal) {
        this.max_sal = max_sal;
    }
}
