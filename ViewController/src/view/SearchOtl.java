package view;

import com.view.utils.ADFUtils;
import oracle.jbo.Row;
import com.view.utils.JSFUtils;


import java.text.DecimalFormat;

import javax.faces.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.vo.TIME_CARD_MASTER_VOImpl;

import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;

import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.ViewObject;

public class SearchOtl {
    private RichPopup popUp;
//    private RichPopup p2;

    public SearchOtl() {
    }

    public void onClickEdit(ActionEvent actionEvent) {
        Object obj =  ADFContext.getCurrent().getPageFlowScope().get("headerId");
                 System.err.println("Object Name"+obj);
                        ViewObject HdrVO = ADFUtils.findIterator("TIME_CARD_MASTER_VOIterator").getViewObject();
                        ViewCriteria hdrVC = HdrVO.createViewCriteria();
                        ViewCriteriaRow hdrVcr = hdrVC.createViewCriteriaRow();
                        hdrVcr.setAttribute("TimeCardMasterId", obj);
                        hdrVC.addRow(hdrVcr);
                        HdrVO.applyViewCriteria(hdrVC);
                        HdrVO.executeQuery();

    }

    public void onClickDeleteOk(ActionEvent actionEvent) {
        ADFUtils.findOperation("Delete").execute();
        ADFUtils.findOperation("Commit").execute();
               JSFUtils.hidePopup(popUp);
        RichTable tables = (RichTable) JSFUtils.findComponentInRoot("t1");
        AdfFacesContext.getCurrentInstance().addPartialTarget(tables);
    }

    public void setPopUp(RichPopup popUp) {
        this.popUp = popUp;
    }

    public RichPopup getPopUp() {
        return popUp;
    }

    public void onClickDeleteCancel(ActionEvent actionEvent) {
        JSFUtils.hidePopup(popUp);
    }

