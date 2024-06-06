package org.example.dto;
import jakarta.ws.rs.QueryParam;
public class JobFilterDto {

    private @QueryParam("main_salary") double main_salary;
    private @QueryParam("limit") Integer limit;
    private @QueryParam("offset") int offset;

    public Integer getLimit() {
        return limit;
    }

    public int getOffset() {
        return offset;
    }

    public Double getMin_salary() {
        return main_salary;
    }

    public void setMin_salary(Double min_salary) {
        this.main_salary = min_salary;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}

