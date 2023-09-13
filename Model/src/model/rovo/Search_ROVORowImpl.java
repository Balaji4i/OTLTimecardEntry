package model.rovo;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Dec 23 12:45:02 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Search_ROVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        EmployeeId,
        EmployeeName,
        EmployeeNumber,
        TaskId,
        TaskName,
        TaskNumber,
        JobId,
        JobType,
        JobType_ROVO;
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


    public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();
    public static final int EMPLOYEENAME = AttributesEnum.EmployeeName.index();
    public static final int EMPLOYEENUMBER = AttributesEnum.EmployeeNumber.index();
    public static final int TASKID = AttributesEnum.TaskId.index();
    public static final int TASKNAME = AttributesEnum.TaskName.index();
    public static final int TASKNUMBER = AttributesEnum.TaskNumber.index();
    public static final int JOBID = AttributesEnum.JobId.index();
    public static final int JOBTYPE = AttributesEnum.JobType.index();
    public static final int JOBTYPE_ROVO = AttributesEnum.JobType_ROVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public Search_ROVORowImpl() {
    }
}