    public void onClickOkCopyPaste(ActionEvent actionEvent) {
        ViewObject cpVO = ADFUtils.findIterator("CopyPaste_ROVOIterator").getViewObject();
        
     
            String p_TimeEntryDate = cpVO.getCurrentRow().getAttribute("Day") == null ? " " : cpVO.getCurrentRow().getAttribute("Day").toString();
            System.out.println(p_TimeEntryDate +"--------TimeEntryDate");
            String p_payRollFlag = cpVO.getCurrentRow().getAttribute("Value") == null ? "Y" : cpVO.getCurrentRow().getAttribute("Value").toString();
            System.out.println(p_payRollFlag +"--------p_payRollFlag");
        
        
        
       
            ViewObject HdrVo = ADFUtils.findIterator("TIME_CARD_MASTER_VOIterator").getViewObject();
            if(HdrVo.getCurrentRow() != null){
             String p_ProjectName = HdrVo.getCurrentRow().getAttribute("ProjectName") == null ? " " : HdrVo.getCurrentRow().getAttribute("ProjectName").toString();
            System.out.println(p_ProjectName +"--------ProjectName");
                       
               
            System.out.println( HdrVo.getCurrentRow().getAttribute("TimeCardMasterId") +"---cur Row");
                       
                ViewObject LineVo =ADFUtils.findIterator("XXSC_TIME_CARD_DTL_VOIterator").getViewObject();
                          ViewCriteria viewCriteria = LineVo.createViewCriteria();
                           ViewCriteriaRow viewCriteriaRow = viewCriteria.createViewCriteriaRow();
                           viewCriteriaRow.setAttribute("TimeCardMasterId",
                                                        HdrVo.getCurrentRow().getAttribute("TimeCardMasterId"));
                           viewCriteria.addRow(viewCriteriaRow);
                           LineVo.applyViewCriteria(viewCriteria);
                           LineVo.executeQuery();
                           System.out.println(LineVo.getEstimatedRowCount() + "---- row count");
            Map line= new HashMap();
            
            List<Map> lineList = new ArrayList<Map>();
                           
                           if (LineVo.getEstimatedRowCount() >= 1) {

                                                            System.out.println("Enters into Loop");
                                                            RowSetIterator rs = LineVo.createRowSetIterator(null);

                                                            while (rs.hasNext()) {
                                                                Row r = rs.next();
                    System.out.println(r.getAttribute("JobTypeCode") == null ? "" :r.getAttribute("JobTypeCode").toString() + "---- JobTypeCode");
                                     
                    line.put("EmployeeName", r.getAttribute("EmployeeName") == null ? "" : r.getAttribute("EmployeeName").toString());
                    line.put("EmployeeNumber",r.getAttribute("EmployeeNumber") == null ? "" : r.getAttribute("EmployeeNumber").toString());
                    line.put("EmployeeId",r.getAttribute("EmployeeId") == null ? "" : r.getAttribute("EmployeeId").toString());
                    line.put("JobTypeCode",r.getAttribute("JobTypeCode") == null ? "" : r.getAttribute("JobTypeCode").toString());
                    line.put("JobTypeName",r.getAttribute("JobTypeName") == null ? "" : r.getAttribute("JobTypeName").toString());
                    line.put("OverTimeHrs",r.getAttribute("OverTimeHrs") == null ? "" : r.getAttribute("OverTimeHrs").toString());
                    line.put("RegularHrs",r.getAttribute("RegularHrs") == null ? "" : r.getAttribute("RegularHrs").toString());
                    line.put("IncentiveHrs",r.getAttribute("IncentiveHrs") == null ? "" : r.getAttribute("IncentiveHrs").toString());
                    line.put("TaskNumber", r.getAttribute("TaskNumber") == null ? "" :r.getAttribute("TaskNumber").toString());
                    line.put("TaskName", r.getAttribute("TaskName") == null ? "" :r.getAttribute("TaskName").toString());
                    line.put("IncentiveRate",r.getAttribute("IncentiveRate") == null ? "" : r.getAttribute("IncentiveRate").toString());
                    line.put("IncentiveUnitRate",r.getAttribute("IncentiveUnitRate") == null ? "" : r.getAttribute("IncentiveUnitRate").toString());
                    line.put("JobTypeRate",r.getAttribute("JobTypeRate") == null ? "" : r.getAttribute("JobTypeRate").toString());
                    line.put("OverTimeRate",r.getAttribute("OverTimeRate") == null ? "" : r.getAttribute("OverTimeRate").toString());
                    line.put("OverTimeUnitRate",r.getAttribute("OverTimeUnitRate") == null ? "" : r.getAttribute("OverTimeUnitRate").toString());   
                    line.put("PayrollFlag", p_payRollFlag);
                    line.put("RegularRate",r.getAttribute("RegularRate") == null ? "" : r.getAttribute("RegularRate").toString());
                    line.put("RegularUnitRate",r.getAttribute("RegularUnitRate") == null ? "" : r.getAttribute("RegularUnitRate").toString());
                    line.put("TaskId", r.getAttribute("TaskId") == null ? "" :r.getAttribute("TaskId").toString());
                    line.put("RejectReason",r.getAttribute("RejectReason") == null ? "" : r.getAttribute("RejectReason").toString());
                    lineList.add(line);
                                 }
             
                }
                           
            HdrVo.applyViewCriteria(null);
            System.out.println("-----1-------");
                        Row newRow = HdrVo.createRow();
                        newRow.setAttribute("ProjectId", HdrVo.getCurrentRow().getAttribute("ProjectId"));
                        newRow.setAttribute("ProjectName", HdrVo.getCurrentRow().getAttribute("ProjectName"));
                        newRow.setAttribute("ProjectNumber", HdrVo.getCurrentRow().getAttribute("ProjectNumber"));
                        newRow.setAttribute("JobTypeCode", HdrVo.getCurrentRow().getAttribute("JobTypeCode"));
                        newRow.setAttribute("JobTypeName", HdrVo.getCurrentRow().getAttribute("JobTypeName"));
                        newRow.setAttribute("BusinessUnitId", HdrVo.getCurrentRow().getAttribute("BusinessUnitId"));
                        newRow.setAttribute("BusinessUnitName", HdrVo.getCurrentRow().getAttribute("BusinessUnitName"));
                        newRow.setAttribute("ProjectUnitId",HdrVo.getCurrentRow().getAttribute("ProjectUnitId"));
                        newRow.setAttribute("FuncId",HdrVo.getCurrentRow().getAttribute("FuncId"));
            System.out.println("-----------");
            newRow.setAttribute("TimeCardDate",p_TimeEntryDate);
           
                        newRow.setAttribute("Status", "Draft");
            
                        System.out.println("-----2-------");
                        HdrVo.insertRow(newRow);
                        System.out.println("-----------------Master------------------");
     
                      
                      System.out.println( HdrVo.getCurrentRow().getAttribute("TimeCardMasterId") +"---cur Row");
                      
                      
            String timeCardNumber=HdrVo.getCurrentRow().getAttribute("TimeCardNumber") == null ? "" : HdrVo.getCurrentRow().getAttribute("TimeCardNumber").toString();          
            System.out.println(timeCardNumber+"---------------TimeCardNumber");
            
            if (timeCardNumber == "") {
                         System.out.println("22222222222222");
                         long val =
                             Long.parseLong(HdrVo.getCurrentRow().getAttribute("TimeCardMasterId").toString());
            System.out.println(val +"-----val");
            
                         DecimalFormat myFormatter = new DecimalFormat("00000000");
                         long seq = 0;
                         seq = val + 1;
                         String typeCode = "OTL-";
                         System.out.println(typeCode + myFormatter.format(seq));
                         HdrVo.getCurrentRow().setAttribute("TimeCardNumber",
                                                         typeCode + myFormatter.format(seq));
                        
                     }
                   
            ViewCriteria VC = LineVo.createViewCriteria();
            ViewCriteriaRow viewCriteriaRows = VC.createViewCriteriaRow();
            viewCriteriaRows.setAttribute("TimeCardMasterId",
                 HdrVo.getCurrentRow().getAttribute("TimeCardMasterId"));
            viewCriteria.addRow(viewCriteriaRows);
            LineVo.applyViewCriteria(VC);
            LineVo.executeQuery();
            System.out.println(LineVo.getEstimatedRowCount() + "---- row count");
           
            
            if (LineVo.getEstimatedRowCount() == 0) {
           
   System.out.println("Entered Line ");
                           
                       int size=lineList.size();    
                       System.out.println(size +"-------Total Count");
            for(int i =0;i<size;i++){
                               
                System.out.println("-----1-------");
                                       Row newRows = LineVo.createRow();
                            newRows.setAttribute("EmployeeName", lineList.get(i).get("EmployeeName"));
                            newRows.setAttribute("EmployeeNumber", lineList.get(i).get("EmployeeNumber"));
                            newRows.setAttribute("EmployeeId",lineList.get(i).get("EmployeeId"));
                            newRows.setAttribute("JobTypeCode", lineList.get(i).get("JobTypeCode"));
                            newRows.setAttribute("JobTypeName",lineList.get(i).get("JobTypeName"));
                         newRows.setAttribute("OverTimeHrs", lineList.get(i).get("OverTimeHrs"));
                         newRows.setAttribute("RegularHrs", lineList.get(i).get("RegularHrs"));
                         newRows.setAttribute("IncentiveHrs",  lineList.get(i).get("IncentiveHrs"));
                         newRows.setAttribute("TaskNumber", lineList.get(i).get("TaskNumber"));
                         newRows.setAttribute("TaskName",lineList.get(i).get("TaskName"));
                newRows.setAttribute("IncentiveRate", lineList.get(i).get("IncentiveRate"));
                newRows.setAttribute("IncentiveUnitRate", lineList.get(i).get("IncentiveUnitRate"));
                newRows.setAttribute("JobTypeRate",  lineList.get(i).get("JobTypeRate"));
                newRows.setAttribute("OverTimeRate", lineList.get(i).get("OverTimeRate"));
                newRows.setAttribute("OverTimeUnitRate",lineList.get(i).get("OverTimeUnitRate"));
                newRows.setAttribute("PayrollFlag", lineList.get(i).get("PayrollFlag"));
                newRows.setAttribute("RegularRate", lineList.get(i).get("RegularRate"));
                newRows.setAttribute("RegularUnitRate",  lineList.get(i).get("RegularUnitRate"));
                newRows.setAttribute("TaskId", lineList.get(i).get("TaskId"));
                newRows.setAttribute("RejectReason",lineList.get(i).get("RejectReason"));
                            System.out.println("-----2-------");
                            LineVo.insertRow(newRows);
                            System.out.println("-----------------Final------------------");

          System.out.println(lineList.get(i).get("JobTypeName") +"-----------"+i);
            }
            }
            
            ADFUtils.findOperation("Commit").execute();
System.out.println("---------------------12345------------------------");
//            this.getP2().cancel();

        }
    }

    public void onClickSave(ActionEvent actionEvent) {
        ADFUtils.findOperation("Commit").execute();
        JSFUtils.addFacesInformationMessage("Saved Successfully.");
        

    }

    public void onClickCopyPasteCancel(ActionEvent actionEvent) {
//        this.getP2().cancel();
    }

//    public void setP2(RichPopup p2) {
//        this.p2 = p2;
//    }
//
//    public RichPopup getP2() {
//        return p2;
//    }
    public void onClickRefresh(ActionEvent actionEvent) {
        ViewObject HdrVo = ADFUtils.findIterator("TIME_CARD_MASTER_VOIterator").getViewObject();
        HdrVo.applyViewCriteria(null);
        HdrVo.executeQuery();
    }
}
