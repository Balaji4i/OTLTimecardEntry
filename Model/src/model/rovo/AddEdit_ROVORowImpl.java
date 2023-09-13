package model.rovo;

import java.math.BigDecimal;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Dec 22 19:01:29 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AddEdit_ROVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        EmployeeId,
        EmployeeName,
        EmployeeNumber,
        EmployeeLov,
        TaskId,
        TaskName,
        TaskNumber,
        JobId,
        JobType,
        JobRate,
        RegularHours,
        Ot1,
        Ot2,
        Overtimerate,
        Incentiverate,
        Data,
        ProjectId,
        BusinessUnitId,
        DataValue,
        JobType_ROVO,
        Employee_ROVO,
        TIME_CARD_MASTER_VO,
        Task_ROVO;
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
    public static final int EMPLOYEELOV = AttributesEnum.EmployeeLov.index();
    public static final int TASKID = AttributesEnum.TaskId.index();
    public static final int TASKNAME = AttributesEnum.TaskName.index();
    public static final int TASKNUMBER = AttributesEnum.TaskNumber.index();
    public static final int JOBID = AttributesEnum.JobId.index();
    public static final int JOBTYPE = AttributesEnum.JobType.index();
    public static final int JOBRATE = AttributesEnum.JobRate.index();
    public static final int REGULARHOURS = AttributesEnum.RegularHours.index();
    public static final int OT1 = AttributesEnum.Ot1.index();
    public static final int OT2 = AttributesEnum.Ot2.index();
    public static final int OVERTIMERATE = AttributesEnum.Overtimerate.index();
    public static final int INCENTIVERATE = AttributesEnum.Incentiverate.index();
    public static final int DATA = AttributesEnum.Data.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int BUSINESSUNITID = AttributesEnum.BusinessUnitId.index();
    public static final int DATAVALUE = AttributesEnum.DataValue.index();
    public static final int JOBTYPE_ROVO = AttributesEnum.JobType_ROVO.index();
    public static final int EMPLOYEE_ROVO = AttributesEnum.Employee_ROVO.index();
    public static final int TIME_CARD_MASTER_VO = AttributesEnum.TIME_CARD_MASTER_VO.index();
    public static final int TASK_ROVO = AttributesEnum.Task_ROVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AddEdit_ROVORowImpl() {
    }
}
