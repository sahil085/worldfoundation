package iskcongzb.Configuration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import iskcongzb.dao.DaoInterfaces.FindUserByNameDao;
import iskcongzb.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.request.ServletRequestAttributes;

@Component
public class CustomSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
@Autowired
    FindUserByNameDao findUserByNameDao;
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Override
    protected void handle(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
            throws IOException {
        String targetUrl = determineTargetUrl(authentication);

        if (response.isCommitted()) {
            System.out.println("Can't redirect");
            return;
        }

        redirectStrategy.sendRedirect(request, response, targetUrl);
    }

    /*
     * This method extracts the roles of currently logged-in user and returns
     * appropriate URL according to his/her role.
     */

    public String determineTargetUrl(Authentication authentication) {
        String url = "";

        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();

        List<String> roles = new ArrayList<String>();

        for (GrantedAuthority a : authorities) {
            roles.add(a.getAuthority());
        }

        if (isBookAdmin(roles)) {
            url = "/bookdistributionadminpage";

        } else if (isHarinaamAdmin(roles)) {
            url = "/haarinaamAdminPage";
        } else if (isUser(roles)) {
            url = "/iyfpage";

        }else if(isPreacher(roles)) {
            url="/pp";
        }
        else {
            url = "/Access_Denied";
        }

        return url;
    }

    private boolean isUser(List<String> roles) {
        if (roles.contains("ROLE_USER")) {
            return true;
        }
        return false;
    }

    private boolean isHarinaamAdmin(List<String> roles) {
        if (roles.contains("ROLE_Harinaam Sankirtan")) {
            return true;
        }
        return false;
    }
    private boolean isPreacher(List<String> roles) {
        if (roles.contains("ROLE_Preaching")) {
            return true;
        }
        return false;
    }

    private boolean isBookAdmin(List<String> roles) {
        if (roles.contains("ROLE_book distribution admin")) {
            return true;
        }
        return false;
    }

    public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
        this.redirectStrategy = redirectStrategy;
    }

    protected RedirectStrategy getRedirectStrategy() {
        return redirectStrategy;
    }

}
