package model.eo;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.RowInconsistentException;
import oracle.jbo.RowIterator;

import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
public class TIME_CARD_MASTER_EOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        TimeCardMasterId,
        TimeCardNumber,
        ProjectId,
        ProjectName,
        ProjectNumber,
        ProjectUnitId,
        ExpenditureId,
        ExpenditureType,
        BusinessUnitId,
        BusinessUnitName,
        JobTypeCode,
        JobTypeName,
        TimeCardDate,
        Status,
        ApprovalStatus,
        CreatedBy,
        CreationDate,
        LastUpdatedBy,
        LastUpdateDate,
        LastUpdateLogin,
        FlowLevel,
        FlowStatus,
        FlowWith,
        FuncId,
        UserGrpId,
        BatchId,
        ErrorMsg,
        InterfaceStatus,
        WeekDay,
        TIME_CARD_DTL_EO;
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


    public static final int TIMECARDMASTERID = AttributesEnum.TimeCardMasterId.index();
    public static final int TIMECARDNUMBER = AttributesEnum.TimeCardNumber.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int PROJECTNAME = AttributesEnum.ProjectName.index();
    public static final int PROJECTNUMBER = AttributesEnum.ProjectNumber.index();
    public static final int PROJECTUNITID = AttributesEnum.ProjectUnitId.index();
    public static final int EXPENDITUREID = AttributesEnum.ExpenditureId.index();
    public static final int EXPENDITURETYPE = AttributesEnum.ExpenditureType.index();
    public static final int BUSINESSUNITID = AttributesEnum.BusinessUnitId.index();
    public static final int BUSINESSUNITNAME = AttributesEnum.BusinessUnitName.index();
    public static final int JOBTYPECODE = AttributesEnum.JobTypeCode.index();
    public static final int JOBTYPENAME = AttributesEnum.JobTypeName.index();
    public static final int TIMECARDDATE = AttributesEnum.TimeCardDate.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int APPROVALSTATUS = AttributesEnum.ApprovalStatus.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int FLOWLEVEL = AttributesEnum.FlowLevel.index();
    public static final int FLOWSTATUS = AttributesEnum.FlowStatus.index();
    public static final int FLOWWITH = AttributesEnum.FlowWith.index();
    public static final int FUNCID = AttributesEnum.FuncId.index();
    public static final int USERGRPID = AttributesEnum.UserGrpId.index();
    public static final int BATCHID = AttributesEnum.BatchId.index();
    public static final int ERRORMSG = AttributesEnum.ErrorMsg.index();
    public static final int INTERFACESTATUS = AttributesEnum.InterfaceStatus.index();
    public static final int WEEKDAY = AttributesEnum.WeekDay.index();
    public static final int TIME_CARD_DTL_EO = AttributesEnum.TIME_CARD_DTL_EO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TIME_CARD_MASTER_EOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.eo.TIME_CARD_MASTER_EO");
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
     * Gets the attribute value for TimeCardNumber, using the alias name TimeCardNumber.
     * @return the value of TimeCardNumber
     */
    public String getTimeCardNumber() {
        return (String) getAttributeInternal(TIMECARDNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for TimeCardNumber.
     * @param value value to set the TimeCardNumber
     */
    public void setTimeCardNumber(String value) {
        setAttributeInternal(TIMECARDNUMBER, value);
    }

    /**
     * Gets the attribute value for ProjectId, using the alias name ProjectId.
     * @return the value of ProjectId
     */
    public BigDecimal getProjectId() {
        return (BigDecimal) getAttributeInternal(PROJECTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjectId.
     * @param value value to set the ProjectId
     */
    public void setProjectId(BigDecimal value) {
        setAttributeInternal(PROJECTID, value);
    }

    /**
     * Gets the attribute value for ProjectName, using the alias name ProjectName.
     * @return the value of ProjectName
     */
    public String getProjectName() {
        return (String) getAttributeInternal(PROJECTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjectName.
     * @param value value to set the ProjectName
     */
    public void setProjectName(String value) {
        setAttributeInternal(PROJECTNAME, value);
    }

    /**
     * Gets the attribute value for ProjectNumber, using the alias name ProjectNumber.
     * @return the value of ProjectNumber
     */
    public String getProjectNumber() {
        return (String) getAttributeInternal(PROJECTNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjectNumber.
     * @param value value to set the ProjectNumber
     */
    public void setProjectNumber(String value) {
        setAttributeInternal(PROJECTNUMBER, value);
    }

    /**
     * Gets the attribute value for ProjectUnitId, using the alias name ProjectUnitId.
     * @return the value of ProjectUnitId
     */
    public BigDecimal getProjectUnitId() {
        return (BigDecimal) getAttributeInternal(PROJECTUNITID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjectUnitId.
     * @param value value to set the ProjectUnitId
     */
    public void setProjectUnitId(BigDecimal value) {
        setAttributeInternal(PROJECTUNITID, value);
    }

    /**
     * Gets the attribute value for ExpenditureId, using the alias name ExpenditureId.
     * @return the value of ExpenditureId
     */
    public BigDecimal getExpenditureId() {
        return (BigDecimal) getAttributeInternal(EXPENDITUREID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExpenditureId.
     * @param value value to set the ExpenditureId
     */
    public void setExpenditureId(BigDecimal value) {
        setAttributeInternal(EXPENDITUREID, value);
    }

    /**
     * Gets the attribute value for ExpenditureType, using the alias name ExpenditureType.
     * @return the value of ExpenditureType
     */
    public String getExpenditureType() {
        return (String) getAttributeInternal(EXPENDITURETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExpenditureType.
     * @param value value to set the ExpenditureType
     */
    public void setExpenditureType(String value) {
        setAttributeInternal(EXPENDITURETYPE, value);
    }

    /**
     * Gets the attribute value for BusinessUnitId, using the alias name BusinessUnitId.
     * @return the value of BusinessUnitId
     */
    public BigDecimal getBusinessUnitId() {
        return (BigDecimal) getAttributeInternal(BUSINESSUNITID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BusinessUnitId.
     * @param value value to set the BusinessUnitId
     */
    public void setBusinessUnitId(BigDecimal value) {
        setAttributeInternal(BUSINESSUNITID, value);
    }

    /**
     * Gets the attribute value for BusinessUnitName, using the alias name BusinessUnitName.
     * @return the value of BusinessUnitName
     */
    public String getBusinessUnitName() {
        return (String) getAttributeInternal(BUSINESSUNITNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for BusinessUnitName.
     * @param value value to set the BusinessUnitName
     */
    public void setBusinessUnitName(String value) {
        setAttributeInternal(BUSINESSUNITNAME, value);
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
     * Gets the attribute value for TimeCardDate, using the alias name TimeCardDate.
     * @return the value of TimeCardDate
     */
    public Timestamp getTimeCardDate() {
        return (Timestamp) getAttributeInternal(TIMECARDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TimeCardDate.
     * @param value value to set the TimeCardDate
     */
    public void setTimeCardDate(Timestamp value) {
        setAttributeInternal(TIMECARDDATE, value);
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
     * Gets the attribute value for ApprovalStatus, using the alias name ApprovalStatus.
     * @return the value of ApprovalStatus
     */
    public String getApprovalStatus() {
        return (String) getAttributeInternal(APPROVALSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for ApprovalStatus.
     * @param value value to set the ApprovalStatus
     */
    public void setApprovalStatus(String value) {
        setAttributeInternal(APPROVALSTATUS, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
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
     * Gets the attribute value for FlowLevel, using the alias name FlowLevel.
     * @return the value of FlowLevel
     */
    public BigDecimal getFlowLevel() {
        return (BigDecimal) getAttributeInternal(FLOWLEVEL);
    }

    /**
     * Sets <code>value</code> as the attribute value for FlowLevel.
     * @param value value to set the FlowLevel
     */
    public void setFlowLevel(BigDecimal value) {
        setAttributeInternal(FLOWLEVEL, value);
    }

    /**
     * Gets the attribute value for FlowStatus, using the alias name FlowStatus.
     * @return the value of FlowStatus
     */
    public String getFlowStatus() {
        return (String) getAttributeInternal(FLOWSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for FlowStatus.
     * @param value value to set the FlowStatus
     */
    public void setFlowStatus(String value) {
        setAttributeInternal(FLOWSTATUS, value);
    }

    /**
     * Gets the attribute value for FlowWith, using the alias name FlowWith.
     * @return the value of FlowWith
     */
    public BigDecimal getFlowWith() {
        return (BigDecimal) getAttributeInternal(FLOWWITH);
    }

    /**
     * Sets <code>value</code> as the attribute value for FlowWith.
     * @param value value to set the FlowWith
     */
    public void setFlowWith(BigDecimal value) {
        setAttributeInternal(FLOWWITH, value);
    }

    /**
     * Gets the attribute value for FuncId, using the alias name FuncId.
     * @return the value of FuncId
     */
    public BigDecimal getFuncId() {
        return (BigDecimal) getAttributeInternal(FUNCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FuncId.
     * @param value value to set the FuncId
     */
    public void setFuncId(BigDecimal value) {
        setAttributeInternal(FUNCID, value);
    }

    /**
     * Gets the attribute value for UserGrpId, using the alias name UserGrpId.
     * @return the value of UserGrpId
     */
    public BigDecimal getUserGrpId() {
        return (BigDecimal) getAttributeInternal(USERGRPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for UserGrpId.
     * @param value value to set the UserGrpId
     */
    public void setUserGrpId(BigDecimal value) {
        setAttributeInternal(USERGRPID, value);
    }

    /**
     * Gets the attribute value for BatchId, using the alias name BatchId.
     * @return the value of BatchId
     */
    public BigDecimal getBatchId() {
        return (BigDecimal) getAttributeInternal(BATCHID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BatchId.
     * @param value value to set the BatchId
     */
    public void setBatchId(BigDecimal value) {
        setAttributeInternal(BATCHID, value);
    }

    /**
     * Gets the attribute value for ErrorMsg, using the alias name ErrorMsg.
     * @return the value of ErrorMsg
     */
    public String getErrorMsg() {
        return (String) getAttributeInternal(ERRORMSG);
    }

    /**
     * Sets <code>value</code> as the attribute value for ErrorMsg.
     * @param value value to set the ErrorMsg
     */
    public void setErrorMsg(String value) {
        setAttributeInternal(ERRORMSG, value);
    }

    /**
     * Gets the attribute value for InterfaceStatus, using the alias name InterfaceStatus.
     * @return the value of InterfaceStatus
     */
    public String getInterfaceStatus() {
        return (String) getAttributeInternal(INTERFACESTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for InterfaceStatus.
     * @param value value to set the InterfaceStatus
     */
    public void setInterfaceStatus(String value) {
        setAttributeInternal(INTERFACESTATUS, value);
    }

    /**
     * Gets the attribute value for WeekDay, using the alias name WeekDay.
     * @return the value of WeekDay
     */
    public String getWeekDay() {
        return (String) getAttributeInternal(WEEKDAY);
    }

    /**
     * Sets <code>value</code> as the attribute value for WeekDay.
     * @param value value to set the WeekDay
     */
    public void setWeekDay(String value) {
        setAttributeInternal(WEEKDAY, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTIME_CARD_DTL_EO() {
        return (RowIterator) getAttributeInternal(TIME_CARD_DTL_EO);
    }

    /**
     * @param timeCardMasterId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal timeCardMasterId) {
        return new Key(new Object[] { timeCardMasterId });
    }


}

