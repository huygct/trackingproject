package com.springapp.mvc.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by thuynghi on 4/9/2015.
 */
public class UserRolePKPK implements Serializable {
    private int userRoleId;
    private int badgeId;

    @Column(name = "userRoleId")
    @Id
    public int getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(int userRoleId) {
        this.userRoleId = userRoleId;
    }

    @Column(name = "badgeId")
    @Id
    public int getBadgeId() {
        return badgeId;
    }

    public void setBadgeId(int badgeId) {
        this.badgeId = badgeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRolePKPK that = (UserRolePKPK) o;

        if (badgeId != that.badgeId) return false;
        if (userRoleId != that.userRoleId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userRoleId;
        result = 31 * result + badgeId;
        return result;
    }
}
