package com.kainos.ea.db;

import com.kainos.ea.objects.JobRole;
import com.kainos.ea.resources.Test;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface JobRoleMapper {
    @Select("SELECT ID, TestMessage FROM Test_Table")
    List<Test> getTest();

    @Select("SELECT JobRoleID, JobTitle, jc.JobCapability, jb.JobBand, JobCompetencies, RecordCreated FROM JobRoles JOIN JobBand jb ON JobRoles.JobBand = jb.JobBandID JOIN JobCapability jc ON JobRoles.JobCapability = jc.JobCapabilityID")
    List<JobRole> getJobRoles();


}
