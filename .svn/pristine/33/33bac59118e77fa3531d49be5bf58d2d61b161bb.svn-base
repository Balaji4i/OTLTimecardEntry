package view;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

import com.view.utils.ADFApproval;
import com.view.utils.ADFUtils;
import com.view.utils.JSFUtils;

import java.math.BigDecimal;

import java.sql.SQLException;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.application.ViewHandler;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ViewObjectImpl;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;


public class OTL {
//    private RichInputComboboxListOfValues empNum;
//    private RichInputComboboxListOfValues jobType;
//    private RichPopup popUp;

    private RichPopup popUp;
    private RichPopup p2;
    private RichPopup p3;
    private RichOutputText ot25;
    private RichPanelFormLayout hdrForm;
    private RichInputText ovrtime;
    //    private RichInputText approValue;
//    private RichInputText rejectValue;

    public OTL() {
    }
    
    ViewObject AddEditRoVo = ADFUtils.findIterator("AddEdit_ROVOIterator").getViewObject();
    ViewObject SearchRoVo = ADFUtils.findIterator("Search_ROVOIterator").getViewObject();
    ViewObject lookupROVO = ADFUtils.findIterator("Lookup_ROVO1Iterator").getViewObject();

//    String token = ADFContext.getCurrent()
//                             .getSessionScope()
//                             .get("jwtToken")
//                             .toString();
//     String token =
//                        ADFContext.getCurrent().getPageFlowScope().get("tokens").toString();
    String token ="eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsIng1dCI6Ik1OM2phUU1TZTNVQ3F4R1hSX2NZdHVTaWtEUSIsImtpZCI6InRydXN0c2VydmljZSJ9.eyJleHAiOjE1Nzc5NjA0NTYsInN1YiI6IjRpYXBwcyIsImlzcyI6Ind3dy5vcmFjbGUuY29tIiwicHJuIjoiNGlhcHBzIiwiaWF0IjoxNTc3OTQ2MDU2fQ.JWi6u4T2LoNl79Bgn40wHbcpg8HbRLnYNAZvNluWj8HtB5WTqKV26XBGyKmnWSnki93c8HYsrpymyqWeweSAjmqSM3CxJYBzBLpSqUA8noYmLTWf9LdSB-utLt-j2ZLxtU7ydWvdhksowGDNw4YK86jL5_k0-OSfT4PPZ37vyfp56ybBEqeNPi4sO9q6r0RHc9TyO8GF41soxgZTaSe_Xsiyzj8Xw5TBa3wkH_JTqerZoluwiU3CbLj89PO7wYAUnpfSZFYBmqYOmXkMd-XEh6nwDd3huFh9Jc9SNfMM_U6vdXb-zIIdCgJ_XKUwqzbPguQf6Atk3RoKwx8kLHf-Rg";
//String token ="eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsIng1dCI6Ik1OM2phUU1TZTNVQ3F4R1hSX2NZdHVTaWtEUSIsImtpZCI6InRydXN0c2VydmljZSJ9.eyJleHAiOjE1Nzc3MDA4NzQsInN1YiI6IjRpYXBwcyIsImlzcyI6Ind3dy5vcmFjbGUuY29tIiwicHJuIjoiNGlhcHBzIiwiaWF0IjoxNTc3Njg2NDc0fQ.UB9I-fm7gDAYy3Y98_BkBJAiQERqSvlHaRt7mvRXKpfjJmFQ97FzZawnLWto1GZ01lqwhkvmsmnwHPce7wBwYDDdfShQ5ClSXrdt_wwiSjQlouPka_fxQokFjsbMD43bXjU1-H1P_zTEj8-5aTBd3ebFhu6nwF_SPHEcbdJixKX3eTHVPXDaJB0JxZDmW3wPKUhs7AMA6SiuL1YUzGfnPvZvjZnnvbULhLJ1NG49YIy86474xu0Z2_SkHiSCNrbpaw9iiD0yxbWbV9qXpCBg_Tucsz25C0Cdudo3EYNddyih8qvNYm2iV3n3CErLQtwPakLo5xFwRhwuSXl5Nfi3hg";
   
    public void onChangeProjectNumber(ValueChangeEvent vce) {
        vce.getComponent().processUpdates(FacesContext.getCurrentInstance());
        if (vce.getNewValue() != null) {
            try {
                ViewObject MasterVO = ADFUtils.findIterator("TIME_CARD_MASTER_VOIterator").getViewObject();
                String First =
                    "https://efmj-test.fa.em3.oraclecloud.com:443/projectsFinancialsApi/resources/11.12.1.0/projects?q=ProjectNumber=";
                String Secound = vce.getNewValue().toString();
                String Final = First + Secound;
                System.out.println(Final + "Final");
                Client client = Client.create();
                String jsonStr = client.resource(Final)
                                       .accept("application/json")
                                       .header("authorization", "Bearer " + token)
                                       .get(String.class);
                System.out.println(jsonStr + "-----------??");
                JSONObject jsonObj = new JSONObject(jsonStr);
                String name = jsonObj.getString("items");
                //  System.out.println(name+"--------------");
                JSONArray arrJson = jsonObj.getJSONArray("items");
                JSONArray resultArray = (JSONArray) arrJson;
                for (int i = 0; i < resultArray.length(); i++) {
                    JSONObject result = resultArray.getJSONObject(i);
                    System.out.println(result.getString("ProjectName"));
                    System.out.println(result.getString("ProjectUnitId"));
                    System.out.println(result.getString("ProjectId"));
                    String prjName = result.getString("ProjectName");
                    String prjUnitId = result.getString("ProjectUnitId");
                    String prjId = result.getString("ProjectId");
                    
                    MasterVO.getCurrentRow().setAttribute("ProjectName",prjName);
                    MasterVO.getCurrentRow().setAttribute("ProjectId",prjId);
                    MasterVO.getCurrentRow().setAttribute("ProjectUnitId",prjUnitId);
                }
                if (name.equals("[]") || name.equals(null) ){
                    MasterVO.getCurrentRow().setAttribute("ProjectName","");
                    MasterVO.getCurrentRow().setAttribute("ProjectId","");
                    MasterVO.getCurrentRow().setAttribute("ProjectUnitId","");
                }
                RichInputText table = (RichInputText) JSFUtils.findComponentInRoot("it2");
                AdfFacesContext.getCurrentInstance().addPartialTarget(table);
                RichInputText task = (RichInputText) JSFUtils.findComponentInRoot("it9");
                AdfFacesContext.getCurrentInstance().addPartialTarget(task);

            } catch (Exception e) {
                System.out.println("--------------**Exception**------------------");
                System.out.println(e.getMessage());
            }
        }
        
        
        
    }

    public void onClickSave(ActionEvent actionEvent) {
       
                
                 ViewObjectImpl MasterVO =
                       (ViewObjectImpl)ADFUtils.findIterator("TIME_CARD_MASTER_VOIterator").getViewObject();
                 MasterVO.getCurrentRow().setAttribute("InterfaceStatus", "A");
                 System.out.println(MasterVO.getCurrentRow().getAttribute("Status") +"----Status");
                 String value="commit";
                 String status=MasterVO.getCurrentRow().getAttribute("Status").toString();
                 String id=MasterVO.getCurrentRow().getAttribute("TimeCardMasterId").toString();
                 String timeCardNumber=MasterVO.getCurrentRow().getAttribute("TimeCardNumber") == null ? "" : MasterVO.getCurrentRow().getAttribute("TimeCardNumber").toString();          
                 if(status.equals("DRAFT")){
                     ADFUtils.getPageFlowScope().put("headerId", MasterVO.getCurrentRow().getAttribute("TimeCardMasterId"));            
                 try {
               System.out.println("else");
                     MasterVO.applyViewCriteria(null);
System.out.println(timeCardNumber+"---------------TimeCardNumber");
           
                 if (timeCardNumber == "") {
                              System.out.println("22222222222222");
                              long val =
                                  Long.parseLong(id);
System.out.println(val +"-----val");
            
                              DecimalFormat myFormatter = new DecimalFormat("00000000");
                              long seq = 0;
                              seq = val + 1;
                              String typeCode = "OTL-";
                              System.out.println(typeCode + myFormatter.format(seq));
                              MasterVO.getCurrentRow().setAttribute("TimeCardNumber",
                                                              typeCode + myFormatter.format(seq));
                              MasterVO.getCurrentRow().setAttribute("Status","Draft");
//                              ADFUtils.getPageFlowScope().put("headerId", MasterVO.getCurrentRow().getAttribute("TimeCardMasterId"));
                              RichInputText tab =
                                  (RichInputText)JSFUtils.findComponentInRoot("it10");
                              AdfFacesContext.getCurrentInstance().addPartialTarget(tab);
                              System.out.println("final");
                          
                          }
                  
                 }
                 catch (Exception e) {
                 JSFUtils.addFacesErrorMessage("Error while saving :" +
                                              e.toString());
                 }   
                     ViewCriteria findBYdate =MasterVO.getViewCriteria("findBYdate");
                                                             MasterVO.applyViewCriteria(findBYdate);
                                                             MasterVO.setNamedWhereClauseParam("BV_date",MasterVO.getCurrentRow().getAttribute("TimeCardDate"));
                                                             MasterVO.setNamedWhereClauseParam("BV_Project",MasterVO.getCurrentRow().getAttribute("ProjectId"));
                                                                                 MasterVO.setNamedWhereClauseParam("BV_code",MasterVO.getCurrentRow().getAttribute("JobTypeCode"));
                                                             MasterVO.executeQuery();
                                                             System.err.println("==COUNT==" +
                                                                                MasterVO.getEstimatedRowCount());
                                                             if(MasterVO.getEstimatedRowCount() > 0){
                                              JSFUtils.addFacesErrorMessage("Same Combination of Project,Job and Date already Exists ");
                                              value="revoke";
                                                             }
                                     
                                                                                 else{
                                                                                     MasterVO.applyViewCriteria(null);
                                                                                                MasterVO.executeQuery();
                                                                                 }
                 
                 
                 }
               
                 System.out.println(value);
                 if(value.equals("commit")){
                  
                     System.out.println("11111111111");
                     ADFUtils.findOperation("Commit").execute();
                     JSFUtils.addFacesInformationMessage("Saved Successfully.");
                 }
               
               
             }
 

