package model.eo;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.RowInconsistentException;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jan 15 18:46:11 IST 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TIME_CARD_DTL_EOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        TimeCardDtlId,
        TimeCardMasterId,
        EmployeeId,
        EmployeeName,
        EmployeeNumber,
        TaskId,
        TaskName,
        TaskNumber,
        JobTypeCode,
        JobTypeName,
        JobTypeRate,
        RegularHrs,
        OverTimeHrs,
        IncentiveHrs,
        RegularUnitRate,
        OverTimeUnitRate,
        TotalAmount,
        IncentiveUnitRate,
        RegularRate,
        OverTimeRate,
        IncentiveRate,
        Status,
        ActiveFlag,
        PayrollFlag,
        CreatedBy,
        CreationDate,
        LastUpdatedBy,
        LastUpdateDate,
        LastUpdateLogin,
        RejectReason,
        TIME_CARD_MASTER_EO;
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
    
    
    @Override
    public void lock() {
        try {
            super.lock();
        } catch (RowInconsistentException e) {
            refresh(REFRESH_WITH_DB_ONLY_IF_UNCHANGED | REFRESH_CONTAINEES);
            super.lock();
        }
    }


    public static final int TIMECARDDTLID = AttributesEnum.TimeCardDtlId.index();
    public static final int TIMECARDMASTERID = AttributesEnum.TimeCardMasterId.index();
    public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();
    public static final int EMPLOYEENAME = AttributesEnum.EmployeeName.index();
    public static final int EMPLOYEENUMBER = AttributesEnum.EmployeeNumber.index();
    public static final int TASKID = AttributesEnum.TaskId.index();
    public static final int TASKNAME = AttributesEnum.TaskName.index();
    public static final int TASKNUMBER = AttributesEnum.TaskNumber.index();
    public static final int JOBTYPECODE = AttributesEnum.JobTypeCode.index();
    public static final int JOBTYPENAME = AttributesEnum.JobTypeName.index();
    public static final int JOBTYPERATE = AttributesEnum.JobTypeRate.index();
    public static final int REGULARHRS = AttributesEnum.RegularHrs.index();
    public static final int OVERTIMEHRS = AttributesEnum.OverTimeHrs.index();
    public static final int INCENTIVEHRS = AttributesEnum.IncentiveHrs.index();
    public static final int REGULARUNITRATE = AttributesEnum.RegularUnitRate.index();
    public static final int OVERTIMEUNITRATE = AttributesEnum.OverTimeUnitRate.index();
    public static final int TOTALAMOUNT = AttributesEnum.TotalAmount.index();
    public static final int INCENTIVEUNITRATE = AttributesEnum.IncentiveUnitRate.index();
    public static final int REGULARRATE = AttributesEnum.RegularRate.index();
    public static final int OVERTIMERATE = AttributesEnum.OverTimeRate.index();
    public static final int INCENTIVERATE = AttributesEnum.IncentiveRate.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int ACTIVEFLAG = AttributesEnum.ActiveFlag.index();
    public static final int PAYROLLFLAG = AttributesEnum.PayrollFlag.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int REJECTREASON = AttributesEnum.RejectReason.index();
    public static final int TIME_CARD_MASTER_EO = AttributesEnum.TIME_CARD_MASTER_EO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TIME_CARD_DTL_EOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.eo.TIME_CARD_DTL_EO");
    }


    /**
     * Gets the attribute value for TimeCardDtlId, using the alias name TimeCardDtlId.
     * @return the value of TimeCardDtlId
     */
    public BigDecimal getTimeCardDtlId() {
        return (BigDecimal) getAttributeInternal(TIMECARDDTLID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TimeCardDtlId.
     * @param value value to set the TimeCardDtlId
     */
    public void setTimeCardDtlId(BigDecimal value) {
        setAttributeInternal(TIMECARDDTLID, value);
    }

    /**
     * Gets the attribute value for TimeCardMasterId, using the alias name TimeCardMasterId.
     * @return the value of TimeCardMasterId
     */
    public BigDecimal getTimeCardMasterId() {
        return (BigDecimal) getAttributeInternal(TIMECARDMASTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TimeCardMasterId.
     * @param value value to set the TimeCardMasterId
     */
    public void setTimeCardMasterId(BigDecimal value) {
        setAttributeInternal(TIMECARDMASTERID, value);
    }

    /**
     * Gets the attribute value for EmployeeId, using the alias name EmployeeId.
     * @return the value of EmployeeId
     */
    public BigDecimal getEmployeeId() {
        return (BigDecimal) getAttributeInternal(EMPLOYEEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmployeeId.
     * @param value value to set the EmployeeId
     */
    public void setEmployeeId(BigDecimal value) {
        setAttributeInternal(EMPLOYEEID, value);
    }

    /**
     * Gets the attribute value for EmployeeName, using the alias name EmployeeName.
     * @return the value of EmployeeName
     */
    public String getEmployeeName() {
        return (String) getAttributeInternal(EMPLOYEENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmployeeName.
     * @param value value to set the EmployeeName
     */
    public void setEmployeeName(String value) {
        setAttributeInternal(EMPLOYEENAME, value);
    }

    /**
     * Gets the attribute value for EmployeeNumber, using the alias name EmployeeNumber.
     * @return the value of EmployeeNumber
     */
    public String getEmployeeNumber() {
        return (String) getAttributeInternal(EMPLOYEENUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmployeeNumber.
     * @param value value to set the EmployeeNumber
     */
    public void setEmployeeNumber(String value) {
        setAttributeInternal(EMPLOYEENUMBER, value);
    }

    /**
     * Gets the attribute value for TaskId, using the alias name TaskId.
     * @return the value of TaskId
     */
    public BigDecimal getTaskId() {
        return (BigDecimal) getAttributeInternal(TASKID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TaskId.
     * @param value value to set the TaskId
     */
    public void setTaskId(BigDecimal value) {
        setAttributeInternal(TASKID, value);
    }

    /**
     * Gets the attribute value for TaskName, using the alias name TaskName.
     * @return the value of TaskName
     */
    public String getTaskName() {
        return (String) getAttributeInternal(TASKNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for TaskName.
     * @param value value to set the TaskName
     */
    public void setTaskName(String value) {
        setAttributeInternal(TASKNAME, value);
    }

    /**
     * Gets the attribute value for TaskNumber, using the alias name TaskNumber.
     * @return the value of TaskNumber
     */
    public String getTaskNumber() {
        return (String) getAttributeInternal(TASKNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for TaskNumber.
     * @param value value to set the TaskNumber
     */
    public void setTaskNumber(String value) {
        setAttributeInternal(TASKNUMBER, value);
    }

    /**
     * Gets the attribute value for JobTypeCode, using the alias name JobTypeCode.
     * @return the value of JobTypeCode
     */
    public String getJobTypeCode() {
        return (String) getAttributeInternal(JOBTYPECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for JobTypeCode.
     * @param value value to set the JobTypeCode
     */
    public void setJobTypeCode(String value) {
        setAttributeInternal(JOBTYPECODE, value);
    }

    /**
     * Gets the attribute value for JobTypeName, using the alias name JobTypeName.
     * @return the value of JobTypeName
     */
    public String getJobTypeName() {
        return (String) getAttributeInternal(JOBTYPENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for JobTypeName.
     * @param value value to set the JobTypeName
     */
    public void setJobTypeName(String value) {
        setAttributeInternal(JOBTYPENAME, value);
    }

    /**
     * Gets the attribute value for JobTypeRate, using the alias name JobTypeRate.
     * @return the value of JobTypeRate
     */
    public BigDecimal getJobTypeRate() {
        return (BigDecimal) getAttributeInternal(JOBTYPERATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for JobTypeRate.
     * @param value value to set the JobTypeRate
     */
    public void setJobTypeRate(BigDecimal value) {
        setAttributeInternal(JOBTYPERATE, value);
    }

    /**
     * Gets the attribute value for RegularHrs, using the alias name RegularHrs.
     * @return the value of RegularHrs
     */
    public BigDecimal getRegularHrs() {
        return (BigDecimal) getAttributeInternal(REGULARHRS);
    }

    /**
     * Sets <code>value</code> as the attribute value for RegularHrs.
     * @param value value to set the RegularHrs
     */
    public void setRegularHrs(BigDecimal value) {
        setAttributeInternal(REGULARHRS, value);
    }

    /**
     * Gets the attribute value for OverTimeHrs, using the alias name OverTimeHrs.
     * @return the value of OverTimeHrs
     */
    public BigDecimal getOverTimeHrs() {
        return (BigDecimal) getAttributeInternal(OVERTIMEHRS);
    }

    /**
     * Sets <code>value</code> as the attribute value for OverTimeHrs.
     * @param value value to set the OverTimeHrs
     */
    public void setOverTimeHrs(BigDecimal value) {
        setAttributeInternal(OVERTIMEHRS, value);
    }

    /**
     * Gets the attribute value for IncentiveHrs, using the alias name IncentiveHrs.
     * @return the value of IncentiveHrs
     */
    public BigDecimal getIncentiveHrs() {
        return (BigDecimal) getAttributeInternal(INCENTIVEHRS);
    }

    /**
     * Sets <code>value</code> as the attribute value for IncentiveHrs.
     * @param value value to set the IncentiveHrs
     */
    public void setIncentiveHrs(BigDecimal value) {
        setAttributeInternal(INCENTIVEHRS, value);
    }

    /**
     * Gets the attribute value for RegularUnitRate, using the alias name RegularUnitRate.
     * @return the value of RegularUnitRate
     */
    public BigDecimal getRegularUnitRate() {
        return (BigDecimal) getAttributeInternal(REGULARUNITRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for RegularUnitRate.
     * @param value value to set the RegularUnitRate
     */
    public void setRegularUnitRate(BigDecimal value) {
        setAttributeInternal(REGULARUNITRATE, value);
    }

    /**
     * Gets the attribute value for OverTimeUnitRate, using the alias name OverTimeUnitRate.
     * @return the value of OverTimeUnitRate
     */
    public BigDecimal getOverTimeUnitRate() {
        return (BigDecimal) getAttributeInternal(OVERTIMEUNITRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for OverTimeUnitRate.
     * @param value value to set the OverTimeUnitRate
     */
    public void setOverTimeUnitRate(BigDecimal value) {
        setAttributeInternal(OVERTIMEUNITRATE, value);
    }

    /**
     * Gets the attribute value for TotalAmount, using the alias name TotalAmount.
     * @return the value of TotalAmount
     */
    public BigDecimal getTotalAmount() {
        return (BigDecimal) getAttributeInternal(TOTALAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalAmount.
     * @param value value to set the TotalAmount
     */
    public void setTotalAmount(BigDecimal value) {
        setAttributeInternal(TOTALAMOUNT, value);
    }

    /**
     * Gets the attribute value for IncentiveUnitRate, using the alias name IncentiveUnitRate.
     * @return the value of IncentiveUnitRate
     */
    public BigDecimal getIncentiveUnitRate() {
        return (BigDecimal) getAttributeInternal(INCENTIVEUNITRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for IncentiveUnitRate.
     * @param value value to set the IncentiveUnitRate
     */
    public void setIncentiveUnitRate(BigDecimal value) {
        setAttributeInternal(INCENTIVEUNITRATE, value);
    }

    /**
     * Gets the attribute value for RegularRate, using the alias name RegularRate.
     * @return the value of RegularRate
     */
    public BigDecimal getRegularRate() {
        return (BigDecimal) getAttributeInternal(REGULARRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for RegularRate.
     * @param value value to set the RegularRate
     */
    public void setRegularRate(BigDecimal value) {
        setAttributeInternal(REGULARRATE, value);
    }

    /**
     * Gets the attribute value for OverTimeRate, using the alias name OverTimeRate.
     * @return the value of OverTimeRate
     */
    public BigDecimal getOverTimeRate() {
        return (BigDecimal) getAttributeInternal(OVERTIMERATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for OverTimeRate.
     * @param value value to set the OverTimeRate
     */
    public void setOverTimeRate(BigDecimal value) {
        setAttributeInternal(OVERTIMERATE, value);
    }

    /**
     * Gets the attribute value for IncentiveRate, using the alias name IncentiveRate.
     * @return the value of IncentiveRate
     */
    public BigDecimal getIncentiveRate() {
        return (BigDecimal) getAttributeInternal(INCENTIVERATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for IncentiveRate.
     * @param value value to set the IncentiveRate
     */
    public void setIncentiveRate(BigDecimal value) {
        setAttributeInternal(INCENTIVERATE, value);
    }

    /**
     * Gets the attribute value for Status, using the alias name Status.
     * @return the value of Status
     */
    public String getStatus() {
        return (String) getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Status.
     * @param value value to set the Status
     */
    public void setStatus(String value) {
        setAttributeInternal(STATUS, value);
    }

    /**
     * Gets the attribute value for ActiveFlag, using the alias name ActiveFlag.
     * @return the value of ActiveFlag
     */
    public String getActiveFlag() {
        return (String) getAttributeInternal(ACTIVEFLAG);
    }


    /**
     * Sets <code>value</code> as the attribute value for ActiveFlag.
     * @param value value to set the ActiveFlag
     */
    public void setActiveFlag(String value) {
        setAttributeInternal(ACTIVEFLAG, value);
    }

    /**
     * Gets the attribute value for PayrollFlag, using the alias name PayrollFlag.
     * @return the value of PayrollFlag
     */
    public String getPayrollFlag() {
        return (String) getAttributeInternal(PAYROLLFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for PayrollFlag.
     * @param value value to set the PayrollFlag
     */
    public void setPayrollFlag(String value) {
        setAttributeInternal(PAYROLLFLAG, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the value of CreationDate
     */
    public Timestamp getCreationDate() {
        return (Timestamp) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the value of LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the value of LastUpdateDate
     */
    public Timestamp getLastUpdateDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Gets the attribute value for LastUpdateLogin, using the alias name LastUpdateLogin.
     * @return the value of LastUpdateLogin
     */
    public String getLastUpdateLogin() {
        return (String) getAttributeInternal(LASTUPDATELOGIN);
    }

    /**
     * Gets the attribute value for RejectReason, using the alias name RejectReason.
     * @return the value of RejectReason
     */
    public String getRejectReason() {
        return (String) getAttributeInternal(REJECTREASON);
    }

    /**
     * Sets <code>value</code> as the attribute value for RejectReason.
     * @param value value to set the RejectReason
     */
    public void setRejectReason(String value) {
        setAttributeInternal(REJECTREASON, value);
    }

    /**
     * @return the associated entity TIME_CARD_MASTER_EOImpl.
     */
    public TIME_CARD_MASTER_EOImpl getTIME_CARD_MASTER_EO() {
        return (TIME_CARD_MASTER_EOImpl) getAttributeInternal(TIME_CARD_MASTER_EO);
    }

    /**
     * Sets <code>value</code> as the associated entity TIME_CARD_MASTER_EOImpl.
     */
    public void setTIME_CARD_MASTER_EO(TIME_CARD_MASTER_EOImpl value) {
        setAttributeInternal(TIME_CARD_MASTER_EO, value);
    }

    /**
     * @param timeCardDtlId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal timeCardDtlId) {
        return new Key(new Object[] { timeCardDtlId });
    }


}
