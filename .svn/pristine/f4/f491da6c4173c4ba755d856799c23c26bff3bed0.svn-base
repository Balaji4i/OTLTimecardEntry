package view;

import com.view.utils.JSFUtils;
import com.oschrenk.io.Base64;

import oracle.adf.share.ADFContext;

//import com.sun.jersey.api.client.Client;




import org.json.JSONException;
import org.json.JSONObject;


import oracle.adf.share.ADFContext;

public class PayrollHome {
    public PayrollHome() {
        super();
    }
    public String checkUser() throws JSONException {
        
//            
//                                //  For Test
                            ///*   
              
//                                       ADFContext.getCurrent().getSessionScope().put("userName","4iapps");
//                                       
//                                       
//                                       
//                                         
//////                                         code to be included here for data restriction.
////                                         ADFContext.getCurrent().getSessionScope().put("userName","Benoy");
////////                                         
////            
//                                      String  outputString = "validUser";
//                                        ADFContext.getCurrent().getPageFlowScope().put("val","validUser");
////                          
//              System.err.println("User name=====>>> "+ADFContext.getCurrent().getSessionScope().get("userName"));                               

        /**
         * Prod
         */
              
////                    Client client =  Client.create();
//
       
    //
    //
    //               System.err.println("JWT tokens:=====>>> "+ADFContext.getCurrent().getPageFlowScope().get("tokens").toString());
    //                URL url;
    //                URLConnection connection;
    //                HttpURLConnection httpConn;
               
//       String jwt="eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsIng1dCI6Ik1OM2phUU1TZTNVQ3F4R1hSX2NZdHVTaWtEUSIsImtpZCI6InRydXN0c2VydmljZSJ9.eyJleHAiOjE1ODAxMzMzNDYsInN1YiI6IjRpYXBwcyIsImlzcyI6Ind3dy5vcmFjbGUuY29tIiwicHJuIjoiNGlhcHBzIiwiaWF0IjoxNTgwMTE4OTQ2fQ.S3BZrmCkyPfYarHS-0AACEP3EkY75mVZOFU9WMvfHYWrE5HJTa2TFgu2OCSfPLIvF_dG-Xsg-gnpjvvdfZz5ZE0kJChOqKY4prVLvuH_IWoOXBiZlgfFI6Iag-Lpc9Vye4ddfuEqqTKGd7ZmMeAvlsubMscYn4DBJDd8Aud9Z2rm-3VNMiaJppec1LuG7BXGgkLrd4y0rmkjnao9D-GSI_-sAnSn5MXffJkXRp_Ed0v2eOdU13oTemJptBU-mQ4Vpr4rFC0M_DSgiCYspaxQ5oTSFlzn7OyVYiqtm2RMPRLYy7dgWUZ0I2USzM1s40EZVI0rO_dQWIzzclYWve0bYA";
     //               ---- s158----
//String jwt="";             
                
  
        
        
        
        
        
              String outputString = "";
                            String jwt =
                                ADFContext.getCurrent().getPageFlowScope().get("tokens").toString();
        
              System.err.println("JWT---- " + jwt);
        System.out.println("Enter check");

        //               ---- 4iapps----
        String inputEncodedText =jwt;
                 
               ADFContext.getCurrent().getPageFlowScope().put("val",jwt);
                           try {    
//                  
                        outputString = "validUser";
                        ADFContext.getCurrent().getPageFlowScope().put("val","validUser"); 
             
                    if (outputString.equalsIgnoreCase("validUser")) {
              
                        String[] xIn = inputEncodedText.split("\\.");
                        byte c[] = Base64.decode(xIn[1]);
                        String tempPass = new String(c);
                        int chkOccurance = tempPass.lastIndexOf("}");
                        if (chkOccurance < 1) {
                          tempPass += "}";
                        }
                        JSONObject jo = new JSONObject(tempPass);
                    
                        long millis = System.currentTimeMillis();
                        long iatVal = Long.parseLong(jo.get("iat").toString()) * 1000;
                        long expVal = Long.parseLong(jo.get("exp").toString()) * 1000;
                        if (millis >= iatVal && millis <= expVal) {
              

                          ADFContext.getCurrent().getSessionScope().put("userName", jo.getString("prn"));
                          //code to be included here for data restriction.
                            outputString = "validUser";
                            ADFContext.getCurrent().getPageFlowScope().put("val","validUser"); 
                 
                        }
                          else {
                                            outputString = "invalidUser";
                                            ADFContext.getCurrent().getPageFlowScope().put("val","invalidUser");
                                        }
                      }
                           else {
                               outputString = "invalidUser";
                               ADFContext.getCurrent().getPageFlowScope().put("val","invalidUser");
                       }
               
                       }catch (Exception e) {
                    JSFUtils.addFacesInformationMessage("Token Error: "+e.toString());
                               
                }
         System.err.println("output string "+outputString);
                return outputString;
          }
}