    public void onClickAdd(ActionEvent actionEvent) {
        
        ViewObject HdrVO = ADFUtils.findIterator("TIME_CARD_MASTER_VOIterator").getViewObject();
        
        
        
        if(AddEditRoVo.getCurrentRow().getAttribute("EmployeeLov") == null ){
            JSFUtils.addFacesErrorMessage("Employee Number... You must enter a value.");
        }else if(AddEditRoVo.getCurrentRow().getAttribute("TaskName") == null && HdrVO.getCurrentRow().getAttribute("JobTypeCode").equals("EMP")){
            JSFUtils.addFacesErrorMessage("Task Number... You must enter a value.");         
        }else if(AddEditRoVo.getCurrentRow().getAttribute("RegularHours") == null ){
            JSFUtils.addFacesErrorMessage("Regular Hours.. You must enter a value.");         
        }else if(AddEditRoVo.getCurrentRow().getAttribute("Ot1") == null ){
            JSFUtils.addFacesErrorMessage(" Over Time .. You must enter a value.");         
        }
//        else if(AddEditRoVo.getCurrentRow().getAttribute("Ot2") == null ){
//            JSFUtils.addFacesErrorMessage("Incentive Hours..You must enter a value");         
//        }
           else if(AddEditRoVo.getCurrentRow().getAttribute("JobType") == null && HdrVO.getCurrentRow().getAttribute("JobTypeCode").equals("EMP")){
            JSFUtils.addFacesErrorMessage("JobType.. You must enter a value ");         
        }
        else{        
//            if(AddEditRoVo.getCurrentRow().getAttribute("EmployeeLov") != null ){
            
//                              ViewObject LineVO = ADFUtils.findIterator("XXSC_TIME_CARD_DTL_VO1Iterator").getViewObject();
//               ViewCriteria contractLineVC =
//                           LineVO.createViewCriteria();
//                       ViewCriteriaRow contractLineVCRow =
//                           contractLineVC.createViewCriteriaRow();
//            System.out.println(HdrVO.getCurrentRow().getAttribute("TimeCardDate") +"--------Date");
//            System.out.println(AddEditRoVo.getCurrentRow().getAttribute("EmployeeLov") +"-------Employee");
//                       contractLineVCRow.setAttribute("TimeCardDate", HdrVO.getCurrentRow().getAttribute("TimeCardDate"));
//                       contractLineVCRow.setAttribute("EmployeeNumber",AddEditRoVo.getCurrentRow().getAttribute("EmployeeLov"));
//                       contractLineVC.addRow(contractLineVCRow);
//                       LineVO.applyViewCriteria(contractLineVC);
//                       LineVO.executeQuery();
                    ViewObjectImpl LineVO =
              (ViewObjectImpl)ADFUtils.findIterator("XXSC_TIME_CARD_DTL_VO1Iterator").getViewObject();
                    ViewCriteria findByNumAndDate =LineVO.getViewCriteria("findByNumAndDate");
                       LineVO.applyViewCriteria(findByNumAndDate);
                       LineVO.setNamedWhereClauseParam("BV_Date",HdrVO.getCurrentRow().getAttribute("TimeCardDate"));
                       LineVO.setNamedWhereClauseParam("BV_EMP_NUM",AddEditRoVo.getCurrentRow().getAttribute("EmployeeLov")); 
                       LineVO.executeQuery();
                       System.err.println("==COUNT==" +
                                          LineVO.getEstimatedRowCount());
                       if(LineVO.getEstimatedRowCount() > 0){
                    AddEditRoVo.getCurrentRow().setAttribute("EmployeeLov",null);
                    AddEditRoVo.getCurrentRow().setAttribute("EmployeeName","");
                    AddEditRoVo.getCurrentRow().setAttribute("JobType",null);                    
                    
                    RichInputComboboxListOfValues table = (RichInputComboboxListOfValues) JSFUtils.findComponentInRoot("employeeLovId");
                    AdfFacesContext.getCurrentInstance().addPartialTarget(table);
                    RichInputComboboxListOfValues val = (RichInputComboboxListOfValues) JSFUtils.findComponentInRoot("jobTypeId");
                    AdfFacesContext.getCurrentInstance().addPartialTarget(val);
                    JSFUtils.addFacesErrorMessage("Please Check .. Selected Employee Details  Already Exists ");
                }
                
                else{
               
                        ViewObject jobDtlvo = ADFUtils.findIterator("XXSC_TIME_CARD_DTL_VOIterator").getViewObject();
                        Row[] dtlRows = jobDtlvo.getFilteredRows("EmployeeNumber",AddEditRoVo.getCurrentRow().getAttribute("EmployeeLov"));
                        System.err.println("dtlRowcount=="+dtlRows.length);
                        if (dtlRows.length > 0) {
                            AddEditRoVo.getCurrentRow().setAttribute("EmployeeLov",null);
                            AddEditRoVo.getCurrentRow().setAttribute("EmployeeName","");
                            AddEditRoVo.getCurrentRow().setAttribute("JobType",null);                    
                            
                            RichInputComboboxListOfValues table = (RichInputComboboxListOfValues) JSFUtils.findComponentInRoot("employeeLovId");
                            AdfFacesContext.getCurrentInstance().addPartialTarget(table);
                            RichInputComboboxListOfValues val = (RichInputComboboxListOfValues) JSFUtils.findComponentInRoot("jobTypeId");
                            AdfFacesContext.getCurrentInstance().addPartialTarget(val);
                            JSFUtils.addFacesErrorMessage("Please Check .. Selected Employee Details  Already Exists ");
                            
                        }
                        else{
                            try {
                                System.out.println("1111111");
                                double RegularAmount =0;
                                  double Ot1Amount =0;
                                  double Ot2Amount =0;
                                double JobRate=0;
                                double total=0;
                                if(HdrVO.getCurrentRow().getAttribute("JobTypeCode").equals("EMP") ){
                                 JobRate=AddEditRoVo.getCurrentRow().getAttribute("JobRate") == null ? 0 : Double.parseDouble(AddEditRoVo.getCurrentRow().getAttribute("JobRate").toString());
                                        double Overtimerate=AddEditRoVo.getCurrentRow().getAttribute("Overtimerate") == null ? 0 : Double.parseDouble(AddEditRoVo.getCurrentRow().getAttribute("Overtimerate").toString());
//                                        double Incentiverate=AddEditRoVo.getCurrentRow().getAttribute("Incentiverate") == null ? 0 : Double.parseDouble(AddEditRoVo.getCurrentRow().getAttribute("Incentiverate").toString());
                                        double RegularHours=AddEditRoVo.getCurrentRow().getAttribute("RegularHours") == null ? 0 : Double.parseDouble(AddEditRoVo.getCurrentRow().getAttribute("RegularHours").toString());
                                        double Ot1=AddEditRoVo.getCurrentRow().getAttribute("Ot1") == null ? 0 : Double.parseDouble(AddEditRoVo.getCurrentRow().getAttribute("Ot1").toString());
//                                        double Ot2=AddEditRoVo.getCurrentRow().getAttribute("Ot2") == null ? 0 : Double.parseDouble(AddEditRoVo.getCurrentRow().getAttribute("Ot2").toString());
                                
                                       RegularAmount =(JobRate/RegularHours)*8;
//                                         Ot1Amount =(JobRate/RegularHours)*Overtimerate*Ot1;//commented on 21-Aug-202
                                       Ot1Amount =Overtimerate*Ot1;
//                                         Ot2Amount =(JobRate/RegularHour;s)*Incentiverate*Ot2;
                                         total=RegularAmount+Ot1Amount;
//                                               + Ot2Amount;
                                }
                               
                                
                            ViewObject DetailVO = ADFUtils.findIterator("XXSC_TIME_CARD_DTL_VOIterator").getViewObject();
                            System.out.println("-----------------Start------------------");
                                Row newRow = DetailVO.createRow();
                                 newRow.setAttribute("EmployeeId", AddEditRoVo.getCurrentRow().getAttribute("EmployeeId"));
                                newRow.setAttribute("EmployeeName", AddEditRoVo.getCurrentRow().getAttribute("EmployeeName"));
                                newRow.setAttribute("EmployeeNumber",AddEditRoVo.getCurrentRow().getAttribute("EmployeeLov")  );
                                
                             
                                
                                newRow.setAttribute("TaskId",AddEditRoVo.getCurrentRow().getAttribute("TaskId"));
                                newRow.setAttribute("TaskName",AddEditRoVo.getCurrentRow().getAttribute("TaskName") );  
                                newRow.setAttribute("TaskNumber",AddEditRoVo.getCurrentRow().getAttribute("TaskNumber") );
                                
                            //           LRow.setAttribute("ExpenditureType","ST");
                                newRow.setAttribute("RegularHrs",AddEditRoVo.getCurrentRow().getAttribute("RegularHours") );
                                newRow.setAttribute("OverTimeHrs",AddEditRoVo.getCurrentRow().getAttribute("Ot1") );
//                                newRow.setAttribute("IncentiveHrs",AddEditRoVo.getCurrentRow().getAttribute("Ot2") );
                               

                                newRow.setAttribute("Status", "DRAFT");
                                
                            
                                newRow.setAttribute("JobTypeCode",AddEditRoVo.getCurrentRow().getAttribute("JobId") );
                                newRow.setAttribute("JobTypeName",AddEditRoVo.getCurrentRow().getAttribute("JobType") );
                                newRow.setAttribute("JobTypeRate",JobRate );
                            //
                               
                                newRow.setAttribute("RegularUnitRate",AddEditRoVo.getCurrentRow().getAttribute("JobRate") );
                                newRow.setAttribute("OverTimeUnitRate",AddEditRoVo.getCurrentRow().getAttribute("Overtimerate") );
                                newRow.setAttribute("IncentiveUnitRate",AddEditRoVo.getCurrentRow().getAttribute("Incentiverate") );
                                
                                System.out.println("-----1-");
                                newRow.setAttribute("RegularRate",RegularAmount );
                                newRow.setAttribute("OverTimeRate",Ot1Amount );
//                                newRow.setAttribute("IncentiveRate",Ot2Amount );
                                newRow.setAttribute("TotalAmount",total );
                                
                             System.out.println("-----2-------");
                                DetailVO.insertRow(newRow);
                                System.out.println("-----------------Final------------------");
                                
                            //            empNum.setValue("");
                                  AddEditRoVo.getCurrentRow().setAttribute("EmployeeLov",null);
                                AddEditRoVo.getCurrentRow().setAttribute("EmployeeName","");
                                AddEditRoVo.getCurrentRow().setAttribute("JobType",null);
                                AddEditRoVo.getCurrentRow().setAttribute("RegularHours",null);
                                AddEditRoVo.getCurrentRow().setAttribute("Ot1",null);
                                RichInputComboboxListOfValues table = (RichInputComboboxListOfValues) JSFUtils.findComponentInRoot("employeeLovId");
                                AdfFacesContext.getCurrentInstance().addPartialTarget(table);
                                RichInputComboboxListOfValues val = (RichInputComboboxListOfValues) JSFUtils.findComponentInRoot("jobTypeId");
                                AdfFacesContext.getCurrentInstance().addPartialTarget(val);
                               
                            } catch (Exception ex) {
                                System.out.println(ex.getMessage());
                            }
                            }
                        }
 
            }
    }

