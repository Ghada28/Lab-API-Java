package org.example.controller;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.dao.JobDAO;
import org.example.models.Jobs;

import java.sql.SQLException;
import java.util.ArrayList;


@Path("/Jobs")
public class DepartmentControlle {
  JobDAO dao =  new JobDAO() ;


  @GET
  public ArrayList<Jobs> getAllDepartments() {

      try {
          return dao.selectAllJobs();
      } catch (Exception e) {
          throw new RuntimeException(e);
      }
  }
    @GET
    @Path("{Job_id}")
    public Jobs getDepartment(@PathParam("deptId") int Job_id) {

        try {
            return dao.selectJob(Job_id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @DELETE
    @Path("{Job_id}")
    public void deleteDepartment(@PathParam("Job_id") int Job_id) {

        try {
            dao.deleteJob(Job_id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @POST
    public void insertJobs(Jobs J) {

        try {
            dao.insertJob(J);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @PUT
    @Path("{Job_id}")
    public void updateDepartment(@PathParam("Job_id") int Job_id, Jobs J) {

        try {
            J.setJob_id(Job_id);
            dao.updateJob(J);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
