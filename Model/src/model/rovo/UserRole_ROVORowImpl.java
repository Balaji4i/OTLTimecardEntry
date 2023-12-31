package model.rovo;

import java.math.BigDecimal;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Feb 21 15:31:57 IST 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class UserRole_ROVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        UserId,
        Username,
        PersonId,
        DisplayName,
        RoleId,
        RoleName;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int USERID = AttributesEnum.UserId.index();
    public static final int USERNAME = AttributesEnum.Username.index();
    public static final int PERSONID = AttributesEnum.PersonId.index();
    public static final int DISPLAYNAME = AttributesEnum.DisplayName.index();
    public static final int ROLEID = AttributesEnum.RoleId.index();
    public static final int ROLENAME = AttributesEnum.RoleName.index();

    /**
     * This is the default constructor (do not remove).
     */
    public UserRole_ROVORowImpl() {
    }
}

