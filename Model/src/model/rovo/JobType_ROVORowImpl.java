package model.rovo;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Dec 24 09:52:06 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class JobType_ROVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        JobTypeCode,
        JobTypeName,
        EffectiveStartDate,
        JobTypeRate,
        OvertimeRate,
        IncentiveRate;
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


    public static final int JOBTYPECODE = AttributesEnum.JobTypeCode.index();
    public static final int JOBTYPENAME = AttributesEnum.JobTypeName.index();
    public static final int EFFECTIVESTARTDATE = AttributesEnum.EffectiveStartDate.index();
    public static final int JOBTYPERATE = AttributesEnum.JobTypeRate.index();
    public static final int OVERTIMERATE = AttributesEnum.OvertimeRate.index();
    public static final int INCENTIVERATE = AttributesEnum.IncentiveRate.index();

    /**
     * This is the default constructor (do not remove).
     */
    public JobType_ROVORowImpl() {
    }
}