    public void onClickUpdate(ActionEvent actionEvent) {
        
        ViewObject HdrVO = ADFUtils.findIterator("TIME_CARD_MASTER_VOIterator").getViewObject();
        if(AddEditRoVo.getCurrentRow().getAttribute("EmployeeLov") == null ){
            JSFUtils.addFacesErrorMessage("Employee Number... You must enter a value.");
        }else if(AddEditRoVo.getCurrentRow().getAttribute("TaskName") == null && HdrVO.getCurrentRow().getAttribute("JobTypeCode").equals("EMP")){
            JSFUtils.addFacesErrorMessage("Task Number... You must enter a value.");         
        }else if(AddEditRoVo.getCurrentRow().getAttribute("RegularHours") == null ){
            JSFUtils.addFacesErrorMessage("Regular Hours.. You must enter a value.");         
        }else if(AddEditRoVo.getCurrentRow().getAttribute("Ot1") == null ){
            JSFUtils.addFacesErrorMessage(" Over Time .. You must enter a value.");         
        }
//        else if(AddEditRoVo.getCurrentRow().getAttribute("Ot2") == null ){
//            JSFUtils.addFacesErrorMessage("Incentive Hours..You must enter a value");         
//        }
        else if(AddEditRoVo.getCurrentRow().getAttribute("JobType") == null && HdrVO.getCurrentRow().getAttribute("JobTypeCode").equals("EMP") ){
            JSFUtils.addFacesErrorMessage("JobType.. You must enter a value ");         
        }
        else{
//        if(AddEditRoVo.getCurrentRow().getAttribute("EmployeeLov") != null ){
//            ViewObject jobDtlvo = ADFUtils.findIterator("XXSC_TIME_CARD_DTL_VOIterator").getViewObject();
//            Row[] dtlRows = jobDtlvo.getFilteredRows("EmployeeNumber",AddEditRoVo.getCurrentRow().getAttribute("EmployeeLov"));
//            System.err.println("dtlRowcount=="+dtlRows.length);
//            if (dtlRows.length > 1) {
               ViewObject LineVO = ADFUtils.findIterator("XXSC_TIME_CARD_DTL_VO1Iterator").getViewObject();
        ViewObject LineView = ADFUtils.findIterator("XXSC_TIME_CARD_DTL_VOIterator").getViewObject();
        ViewCriteria contractLineVC =
                           LineVO.createViewCriteria();
                       ViewCriteriaRow contractLineVCRow =
                           contractLineVC.createViewCriteriaRow();
                       contractLineVCRow.setAttribute("TimeCardDate", HdrVO.getCurrentRow().getAttribute("TimeCardDate"));
                       contractLineVCRow.setAttribute("EmployeeNumber",AddEditRoVo.getCurrentRow().getAttribute("EmployeeLov"));
                       contractLineVC.addRow(contractLineVCRow);
                       LineVO.applyViewCriteria(contractLineVC);
                       LineVO.executeQuery();
                       System.err.println("==COUNT==" +
                                          LineVO.getEstimatedRowCount());
                       
                       if(LineVO.getEstimatedRowCount() > 2){
                       
                AddEditRoVo.getCurrentRow().setAttribute("EmployeeLov",null);
                AddEditRoVo.getCurrentRow().setAttribute("EmployeeName","");
                AddEditRoVo.getCurrentRow().setAttribute("JobType",null); 
                RichInputComboboxListOfValues table = (RichInputComboboxListOfValues) JSFUtils.findComponentInRoot("employeeLovId");
                AdfFacesContext.getCurrentInstance().addPartialTarget(table);
                RichInputComboboxListOfValues val = (RichInputComboboxListOfValues) JSFUtils.findComponentInRoot("jobTypeId");
                AdfFacesContext.getCurrentInstance().addPartialTarget(val);
                JSFUtils.addFacesErrorMessage("Please Check .. Selected Employee Details  Already Exists ");
            }

            else{
        ViewObject jobDtlvo = ADFUtils.findIterator("XXSC_TIME_CARD_DTL_VOIterator").getViewObject();
                    Row[] dtlRows = jobDtlvo.getFilteredRows("EmployeeNumber",AddEditRoVo.getCurrentRow().getAttribute("EmployeeLov"));
                    System.err.println("dtlRowcount=="+dtlRows.length);
                    if (dtlRows.length > 1) { 
                        AddEditRoVo.getCurrentRow().setAttribute("EmployeeLov",null);
                        AddEditRoVo.getCurrentRow().setAttribute("EmployeeName","");
                        AddEditRoVo.getCurrentRow().setAttribute("JobType",null); 
                        RichInputComboboxListOfValues table = (RichInputComboboxListOfValues) JSFUtils.findComponentInRoot("employeeLovId");
                        AdfFacesContext.getCurrentInstance().addPartialTarget(table);
                        RichInputComboboxListOfValues val = (RichInputComboboxListOfValues) JSFUtils.findComponentInRoot("jobTypeId");
                        AdfFacesContext.getCurrentInstance().addPartialTarget(val);
                        JSFUtils.addFacesErrorMessage("Please Check .. Selected Employee Details  Already Exists ");
 
                    }
                    else{
               
            double RegularAmount =0;
              double Ot1Amount =0;
              double Ot2Amount =0;
               double total=0;         
            
            if(HdrVO.getCurrentRow().getAttribute("JobTypeCode").equals("EMP") ){
                
            double JobRate=AddEditRoVo.getCurrentRow().getAttribute("JobRate") == null ? 0 : Double.parseDouble(AddEditRoVo.getCurrentRow().getAttribute("JobRate").toString());
                    double Overtimerate=AddEditRoVo.getCurrentRow().getAttribute("Overtimerate") == null ? 0 : Double.parseDouble(AddEditRoVo.getCurrentRow().getAttribute("Overtimerate").toString());
//                    double Incentiverate=AddEditRoVo.getCurrentRow().getAttribute("Incentiverate") == null ? 0 : Double.parseDouble(AddEditRoVo.getCurrentRow().getAttribute("Incentiverate").toString());
                    double RegularHours=AddEditRoVo.getCurrentRow().getAttribute("RegularHours") == null ? 0 : Double.parseDouble(AddEditRoVo.getCurrentRow().getAttribute("RegularHours").toString());
                    double Ot1=AddEditRoVo.getCurrentRow().getAttribute("Ot1") == null ? 0 : Double.parseDouble(AddEditRoVo.getCurrentRow().getAttribute("Ot1").toString());
//                    double Ot2=AddEditRoVo.getCurrentRow().getAttribute("Ot2") == null ? 0 : Double.parseDouble(AddEditRoVo.getCurrentRow().getAttribute("Ot2").toString());
            
                   RegularAmount =(JobRate/RegularHours)*8;
                     Ot1Amount =(JobRate/RegularHours)*Overtimerate*Ot1;
//                     Ot2Amount =(JobRate/RegularHours)*Incentiverate*Ot2;
                     total=RegularAmount+Ot1Amount;
//                     +Ot2Amount;
            }
                       
              ViewObject DetailVO = ADFUtils.findIterator("XXSC_TIME_CARD_DTL_VOIterator").getViewObject();
               ViewObject AddEditRoVo = ADFUtils.findIterator("AddEdit_ROVOIterator").getViewObject();
                 Row newRow = DetailVO.getCurrentRow();
                          newRow.setAttribute("EmployeeId", AddEditRoVo.getCurrentRow().getAttribute("EmployeeId"));
                        newRow.setAttribute("EmployeeName", AddEditRoVo.getCurrentRow().getAttribute("EmployeeName"));
                        newRow.setAttribute("EmployeeNumber",AddEditRoVo.getCurrentRow().getAttribute("EmployeeLov")  );
                        
                     
                        System.out.println(AddEditRoVo.getCurrentRow().getAttribute("TaskId") +"--------------------Task Id");
                        newRow.setAttribute("TaskId",AddEditRoVo.getCurrentRow().getAttribute("TaskId"));
                        newRow.setAttribute("TaskName",AddEditRoVo.getCurrentRow().getAttribute("TaskName") );  
                        newRow.setAttribute("TaskNumber",AddEditRoVo.getCurrentRow().getAttribute("TaskNumber") );
                newRow.setAttribute("JobTypeCode",AddEditRoVo.getCurrentRow().getAttribute("JobId") );
                newRow.setAttribute("JobTypeName",AddEditRoVo.getCurrentRow().getAttribute("JobType") );
                newRow.setAttribute("JobTypeRate",AddEditRoVo.getCurrentRow().getAttribute("JobRate") );
                
                newRow.setAttribute("RegularUnitRate",AddEditRoVo.getCurrentRow().getAttribute("JobRate") );
                newRow.setAttribute("OverTimeUnitRate",AddEditRoVo.getCurrentRow().getAttribute("Overtimerate") );
//                newRow.setAttribute("IncentiveUnitRate",AddEditRoVo.getCurrentRow().getAttribute("Incentiverate") );
                  
            //                    newRow.setAttribute("ExpenditureId","300000009090581" );
            //                    newRow.setAttribute("ExpenditureType","ST");
                        newRow.setAttribute("RegularHrs",AddEditRoVo.getCurrentRow().getAttribute("RegularHours") );
                        newRow.setAttribute("OverTimeHrs",AddEditRoVo.getCurrentRow().getAttribute("Ot1") );
//                        newRow.setAttribute("IncentiveHrs",AddEditRoVo.getCurrentRow().getAttribute("Ot2") );
                        newRow.setAttribute("RegularRate",RegularAmount);
                        newRow.setAttribute("OverTimeRate",Ot1Amount );
//                        newRow.setAttribute("IncentiveRate",Ot2Amount );
                newRow.setAttribute("TotalAmount",total );
                

              
                     System.err.println("Data updated-----");
            //                  AddEditRoVo.getCurrentRow().setAttribute("EmployeeLov","");
                      AddEditRoVo.getCurrentRow().setAttribute("EmployeeLov",null)  ;
            AddEditRoVo.getCurrentRow().setAttribute("EmployeeName","");
            AddEditRoVo.getCurrentRow().setAttribute("TaskId","") ;  
                      AddEditRoVo.getCurrentRow().setAttribute("TaskName","") ;  
                      AddEditRoVo.getCurrentRow().setAttribute("TaskNumber","") ;
                      AddEditRoVo.getCurrentRow().setAttribute("RegularHours","") ;
                      AddEditRoVo.getCurrentRow().setAttribute("Ot1","") ;
//                      AddEditRoVo.getCurrentRow().setAttribute("Ot2","") ;
                      AddEditRoVo.getCurrentRow().setAttribute("JobId","") ;
                      AddEditRoVo.getCurrentRow().setAttribute("JobType",null) ;
                      AddEditRoVo.getCurrentRow().setAttribute("JobRate","") ;
                      AddEditRoVo.getCurrentRow().setAttribute("Overtimerate","") ;
//                      AddEditRoVo.getCurrentRow().setAttribute("Incentiverate","") ;
//                AddEditRoVo.getCurrentRow().setAttribute("TotalAmount","") ;
            //                                empNum.setValue("");
            //        jobType.setValue("");
            
                           RichInputComboboxListOfValues table = (RichInputComboboxListOfValues) JSFUtils.findComponentInRoot("employeeLovId");
                           AdfFacesContext.getCurrentInstance().addPartialTarget(table);
            RichInputComboboxListOfValues val = (RichInputComboboxListOfValues) JSFUtils.findComponentInRoot("jobTypeId");
            AdfFacesContext.getCurrentInstance().addPartialTarget(val);
            System.err.println("Data cleared-----");  
            ADFUtils.getPageFlowScope().put("addEditMode","addmode");
                    System.out.println( ADFContext.getCurrent().getPageFlowScope().get("addEditMode").toString() +"------Mode");
                        
                ADFUtils.findOperation("Commit").execute();       
                    
            }       
                           
            }    
        }
    }

