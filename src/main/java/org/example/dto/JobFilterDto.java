package org.example.dto;
import jakarta.ws.rs.QueryParam;
public class JobFilterDto {

    private @QueryParam("main_salary") double main_salary;
    private @QueryParam("limit") Integer limit;
    private @QueryParam("offset") int offset;

    public double getLocId() {
        return main_salary;
    }

    public void setMain_salary(double main_salary) {
        this.main_salary = main_salary;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}



