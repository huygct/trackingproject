package com.springapp.mvc.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by thuynghi on 4/9/2015.
 */
@Entity
public class UserRole {
    private int userRoleId;
    private String userRoleName;

    @Id
    @Column(name = "userRoleId")
    public int getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(int userRoleId) {
        this.userRoleId = userRoleId;
    }

    @Basic
    @Column(name = "userRoleName")
    public String getUserRoleName() {
        return userRoleName;
    }

    public void setUserRoleName(String userRoleName) {
        this.userRoleName = userRoleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRole userRole = (UserRole) o;

        if (userRoleId != userRole.userRoleId) return false;
        if (userRoleName != null ? !userRoleName.equals(userRole.userRoleName) : userRole.userRoleName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userRoleId;
        result = 31 * result + (userRoleName != null ? userRoleName.hashCode() : 0);
        return result;
    }
}
