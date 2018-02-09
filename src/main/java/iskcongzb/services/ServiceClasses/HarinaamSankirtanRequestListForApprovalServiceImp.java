package iskcongzb.services.ServiceClasses;

import iskcongzb.dao.DaoInterfaces.HarinaamSankirtanRequestListForApprovalDao;
import iskcongzb.domain.HarinaamSankirtan;
import iskcongzb.services.ServiceInterfaces.HarinaamSankirtanRequestListForApprovalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HarinaamSankirtanRequestListForApprovalServiceImp implements HarinaamSankirtanRequestListForApprovalService {
    @Autowired
    HarinaamSankirtanRequestListForApprovalDao harinaamSankirtanRequestListForApprovalDao;
    public String  getListOfAllPendingRequest(int index) {
        List<HarinaamSankirtan> harinaamSankirtanList= harinaamSankirtanRequestListForApprovalDao.getAllPendingRequest(index);
    StringBuilder stringBuilder=new StringBuilder();
    for(HarinaamSankirtan harinaamSankirtan:harinaamSankirtanList)
    {
        stringBuilder.append("<div style=\" border: 1px solid black;box-shadow: 0px 1px 1px rgba(236, 236, 236, 0.1);margin-top: 5px;margin-bottom: 5px;\">\n" +
                "                                    <h5 class=\"text-center\"><span><b style=\"color: #1f2222\">"+harinaamSankirtan.getUserName()+"</b> </span></h5>\n" +
                "                                    <span class=\"pull-right\" style=\"margin-right: 10px;\" ><b> Date </b><br>\n" +
                "                                            <small class=\"proerty-price\">"+harinaamSankirtan.getDate()+"</small> </span>\n" +
                "\n" +
                "                                    <span class=\"pull-right\" style=\"padding-right: 50px;\"> <b>Time</b> <br>\n" +
                "                                            <small class=\"proerty-price \">"+harinaamSankirtan.getTime()+"</small></span><br>\n" +
                "                                    <div class=\"table-responsive\">\n" +
                "                                    <table class=\"table\">\n" +
                "                                        <thead>\n" +
                "                                        <tr>\n" +
                "                                            <th style=\"color:#222222\">Attributes</th>\n" +
                "                                            <th style=\"color:#222222 \">Info</th>\n" +
                "                                        </tr>\n" +
                "                                        </thead>\n" +
                "                                        <tbody>\n" +
                "\n" +
                "                                        <tr>\n" +
                "                                            <td><b> Venue :</b></td>\n" +
                "                                            <td style=\"color: #FDC600;font-weight: 400;font-size: 15px;\">"+harinaamSankirtan.getVenue()+"</td>\n" +
                "                                        </tr>\n" +
                "                                        <tr>\n" +
                "                                            <td><b> Street :</b></td>\n" +
                "                                            <td style=\"color: #FDC600;font-weight: 400;font-size: 15px;\">"+harinaamSankirtan.getStreet()+" </td>\n" +
                "                                        </tr>\n" +
                "                                        <tr>\n" +
                "                                            <td> <b> Current address</b></td>\n" +
                "                                            <td style=\"color: #FDC600;font-weight: 400;font-size: 15px;\">"+harinaamSankirtan.getCurrentAddress()+"</td>\n" +
                "                                        </tr>\n" +
                "                                        <tr>\n" +
                "                                            <td><b> Vechile Provided </b></td>\n" +
                "                                            <td style=\"color: #FDC600;font-weight: 400;font-size: 15px;\">"+harinaamSankirtan.getVechile()+"</td>\n" +
                "                                        </tr>\n" +
                "                                        <tr>\n" +
                "                                            <td><b> Number Of Vechiles </b></td>\n" +
                "                                            <td style=\"color: #FDC600;font-weight: 400;font-size: 15px;\">"+harinaamSankirtan.getNumberOfVechiles()+"</td>\n" +
                "                                        </tr>\n" +
                "                                        <tr>\n" +
                "                                            <td><b>Music System</b></td>\n" +
                "                                            <td style=\"color: #FDC600;font-weight: 400;font-size: 15px;\">"+harinaamSankirtan.getMusicSystem()+"</td>\n" +
                "                                        </tr>\n" +
                "                                        <tr>\n" +
                "                                            <td><b>Trolly For Music System </b></td>\n" +
                "                                            <td style=\"color: #FDC600;font-weight: 400;font-size: 15px;\">"+harinaamSankirtan.getTrolly()+"</td>\n" +
                "                                        </tr>\n" +
                "                                        <tr>\n" +
                "                                            <td><b>Email Id</b></td>\n" +
                "                                            <td style=\"color: #FDC600;font-weight: 400;font-size: 15px;\">"+harinaamSankirtan.geteMail()+"</td>\n" +
                "                                        </tr>\n" +
                "                                        <tr>\n" +
                "                                            <td><b>Mobile Number</b></td>\n" +
                "                                            <td style=\"color: #FDC600;font-weight: 400;font-size: 15px;\">"+harinaamSankirtan.getMobileNumber()+"</td>\n" +
                "                                        </tr>\n" +
                "                                        <tr>\n" +
                "                                            <td><b>Alt. Mobile Number</b></td>\n" +
                "                                            <td style=\"color: #FDC600;font-weight: 400;font-size: 15px;\">"+harinaamSankirtan.getAlternateMobileNumber()+"</td>\n" +
                "                                        </tr>\n" +
                "                                        <tr>\n" +
                "                                            <td><b>Krishna Prasadam</b></td>\n" +
                "                                            <td style=\"color: #FDC600;font-weight: 400;font-size: 15px;\">"+harinaamSankirtan.getKrishnaPrasadam()+"</td>\n" +
                "                                        </tr>\n" +
                "                                        </tbody>\n" +
                "                                    </table>\n" +
                "                            <button  type=\"button\" id="+harinaamSankirtan.getId()+" class=\"btn btn-danger pull-right\"  onclick=\"declineRequest(event,"+harinaamSankirtan.getId()+")\" style=\"margin-left: 2px;\" data-loading-text=\"<i class='fa fa-spinner fa-spin '></i> Processing\">Delete Request</button>\n" +
                "\n" +
                "                            <button type=\"button\" id="+harinaamSankirtan.getId()+" class=\"btn btn-success pull-right\"  onclick=\"approveRequest(event,"+harinaamSankirtan.getId()+")\"  data-loading-text=\"<i class='fa fa-spinner fa-spin '></i> Processing\">Approve Request</button>\n" +
                "                                    </div>\n" +
                "                            </div>\n" +

                "        ");
    }if(!harinaamSankirtanList.isEmpty()) {
            return stringBuilder.toString();
        }else {
        stringBuilder.append("<h2><b>No More Request</b></h2>");
        return stringBuilder.toString();
        }

    }

    public List<HarinaamSankirtan> getListOfAllRequest() {
      return   harinaamSankirtanRequestListForApprovalDao.getAllPendingRequestList();
    }
}
