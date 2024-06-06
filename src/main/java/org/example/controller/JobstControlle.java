package org.example.controller;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.dao.JobDAO;
import org.example.dto.JobFilterDto;
import org.example.models.Jobs;

import java.util.ArrayList;




@Path("/Jobs")
public class JobstControlle {
  JobDAO dao =  new JobDAO() ;

    @GET
    @Produces ({MediaType.APPLICATION_ATOM_XML, MediaType.APPLICATION_JSON})
    public ArrayList<Jobs> getAllJobs(
           // @QueryParam("main_salary") Double main_salary,
//@QueryParam("limit") Integer limit,
//@QueryParam("offset") int offset
            @BeanParam JobFilterDto Filter
    ) {
        try {
            return dao.selectAllJobs(Filter);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GET
    @Path("{Job_id}")
    public Jobs getJobs(@PathParam("deptId") int Job_id) {

        try {
            return dao.selectJob(Job_id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @DELETE
    @Path("{Job_id}")
    public void deleteJobs(@PathParam("Job_id") int Job_id) {

        try {
            dao.deleteJob(Job_id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @POST

    @Consumes(MediaType.APPLICATION_XML)
    public void insertJobs(Jobs J) {
        try {
            dao.insertJob(J);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @PUT
    @Path("{Job_id}")
    public void updateJobs(@PathParam("Job_id") int Job_id, Jobs J) {

        try {
            J.setJob_id(Job_id);
            dao.updateJob(J);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