    public void OnClickAddEditReset(ActionEvent actionEvent) {
        
       
//        AddEditRoVo.getCurrentRow().setAttribute("EmployeeId","");
//        AddEditRoVo.getCurrentRow().setAttribute("EmployeeLov","");
//        AddEditRoVo.getCurrentRow().setAttribute("EmployeeName","");
//        AddEditRoVo.getCurrentRow().setAttribute("TaskId","");
      
//        AddEditRoVo.getCurrentRow().setAttribute("TaskName","");
//        AddEditRoVo.getCurrentRow().setAttribute("TaskNumber","");
         System.out.println("111111111111");
        AddEditRoVo.getCurrentRow().setAttribute("RegularHours","");
        AddEditRoVo.getCurrentRow().setAttribute("Ot1","");
//        AddEditRoVo.getCurrentRow().setAttribute("Ot2","");
        System.out.println("22222222222");
       AddEditRoVo.getCurrentRow().setAttribute("Overtimerate","");
//        AddEditRoVo.getCurrentRow().setAttribute("Incentiverate","");
        System.out.println("3333333333");
        AddEditRoVo.getCurrentRow().setAttribute("JobType",null);
//        jobType.setValue("");
        RichInputComboboxListOfValues val = (RichInputComboboxListOfValues) JSFUtils.findComponentInRoot("jobTypeId");
        AdfFacesContext.getCurrentInstance().addPartialTarget(val);
        AddEditRoVo.getCurrentRow().setAttribute("JobRate","");
        System.out.println("444444444444");
        AddEditRoVo.getCurrentRow().setAttribute("TaskNumber","");
        AddEditRoVo.getCurrentRow().setAttribute("TaskName","");
        System.out.println("55555555555");
        AddEditRoVo.getCurrentRow().setAttribute("EmployeeLov",null);
//                                 empNum.setValue("");
        RichInputComboboxListOfValues table = (RichInputComboboxListOfValues) JSFUtils.findComponentInRoot("employeeLovId");
        AdfFacesContext.getCurrentInstance().addPartialTarget(table);
        AddEditRoVo.getCurrentRow().setAttribute("EmployeeName","");
        AddEditRoVo.getCurrentRow().setAttribute("EmployeeId","");
        System.out.println("66666666666");
        ovrtime.setDisabled(false);
        AdfFacesContext.getCurrentInstance().addPartialTarget(ovrtime);
    }

    public void onclickSearch(ActionEvent actionEvent) {
        ViewObjectImpl DetailVO =
              (ViewObjectImpl)ADFUtils.findIterator("OTL_VOIterator").getViewObject();
        
        System.out.println(SearchRoVo.getCurrentRow().getAttribute("EmployeeNumber"));
        System.out.println(SearchRoVo.getCurrentRow().getAttribute("EmployeeName"));
        System.out.println(SearchRoVo.getCurrentRow().getAttribute("ProjectNumber"));
        System.out.println(SearchRoVo.getCurrentRow().getAttribute("ProjectName"));
        System.out.println(SearchRoVo.getCurrentRow().getAttribute("Fromdate"));
        System.out.println(SearchRoVo.getCurrentRow().getAttribute("Todate"));
        System.err.println("==VC===findByEmpName");
                       ViewCriteria searchReqVC =
        DetailVO.getViewCriteria("findByEmpName");
                         
                       DetailVO.applyViewCriteria(searchReqVC);
                       DetailVO.setNamedWhereClauseParam("p_emp_Num",SearchRoVo.getCurrentRow().getAttribute("EmployeeNumber"));
                       DetailVO.setNamedWhereClauseParam("p_from_date",SearchRoVo.getCurrentRow().getAttribute("Fromdate"));
                       DetailVO.setNamedWhereClauseParam("p_to_date",SearchRoVo.getCurrentRow().getAttribute("Todate")); 
                       DetailVO.executeQuery();
        
        RichTable table = (RichTable) JSFUtils.findComponentInRoot("t1");
        AdfFacesContext.getCurrentInstance().addPartialTarget(table);
        
        }
    

  

    public void onClickSearchReset(ActionEvent actionEvent) {
        // Add event code here...
    }

    public void onChangeAddEmployee(ValueChangeEvent vce) {
        vce.getComponent().processUpdates(FacesContext.getCurrentInstance());
        ADFUtils.getPageFlowScope().put("empId", vce.getNewValue());
        if (vce.getNewValue() != null) {
            
            try {
                String First =
                    "https://efmj-test.fa.em3.oraclecloud.com:443/hcmRestApi/resources/11.13.18.05/emps?q=PersonNumber=";
                String Secound = vce.getNewValue().toString();
                String Final = First + Secound;
                
        //                System.out.println(Final + "Final");
                Client client = Client.create();
                String jsonStr = client.resource(Final)
                                       .accept("application/json")
                                       .header("authorization", "Bearer " + token)
                                       .get(String.class);

        //                System.out.println(jsonStr + "-----------??");
                JSONObject jsonObj = new JSONObject(jsonStr);
                String name = jsonObj.getString("items");
        //                  System.out.println(name+"--------------");
                JSONArray arrJson = jsonObj.getJSONArray("items");
                JSONArray resultArray = (JSONArray) arrJson;
                for (int i = 0; i < resultArray.length(); i++) {
                    JSONObject result = resultArray.getJSONObject(i);
                    System.out.println(result.getString("DisplayName"));
                    String EmpName = result.getString("DisplayName");
                    AddEditRoVo.getCurrentRow().setAttribute("EmployeeName",EmpName);
                   // ADFContext.getCurrent().getSessionScope().put("EmpNumber",Secound);
                }
                if (name.equals("[]") || name.equals(null) ){
                    System.out.println("Name is null ");
                    AddEditRoVo.getCurrentRow().setAttribute("EmployeeName","");
                   // ADFContext.getCurrent().getSessionScope().put("EmpNumber","");
                }
                
                RichInputText table = (RichInputText) JSFUtils.findComponentInRoot("it5");
                AdfFacesContext.getCurrentInstance().addPartialTarget(table);

            } catch (Exception e) {
                System.out.println("--------------**Exception**------------------");
                System.out.println(e.getMessage());
            }
        }
    }

    public void onChangeAddTask(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
              
               try
                   {
                       ViewObjectImpl MasterVO =
                             (ViewObjectImpl)ADFUtils.findIterator("TIME_CARD_MASTER_VOIterator").getViewObject();
                    String prjId=MasterVO.getCurrentRow().getAttribute("ProjectId") == null ? "" : MasterVO.getCurrentRow().getAttribute("ProjectId").toString();
                   
                   System.out.println(prjId +"----PrjId");
                   if(prjId != null)
                   {
                       
                      
                       String First="https://efmj-test.fa.em3.oraclecloud.com:443/projectsFinancialsApi/resources/11.12.1.0/projects/";
                       String Secound ="/child/Tasks?q=TaskNumber=";
                       String TaskNo=valueChangeEvent.getNewValue().toString();
                       String Final=First+prjId+Secound+TaskNo;
                       
                       Client c = Client.create();
                       
                       
                       c.addFilter(new HTTPBasicAuthFilter("4iapps", "welcome@4i"));
                       System.out.println("--------------1-------------");
                           WebResource resource = c.resource(Final);
                       System.out.println("-------------2-------------");
                   
                      
                       
                           String response = resource.accept("application/json").get(String.class); 
                           System.out.println("-------------3-------------");
                          
                           System.out.println(response);
                   System.out.println("--------------------------------------");      
                       JSONObject jsonObj = new JSONObject(response);
                       String name = jsonObj.getString("items");
                       System.out.println(name+"--------------");
                   
                       JSONArray arrJson=jsonObj.getJSONArray("items");
                   
                       JSONArray resultArray = (JSONArray) arrJson;
                       

                       for (int i=0;i<resultArray.length();i++){
                           JSONObject result = resultArray.getJSONObject(i);
                           String taskName=result.getString("TaskName");
                           System.out.println(result.getString("TaskName"));
                         
                           AddEditRoVo.getCurrentRow().setAttribute("TaskName",taskName);
                           }
                           if (name.equals("[]") || name.equals(null) ){
                           System.out.println("TaskName is null ");
                           AddEditRoVo.getCurrentRow().setAttribute("TaskName","");
                           }
                           
                           RichInputText table = (RichInputText) JSFUtils.findComponentInRoot("it9");
                           AdfFacesContext.getCurrentInstance().addPartialTarget(table);

                   }
                   else{
                       System.out.println("Project Id is Null ");
                   }
                   }
                   
                   catch (Exception e)
                   {
                       System.out.println("--------------5-------------");
                     e.printStackTrace();
                   }
               

    }

    public void onChangeSearchEmployee(ValueChangeEvent vce) {
        vce.getComponent().processUpdates(FacesContext.getCurrentInstance());
        if (vce.getNewValue() != null) {
            try {
                String First =
                    "https://efmj-test.fa.em3.oraclecloud.com:443/hcmRestApi/resources/11.13.18.05/emps?q=PersonNumber=";
                String Secound = vce.getNewValue().toString();
                String Final = First + Secound;
                
        //                System.out.println(Final + "Final");
                Client client = Client.create();
                String jsonStr = client.resource(Final)
                                       .accept("application/json")
                                       .header("authorization", "Bearer " + token)
                                       .get(String.class);

        //                System.out.println(jsonStr + "-----------??");
                JSONObject jsonObj = new JSONObject(jsonStr);
                String name = jsonObj.getString("items");
        //                  System.out.println(name+"--------------");
                JSONArray arrJson = jsonObj.getJSONArray("items");
                JSONArray resultArray = (JSONArray) arrJson;
                for (int i = 0; i < resultArray.length(); i++) {
                    JSONObject result = resultArray.getJSONObject(i);
                    System.out.println(result.getString("DisplayName"));
                    String EmpName = result.getString("DisplayName");
                    SearchRoVo.getCurrentRow().setAttribute("EmployeeName",EmpName);
                }
                if (name.equals("[]") || name.equals(null) ){
                    System.out.println("Name is null ");
                    SearchRoVo.getCurrentRow().setAttribute("EmployeeName","");
                }
                
                RichInputText table = (RichInputText) JSFUtils.findComponentInRoot("it11");
                AdfFacesContext.getCurrentInstance().addPartialTarget(table);

            } catch (Exception e) {
                System.out.println("--------------**Exception**------------------");
                System.out.println(e.getMessage());
            }
        }
    }

    public void onChangeSearchTask(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
              
//               try
//                   {
//                   
//                       System.out.println(prjId.getValue()+"------------------ Prj id");
//                   
//                   if(prjId.getValue() != null)
//                   {
//                       
//                       String ProjectId=prjId.getValue().toString();
//                       String First="https://efmj-test.fa.em3.oraclecloud.com:443/projectsFinancialsApi/resources/11.12.1.0/projects/";
//                       String Secound ="/child/Tasks?q=TaskNumber=";
//                       String TaskNo=valueChangeEvent.getNewValue().toString();
//                       String Final=First+ProjectId+Secound+TaskNo;
//                       
//                       Client c = Client.create();
//                       
//                       
//                       c.addFilter(new HTTPBasicAuthFilter("4iapps", "welcome@4i"));
//                       System.out.println("--------------1-------------");
//                           WebResource resource = c.resource(Final);
//                       System.out.println("-------------2-------------");
//                   
//                      
//                       
//                           String response = resource.accept("application/json").get(String.class); 
//                           System.out.println("-------------3-------------");
//                          
//                           System.out.println(response);
//                   System.out.println("--------------------------------------");      
//                       JSONObject jsonObj = new JSONObject(response);
//                       String name = jsonObj.getString("items");
//                       System.out.println(name+"--------------");
//                   
//                       JSONArray arrJson=jsonObj.getJSONArray("items");
//                   
//                       JSONArray resultArray = (JSONArray) arrJson;
//                       
//
//                       for (int i=0;i<resultArray.length();i++){
//                           JSONObject result = resultArray.getJSONObject(i);
//                           String taskName=result.getString("TaskName");
//                           System.out.println(result.getString("TaskName"));
//                           taskname.setValue(taskName);
//                           System.out.println(taskname.getValue()+ "------------------Taskname");
//                           
//                       }
//                   }
//                   else{
//                       System.out.println("Project Id is Null ");
//                   }
//                   }
//                   
//                   catch (Exception e)
//                   {
//                       System.out.println("--------------5-------------");
//                     e.printStackTrace();
//                   }
//               

    }

