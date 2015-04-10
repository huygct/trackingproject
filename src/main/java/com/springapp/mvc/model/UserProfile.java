package com.springapp.mvc.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by thuynghi on 4/9/2015.
 */
@Entity
@Table(name = "user_profile", schema = "", catalog = "tracking_project_db")
public class UserProfile {
    private int badgeId;
    private Integer toeic;
    private String school;
    private String degree;
    private Timestamp graduateDate;
    private Double finalStudyResult;
    private Timestamp joinDate;
    private String workRole;
    private Double experienceYears;
    private Double experienceYearsInCurrentRole;
    private Byte professionalCertification;
    private Byte overseaWorkingExperience;
    private Byte policeClearanceStatus;

    @Id
    @Column(name = "badgeId")
    public int getBadgeId() {
        return badgeId;
    }

    public void setBadgeId(int badgeId) {
        this.badgeId = badgeId;
    }

    @Basic
    @Column(name = "toeic")
    public Integer getToeic() {
        return toeic;
    }

    public void setToeic(Integer toeic) {
        this.toeic = toeic;
    }

    @Basic
    @Column(name = "school")
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Basic
    @Column(name = "degree")
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Basic
    @Column(name = "graduateDate")
    public Timestamp getGraduateDate() {
        return graduateDate;
    }

    public void setGraduateDate(Timestamp graduateDate) {
        this.graduateDate = graduateDate;
    }

    @Basic
    @Column(name = "finalStudyResult")
    public Double getFinalStudyResult() {
        return finalStudyResult;
    }

    public void setFinalStudyResult(Double finalStudyResult) {
        this.finalStudyResult = finalStudyResult;
    }

    @Basic
    @Column(name = "joinDate")
    public Timestamp getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Timestamp joinDate) {
        this.joinDate = joinDate;
    }

    @Basic
    @Column(name = "workRole")
    public String getWorkRole() {
        return workRole;
    }

    public void setWorkRole(String workRole) {
        this.workRole = workRole;
    }

    @Basic
    @Column(name = "experienceYears")
    public Double getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(Double experienceYears) {
        this.experienceYears = experienceYears;
    }

    @Basic
    @Column(name = "experienceYearsInCurrentRole")
    public Double getExperienceYearsInCurrentRole() {
        return experienceYearsInCurrentRole;
    }

    public void setExperienceYearsInCurrentRole(Double experienceYearsInCurrentRole) {
        this.experienceYearsInCurrentRole = experienceYearsInCurrentRole;
    }

    @Basic
    @Column(name = "professionalCertification")
    public Byte getProfessionalCertification() {
        return professionalCertification;
    }

    public void setProfessionalCertification(Byte professionalCertification) {
        this.professionalCertification = professionalCertification;
    }

    @Basic
    @Column(name = "overseaWorkingExperience")
    public Byte getOverseaWorkingExperience() {
        return overseaWorkingExperience;
    }

    public void setOverseaWorkingExperience(Byte overseaWorkingExperience) {
        this.overseaWorkingExperience = overseaWorkingExperience;
    }

    @Basic
    @Column(name = "policeClearanceStatus")
    public Byte getPoliceClearanceStatus() {
        return policeClearanceStatus;
    }

    public void setPoliceClearanceStatus(Byte policeClearanceStatus) {
        this.policeClearanceStatus = policeClearanceStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserProfile that = (UserProfile) o;

        if (badgeId != that.badgeId) return false;
        if (degree != null ? !degree.equals(that.degree) : that.degree != null) return false;
        if (experienceYears != null ? !experienceYears.equals(that.experienceYears) : that.experienceYears != null)
            return false;
        if (experienceYearsInCurrentRole != null ? !experienceYearsInCurrentRole.equals(that.experienceYearsInCurrentRole) : that.experienceYearsInCurrentRole != null)
            return false;
        if (finalStudyResult != null ? !finalStudyResult.equals(that.finalStudyResult) : that.finalStudyResult != null)
            return false;
        if (graduateDate != null ? !graduateDate.equals(that.graduateDate) : that.graduateDate != null) return false;
        if (joinDate != null ? !joinDate.equals(that.joinDate) : that.joinDate != null) return false;
        if (overseaWorkingExperience != null ? !overseaWorkingExperience.equals(that.overseaWorkingExperience) : that.overseaWorkingExperience != null)
            return false;
        if (policeClearanceStatus != null ? !policeClearanceStatus.equals(that.policeClearanceStatus) : that.policeClearanceStatus != null)
            return false;
        if (professionalCertification != null ? !professionalCertification.equals(that.professionalCertification) : that.professionalCertification != null)
            return false;
        if (school != null ? !school.equals(that.school) : that.school != null) return false;
        if (toeic != null ? !toeic.equals(that.toeic) : that.toeic != null) return false;
        if (workRole != null ? !workRole.equals(that.workRole) : that.workRole != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = badgeId;
        result = 31 * result + (toeic != null ? toeic.hashCode() : 0);
        result = 31 * result + (school != null ? school.hashCode() : 0);
        result = 31 * result + (degree != null ? degree.hashCode() : 0);
        result = 31 * result + (graduateDate != null ? graduateDate.hashCode() : 0);
        result = 31 * result + (finalStudyResult != null ? finalStudyResult.hashCode() : 0);
        result = 31 * result + (joinDate != null ? joinDate.hashCode() : 0);
        result = 31 * result + (workRole != null ? workRole.hashCode() : 0);
        result = 31 * result + (experienceYears != null ? experienceYears.hashCode() : 0);
        result = 31 * result + (experienceYearsInCurrentRole != null ? experienceYearsInCurrentRole.hashCode() : 0);
        result = 31 * result + (professionalCertification != null ? professionalCertification.hashCode() : 0);
        result = 31 * result + (overseaWorkingExperience != null ? overseaWorkingExperience.hashCode() : 0);
        result = 31 * result + (policeClearanceStatus != null ? policeClearanceStatus.hashCode() : 0);
        return result;
    }
}
