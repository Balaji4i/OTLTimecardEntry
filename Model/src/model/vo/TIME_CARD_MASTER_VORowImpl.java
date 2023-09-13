package model.vo;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jan 12 18:34:00 IST 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TIME_CARD_MASTER_VORowImpl extends ViewRowImpl {


    public static final int ENTITY_TIME_CARD_MASTER_EO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        ApprovalStatus,
        BusinessUnitId,
        BusinessUnitName,
        CreatedBy,
        CreationDate,
        ExpenditureId,
        ExpenditureType,
        JobTypeCode,
        JobTypeName,
        LastUpdateDate,
        LastUpdateLogin,
        LastUpdatedBy,
        ProjectId,
        ProjectName,
        ProjectNumber,
        ProjectUnitId,
        Status,
        TimeCardDate,
        TimeCardMasterId,
        TimeCardNumber,
        FlowLevel,
        FlowStatus,
        FlowWith,
        FuncId,
        UserGrpId,
        BatchId,
        NextUserApprover,
        ErrorMsg,
        InterfaceStatus,
        WeekDay,
        NextApprover,
        XXSC_TIME_CARD_DTL_VO,
        BusinessUnit_ROVO,
        Jobs_ROVO,
        Project_ROVO,
        UserAcess_ROVO,
        NextApprover_ROVO;
        private static AttributesEnum[] vals = null;
        ;
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


    public static final int APPROVALSTATUS = AttributesEnum.ApprovalStatus.index();
    public static final int BUSINESSUNITID = AttributesEnum.BusinessUnitId.index();
    public static final int BUSINESSUNITNAME = AttributesEnum.BusinessUnitName.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int EXPENDITUREID = AttributesEnum.ExpenditureId.index();
    public static final int EXPENDITURETYPE = AttributesEnum.ExpenditureType.index();
    public static final int JOBTYPECODE = AttributesEnum.JobTypeCode.index();
    public static final int JOBTYPENAME = AttributesEnum.JobTypeName.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int PROJECTNAME = AttributesEnum.ProjectName.index();
    public static final int PROJECTNUMBER = AttributesEnum.ProjectNumber.index();
    public static final int PROJECTUNITID = AttributesEnum.ProjectUnitId.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int TIMECARDDATE = AttributesEnum.TimeCardDate.index();
    public static final int TIMECARDMASTERID = AttributesEnum.TimeCardMasterId.index();
    public static final int TIMECARDNUMBER = AttributesEnum.TimeCardNumber.index();
    public static final int FLOWLEVEL = AttributesEnum.FlowLevel.index();
    public static final int FLOWSTATUS = AttributesEnum.FlowStatus.index();
    public static final int FLOWWITH = AttributesEnum.FlowWith.index();
    public static final int FUNCID = AttributesEnum.FuncId.index();
    public static final int USERGRPID = AttributesEnum.UserGrpId.index();
    public static final int BATCHID = AttributesEnum.BatchId.index();
    public static final int NEXTUSERAPPROVER = AttributesEnum.NextUserApprover.index();
    public static final int ERRORMSG = AttributesEnum.ErrorMsg.index();
    public static final int INTERFACESTATUS = AttributesEnum.InterfaceStatus.index();
    public static final int WEEKDAY = AttributesEnum.WeekDay.index();
    public static final int NEXTAPPROVER = AttributesEnum.NextApprover.index();
    public static final int XXSC_TIME_CARD_DTL_VO = AttributesEnum.XXSC_TIME_CARD_DTL_VO.index();
    public static final int BUSINESSUNIT_ROVO = AttributesEnum.BusinessUnit_ROVO.index();
    public static final int JOBS_ROVO = AttributesEnum.Jobs_ROVO.index();
    public static final int PROJECT_ROVO = AttributesEnum.Project_ROVO.index();
    public static final int USERACESS_ROVO = AttributesEnum.UserAcess_ROVO.index();
    public static final int NEXTAPPROVER_ROVO = AttributesEnum.NextApprover_ROVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TIME_CARD_MASTER_VORowImpl() {
    }
}