    public void onClickEdit(ActionEvent actionEvent) {
        ViewObject DetailVO = ADFUtils.findIterator("XXSC_TIME_CARD_DTL_VOIterator").getViewObject();
        System.out.println("------------1------------");
     
       
        AddEditRoVo.getCurrentRow().setAttribute("EmployeeLov",DetailVO.getCurrentRow().getAttribute("EmployeeNumber"));
        AddEditRoVo.getCurrentRow().setAttribute("EmployeeName",DetailVO.getCurrentRow().getAttribute("EmployeeName"));
        AddEditRoVo.getCurrentRow().setAttribute("TaskId",DetailVO.getCurrentRow().getAttribute("TaskId"));
        AddEditRoVo.getCurrentRow().setAttribute("TaskName",DetailVO.getCurrentRow().getAttribute("TaskName"));
        AddEditRoVo.getCurrentRow().setAttribute("TaskNumber",DetailVO.getCurrentRow().getAttribute("TaskNumber"));
        AddEditRoVo.getCurrentRow().setAttribute("JobId",DetailVO.getCurrentRow().getAttribute("JobTypeCode"));
        AddEditRoVo.getCurrentRow().setAttribute("JobType",DetailVO.getCurrentRow().getAttribute("JobTypeName"));
        AddEditRoVo.getCurrentRow().setAttribute("JobRate",DetailVO.getCurrentRow().getAttribute("JobTypeRate"));       
        AddEditRoVo.getCurrentRow().setAttribute("RegularHours",DetailVO.getCurrentRow().getAttribute("RegularHrs"));
        AddEditRoVo.getCurrentRow().setAttribute("Ot1",DetailVO.getCurrentRow().getAttribute("OverTimeHrs"));
//        AddEditRoVo.getCurrentRow().setAttribute("Ot2",DetailVO.getCurrentRow().getAttribute("IncentiveHrs"));
        AddEditRoVo.getCurrentRow().setAttribute("Overtimerate",DetailVO.getCurrentRow().getAttribute("OverTimeUnitRate"));
//        AddEditRoVo.getCurrentRow().setAttribute("Incentiverate",DetailVO.getCurrentRow().getAttribute("IncentiveUnitRate"));
 
//                    empNum.setValue(DetailVO.getCurrentRow().getAttribute("EmployeeNumber"));
//                AdfFacesContext.getCurrentInstance().addPartialTarget(empNum);

        System.out.println("----------------2----------------------");

        
    }

    public void onClickCancel(ActionEvent actionEvent) {
        
        ViewObject HdrVO = ADFUtils.findIterator("TIME_CARD_MASTER_VOIterator").getViewObject();
              HdrVO.applyViewCriteria(null);
              HdrVO.executeQuery();
            
        ADFUtils.findOperation("Rollback").execute();
        
        
    }

    public void onClickTest() {
            ViewObject HdrVO = ADFUtils.findIterator("TIME_CARD_MASTER_VOIterator").getViewObject();
            String batch_id=HdrVO.getCurrentRow().getAttribute("BatchId").toString();
            String jobTypeCode=HdrVO.getCurrentRow().getAttribute("JobTypeCode").toString();
            System.err.println("batch_id is----"+batch_id);
        System.err.println("jobTypeCode is----"+jobTypeCode);
            
        if( jobTypeCode.equals("SUB_CONT")){
            System.out.println("Subcontractor information");
//            JSFUtils.addFacesInformationMessage("Subcontractor wont push to saas");
            

        }
    else{
        
       
        try {
//                     JSFUtils.addFacesInformationMessage("Employee Inside saas try block");
            
//               JSFUtils.addFacesInformationMessage("Inside onClickTest");
//                     Client client = Client.create();
//
//                     WebResource webResource = client.resource("https://nclicstst-naresco.integration.ocp.oraclecloud.com/ic/api/integration/v1/flows/rest/CREATE_TS_ENTRY/1.0/synctimeentry");
//                     client.addFilter(new HTTPBasicAuthFilter("arun.v@4iapps.com", "Wel_c0me#4i8"));
////                     JSFUtils.addFacesInformationMessage("Inside onClickTest after calling webresource");
////                     String input = "{\"Batch_ID\": \"3\"}";
//                       String input = "{\"Batch_ID\": \""+batch_id+"\"}";
//        
//
//                     // POST method
//                     ClientResponse response = webResource.accept("application/json")
//                             .type("application/json").post(ClientResponse.class, input);

                     // check response status code
//                     if (response.getStatus() != 200) {
//                         System.out.println("---------------");
////                         throw new RuntimeException("Failed : HTTP error code : "
////                                );
//                     }

                     // display response
            
//                     String output = response.getEntity(String.class);
//            
//                     System.out.println("Output from Server .... ");
//            
//                     System.out.println(output + "----output---");
//                     JSONObject jsonObj = new JSONObject(output);
//                     jsonObj.getString("Status");
//            if(jsonObj.getString("Status").equalsIgnoreCase("ESS job has been triggered" )){
////                    HdrVO.getCurrentRow().setAttribute("Status", "Submitted to Saas");
                JSFUtils.addFacesInformationMessage("Submitted to Saas !!!");
//                }
//            
//            else{
//                JSFUtils.addFacesInformationMessage("Error with Push data to Saas");
//                }
                 } catch (Exception e) {
                     JSFUtils.addFacesInformationMessage("Exception to push data to saas"+e.getMessage());
                     e.printStackTrace();
                 }
          
        
        
      /**
       * 
       */
        
//        ViewObject HdrVO = ADFUtils.findIterator("TIME_CARD_MASTER_VOIterator").getViewObject();
//        ViewObject LineVO = ADFUtils.findIterator("XXSC_TIME_CARD_DTL_VO1Iterator").getViewObject();
//        ViewObject LineView = ADFUtils.findIterator("XXSC_TIME_CARD_DTL_VOIterator").getViewObject();
//      System.out.println("*****************************");
//       System.out.println(HdrVO.getCurrentRow().getAttribute("TimeCardDate")+"--------------");
//        System.out.println("*****************************");
//        ViewCriteria contractLineVC =
//                           LineVO.createViewCriteria();
//                       ViewCriteriaRow contractLineVCRow =
//                           contractLineVC.createViewCriteriaRow();
//                       contractLineVCRow.setAttribute("TimeCardDate", HdrVO.getCurrentRow().getAttribute("TimeCardDate"));
//                       contractLineVCRow.setAttribute("EmployeeNumber",AddEditRoVo.getCurrentRow().getAttribute("EmployeeLov"));
//                       contractLineVC.addRow(contractLineVCRow);
//                       LineVO.applyViewCriteria(contractLineVC);
//                       LineVO.executeQuery();
//                       System.err.println("==COUNT==" +
//                                          LineVO.getEstimatedRowCount());
//                       
//                       if(LineVO.getEstimatedRowCount() > 0){
//                           System.out.println("Dont  Allow");
//                       }
//                       else{
//                           System.out.println("Allow ");
//                       }

        
        
        
        
//        System.out.println(HdrVO.getCurrentRow().getAttribute("JobTypeCode") +"--------------Type");
//        
//        if (HdrVO.getCurrentRow().getAttribute("JobTypeCode").equals("EMP")){
//            System.out.println("YEs");
//        }
//        else{
//            System.out.println("No..");
//        }
//        String token = ADFContext.getCurrent().getPageFlowScope().get("headerId").toString();
//      
//      System.out.println(token +"--------------Header Id");  
//      
//      System.out.println( AddEditRoVo.getCurrentRow().getAttribute("ProjectId"));
//        if(AddEditRoVo.getCurrentRow().getAttribute("EmployeeLov") != null ){
//            ViewObject jobDtlvo = ADFUtils.findIterator("XXSC_TIME_CARD_DTL_VOIterator").getViewObject();
//            Row[] dtlRows = jobDtlvo.getFilteredRows("EmployeeNumber",AddEditRoVo.getCurrentRow().getAttribute("EmployeeLov"));
//            System.err.println("dtlRowcount=="+dtlRows.length);
//            if (dtlRows.length > 0) {
//             
//                AddEditRoVo.getCurrentRow().setAttribute("EmployeeName","");
//                empNum.setValue("");
//                RichInputComboboxListOfValues tables = (RichInputComboboxListOfValues) JSFUtils.findComponentInRoot("employeeLovId");
//                AdfFacesContext.getCurrentInstance().addPartialTarget(tables);
//                JSFUtils.addFacesErrorMessage("Please Check .. Selected Employee Details  Already Exists ");
//            }
//            
//        }
      
      
      
//        if(AddEditRoVo.getCurrentRow().getAttribute("EmployeeLov") == null ){
//            
//            
//            JSFUtils.addFacesErrorMessage("Employee Number... You must enter a value.");
//        }else if(AddEditRoVo.getCurrentRow().getAttribute("TaskName") == null ){
//            JSFUtils.addFacesErrorMessage("Task Name... You must enter a value.");         
//        }else if(AddEditRoVo.getCurrentRow().getAttribute("RegularHours") == null ){
//            JSFUtils.addFacesErrorMessage("Regular Hours.. You must enter a value.");         
//        }else if(AddEditRoVo.getCurrentRow().getAttribute("Ot1") == null ){
//            JSFUtils.addFacesErrorMessage(" Over Time .. You must enter a value.");         
//        }else if(AddEditRoVo.getCurrentRow().getAttribute("Ot2") == null ){
//            JSFUtils.addFacesErrorMessage("Incentive Hours..You must enter a value");         
//        }else if(AddEditRoVo.getCurrentRow().getAttribute("JobType") == null ){
//            JSFUtils.addFacesErrorMessage("JobType.. You must enter a value ");         
//        }
//        else{
//        
//     System.out.println( AddEditRoVo.getCurrentRow().getAttribute("JobRate"));
//      System.out.println( AddEditRoVo.getCurrentRow().getAttribute("Overtimerate"));
//      System.out.println( AddEditRoVo.getCurrentRow().getAttribute("Incentiverate"));
//         System.out.println( AddEditRoVo.getCurrentRow().getAttribute("RegularHours"));
//         System.out.println( AddEditRoVo.getCurrentRow().getAttribute("Ot1"));
//         System.out.println( AddEditRoVo.getCurrentRow().getAttribute("Ot2"));
//        
//        
//         double JobRate=AddEditRoVo.getCurrentRow().getAttribute("JobRate") == null ? 0 : Double.parseDouble(AddEditRoVo.getCurrentRow().getAttribute("JobRate").toString());
//        double Overtimerate=AddEditRoVo.getCurrentRow().getAttribute("Overtimerate") == null ? 0 : Double.parseDouble(AddEditRoVo.getCurrentRow().getAttribute("Overtimerate").toString());
//        double Incentiverate=AddEditRoVo.getCurrentRow().getAttribute("Incentiverate") == null ? 0 : Double.parseDouble(AddEditRoVo.getCurrentRow().getAttribute("Incentiverate").toString());
//        double RegularHours=AddEditRoVo.getCurrentRow().getAttribute("RegularHours") == null ? 0 : Double.parseDouble(AddEditRoVo.getCurrentRow().getAttribute("RegularHours").toString());
//        double Ot1=AddEditRoVo.getCurrentRow().getAttribute("Ot1") == null ? 0 : Double.parseDouble(AddEditRoVo.getCurrentRow().getAttribute("Ot1").toString());
//        double Ot2=AddEditRoVo.getCurrentRow().getAttribute("Ot2") == null ? 0 : Double.parseDouble(AddEditRoVo.getCurrentRow().getAttribute("Ot2").toString());
//      
//      double RegularAmount =(JobRate/RegularHours)*8;
//        double Ot1Amount =(JobRate/RegularHours)*Overtimerate*Ot1;
//        double Ot2Amount =(JobRate/RegularHours)*Incentiverate*Ot2;
//        
//        System.out.println(RegularAmount+"------RegularAmount");
//        System.out.println(Ot1Amount +"----------Ot1Amount");
//        System.out.println(Ot2Amount +"----------Ot2Amount");
//        
//      
//    System.out.println(RegularHours +"--------------RegularHours");  
        
        
        //---------------------
// AddEditRoVo.getCurrentRow().getAttribute("JobRate");
//        AddEditRoVo.getCurrentRow().getAttribute("Overtimerate");
//        AddEditRoVo.getCurrentRow().getAttribute("Incentiverate");
//        AddEditRoVo.getCurrentRow().getAttribute("RegularHours");
//        AddEditRoVo.getCurrentRow().getAttribute("Ot1");
//        AddEditRoVo.getCurrentRow().getAttribute("Ot2");
        
//        }
    }
    }

