package iskcongzb.controller;

import com.sun.org.apache.regexp.internal.RE;
import iskcongzb.dao.DaoInterfaces.AddProductForBookDistributionDao;
import iskcongzb.dao.DaoInterfaces.OnlineBookStoreDao;
import iskcongzb.domain.ProductDetails;
import iskcongzb.domain.RequestAFacilitator;
import iskcongzb.domain.RequestForBookDistribution;
import iskcongzb.services.ServiceInterfaces.FindProductService;
import iskcongzb.services.ServiceInterfaces.RequestAFacilitatorService;
import iskcongzb.services.ServiceInterfaces.RequestForBookDistributionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BookDistributionController {
   @Autowired
   FindProductService findProductService;
   @Autowired
    AddProductForBookDistributionDao addProductForBookDistributionDao;
    @RequestMapping(value = "/BookDistribution",method = RequestMethod.GET)
    public String gotoBookDistributionMainPage(HttpSession session)
    {

        return "BookDistributionIndex";
    }
    @RequestMapping(value = "/ProductPage",method = RequestMethod.GET)
    public ModelAndView showProducts()
    {
        ModelAndView modelAndView=new ModelAndView("ProductPageBookDistribution");
        modelAndView.addObject("productList",findProductService.getAllProducts());
        return modelAndView;
    }

    @RequestMapping(value = "/addToCart",method = RequestMethod.GET)
    public @ResponseBody String addItemsToCart(@RequestParam("id") int pid,HttpSession session)
    {
        List<ProductDetails> productDetailsList=new ArrayList<ProductDetails>();
        if(session.getAttribute("cart")==null)
        {

            productDetailsList.add(findProductService.getProductById(pid));
            session.setAttribute("cart",productDetailsList);
            System.out.println("first call");

        }else {
          List<ProductDetails> list= (List<ProductDetails>) session.getAttribute("cart");
            list.add(findProductService.getProductById(pid));

            session.setAttribute("cart",list);

        }
        return "Added To Cart";
    }

    @RequestMapping(value = "/GoToCart",method = RequestMethod.GET)
    public String GoToCart()
    {
        return "CartDetails";
    }

// to be done (Not Completed)

    @RequestMapping(value = "/modificationincart")
    public @ResponseBody String doModificationInCart(@RequestParam("id") int id,HttpSession session)
    {
        List<ProductDetails> productDetailsList= (List<ProductDetails>) session.getAttribute("cart");
return null;
    }

    @RequestMapping( value = "/bookdistributionadminpage",method = RequestMethod.GET)
    public String gotoBookdistributionadminpage()
    {
        return "AddProductsForBookDistribution";
    }




    @RequestMapping(value = "/addBooks",method = RequestMethod.POST)
    public String addProduct(@ModelAttribute ProductDetails productDetails, @RequestParam("file") MultipartFile multipartFile, Model model) throws IOException {
        productDetails.setBookImage(multipartFile.getBytes());
        productDetails.setInStock(true);
        if (addProductForBookDistributionDao.addProducts(productDetails)) {
            model.addAttribute("msg", "book added");
            return "erroraddproduct";
        } else {
            model.addAttribute("msg", "book not added");
            return "erroraddproduct";
        }
    }

    /// online book store

    @Autowired
    OnlineBookStoreDao onlineBookStoreDao;

    @RequestMapping(value = "/OnlineBookStore",method = RequestMethod.GET)
    public String onlineBookStore(Model model)
    {
      List<ProductDetails> productDetailsList=onlineBookStoreDao.getAllProducts();
      model.addAttribute("Products",productDetailsList);
      return "OnlineBookStore";
    }
    @RequestMapping (value = "/ProductImage",method = RequestMethod.GET)
    public  void getBookImage(@RequestParam("pid") int pid,HttpServletResponse response) throws IOException {
       byte image[]= onlineBookStoreDao.getBookImage(pid);
       response.getOutputStream().write(image);
    }

   @RequestMapping(value = "/RegularBookDistributionIndex",method = RequestMethod.GET)
    public String RegularBookDistribution()
   {
       return "RegularBookDistributionIndexPage";
   }
   @Autowired
    RequestAFacilitatorService requestAFacilitatorService;
   @RequestMapping(value = "/requestafacilitator",method = RequestMethod.POST)
    public @ResponseBody String RequestAfacilitator(@ModelAttribute RequestAFacilitator requestAFacilitator)
   {

       if(requestAFacilitator!=null)
       return requestAFacilitatorService.MakeRequest(requestAFacilitator);
       else
           return "Please Fill All The Details";
   }
   @Autowired
    RequestForBookDistributionService requestForBookDistributionService;
   @RequestMapping(value = "/requestForBookDistribution",method = RequestMethod.POST)
   public @ResponseBody String RequestForBookDistribution(@ModelAttribute RequestForBookDistribution requestForBookDistribution, BindingResult bindingResult)
   {
    if(bindingResult.hasErrors())
    {
        return "Some Error Occured Please Try Again After Sometime";
    }else
    {
        return requestForBookDistributionService.makeRequest(requestForBookDistribution);
    }
   }

   @RequestMapping(value = "/ReadAbook",method = RequestMethod.GET)
    public String ReadABook()
   {
       return "ReadBookOnline";
   }

}
