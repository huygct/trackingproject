package com.springapp.mvc.model;

import javax.persistence.*;

/**
 * Created by thuynghi on 4/9/2015.
 */
@Entity
@Table(name = "user_userrole", schema = "", catalog = "tracking_project_db")
@IdClass(UserRolePKPK.class)
public class UserRolePK {
    private int userRoleId;
    private int badgeId;

    @Id
    @Column(name = "userRoleId")
    public int getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(int userRoleId) {
        this.userRoleId = userRoleId;
    }

    @Id
    @Column(name = "badgeId")
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

        UserRolePK that = (UserRolePK) o;

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