    public void onChangeRegularHours(ValueChangeEvent vce) {
        vce.getComponent().processUpdates(FacesContext.getCurrentInstance());
        if (vce.getNewValue() != null) {
                double RegularHrs=vce.getNewValue() == null ? 0 : Double.parseDouble(vce.getNewValue().toString());
                if(RegularHrs > 8){
                    AddEditRoVo.getCurrentRow().setAttribute("RegularHours","");
                   JSFUtils.addFacesErrorMessage("Regular Hours Should not be Greater than 8 Hours");
                }
                else if(RegularHrs<8){
                    ovrtime.setDisabled(true);
                }
            }
        else{
            ovrtime.setDisabled(false);
            }
                AdfFacesContext.getCurrentInstance().addPartialTarget(ovrtime);
    }

    public void onChangeOT1(ValueChangeEvent vce) {
        vce.getComponent().processUpdates(FacesContext.getCurrentInstance());
        if (vce.getNewValue() != null) {
                double ot1=vce.getNewValue() == null ? 0 : Double.parseDouble(vce.getNewValue().toString());
                if(ot1 > 2){
                    AddEditRoVo.getCurrentRow().setAttribute("Ot1","");
                   JSFUtils.addFacesErrorMessage("Over Time Should not be Greater than 2 Hours");
                }
            
            }
    }

    public void onChangeEmployeLov(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
               try {
                   System.err.println("Enter into onClickEmployeeLov");
                   valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());

                   Object newValue = valueChangeEvent.getNewValue();
                   System.err.println("---newValue" + newValue);

        

                   ViewObject jobDtlvo = ADFUtils.findIterator("XXSC_TIME_CARD_DTL_VOIterator").getViewObject();

        

                   Row[] dtlRows = jobDtlvo.getFilteredRows("EmployeeNumber", newValue);
                   System.err.println("dtlRowcount=="+dtlRows.length);
                   if (dtlRows.length > 0) {
                     //  System.err.println("Please check selected Person Name is already exist");
                      
                      
                       
                       AddEditRoVo.getCurrentRow().setAttribute("EmployeeName","");
//                       empNum.setValue("");
                       RichInputComboboxListOfValues tables = (RichInputComboboxListOfValues) JSFUtils.findComponentInRoot("employeeLovId");
                       AdfFacesContext.getCurrentInstance().addPartialTarget(tables);
                       JSFUtils.addFacesErrorMessage("Please Check .. Selected Employee Details  Already Exists ");
                   }
               } catch (Exception e) {
                   e.printStackTrace();
               }
           
    }

//    public void setEmpNum(RichInputComboboxListOfValues empNum) {
//        this.empNum = empNum;
//    }
//
//    public RichInputComboboxListOfValues getEmpNum() {
//        return empNum;
//    }

//    public void setJobType(RichInputComboboxListOfValues jobType) {
//        this.jobType = jobType;
//    }
//
//    public RichInputComboboxListOfValues getJobType() {
//        return jobType;
//    }

//    public void setPopUp(RichPopup popUp) {
//        this.popUp = popUp;
//    }
//
//    public RichPopup getPopUp() {
//        return popUp;
//    }
    public void setPopUp(RichPopup popUp) {
        this.popUp = popUp;
    }

    public RichPopup getPopUp() {
        return popUp;
    }

    public void onClickDeleteOk(ActionEvent actionEvent) {
        ADFUtils.findOperation("Delete").execute();
        ADFUtils.findOperation("Commit").execute();
               JSFUtils.hidePopup(popUp);
        RichTable tables = (RichTable) JSFUtils.findComponentInRoot("t2");
        AdfFacesContext.getCurrentInstance().addPartialTarget(tables);
    }

    public void onClickDeleteCancel(ActionEvent actionEvent) {
        JSFUtils.hidePopup(popUp);
    }


    public void onClickSubmit(ActionEvent actionEvent) throws SQLException {
        try{
        ViewObject HdrVO = ADFUtils.findIterator("TIME_CARD_MASTER_VOIterator").getViewObject();
        ViewObject timeDtlvo = ADFUtils.findIterator("XXSC_TIME_CARD_DTL_VOIterator").getViewObject();
        /**
         * Approval Process parameters
         * 
         */
                           String submitPkg = "xxfnd_util_pkg.submit_for_approval";
                           String responsePkg = "xxfnd_util_pkg.update_response";
                           String tableName = "XXSC_TIME_CARD_MASTER";
                           String app_status_column = "STATUS";
                           String pk_column = "TIME_CARD_MASTER_ID";
                           String fwd_to = "0";
                           String func_id =
                            HdrVO.getCurrentRow().getAttribute("FuncId") ==
                            null ? "0" :
                            HdrVO.getCurrentRow().getAttribute("FuncId").toString();
                           String ref_id =
                            HdrVO.getCurrentRow().getAttribute("TimeCardMasterId") ==
                            null ? "0" :
                            HdrVO.getCurrentRow().getAttribute("TimeCardMasterId").toString();
                           String level_no =
                            HdrVO.getCurrentRow().getAttribute("FlowLevel") ==
                            null ? "0" :
                            HdrVO.getCurrentRow().getAttribute("FlowLevel").toString();
                           String OrgId =
                            HdrVO.getCurrentRow().getAttribute("BusinessUnitId") ==
                            null ? "0" :
                            HdrVO.getCurrentRow().getAttribute("BusinessUnitId").toString();
                           String projectId =
                             HdrVO.getCurrentRow().getAttribute("ProjectId") ==
                             null ? "0" :
                             HdrVO.getCurrentRow().getAttribute("ProjectId").toString();
        String approvalInfo=ADFApproval.approvalInfo(lookupROVO, "TIMECARD_MASTER_SUBMIT");
        if(approvalInfo.equalsIgnoreCase("AUTO")){
            HdrVO.getCurrentRow().setAttribute("Status", "APR");
            HdrVO.getCurrentRow().setAttribute("InterfaceStatus", "Y");
                 onClickTest();
//                 onClickSampleTest();                            
            ADFUtils.findOperation("Commit").execute();
            String resp =   ADFApproval.invokeSundayCreatePro(ref_id,"AUTO_CREATE_SUNDAY_TC");
//            JSFUtils.addFacesInformationMessage("resp: " + resp);
//            emailNotification();
        }else{
                           String flag =
                           ADFApproval.invokeSubmitPkg(submitPkg, func_id, ref_id,
                                                level_no, tableName,
                                                app_status_column, pk_column,
                                                OrgId, projectId);
                           System.out.println(flag +"=====Flag");
                           /**
                            * Refreshing status
                            */
                           
                           emailNotification();
    BigDecimal timeHdrId=(BigDecimal)  HdrVO.getCurrentRow().getAttribute("TimeCardMasterId");
        ViewCriteria viewCriteria = HdrVO.createViewCriteria();
         ViewCriteriaRow viewCriteriaRow = viewCriteria.createViewCriteriaRow();
         viewCriteriaRow.setAttribute("TimeCardMasterId",timeHdrId );
                                   
         viewCriteria.addRow(viewCriteriaRow);
         HdrVO.applyViewCriteria(viewCriteria);
        
        HdrVO.executeQuery();              
                           
//        HdrVO.executeQuery();
//           AdfFacesContext.getCurrentInstance().addPartialTarget(ot25);                
//        refreshPage();
//        AdfFacesContext.getCurrentInstance().addPartialTarget(ot25);
//        HdrVO.getCurrentRow().setAttribute("Status","PEN");
//        RichOutputText status =
//            (RichOutputText)JSFUtils.findComponentInRoot("ot3");
//        AdfFacesContext.getCurrentInstance().addPartialTarget(status);              
//        ADFUtils.findOperation("Commit").execute();
                }
        }catch(Exception e){
            System.out.println("Exception====="+e);
        }
    }
    protected void refreshPage() {

          FacesContext fc = FacesContext.getCurrentInstance();
          String refreshpage = fc.getViewRoot().getViewId();
     ViewHandler ViewH =
     fc.getApplication().getViewHandler();
          UIViewRoot UIV = ViewH.createView(fc,refreshpage);
          UIV.setViewId(refreshpage);
          fc.setViewRoot(UIV);
    }
    public void onClickApprove(ActionEvent actionEvent) throws  SQLException, ParseException {
        ViewObject HdrVO = ADFUtils.findIterator("TIME_CARD_MASTER_VOIterator").getViewObject();
        ViewObject timeDtlvo = ADFUtils.findIterator("XXSC_TIME_CARD_DTL_VOIterator").getViewObject();
        String submitPkg = "xxfnd_util_pkg.submit_for_approval";
        String responsePkg = "xxfnd_util_pkg.update_response";
        String tableName = "XXSC_TIME_CARD_MASTER";
        String app_status_column = "STATUS";
        String pk_column = "TIME_CARD_MASTER_ID";
        String fwd_to = "0";
        String apprDesc ="Approved";
        
        String func_id =
            HdrVO.getCurrentRow().getAttribute("FuncId") ==
            null ? "" :
            HdrVO.getCurrentRow().getAttribute("FuncId").toString();
        String ref_id =
            HdrVO.getCurrentRow().getAttribute("TimeCardMasterId") ==
            null ? "" :
            HdrVO.getCurrentRow().getAttribute("TimeCardMasterId").toString();
        String level_no =
            HdrVO.getCurrentRow().getAttribute("FlowLevel") ==
            null ? "" :
            HdrVO.getCurrentRow().getAttribute("FlowLevel").toString();
        String appr_id =
            HdrVO.getCurrentRow().getAttribute("FlowWith") ==
            null ? "" :
            HdrVO.getCurrentRow().getAttribute("FlowWith").toString();
        String user_grp =
            HdrVO.getCurrentRow().getAttribute("UserGrpId") ==
            null ? "" :
            HdrVO.getCurrentRow().getAttribute("UserGrpId").toString();

        String flag =
            ADFApproval.invokeResponsePkg(responsePkg, func_id,
                                          user_grp, ref_id, level_no,
                                          appr_id, apprDesc, "A",
                                          fwd_to, tableName,
                                          app_status_column,
                                          pk_column);
//        AdfFacesContext.getCurrentInstance().addPartialTarget(ot25);
       
        if (flag.equalsIgnoreCase("Success")) {
            HdrVO.executeQuery();
             System.err.println(HdrVO.getCurrentRow().getAttribute("Status")+"---------Status");
            emailNotification();
            if(HdrVO.getCurrentRow().getAttribute("Status").toString().equalsIgnoreCase("APR")){
//                      JSFUtils.addFacesInformationMessage("Inside Approved status");
                      onClickTest();
                      onClickSampleTest();
                      HdrVO.getCurrentRow().setAttribute("InterfaceStatus", "Y");
                      
                      ADFUtils.findOperation("Commit").execute();
                      HdrVO.applyViewCriteria(null);
                      HdrVO.executeQuery();
                      
                  }
            else {
                System.err.println(HdrVO.getCurrentRow().getAttribute("Status")+"---------Status");
            }
            
//            HdrVO.executeQuery();

        }
        this.getP2().cancel();
    }

    public void onClickApprCancel(ActionEvent actionEvent) {
        this.getP2().cancel();
    }

    
    public boolean getApprovalUser() {
        ViewObject HdrVO = ADFUtils.findIterator("TIME_CARD_MASTER_VOIterator").getViewObject();
        ViewObject timeDtlvo = ADFUtils.findIterator("XXSC_TIME_CARD_DTL_VOIterator").getViewObject();
        boolean flag = false;
        System.out.println("---1------");
        String flowWith =
            HdrVO.getCurrentRow().getAttribute("FlowWith") ==
            null ? "" :
            HdrVO.getCurrentRow().getAttribute("FlowWith").toString();
        String LoginUser =
            ADFContext.getCurrent().getSessionScope().get("userName") == null ?
            "0" :
            ADFContext.getCurrent().getSessionScope().get("userName").toString();
        ViewObject userVO =
            ADFUtils.findIterator("UserAcess_ROVOIterator").getViewObject();
        ViewCriteria viewCriteria = userVO.createViewCriteria();
         ViewCriteriaRow viewCriteriaRow = viewCriteria.createViewCriteriaRow();
         viewCriteriaRow.setAttribute("UserName",LoginUser  );
                                   
         viewCriteria.addRow(viewCriteriaRow);
         userVO.applyViewCriteria(viewCriteria);
       
        userVO.executeQuery();
        System.out.println("----2----");
        if (userVO.getEstimatedRowCount() != 0) {
            String loginID =
                userVO.first().getAttribute("UserId") == null ? "0" :
                userVO.first().getAttribute("UserId").toString();
            System.err.println("flowWith-->>" + flowWith + "loginID-->" +
                               loginID);
            if (flowWith.equalsIgnoreCase(loginID)) {
                flag = true;
            } else {
                flag = false;
            }
        } else {
            flag = false;
        }
        System.err.println("Flag" + flag);
        return flag;
    }

    public void onClickRejectSave(ActionEvent actionEvent) throws SQLException {
        ViewObject HdrVO = ADFUtils.findIterator("TIME_CARD_MASTER_VOIterator").getViewObject();
        ViewObject timeDtlvo = ADFUtils.findIterator("XXSC_TIME_CARD_DTL_VOIterator").getViewObject();
        String submitPkg = "xxfnd_util_pkg.submit_for_approval";
        String responsePkg = "xxfnd_util_pkg.update_response";
        String tableName = "XXSC_TIME_CARD_MASTER";
        String app_status_column = "STATUS";
        String pk_column = "TIME_CARD_MASTER_ID";
        String fwd_to = "0";
        String rejDesc ="Rejected";
       
        
      
            String func_id =
                HdrVO.getCurrentRow().getAttribute("FuncId") ==
                null ? "" :
                HdrVO.getCurrentRow().getAttribute("FuncId").toString();
            String ref_id =
                HdrVO.getCurrentRow().getAttribute("TimeCardMasterId") ==
                null ? "" :
                HdrVO.getCurrentRow().getAttribute("TimeCardMasterId").toString();
            String level_no =
                HdrVO.getCurrentRow().getAttribute("FlowLevel") ==
                null ? "" :
                HdrVO.getCurrentRow().getAttribute("FlowLevel").toString();
            String appr_id =
                HdrVO.getCurrentRow().getAttribute("FlowWith") ==
                null ? "" :
                HdrVO.getCurrentRow().getAttribute("FlowWith").toString();
            String user_grp =
                HdrVO.getCurrentRow().getAttribute("UserGrpId") ==
                null ? "" :
                HdrVO.getCurrentRow().getAttribute("UserGrpId").toString();
            String flag =
                ADFApproval.invokeResponsePkg(responsePkg, func_id,
                                              user_grp, ref_id, level_no,
                                              appr_id,
                                              rejDesc,
                                              "R", fwd_to, tableName,
                                              app_status_column,
                                              pk_column);
       
//                        AdfFacesContext.getCurrentInstance().addPartialTarget(ot25);
            
            if (flag.equalsIgnoreCase("Success")) {
                emailNotification();
                HdrVO.executeQuery();
//                HdrVO.getCurrentRow().setAttribute("Status","REJ");
//               AdfFacesContext.getCurrentInstance().addPartialTarget(ot25);
            }
        
        this.getP3().cancel();
//        AdfFacesContext.getCurrentInstance().addPartialTarget(ot25);
    }

    public void onClickRejectCancel(ActionEvent actionEvent) {
        this.getP3().cancel();
    }

    
//    public void setApproValue(RichInputText approValue) {
//        this.approValue = approValue;
//    }
//
//    public RichInputText getApproValue() {
//        return approValue;
//    }
//
//   
//    public void setRejectValue(RichInputText rejectValue) {
//        this.rejectValue = rejectValue;
//    }
//
//    public RichInputText getRejectValue() {
//        return rejectValue;
//    }
    public void setP2(RichPopup p2) {
        this.p2 = p2;
    }

    public RichPopup getP2() {
        return p2;
    }

    public void setP3(RichPopup p3) {
        this.p3 = p3;
    }

    public RichPopup getP3() {
        return p3;
    }

    public void setOt25(RichOutputText ot25) {
        this.ot25 = ot25;
    }

    public RichOutputText getOt25() {
        return ot25;
    }

    public void setHdrForm(RichPanelFormLayout hdrForm) {
        this.hdrForm = hdrForm;
    }

    public RichPanelFormLayout getHdrForm() {
        return hdrForm;
    }
    @SuppressWarnings({ "unchecked", "oracle.jdeveloper.java.unchecked-conversion-or-cast" })
    public void onClickSampleTest() throws ParseException {

//
        ViewObject HdrVO = ADFUtils.findIterator("TIME_CARD_MASTER_VOIterator").getViewObject();
        String dateHdr = HdrVO.getCurrentRow()
                              .getAttribute("TimeCardDate")
                              .toString();
        Date now = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse(dateHdr);
        System.out.println(dateHdr + "\t" + now);
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("E");
        System.out.println(simpleDateformat.format(now));
        simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
        System.out.println(simpleDateformat.format(now));
        int MILLIS_IN_DAY = 1000 * 60 * 60 * 24;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
        String nextDate = dateFormat.format(now.getTime() + MILLIS_IN_DAY);
        System.out.println("Next date: " + nextDate);
//        JSFUtils.addFacesInformationMessage("Next date: " + nextDate);
//        JSFUtils.addFacesInformationMessage("Day: " + simpleDateformat.format(now));
        HdrVO.getCurrentRow().setAttribute("WeekDay", "NO_DAY");
//        JSFUtils.addFacesInformationMessage("WeekDay1: " + HdrVO.getCurrentRow().getAttribute("WeekDay"));
        if (simpleDateformat.format(now).equals("Saturday")) {
            HdrVO.getCurrentRow().setAttribute("WeekDay", "SATURDAY");
        }else{
            HdrVO.getCurrentRow().setAttribute("WeekDay", "NO_DAY");
        }
//        JSFUtils.addFacesInformationMessage("Testing");
//        JSFUtils.addFacesInformationMessage("WeekDay2: " + HdrVO.getCurrentRow().getAttribute("WeekDay"));
//        if (simpleDateformat.format(now).equals("Saturday")) {
//            System.out.println("Selected date is Saturday");
//            ViewObject HdrVo = ADFUtils.findIterator("TIME_CARD_MASTER_VOIterator").getViewObject();
//            
//            
////            JSFUtils.addFacesInformationMessage("11111thursday");
//            if (HdrVo.getCurrentRow() != null) {
//                
//                
//                
//                
////                String p_ProjectName =
////                    HdrVo.getCurrentRow().getAttribute("ProjectName") == null ? " " :
////                    HdrVo.getCurrentRow().getAttribute("ProjectName").toString();
////                System.out.println(p_ProjectName + "--------ProjectName");
//                String p_JobTypeCode =
//                    HdrVo.getCurrentRow().getAttribute("JobTypeCode") == null ? " " :
//                    HdrVo.getCurrentRow().getAttribute("JobTypeCode").toString();
//                System.out.println(p_JobTypeCode + "--------JobTypeCode");
//                String p_CreatedBy =
//                                    HdrVo.getCurrentRow().getAttribute("CreatedBy") == null ? " " :
//                                    HdrVo.getCurrentRow().getAttribute("CreatedBy").toString();
//                                System.out.println(p_CreatedBy + "--------p_CreatedBy");
////                JSFUtils.addFacesInformationMessage("22222thursday");
//
//if(p_JobTypeCode.equals("EMP"))
//{
//    System.out.println( HdrVo.getCurrentRow().getAttribute("TimeCardMasterId") +"---cur Row");
//               
//        ViewObject LineVo =ADFUtils.findIterator("XXSC_TIME_CARD_DTL_VOIterator").getViewObject();
//                  ViewCriteria viewCriteria = LineVo.createViewCriteria();
//                   ViewCriteriaRow viewCriteriaRow = viewCriteria.createViewCriteriaRow();
//                   viewCriteriaRow.setAttribute("TimeCardMasterId",
//                                                HdrVo.getCurrentRow().getAttribute("TimeCardMasterId"));
//                   viewCriteria.addRow(viewCriteriaRow);
//                   LineVo.applyViewCriteria(viewCriteria);
//                   LineVo.executeQuery();
//                   System.out.println(LineVo.getEstimatedRowCount() + "---- row count");
////    JSFUtils.addFacesInformationMessage("3333thursday");
//    List<Map> lineList = new ArrayList<Map>();
//                   
//                   if (LineVo.getEstimatedRowCount() >= 1) {
//
//                                                    System.out.println("Enters into Loop");
//                                                    RowSetIterator rs = LineVo.createRowSetIterator(null);
//
//                                                    while (rs.hasNext()) {
//                                                        Map line= new HashMap();
//                                                        Row r = rs.next();
//                                                        
//                                                        
//            System.out.println(r.getAttribute("JobTypeCode") == null ? "" :r.getAttribute("JobTypeCode").toString() + "---- JobTypeCode");
//                String zero="0";             
//            line.put("EmployeeName", r.getAttribute("EmployeeName") == null ? "" : r.getAttribute("EmployeeName").toString());
//            line.put("EmployeeNumber",r.getAttribute("EmployeeNumber") == null ? "" : r.getAttribute("EmployeeNumber").toString());
//            line.put("EmployeeId",r.getAttribute("EmployeeId") == null ? "" : r.getAttribute("EmployeeId").toString());
//            line.put("JobTypeCode",r.getAttribute("JobTypeCode") == null ? "" : r.getAttribute("JobTypeCode").toString());
//            line.put("JobTypeName",r.getAttribute("JobTypeName") == null ? "" : r.getAttribute("JobTypeName").toString());
//            line.put("OverTimeHrs",zero);
//            line.put("RegularHrs",r.getAttribute("RegularHrs") == null ? "" : r.getAttribute("RegularHrs").toString());
//            line.put("IncentiveHrs",zero);
//            line.put("TaskNumber", r.getAttribute("TaskNumber") == null ? "" :r.getAttribute("TaskNumber").toString());
//            line.put("TaskName", r.getAttribute("TaskName") == null ? "" :r.getAttribute("TaskName").toString());
//            line.put("IncentiveRate",zero);
//            line.put("IncentiveUnitRate",r.getAttribute("IncentiveUnitRate") == null ? "" : r.getAttribute("IncentiveUnitRate").toString());
//            line.put("JobTypeRate",r.getAttribute("JobTypeRate") == null ? "" : r.getAttribute("JobTypeRate").toString());
//            line.put("OverTimeRate",zero);
//            line.put("OverTimeUnitRate",r.getAttribute("OverTimeUnitRate") == null ? "" : r.getAttribute("OverTimeUnitRate").toString());   
//            line.put("PayrollFlag", "N");
//            line.put("RegularRate",r.getAttribute("RegularRate") == null ? "" : r.getAttribute("RegularRate").toString());
//            line.put("RegularUnitRate",r.getAttribute("RegularUnitRate") == null ? "" : r.getAttribute("RegularUnitRate").toString());
//            line.put("TaskId", r.getAttribute("TaskId") == null ? "" :r.getAttribute("TaskId").toString());
//            line.put("RejectReason",r.getAttribute("RejectReason") == null ? "" : r.getAttribute("RejectReason").toString());
//            line.put("TotalAmount",r.getAttribute("RegularRate") == null ? "" : r.getAttribute("RegularRate").toString());
//                            
//                                    
//
//            lineList.add(line);
////                             JSFUtils.addFacesInformationMessage("44444444thursday");
//                         }
//     
//        }
//                   
//    HdrVo.applyViewCriteria(null);
//    System.out.println("-----1-------");
//                Row newRow = HdrVo.createRow();
//                newRow.setAttribute("ProjectId", HdrVo.getCurrentRow().getAttribute("ProjectId"));
//                newRow.setAttribute("ProjectName", HdrVo.getCurrentRow().getAttribute("ProjectName"));
//                newRow.setAttribute("ProjectNumber", HdrVo.getCurrentRow().getAttribute("ProjectNumber"));
//                newRow.setAttribute("JobTypeCode", HdrVo.getCurrentRow().getAttribute("JobTypeCode"));
//                newRow.setAttribute("JobTypeName", HdrVo.getCurrentRow().getAttribute("JobTypeName"));
//                newRow.setAttribute("BusinessUnitId", HdrVo.getCurrentRow().getAttribute("BusinessUnitId"));
//                newRow.setAttribute("BusinessUnitName", HdrVo.getCurrentRow().getAttribute("BusinessUnitName"));
//                newRow.setAttribute("ProjectUnitId",HdrVo.getCurrentRow().getAttribute("ProjectUnitId"));
//                newRow.setAttribute("FuncId",HdrVo.getCurrentRow().getAttribute("FuncId"));
//    newRow.setAttribute("CreatedBy",p_CreatedBy);
//    System.out.println("-----------");
//    newRow.setAttribute("TimeCardDate",nextDate);
//    
//                newRow.setAttribute("Status", "Draft");
//    
//                System.out.println("-----2-------");
//                HdrVo.insertRow(newRow);
//                System.out.println("-----------------Master------------------");
//    
//              
//              System.out.println( HdrVo.getCurrentRow().getAttribute("TimeCardMasterId") +"---cur Row");
//              
//              
//    String timeCardNumber=HdrVo.getCurrentRow().getAttribute("TimeCardNumber") == null ? "" : HdrVo.getCurrentRow().getAttribute("TimeCardNumber").toString();          
//    System.out.println(timeCardNumber+"---------------TimeCardNumber");
////    JSFUtils.addFacesInformationMessage("555555555555555thursday");
//    if (timeCardNumber == "") {
//                 System.out.println("22222222222222");
//                 long val =
//                     Long.parseLong(HdrVo.getCurrentRow().getAttribute("TimeCardMasterId").toString());
//    System.out.println(val +"-----val");
//    
//                 DecimalFormat myFormatter = new DecimalFormat("00000000");
//                 long seq = 0;
//                 seq = val + 1;
//                 String typeCode = "OTL-";
//                 System.out.println(typeCode + myFormatter.format(seq));
//                 HdrVo.getCurrentRow().setAttribute("TimeCardNumber",
//                                                 typeCode + myFormatter.format(seq));
//                
//             }
//           
//    ViewCriteria VC = LineVo.createViewCriteria();
//    ViewCriteriaRow viewCriteriaRows = VC.createViewCriteriaRow();
//    viewCriteriaRows.setAttribute("TimeCardMasterId",
//         HdrVo.getCurrentRow().getAttribute("TimeCardMasterId"));
//    viewCriteria.addRow(viewCriteriaRows);
//    LineVo.applyViewCriteria(VC);
//    LineVo.executeQuery();
//    System.out.println(LineVo.getEstimatedRowCount() + "---- row count");
////    JSFUtils.addFacesInformationMessage("6666666666thursday");
//    
//    if (LineVo.getEstimatedRowCount() == 0) {
//    
//    System.out.println("Entered Line ");
//                   
//               int size=lineList.size();    
//               System.out.println(size +"-------Total Count");
//    for(int i =0;i<size;i++){
//                       
//        System.out.println("-----1-------");
//                               Row newRows = LineVo.createRow();
//                    newRows.setAttribute("EmployeeName", lineList.get(i).get("EmployeeName"));
//                    newRows.setAttribute("EmployeeNumber", lineList.get(i).get("EmployeeNumber"));
//                    newRows.setAttribute("EmployeeId",lineList.get(i).get("EmployeeId"));
//                    newRows.setAttribute("JobTypeCode", lineList.get(i).get("JobTypeCode"));
//                    newRows.setAttribute("JobTypeName",lineList.get(i).get("JobTypeName"));
//                 newRows.setAttribute("OverTimeHrs", lineList.get(i).get("OverTimeHrs"));
//                 newRows.setAttribute("RegularHrs", lineList.get(i).get("RegularHrs"));
//                 newRows.setAttribute("IncentiveHrs",  lineList.get(i).get("IncentiveHrs"));
//                 newRows.setAttribute("TaskNumber", lineList.get(i).get("TaskNumber"));
//                 newRows.setAttribute("TaskName",lineList.get(i).get("TaskName"));
//        newRows.setAttribute("IncentiveRate", lineList.get(i).get("IncentiveRate"));
//        newRows.setAttribute("IncentiveUnitRate", lineList.get(i).get("IncentiveUnitRate"));
//        newRows.setAttribute("JobTypeRate",  lineList.get(i).get("JobTypeRate"));
//        newRows.setAttribute("OverTimeRate", lineList.get(i).get("OverTimeRate"));
//        newRows.setAttribute("OverTimeUnitRate",lineList.get(i).get("OverTimeUnitRate"));
//        newRows.setAttribute("PayrollFlag", lineList.get(i).get("PayrollFlag"));
//        newRows.setAttribute("RegularRate", lineList.get(i).get("RegularRate"));
//        newRows.setAttribute("RegularUnitRate",  lineList.get(i).get("RegularUnitRate"));
//        newRows.setAttribute("TaskId", lineList.get(i).get("TaskId"));
//        newRows.setAttribute("RejectReason",lineList.get(i).get("RejectReason"));
//        newRows.setAttribute("TotalAmount", lineList.get(i).get("TotalAmount"));
//
//                    System.out.println("-----2-------");
//                    LineVo.insertRow(newRows);
//                    System.out.println("-----------------Final------------------");
//
//    System.out.println(lineList.get(i).get("JobTypeName") +"-----------"+i);
////        JSFUtils.addFacesInformationMessage("777777thursday");
//    }
//    }
//                ADFUtils.findOperation("Commit").execute();
//    HdrVO.applyViewCriteria(null);
//    HdrVO.executeQuery();
//                System.out.println("---------------------12345------------------------");
////    JSFUtils.addFacesInformationMessage("8888888thursday");
//}
//            }
//
//
//        }


    }
    public void emailNotification() {
        ViewObject HdrVO = ADFUtils.findIterator("TIME_CARD_MASTER_VOIterator").getViewObject();
        String batch_id=HdrVO.getCurrentRow().getAttribute("BatchId").toString();
        System.err.println("batch_id is----"+batch_id);
        
        try {
 
                     Client client = Client.create();

                     WebResource webResource = client.resource("https://nclicstst-naresco.integration.ocp.oraclecloud.com/ic/api/integration/v1/flows/rest/SENDOTLNOTIFICATION/1.0/notify");
                     client.addFilter(new HTTPBasicAuthFilter("arun.v@4iapps.com", "CR7_2023_Alnassar"));
                       String input = "{\"Batch_ID\": \""+batch_id+"\"}";
                             // POST method
                     ClientResponse response = webResource.accept("application/json")
                             .type("application/json").post(ClientResponse.class, input);

                     // check response status code
                     if (response.getStatus() != 200) {
                         System.out.println("---------------");              
                     }

                     String output = response.getEntity(String.class);
                     System.out.println("Output from Server .... ");
                     System.out.println(output + "----output---");
                
                 } catch (Exception e) {
                     JSFUtils.addFacesInformationMessage("Exception in email notification"+e.getMessage());
                     e.printStackTrace();
                 }
    }



    public void onclickOk(ActionEvent actionEvent)throws ParseException  {
        onClickSampleTest();
    }

    public void onChangeEmployeeLov(ValueChangeEvent vce) {
        vce.getComponent().processUpdates(FacesContext.getCurrentInstance());
        if (vce.getNewValue() != null) {
        ViewObject HdrVO = ADFUtils.findIterator("TIME_CARD_MASTER_VOIterator").getViewObject();
            String TimeCardDate =
                HdrVO.getCurrentRow().getAttribute("TimeCardDate") ==
                null ? "" :
                HdrVO.getCurrentRow().getAttribute("TimeCardDate").toString();  
            System.out.println(TimeCardDate +"---TimeCardDate");
            try{
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
                   java.util.Date date = formatter.parse(TimeCardDate);
//                JSFUtils.addFacesInformationMessage(date +"----1st");
                   System.out.println(date +"---date");
                
                   SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
                String s=ft.format(date);
//                JSFUtils.addFacesInformationMessage(s +"----2nd");
                System.out.println( ft.format(date));  
                
                
//                ADFContext.getCurrent().getSessionScope().put("Date",date);
//                JSFUtils.addFacesInformationMessage(ADFContext.getCurrent().getSessionScope().get("Date") +"----3rd");
                AddEditRoVo.getCurrentRow().setAttribute("DataValue",ft.format(date).toString());
//                JSFUtils.addFacesInformationMessage(ft.format(date).toString() +"----3rd");
            }
            catch(Exception e) {
                System.out.println(e.getMessage() +"-----Exception");
            }
            if(!HdrVO.getCurrentRow().getAttribute("JobTypeCode").toString().equalsIgnoreCase("EMP")){
                AddEditRoVo.getCurrentRow().setAttribute("RegularHours", "0");
                AddEditRoVo.getCurrentRow().setAttribute("Ot1", "0");
            }
        
        }
    }

    public void setOvrtime(RichInputText ovrtime) {
        this.ovrtime = ovrtime;
    }

    public RichInputText getOvrtime() {
        return ovrtime;
    }
}
